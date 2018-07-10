package com.marvin.spring.scope;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class ScopeTest {
    @Autowired
    Basketball basketball1;
    @Autowired
    Basketball basketball2;

    @Autowired
    Football football1;
    @Autowired
    Football football2;

    @Test
    public void single(){
        Assert.assertTrue(football1 == football2);
    }

    @Test
    public void prototype(){
        Assert.assertFalse(basketball2 == basketball1);
    }

}
