package cn.com.easystudio.api.dataquality.dao;

import cn.com.easystudio.api.dataquality.model.addresses.HRARequest;
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
    private  String key;

    @Autowired
    private CountryUtil countryUtil;

    @Autowired
    private AxwavUserAgentInterceptor axwavInterceptor;

    @Autowired
    private RestTemplate restTemplate;


    @Override
    public HRAResponse searchSimilarAddresses(String queryText, String country, String size) {
        HRARequest request = createRequest(queryText,country,size);
        axwavInterceptor.setKey(key);
        restTemplate.setInterceptors(Collections.singletonList(axwavInterceptor));
        return restTemplate.postForObject(countryUtil.getSimilarAddressEndpoint(country),request,HRAResponse.class);
    }

    private HRARequest createRequest(String queryText, String country, String size) {
        //TODO:finish this method
        return null;
    }
}
