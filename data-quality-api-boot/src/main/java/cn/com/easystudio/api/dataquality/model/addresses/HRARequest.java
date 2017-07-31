package cn.com.easystudio.api.dataquality.model.addresses;

public class HRARequest {
    private HRARequestOption option;
    private HRARequestPayload payload;

    public HRARequestOption getOption() {
        return option;
    }

    public void setOption(HRARequestOption option) {
        this.option = option;
    }

    public HRARequestPayload getPayload() {
        return payload;
    }

    public void setPayload(HRARequestPayload payload) {
        this.payload = payload;
    }
}
