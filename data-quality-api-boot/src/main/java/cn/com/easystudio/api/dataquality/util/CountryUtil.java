package cn.com.easystudio.api.dataquality.util;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class CountryUtil {
    static final Logger LOGGER = Logger.getLogger("CountryUtil");

    @Value("${endpoint.similarAddressNZ}")
    private String similarAddressEndpointNZ;

    @Value("${endpoint.similarAddressAU}")
    private String similarAddressEndpointAU;

    @Value("${country.Australia}")
    private String au;

    @Value("${country.NewZealand}")
    private String nz;

    @Value("${country.paf.Australia}")
    private String auPAF;

    @Value("${country.paf.NewZealand}")
    private String nzPAF;


    public String getSimilarAddressEndpoint(String country) {
        if (nz.equals(country)) {
            return similarAddressEndpointNZ;
        } else if (au.equals(country)) {
            return similarAddressEndpointAU;
        }
        //Unknown country code
        throw new RuntimeException("Unknown Country Code: " + country);
    }

    public String toPaf(String country) {
        if (country != null) {
            if (country.equals(au)) {
                return auPAF;
            } else if (country.equals(nz)) {
                return nzPAF;
            } else {
                LOGGER.warn("Unable to find PAF for country: " + country);
            }
        } else {
            LOGGER.warn("Unable to find PAF due to null country code");
        }
        return "";
    }

    public String getSimilarAddressEndpointNZ() {
        return similarAddressEndpointNZ;
    }

    public void setSimilarAddressEndpointNZ(String similarAddressEndpointNZ) {
        this.similarAddressEndpointNZ = similarAddressEndpointNZ;
    }

    public String getSimilarAddressEndpointAU() {
        return similarAddressEndpointAU;
    }

    public void setSimilarAddressEndpointAU(String similarAddressEndpointAU) {
        this.similarAddressEndpointAU = similarAddressEndpointAU;
    }

    public String getAu() {
        return au;
    }

    public void setAu(String au) {
        this.au = au;
    }

    public String getNz() {
        return nz;
    }

    public void setNz(String nz) {
        this.nz = nz;
    }

    public String getAuPAF() {
        return auPAF;
    }

    public void setAuPAF(String auPAF) {
        this.auPAF = auPAF;
    }

    public String getNzPAF() {
        return nzPAF;
    }

    public void setNzPAF(String nzPAF) {
        this.nzPAF = nzPAF;
    }
}
