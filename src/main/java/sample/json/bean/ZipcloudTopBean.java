package sample.json.bean;

import java.util.List;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
    "message",
    "results",
    "status"
})

@Data
public class ZipcloudTopBean {
    @JsonProperty
    private String message;

    @JsonProperty
    private List<ZipcloudResultBean> results;

    @JsonProperty
    private int status;
}
