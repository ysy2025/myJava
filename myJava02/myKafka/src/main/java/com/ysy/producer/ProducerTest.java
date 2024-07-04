//package com.ysy.producer;
//
//import com.ysy.properties.KafkaProperties;
//import org.apache.kafka.clients.producer.KafkaProducer;
//import org.apache.kafka.common.config.ConfigException;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Properties;
//
//public class ProducerTest extends Thread{
//
//    private static final Logger LOG = LoggerFactory.getLogger(Producer.class);
//
//    /**
//     * 用户自己申请的机机账号keytab文件名称
//     */
////    private static final String USER_KEYTAB_FILE = "请修改为真实keytab文件名";
//    private static final String USER_KEYTAB_FILE = "user.keytab";
//
//    /**
//     * 用户自己申请的机机账号名称
//     */
////    private static final String USER_PRINCIPAL = "请修改为真实用户名称";
//    private static final String USER_PRINCIPAL = "bigdata";
//
//
//    // Broker地址列表
//    private final static String BOOTSTRAP_SERVER = "bootstrap.servers";
////    private final static String ZOOKEEPER_CONNECT = "zookeeper.connect";
//
//    // 客户端ID
//    private final static String CLIENT_ID = "client.id";
//
//    // Key序列化类
//    private final static String KEY_SERIALIZER = "key.serializer";
//
//    // Value序列化类
//    private final static String VALUE_SERIALIZER = "value.serializer";
//
//    // 协议类型:当前支持配置为SASL_PLAINTEXT或者PLAINTEXT
//    private final static String SECURITY_PROTOCOL = "security.protocol";
//
//    public static void main(String[] args) {
////        if (LoginUtil.isSecurityModel()) {
////            try {
////                System.out.println("Securitymode start.");
////                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
////                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
////                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
////                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
////                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
////                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
////
////                // !!注意，安全认证时，需要用户手动修改为自己申请的机机账号
////                LoginUtil.securityPrepare(USER_PRINCIPAL, USER_KEYTAB_FILE);
////            } catch (IOException e) {
////                LOG.error("Security prepare failure.");
////                LOG.error("The IOException occured.", e);
////                return;
////            }
////            LOG.info("Security prepare success.");
////        }
//
//        // 是否使用异步发送模式
////        final boolean asyncEnable = false;
////        Producer producerThread = new Producer(KafkaProperties.TOPIC, asyncEnable);
////        producerThread.start();
//
//
//        Properties props = new Properties();
//        KafkaProperties kafkaProc = KafkaProperties.getInstance();
//
//        // Broker地址列表
////        props.put(BOOTSTRAP_SERVER, kafkaProc.getValues(BOOTSTRAP_SERVER, "10.31.68.180:21007"));
//        props.put(BOOTSTRAP_SERVER, kafkaProc.getValues(BOOTSTRAP_SERVER, "192.168.1.100:9092"));
////        props.put(ZOOKEEPER_CONNECT, kafkaProc.getValues(ZOOKEEPER_CONNECT, "10.31.69.191:2181"));
//        // 客户端ID
//        props.put(CLIENT_ID, kafkaProc.getValues(CLIENT_ID, "DemoProducer"));
//        // Key序列化类
//        props.put(KEY_SERIALIZER,
//                kafkaProc.getValues(KEY_SERIALIZER, "org.apache.kafka.common.serialization.StringSerializer"));
//        // Value序列化类
//        props.put(VALUE_SERIALIZER,
//                kafkaProc.getValues(VALUE_SERIALIZER, "org.apache.kafka.common.serialization.StringSerializer"));
//        // 协议类型:当前支持配置为SASL_PLAINTEXT或者PLAINTEXT
//        props.put(SECURITY_PROTOCOL, kafkaProc.getValues(SECURITY_PROTOCOL, "SASL_PLAINTEXT"));
//
//        KafkaProducer<String, String> producer = new KafkaProducer<String, String>(props);
//    }
//
//
//    private static Map<String, Object> propsToMap(Properties properties) {
//        Map<String, Object> map = new HashMap(properties.size());
//        Iterator var2 = properties.entrySet().iterator();
//
//        while(var2.hasNext()) {
//            Map.Entry<Object, Object> entry = (Map.Entry)var2.next();
//            if (!(entry.getKey() instanceof String)) {
//                throw new ConfigException(entry.getKey().toString(), entry.getValue(), "Key must be a string.");
//            }
//
//            String k = (String)entry.getKey();
//            map.put(k, properties.get(k));
//        }
//
//        return map;
//    }
//}
