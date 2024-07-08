package com.exercise.test01;

import java.math.BigInteger;
import java.util.Objects;

public class CustomIPInfo extends IPInfo {

    /**
     * IP数字表示
     */
    private final BigInteger ipInteger;

    private final String ip;

    public CustomIPInfo(String ip, String country, String province, String city, String address, String isp, boolean overseas, double lat, double lng) {
        super(country, province, city, address, isp, overseas, lat, lng);
        if (ip.contains(":")) {
            this.ipInteger = IpParser.getIPv6BigInteger(ip);
        } else {
            this.ipInteger = BigInteger.valueOf(IpUtils.ip2long(ip));
        }
        this.ip = ip;
    }

    public BigInteger getIpInteger() {
        return ipInteger;
    }

    public String getIp() {
        return ip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomIPInfo that = (CustomIPInfo) o;
        return ipInteger.equals(that.ipInteger);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipInteger);
    }

    @Override
    public String toString() {
        return "CustomIPInfo{" +
                "ipInteger=" + ipInteger +
                ", ip='" + ip + '\'' +
                '}' + super.toString();
    }
}
