package cn.com.easystudio.api.dataquality.model.addresses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HRAResponseAddressPayload {
    private String fullAddress;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String addressLine4;
    private String dpid;
    private String pafPosition;
    private String localityName;
    private String postcode;
    private String state;
    private String streetName;
    private String streetType;
    private String streetSufix;
    private String houseNumber1;
    private String houseNumber2;
    private String rdNumber;
    private String oldPostcode;
    private String townCityName;
    private String buildingName1;
    private String buildingName2;
    private String flatUnitType;
    private String flatUnitNumber;
    private String floorLevelType;
    private String floorLevelNumber;
    private String lotNumber;
    private String houseNumberSuffix1;
    private String houseNumberSuffix2;
    private String postalDeliveryType;
    private String postalNumber;

    @Override
    public String toString() {
        return fullAddress;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getAddressLine4() {
        return addressLine4;
    }

    public void setAddressLine4(String addressLine4) {
        this.addressLine4 = addressLine4;
    }

    public String getDpid() {
        return dpid;
    }

    public void setDpid(String dpid) {
        this.dpid = dpid;
    }

    public String getPafPosition() {
        return pafPosition;
    }

    public void setPafPosition(String pafPosition) {
        this.pafPosition = pafPosition;
    }

    public String getLocalityName() {
        return localityName;
    }

    public void setLocalityName(String localityName) {
        this.localityName = localityName;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetType() {
        return streetType;
    }

    public void setStreetType(String streetType) {
        this.streetType = streetType;
    }

    public String getStreetSufix() {
        return streetSufix;
    }

    public void setStreetSufix(String streetSufix) {
        this.streetSufix = streetSufix;
    }

    public String getHouseNumber1() {
        return houseNumber1;
    }

    public void setHouseNumber1(String houseNumber1) {
        this.houseNumber1 = houseNumber1;
    }

    public String getHouseNumber2() {
        return houseNumber2;
    }

    public void setHouseNumber2(String houseNumber2) {
        this.houseNumber2 = houseNumber2;
    }

    public String getRdNumber() {
        return rdNumber;
    }

    public void setRdNumber(String rdNumber) {
        this.rdNumber = rdNumber;
    }

    public String getOldPostcode() {
        return oldPostcode;
    }

    public void setOldPostcode(String oldPostcode) {
        this.oldPostcode = oldPostcode;
    }

    public String getTownCityName() {
        return townCityName;
    }

    public void setTownCityName(String townCityName) {
        this.townCityName = townCityName;
    }

    public String getBuildingName1() {
        return buildingName1;
    }

    public void setBuildingName1(String buildingName1) {
        this.buildingName1 = buildingName1;
    }

    public String getBuildingName2() {
        return buildingName2;
    }

    public void setBuildingName2(String buildingName2) {
        this.buildingName2 = buildingName2;
    }

    public String getFlatUnitType() {
        return flatUnitType;
    }

    public void setFlatUnitType(String flatUnitType) {
        this.flatUnitType = flatUnitType;
    }

    public String getFlatUnitNumber() {
        return flatUnitNumber;
    }

    public void setFlatUnitNumber(String flatUnitNumber) {
        this.flatUnitNumber = flatUnitNumber;
    }

    public String getFloorLevelType() {
        return floorLevelType;
    }

    public void setFloorLevelType(String floorLevelType) {
        this.floorLevelType = floorLevelType;
    }

    public String getFloorLevelNumber() {
        return floorLevelNumber;
    }

    public void setFloorLevelNumber(String floorLevelNumber) {
        this.floorLevelNumber = floorLevelNumber;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    public String getHouseNumberSuffix1() {
        return houseNumberSuffix1;
    }

    public void setHouseNumberSuffix1(String houseNumberSuffix1) {
        this.houseNumberSuffix1 = houseNumberSuffix1;
    }

    public String getHouseNumberSuffix2() {
        return houseNumberSuffix2;
    }

    public void setHouseNumberSuffix2(String houseNumberSuffix2) {
        this.houseNumberSuffix2 = houseNumberSuffix2;
    }

    public String getPostalDeliveryType() {
        return postalDeliveryType;
    }

    public void setPostalDeliveryType(String postalDeliveryType) {
        this.postalDeliveryType = postalDeliveryType;
    }

    public String getPostalNumber() {
        return postalNumber;
    }

    public void setPostalNumber(String postalNumber) {
        this.postalNumber = postalNumber;
    }
}
