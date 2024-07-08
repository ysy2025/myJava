package com.exercise.test01;


import java.math.BigInteger;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class IPInfoUtils {

    private static final IPInfo UNKNOWN = new IPInfo("未知","未知", "未知", "未知", "未知", false, 0, 0);

    private static volatile boolean useCustomFlag = false;

    private static final Map<BigInteger, CustomIPInfo> CUSTOM_IP_INFO_LIST = new ConcurrentHashMap<>();

    public static IPInfo getIpInfo(String ip) {
        if (ip == null) {
            return UNKNOWN;
        }
        if (useCustomFlag) {
            CustomIPInfo customIPInfo = CUSTOM_IP_INFO_LIST.get(IpUtils.ip2BigInteger(ip));
            if (customIPInfo != null) {
                return customIPInfo;
            }
        }
        if (ip.contains(":")) {
            return IPv6InfoUtils.getIPv6Info(ip);
        } else {
            return IPv4InfoUtils.getIPv4Info(ip);
        }
    }

    /**
     * 是否开启使用自定义IP信息
     * @param useCustom 是否启用
     */
    public static void useCustom(boolean useCustom) {
        useCustomFlag = useCustom;
    }

    public static void addCustom(CustomIPInfo customIPInfo) {
        CUSTOM_IP_INFO_LIST.put(customIPInfo.getIpInteger(), customIPInfo);
    }

    public static void removeCustom(String ip) {
        CUSTOM_IP_INFO_LIST.remove(IpUtils.ip2BigInteger(ip));
    }

    public static Collection<CustomIPInfo> listCustom() {
        return CUSTOM_IP_INFO_LIST.values();
    }



    /**
     * 初始化过程需要耗费较长时间，大概为几秒钟，可调用init方法提前初始化，使得查询方法可快速返回结果。
     * 如不调用该方法，当第一次调用getIpInfo方法时会自动调用init方法。
     */
    public static void init() {
        IPv4InfoUtils.init();
        IPv6InfoUtils.init();
    }

    public static final Map<String, String> COUNTRY_GEO = new HashMap<String, String>() {
        {
            // 纬,经
            put("不丹", "27.466089,89.641907");
            put("东帝汶", "-8.55861,125.573608");
            put("中非共和国", "5.02666,21.208759");
            put("丹麦", "55.675941,12.56553");
            put("乌克兰", "50.433334,30.516666");
            put("乌兹别克斯坦", "41.264648,69.21627");
            put("乌干达", "3.37786,31.790899");
            put("乌拉圭", "-34.200001,-54.75");
            put("乍得", "13.82916,20.832399");
            put("也门", "15.35472,44.206669");
            put("亚美尼亚", "40.18111,44.513611");
            put("以色列", "31.769039,35.216331");
            put("伊拉克", "33.34058,44.400879");
            put("伊朗", "35.694389,51.421509");
            put("伯利兹", "17.25,-88.76667");
            put("佛得角", "15.1,-23.683331");
            put("俄罗斯", "55.75222,37.615555");
            put("保加利亚", "42.69751,23.32415");
            put("克罗地亚", "45.22472,18.73806");
            put("关岛", "13.46559,144.747955");
            put("冈比亚", "13.40417,-16.65583");
            put("冰岛", "64.135483,-21.895411");
            put("几内亚", "8.68333,-8.63333");
            put("几内亚比绍", "12.16667,-14.66667");
            put("列支敦士登", "47.14151,9.52154");
            put("刚果", "2.73877,23.78326");
            put("刚果共和国", "-4.32459,15.32146");
            put("刚果民主共和国", "1.2,19.8");
            put("利比亚", "32.375351,15.09254");
            put("利比里亚", "4.67972,-8.23389");
            put("加拿大", "45.411171,-75.69812");
            put("加纳", "5.3617,-1.94732");
            put("加蓬", "2.07597,11.50065");
            put("匈牙利", "47.498009,19.039909");
            put("北马里亚那群岛", "14.96874,145.624374");
            put("南乔治亚岛与南桑威奇群岛", "-54.281109,-36.509201");
            put("南苏丹", "8.76816,27.40019");
            put("南非", "-25.74486,28.18783");
            put("博奈尔岛", "12.16667,-68.26667");
            put("博茨瓦纳", "-24.450001,26.01667");
            put("卡塔尔", "25.286667,51.533333");
            put("卢旺达", "-2.59667,29.739441");
            put("卢森堡", "49.611671,6.13");
            put("印度", "28.666668,77.216667");
            put("印度尼西亚", "-6.21462,106.845131");
            put("危地马拉", "14.64072,-90.513268");
            put("厄瓜多尔", "-2.2,-78.833328");
            put("厄立特里亚", "14.84444,39.37722");
            put("叙利亚", "33.510201,36.291279");
            put("古巴", "20.024719,-75.821938");
            put("吉尔吉斯斯坦", "42.869999,74.589996");
            put("吉布提", "11.15583,42.712502");
            put("哈萨克斯坦", "51.180099,71.445976");
            put("哥伦比亚", "3.43722,-76.522499");
            put("哥斯达黎加", "10.01667,-84.216667");
            put("喀麦隆", "3.98333,13.18333");
            put("图瓦卢", "-6.28764,176.31472");
            put("土库曼斯坦", "37.950001,58.383331");
            put("土耳其", "39.919868,32.854271");
            put("圣卢西亚", "14.01667,-60.966671");
            put("圣基茨和尼维斯", "17.29484,-62.726101");
            put("圣多美和普林西比", "0.33654,6.72732");
            put("圣巴托洛缪岛", "17.896179,-62.849781");
            put("圣文森特和格林纳丁斯", "13.15872,-61.224751");
            put("圣皮埃尔和密克隆", "50.088039,14.42076");
            put("圣诞岛", "-10.42172,105.679123");
            put("圣赫勒拿岛", "-15.93872,-5.71675");
            put("圣马力诺", "43.933331,12.45");
            put("圭亚那", "7.26439,-58.50769");
            put("坦桑尼亚", "-6.82349,39.269508");
            put("埃及", "29.973709,32.526272");
            put("埃塞俄比亚", "9.59306,41.866112");
            put("基里巴斯", "1.3673,173.124146");
            put("塔吉克斯坦", "38.535751,68.779053");
            put("塞内加尔", "12.81028,-16.226391");
            put("塞尔维亚", "44.804008,20.46513");
            put("塞拉利昂", "9.16667,-11.4");
            put("塞浦路斯", "35.166672,33.366669");
            put("塞班岛", "15.21233,145.754501");
            put("塞舌尔", "-4.61667,55.450001");
            put("墨西哥", "19.428471,-99.127663");
            put("多哥", "7.46667,0.9");
            put("多米尼克", "15.23333,-61.316669");
            put("多米尼加", "19.677299,-70.844276");
            put("奥兰群岛", "60.26667,19.933331");
            put("奥地利", "48.208488,16.37208");
            put("委内瑞拉", "10.48801,-66.879189");
            put("孟加拉", "23.7104,90.40744");
            put("安哥拉", "-9.54015,16.34096");
            put("安圭拉", "18.217039,-63.057831");
            put("安提瓜和巴布达", "17.06671,-61.79303");
            put("安道尔", "42.50779,1.52109");
            put("密克罗尼西亚", "6.964,158.205994");
            put("尼加拉瓜", "12.13282,-86.250397");
            put("尼日利亚", "9.05735,7.48976");
            put("尼日尔", "13.51366,2.1098");
            put("尼泊尔", "27.716667,85.316666");
            put("巴勒斯坦", "31.341579,34.345921");
            put("巴哈马", "24.700001,-77.76667");
            put("巴基斯坦", "33.721481,73.043289");
            put("巴巴多斯", "13.1,-59.616669");
            put("巴布亚新几内亚", "-9.44314,147.179718");
            put("巴拉圭", "-26.033331,-55.933331");
            put("巴拿马", "30.15946,-85.659828");
            put("巴林", "26.215361,50.583199");
            put("巴西", "-15.77972,-47.929722");
            put("布基纳法索", "10.63333,-4.76667");
            put("布隆迪", "-3.0804,29.391001");
            put("希腊", "37.97945,23.716221");
            put("帕劳", "7.34257,134.478882");
            put("帝汶岛", "-8.5,126.4");
            put("库克群岛", "-21.207781,-159.774994");
            put("库拉索岛", "12.28333,-69.066673");
            put("开曼群岛", "19.283331,-81.25");
            put("德国", "52.524368,13.41053");
            put("意大利", "41.89193,12.51133");
            put("所罗门群岛", "-8.76761,160.703354");
            put("托克劳群岛", "-8.5,-172.5");
            put("拉脱维亚", "56.950001,24.1");
            put("挪威", "59.912731,10.74609");
            put("捷克", "49.30162,16.652531");
            put("摩尔多瓦", "47.005562,28.8575");
            put("摩洛哥", "33.592781,-7.61916");
            put("摩纳哥", "43.73333,7.41667");
            put("文莱", "4.94029,114.948059");
            put("斐济", "-17.799999,177.416672");
            put("斯威士兰", "-26.549999,31.01667");
            put("斯洛伐克", "48.148159,17.106741");
            put("斯洛文尼亚", "46.051079,14.50513");
            put("斯里兰卡", "6.93194,79.847778");
            put("新加坡", "1.28967,103.850067");
            put("新喀里多尼亚", "-21.866671,166.050003");
            put("新西兰", "-46.400002,168.350006");
            put("日本", "35.689499,139.691711");
            put("智利", "-23.65,-70.400002");
            put("朝鲜", "39.033852,125.754318");
            put("柬埔寨", "11.56245,104.916008");
            put("格恩西岛", "49.459808,-2.53527");
            put("格林纳达", "12.16462,-61.729649");
            put("格陵兰岛", "66.939461,-53.6735");
            put("格鲁吉亚", "41.694111,44.833679");
            put("梵蒂冈", "41.902359,12.45332");
            put("比利时", "50.850449,4.34878");
            put("毛利塔尼亚", "18.08581,-15.9785");
            put("毛里求斯", "-20.16194,57.49889");
            put("汤加", "-21.15,-175.216675");
            put("沙特阿拉伯", "24.687731,46.721851");
            put("法国", "48.853409,2.3488");
            put("法属南部领土", "-49.349998,70.216667");
            put("法属圣马丁", "18.066669,-63.083328");
            put("法属圭亚那", "5.155,-54.347221");
            put("法属玻利尼西亚", "-17.75,-149.283325");
            put("法罗群岛", "62.009731,-6.77164");
            put("波兰", "52.229771,21.01178");
            put("波多黎各", "18.158489,-66.801773");
            put("波斯尼亚和黑塞哥维那", "43.84864,18.35644");
            put("泰国", "13.75,100.51667");
            put("泽西岛", "49.188042,-2.10491");
            put("津巴布韦", "-17.383329,30.4");
            put("洪都拉斯", "14.0818,-87.20681");
            put("海地", "18.539169,-72.334999");
            put("澳大利亚", "-35.283459,149.128067");
            put("爱尔兰", "53.34399,-6.26719");
            put("爱沙尼亚", "59.436958,24.753531");
            put("牙买加", "18.29434,-77.542389");
            put("特克斯和凯科斯群岛", "21.46122,-71.141876");
            put("特立尼达和多巴哥", "10.63333,-61.283329");
            put("玻利维亚", "-17.3895,-66.156799");
            put("瑙鲁", "-0.55085,166.9252");
            put("瑞典", "59.332581,18.064899");
            put("瑞士", "46.94809,7.44744");
            put("瓜德罗普", "16.472059,-61.507778");
            put("瓦利斯群岛和富图纳群岛", "-13.28163,-176.17453");
            put("瓦努阿图", "-15.53333,167.166672");
            put("留尼汪岛", "-20.99667,55.67823");
            put("白俄罗斯", "53.900002,27.566668");
            put("百慕大群岛", "32.291489,-64.777969");
            put("皮特凯恩群岛", "-25.065969,-130.101471");
            put("直布罗陀", "36.144741,-5.35257");
            put("科威特", "29.36972,47.978329");
            put("科摩罗", "-12.13556,44.431671");
            put("科科斯群岛", "-12.15681,96.82251");
            put("秘鲁", "-5.2,-80.633331");
            put("突尼斯", "36.81897,10.16579");
            put("立陶宛", "54.689159,25.2798");
            put("索马里", "2.1381,45.121201");
            put("约旦", "31.955219,35.94503");
            put("纳米比亚", "-22.41667,14.96667");
            put("纽埃岛", "-19.059521,-169.918671");
            put("维尔京群岛", "18.41667,-64.616669");
            put("缅甸", "19.745001,96.129723");
            put("罗马尼亚", "44.432251,26.10626");
            put("美国", "38.895111,-77.036369");
            put("美属维尔京群岛", "35.2,-80.899994");
            put("美属萨摩亚群岛", "-14.27806,-170.702499");
            put("老挝", "17.966669,102.599998");
            put("肯尼亚", "-0.17462,34.916302");
            put("芬兰", "60.169521,24.93545");
            put("苏丹", "15.55177,32.53241");
            put("苏里南", "5.5,-54.049999");
            put("英国", "51.512791,-0.09184");
            put("荷兰", "52.37403,4.88969");
            put("荷属圣马丁", "18.038679,-63.065418");
            put("莫桑比克", "-25.965281,32.589169");
            put("莱索托", "-28.76659,28.249359");
            put("菲律宾", "14.6042,120.982201");
            put("萨尔瓦多", "13.59278,-89.827499");
            put("萨摩亚", "-13.83333,-171.766663");
            put("葡萄牙", "38.716671,-9.13333");
            put("蒙古", "47.907711,106.88324");
            put("蒙塞拉特", "16.79183,-62.210579");
            put("西撒哈拉", "23.684771,-15.95798");
            put("西班牙", "40.4165,-3.70256");
            put("诺福克岛", "-29.05459,167.966278");
            put("象牙海岸", "6.72972,-3.49639");
            put("贝宁", "7.18286,1.99119");
            put("赞比亚", "-15.40669,28.28713");
            put("赤道几内亚", "1.29683,10.93691");
            put("越南", "21.0245,105.841171");
            put("阿塞拜疆", "40.37767,49.89201");
            put("阿富汗", "34.52813,69.172333");
            put("阿尔及利亚", "36.752499,3.04197");
            put("阿尔巴尼亚", "40.598888,19.73472");
            put("阿拉伯", "24.466669,54.366669");
            put("阿曼", "23.613871,58.592201");
            put("阿根廷", "-32.890839,-68.827171");
            put("阿鲁巴", "12.51667,-69.949997");
            put("韩国", "37.56826,126.977829");
            put("马其顿", "42,21.433331");
            put("马尔代夫", "4.1748,73.508881");
            put("马尔维纳斯群岛", "-51.700001,-57.849998");
            put("马恩岛", "54.150002,-4.48333");
            put("马拉维", "-14.97928,34.95575");
            put("马提尼克", "14.86954,-61.11504");
            put("马来西亚", "3.1412,101.686531");
            put("马约特岛", "-12.7044,45.122311");
            put("马绍尔群岛", "7.08971,171.380264");
            put("马耳他", "35.899719,14.51472");
            put("马达加斯加", "-18.913679,47.536129");
            put("马里", "12.65,-8");
            put("黎巴嫩", "33.888939,35.494419");
            put("黑山共和国", "42.441109,19.263611");

            // 纬,经
            put("中非", "7.361661,21.017058");
            put("亚洲", "55.948734,98.70607");
            put("北美地区", "49.127607,-105.61989");
            put("北马其顿", "41.10887,20.806359");
            put("北马里亚纳群岛", "15.207633,145.760801");
            put("南极洲", "-77.514571,67.232663");
            put("印尼", "-0.882168,113.860961");
            put("圣巴泰勒米", "17.904541,-62.835857");
            put("圣皮埃尔和密克隆群岛", "46.848725,-56.286004");
            put("孟加拉国", "23.681552,90.368404");
            put("密克罗尼西亚联邦", "6.885566,158.227498");
            put("库拉索", "12.211142,-69.033139");
            put("托克劳", "-9.171349,-171.820804");
            put("拉美地区", "49.457634,-2.577804");
            put("根西岛", "49.457634,-2.577804");
            put("格陵兰", "71.743234,-42.263953");
            put("欧洲", "52.204185,18.036424");
            put("欧洲地区", "52.204185,18.036424");
            put("欧盟", "50.853795,4.35171");
            put("欧美地区", "52.449562,-32.397421");
            put("毛里塔尼亚", "20.91419,-10.560816");
            put("法属波利尼西亚", "-17.726718,-149.414495");
            put("澳洲", "-22.072304,134.647688");
            put("瓦利斯和富图纳群岛", "-14.235073,-177.942478");
            put("百慕大", "32.303161,-64.755674");
            put("福克兰群岛", "-51.852787,-59.249987");
            put("科特迪瓦", "7.521915,-5.546505");
            put("科索沃", "42.605397,21.100748");
            put("纽埃", "-19.046517,-169.863209");
            put("美属萨摩亚", "-14.315434,-170.749447");
            put("美洲地区", "40.90915,-73.856778");
            put("联合国", "40.90915,-73.856778");
            put("苏格兰", "52.734451,-3.598159");
            put("英属印度洋领地", "-6.659415,71.358178");
            put("英属维尔京群岛", "18.488459,-64.404253");
            put("荷兰加勒比", "51.893385,4.472645");
            put("荷兰省", "52.116884,5.236074");
            put("蒙特塞拉特岛", "16.766314,-62.201411");
            put("阿联酋", "24.73027,55.22819");
            put("非洲地区", "4.524836,24.252784");
            put("韩国首尔", "37.546624,126.990617");
            put("马约特", "-12.802392,45.140948");
            put("黑山", "42.746191,19.312874");
        }
    };

    public static final Map<String, String> PROVINCE_GEO = new HashMap<String, String>() {
        {
            // 纬,经
            put("中国", "39.904000,116.391000");
            // 直辖市
            put("北京", "39.904000,116.391000");
            put("上海", "31.213000,121.445000");
            put("天津", "39.117000,117.246000");
            put("重庆", "29.581000,106.549000");
            // 省
            put("云南", "25.051000,102.702000");
            put("吉林", "43.871000,125.324000");
            put("四川", "30.670000,104.071000");
            put("安徽", "31.861000,117.275000");
            put("山东", "36.663000,117.009000");
            put("山西", "37.893000,112.551000");
            put("广东", "23.108000,113.265000");
            put("江苏", "32.048000,118.769000");
            put("江西", "28.671000,115.889000");
            put("河北", "38.042000,114.498000");
            put("河南", "34.758000,113.641000");
            put("浙江", "30.319000,120.165000");
            put("海南", "11.26,114.20");
            put("湖北", "30.573000,114.279000");
            put("湖南", "28.197000,112.967000");
            put("甘肃", "36.068000,103.751000");
            put("福建", "26.071000,119.303000");
            put("贵州", "26.572000,106.700000");
            put("辽宁", "41.799000,123.418000");
            put("陕西", "34.285000,108.969000");
            put("青海", "36.621000,101.778000");
            put("黑龙江", "45.758000,126.645000");
            // 自治区
            put("新疆", "43.781000,87.585000");
            put("内蒙古", "40.819000,111.686000");
            put("宁夏", "38.468000,106.263000");
            put("西藏", "29.656000,91.126000");
            put("广西", "22.838000,108.295000");
            // 特别行政区
            put("澳门", "22.20056,113.546112");
            put("香港", "22.285521,114.157692");
            put("台湾", "25.040000,121.516000");
        }
    };



}
