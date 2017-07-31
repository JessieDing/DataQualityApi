package cn.com.easystudio.api.dataquality.model;

public class Params {
    public static final int MAX_RESULT_SIZE = 20;
    public static final int MIN_RESULT_SIZE = 1;
    public static final String DEFAULT_RESULT_SIZE = "10";
    public static final String AU = "AU";
    public static final String NZ = "NZ";
    public static final String ADDRESSES_SEARCH_NOTES = "Used to retrieve a list of address suggestions by " +
            "providing the query string(queryString), countryCode and resultSize. The query string(queryString) " +
            "is required. Country Code will default to 'AU' if not specified. Result Size will default to 10 if " +
            "not specified.";
}
