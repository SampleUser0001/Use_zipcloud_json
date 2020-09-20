package sample.json.bean;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
    "address1",
    "address2",
    "address3",
    "kana1",
    "kana2",
    "kana3",
    "prefcode",
    "zipcode"
})

@Data
public class ZipcloudResultBean {

    @JsonProperty
    private String address1;
    @JsonProperty
    private String address2;
    @JsonProperty
    private String address3;

    @JsonProperty
    private String kana1;
    @JsonProperty
    private String kana2;
    @JsonProperty
    private String kana3;

    @JsonProperty
    private String prefcode;

    @JsonProperty
    private String zipcode;
}
