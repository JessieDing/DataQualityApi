package cn.com.easystudio.api.dataquality.dao;

import cn.com.easystudio.api.dataquality.model.addresses.HRAResponse;

public interface HRASearchSimilarAddressesDao {
    HRAResponse searchSimilarAddresses(String queryText, String country, String size);
}
