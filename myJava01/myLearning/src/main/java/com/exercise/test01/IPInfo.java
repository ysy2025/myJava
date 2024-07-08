package com.exercise.test01;

public class IPInfo {

    /**
     * 国家中文名称
     */
    private String country;

    /**
     * 中国省份中文名称
     */
    private String province;

    /**
     * 中国城市中文名称
     */
    private String city;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 互联网服务提供商
     */
    private String isp;

    /**
     * 国外的
     */
    private boolean overseas;

    /**
     * 纬度
     */
    private double lat;

    /**
     * 经度
     */
    private double lng;

    public IPInfo() {
    }

    public IPInfo(String country, String province, String city, String address, String isp, boolean overseas, double lat, double lng) {
        this.country = country;
        this.province = province;
        this.city = city;
        this.address = address;
        this.isp = isp;
        this.overseas = overseas;
        this.lat = lat;
        this.lng = lng;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public boolean isOverseas() {
        return overseas;
    }

    public void setOverseas(boolean overseas) {
        this.overseas = overseas;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    @Override
    public String toString() {
        return "IPInfo{" +
                "country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", isp='" + isp + '\'' +
                ", overseas=" + overseas +
                ", lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}
