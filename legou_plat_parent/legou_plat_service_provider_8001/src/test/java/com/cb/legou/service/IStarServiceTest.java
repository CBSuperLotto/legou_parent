package com.cb.legou.service;

import com.cb.legou.Provider8001;
import com.cb.legou.domain.Star;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Provider8001.class)
public class IStarServiceTest {
    @Autowired
    IStarService starService;

    @Test
    public void findByName() {
        Star star = new Star();
        star.setName("lisa");
        star.setPassword("123456");
        Star star1 = starService.findByName(star);
        System.out.println(star1);
    }
}