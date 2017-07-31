package cn.com.easystudio.api.dataquality.dao;

import cn.com.easystudio.api.dataquality.model.addresses.HRARequest;
import cn.com.easystudio.api.dataquality.model.addresses.HRARequestOption;
import cn.com.easystudio.api.dataquality.model.addresses.HRARequestPayload;
import cn.com.easystudio.api.dataquality.model.addresses.HRAResponse;
import cn.com.easystudio.api.dataquality.util.AxwavUserAgentInterceptor;
import cn.com.easystudio.api.dataquality.util.CountryUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Component
public class DefaultHRASearchAddressesDao implements HRASearchSimilarAddressesDao {
    @Value("${endpoint.similarAddress.key}")
    private String key;

    @Autowired
    private CountryUtil countryUtil;

    @Autowired
    private AxwavUserAgentInterceptor axwavInterceptor;

    @Autowired
    private RestTemplate restTemplate;


    @Override
    public HRAResponse searchSimilarAddresses(String queryText, String country, String size) {
        HRARequest request = createRequest(queryText, country, size);
        axwavInterceptor.setKey(key);
        restTemplate.setInterceptors(Collections.singletonList(axwavInterceptor));
        return restTemplate.postForObject(countryUtil.getSimilarAddressEndpoint(country), request, HRAResponse.class);
    }

    private HRARequest createRequest(String queryText, String country, String size) {
        HRARequest request = new HRARequest();

        request.setOption(createOption(country, size));
        request.setPayload(createPayload(queryText));
        return request;
    }

    private HRARequestPayload createPayload(String queryText) {
        HRARequestPayload requestPayload = new HRARequestPayload();
        requestPayload.setFullAddress(queryText);
        return requestPayload;
    }

    private HRARequestOption createOption(String country, String size) {
        HRARequestOption requestOption = new HRARequestOption();
        requestOption.setSource(countryUtil.toPaf(country));
        requestOption.setTop(size);
        return requestOption;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public CountryUtil getCountryUtil() {
        return countryUtil;
    }

    public void setCountryUtil(CountryUtil countryUtil) {
        this.countryUtil = countryUtil;
    }
}
