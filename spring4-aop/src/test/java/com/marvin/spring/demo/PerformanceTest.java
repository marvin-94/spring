package com.marvin.spring.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PerformConfig.class)
public class PerformanceTest {
    @Autowired
    Performance performance;

    @Test
    public void testPerformance() {
        performance.perform();
    }

    @Test
    public void testSong() {
        performance.song("七里香");
    }

    @Test
    public void testSayInfo() {
        performance.sayInfo("李狗蛋", 20);
    }

    @Test
    public void testPlay() {
        Play ss = (PlayImpl) performance;
        ss.play();
    }
}
