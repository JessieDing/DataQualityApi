package cn.com.easystudio.api.dataquality.controller.addresses;

import cn.com.easystudio.api.dataquality.dao.HRASearchSimilarAddressesDao;
import cn.com.easystudio.api.dataquality.model.Params;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.Assert;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping(value = "/v1") // TODO:produces="application/vnd.api+json"
@Api(value = "Data Quality API")
@Validated
public class AddressSearchController {
/*    private final HRASearchSimilarAddressesDao addressesSearchDao;

    @Autowired
    public AddressSearchController(HRASearchSimilarAddressesDao addressesSearchDao) {
        this.addressesSearchDao = addressesSearchDao;
    }*/

    @ApiOperation(value = "Address Search", notes = Params.ADDRESSES_SEARCH_NOTES, protocols = "https")
    @RequestMapping(path = "/addresses/search", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String addressesSearch(@NotNull
                                  @ApiParam(value = "Query String")
                                  @RequestParam(value = "queryString") String queryString,
                                  @ApiParam(value = "Country", defaultValue = "AU")
                                  @RequestParam(value = "countryCode", defaultValue = "DEFAULT_RESULT_SIZE") String countryCode,
                                  @ApiParam(value = "Size")
                                  @RequestParam(value = "resultSize", defaultValue = "DEFAULT_RESULT_SIZE") String resultSize
    ) {
        Assert.notNull(queryString, "Required String parameter 'queryString' is not present. ");
        return "OK";
    }
}
