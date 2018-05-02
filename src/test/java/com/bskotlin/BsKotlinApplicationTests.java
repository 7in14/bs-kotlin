package com.bskotlin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bskotlin.controllers.DataController;
import com.bskotlin.controllers.PingController;
import com.bskotlin.controllers.RaleighController;

import static org.assertj.core.api.Assertions.assertThat; 

@RunWith(SpringRunner.class)
@SpringBootTest
public class BsKotlinApplicationTests {

    @Autowired PingController pingController;
    @Autowired DataController dataController;
    @Autowired RaleighController raleighController;

    /**
     * Test that controller is loaded when app starts
     */
    @Test
    public void contextLoadsPingController() {
        assertThat(pingController).isNotNull();
    }

    @Test
    public void contextLoadsDataController() {
        assertThat(dataController).isNotNull();;
    }

    @Test
    public void contextLoadsRaleighController() {
        assertThat(raleighController).isNotNull();
    }
}
