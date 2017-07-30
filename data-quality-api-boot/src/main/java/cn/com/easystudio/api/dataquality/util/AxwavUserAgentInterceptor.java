package cn.com.easystudio.api.dataquality.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class AxwavUserAgentInterceptor implements ClientHttpRequestInterceptor {
    private String keyId;

    @Value("${endpoint.similarAddress.key}") private String similarAddressKey;

    @Override
    public ClientHttpResponse intercept(HttpRequest request,
                                        byte[] body, ClientHttpRequestExecution execution) throws IOException {
        HttpHeaders headers = request.getHeaders();
        if (similarAddressKey != null && !similarAddressKey.isEmpty()) {
            headers.add("KeyId", similarAddressKey);
        }
        return execution.execute(request, body);
    }

    public void setKey(String key) {
        this.keyId = key;
    }
}
