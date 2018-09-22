package com.springmvc.learn;

import com.springmvc.learn.config.DatasourceProperties;
import com.springmvc.learn.config.JMSProperties;
import com.springmvc.learn.env.GenericEnv;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@ActiveProfiles(profiles = "prd")
@ContextConfiguration(value = "classpath:spring/spring-context.xml")
public class AppTest{

    @Autowired
    private GenericEnv env;

    @Autowired
    private DatasourceProperties datasourceProperties;

    @Autowired
    private JMSProperties jmsProperties;

    @Test
    public void testApp() {
        System.out.println(env.getClass().getSimpleName() + ", " + env);
        System.out.println(datasourceProperties);
        System.out.println(jmsProperties);
    }


}
