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
 * Unit test for simple MultiEnvDemo.
 */
@RunWith(SpringRunner.class)
@ActiveProfiles(profiles = "uat")
@ContextConfiguration(value = "classpath:spring/spring-context.xml")
public class MultiEnvDemoTest {

    @Autowired
    private GenericEnv env;

    @Autowired
    private DatasourceProperties datasourceProperties;

    @Autowired
    private JMSProperties jmsProperties;

    @Test
    public void testApp() {
        env.show();
        System.out.println(datasourceProperties);
        System.out.println(jmsProperties);
    }


}
