package org.ysy.entity;

import lombok.Data;
import lombok.Value;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Data
@SpringBootTest
public class DataSourceTest {

    @Test
    public void testDataSource01(){
        DataSource dataSource = new DataSource();

        System.out.println(dataSource.getPassword());
    }

}