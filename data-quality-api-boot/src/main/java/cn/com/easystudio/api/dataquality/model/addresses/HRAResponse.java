package cn.com.easystudio.api.dataquality.model.addresses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HRAResponse {
    private String status;
    private List<String> messages;
    private List<HRAResponseAddressPayload> payload;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public List<HRAResponseAddressPayload> getPayload() {
        return payload;
    }

    public void setPayload(List<HRAResponseAddressPayload> payload) {
        this.payload = payload;
    }
}
