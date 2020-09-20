package sample.json;

import java.io.File;
import java.util.List;

import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.commons.io.IOUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.JsonProcessingException;

import sample.json.bean.ZipcloudTopBean;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws JsonProcessingException {


        /* TARGET URL AND JSON */
        String url = "http://zipcloud.ibsnet.co.jp/api/search?zipcode=2500011";

        /* HTTPCLIENT AND HTTPPOST OOBJECT */
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost request = new HttpPost(url);

        /* ADD HEADER INFO */
        // request.addHeader("zipcode", "2500011");
        request.addHeader("content-type", "application/json");

        /* PROXY CONFIG */
        // HttpHost target = new HttpHost("proxy", 8080, "http");
        // RequestConfig config = RequestConfig.custom().setProxy(target).build();
        // request.setConfig(config);

        // /* JSON AS STRINGENTITY */
        // StringEntity input = null;
        // try {
        //     input = new StringEntity(json);
        // } catch (UnsupportedEncodingException e) {
        //     e.printStackTrace();
        // }
        // request.setEntity(input);

        /* SEND AND RETRIEVE RESPONSE */
        HttpResponse response = null;
        try {
            response = httpClient.execute(request);
        } catch (IOException e) {
            e.printStackTrace();
        }

        /* RESPONSE AS JSON STRING */
        String result = null;
        try {
            result = IOUtils.toString(response.getEntity().getContent(), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(result);

        ObjectMapper mapper = new JacksonObjectMapper().getContext(ZipcloudTopBean.class);
        System.out.println(mapper.readValue(result, new TypeReference<ZipcloudTopBean>(){}));
    }
}
