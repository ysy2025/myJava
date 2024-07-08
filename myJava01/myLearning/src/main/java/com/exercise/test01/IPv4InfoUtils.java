package com.exercise.test01;


import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.util.*;

public class IPv4InfoUtils {

    private static List<IPv4Info> ipv4InfoList;

    private static final IPv4Info UNKNOWN = new IPv4Info(0, 0, "未知", "未知", "未知", "未知", "未知", false, 0, 0);

    private static final Map<String, String> COUNTRY_GEO = IPInfoUtils.COUNTRY_GEO;

    private static final Map<String, String> PROVINCE_GEO = IPInfoUtils.PROVINCE_GEO;

    public synchronized static void init() {

        if (ipv4InfoList != null && !ipv4InfoList.isEmpty()) {
            return;
        }
        String uploadBasePath = "src/main/resources";
        File ipv4InfoFile = new File(uploadBasePath + File.separator + "files" + File.separator + "upload_cms" + File.separator + "ip.txt");
        try {
            FileInputStream inputStream = new FileInputStream(ipv4InfoFile);
            ipv4InfoList = importTxt(inputStream);
            if (ipv4InfoList == null) {
                ipv4InfoList = Collections.emptyList();
            }
            ipv4InfoList.sort(Comparator.comparing(IPv4Info::getStartLong));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public static IPv4Info getIPv4Info(String ip) {
        if (ip == null) {
            return UNKNOWN;
        }
        if (ip.contains(":") || !IpUtils.isIp(ip)) {
            return UNKNOWN;
        }
        if (ipv4InfoList == null) {
            init();
        }
        int index = Collections.binarySearch(ipv4InfoList, new IPv4Info(IpUtils.ip2long(ip), IpUtils.ip2long(ip)));
        if (index < 0 || index >= ipv4InfoList.size()) {
            return UNKNOWN;
        }
        return ipv4InfoList.get(index);
    }


    private static List<IPv4Info> importTxt(InputStream file) {
        List<IPv4Info> ipv4InfoList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(file, "UTF-8"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                IPv4Info IPv4Info = convertToIPv4Info(line);
                if (IPv4Info == null) {
                    continue;
                }
                ipv4InfoList.add(IPv4Info);
            }
            return ipv4InfoList;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


    private static IPv4Info convertToIPv4Info(String row) {
        if (row.trim().equals("")) {
            return null;
        }
        String[] split = row.split("\\s+", 5);
        String startIp = split[0].trim();
        if (!IpUtils.isIp(startIp)) {
            return null;
        }
        long startLong = IpUtils.ip2long(startIp);
        String endIp = split[1].trim();
        if (!IpUtils.isIp(endIp)) {
            return null;
        }
        long endLong = IpUtils.ip2long(endIp);
        String region = split[3].trim();
        String isp = split[2].trim();
        if (startIp.equals("255.255.255.0")) {
            region = "保留地址";
            isp = "保留地址";
        }
        String tmp = "中国";
        String province = "";
        if(StringUtils.isNotBlank(region)){
            tmp = region.substring(0, 2);
            province = region;
        }
        String country = split[2].trim();
        boolean overseas;
        String city = "";
        if(split.length > 4){
            city = split[4].trim();
        }
        String address = country+province+city;
        String geo = "0,0";
        if (provinces.contains(tmp)) {
            overseas = false;
            String formatProvince = formatProvince(tmp);
            String g = PROVINCE_GEO.get(formatProvince);
            if (g != null) {
                geo = g;
            }
        } else if (tmp.equals("广州")) {
            overseas = false;
            geo = PROVINCE_GEO.get("广东");
        } else if (tmp.equals("成都")) {
            overseas = false;
            geo = PROVINCE_GEO.get("四川");
        } else if (tmp.equals("沈阳")) {
            overseas = false;
            geo = PROVINCE_GEO.get("辽宁");
        } else if (region.contains("大学") || region.contains("学院") || region.contains("东北")) {
            overseas = false;
            geo = PROVINCE_GEO.get("中国");
        } else if (region.contains("局域网") || isp.contains("局域网")) {
            overseas = false;
        } else if (region.contains("保留地址") || isp.contains("保留地址")) {
            overseas = false;
        } else if (region.contains("本机地址") || isp.contains("本机地址")) {
            overseas = false;
        } if (tmp.equals("中国")) {
            overseas = false;
            String g = PROVINCE_GEO.get(tmp);
            if (g != null) {
                geo = g;
            }
        } else {
            overseas = true;
            String g = COUNTRY_GEO.get(country);
            if (g != null) {
                geo = g;
            }
        }
        String[] latAndLng = geo.split(",");
        double lat = Double.parseDouble(latAndLng[0]);
        double lng = Double.parseDouble(latAndLng[1]);
        return new IPv4Info(startLong, endLong, country, province, city, address, isp, overseas, lat, lng);
    }

    private static final String provinces = "河北,山西,辽宁,吉林,黑龙,江苏,浙江,安徽,福建,江西,山东,河南,"
            + "湖北,湖南,广东,海南,四川,贵州,云南,陕西,甘肃,青海,台湾"
            + "西藏,广西,内蒙,宁夏,新疆,香港,澳门"//黑龙江和内蒙古用黑龙和内蒙就可以匹配到
            + "北京,上海,天津,重庆,中国";//23省+5自治区+4直辖市+2特别行政区+中国

    /***
     * 规范省份名称
     * @param originalData 需要进行规范名字的省份
     * @return 规范后的名字
     */
    private static String formatProvince(String originalData) {
        String result;
        switch (originalData) {
            case "内蒙":
                result = "内蒙古";
                break;
            case "黑龙":
                result = "黑龙江";
                break;
            default:
                result = originalData;
                break;
        }
        return result;
    }

    public static void main(String[] args) {
//        StopWatch watch=new StopWatch();
//        watch.start("init");
//        IPv4InfoUtils.init();
//        watch.stop();
//        watch.start("get one");
        IPv4InfoUtils.getIPv4Info("172.30.6.37");
//        watch.stop();
//        watch.start("get 10");
//        for (int i = 0; i < 10; i++) {
//            System.out.println(IPInfoUtils.getIpInfo("222.128.176.102"));
//        }
//        watch.stop();
//        System.out.println(watch.prettyPrint());

//        IPv4InfoUtils.init();
//        IPv4Info iPv4Info = IPv4InfoUtils.getIPv4Info("116.198.47.204");
//        System.out.println(iPv4Info);

        String ip = "116.198.47.204";
        long iplong = 0L;
        String[] ips = null;
        try{
            long[] longs = new long[4];
            if (org.apache.commons.lang3.StringUtils.contains(ip, ".")) {
                ips = ip.split("\\.");
                for (int i = 0; i < 4; i++) {
                    longs[i] = Long.parseLong(ips[i]);
                }
                iplong = (longs[0] << 24) + (longs[1] << 16) + (longs[2] << 8) + longs[3];

            }
        }catch (Exception e){

        }
        System.out.println(iplong);
    }
}
