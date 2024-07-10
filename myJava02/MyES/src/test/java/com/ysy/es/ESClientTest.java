package com.ysy.es;

import org.junit.Test;
import com.alibaba.fastjson.JSON;

public class ESClientTest {

    @Test
    public void test01() throws Exception {
        ESClient esClient = new ESClient();

        esClient.createClient("http://10.31.68.168:9200",
                "searchuser",
                "pAssw0d9090",
                false,
                300000,
                false,
                false);

        boolean isExists = esClient.indicesExists("liuyan_threads_full_check_org_01");
        System.out.println(isExists);
    }

    @Test
    public void test02(){
        String column = "{\"name\":\"\",\n" +
                "\"nameCase\":\"\",\n" +
                "\"filter\":\"\",\n" +
                "\"deleteFilterKey\":\"\",\n" +
                "\"column\":[]}";
        EsTable esTable = JSON.parseObject(column, EsTable.class);
        System.out.println(esTable.getColumn());
    }
}
