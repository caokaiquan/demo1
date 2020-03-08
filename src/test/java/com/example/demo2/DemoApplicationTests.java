package com.example.demo2;

import com.example.demo2.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackages;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DemoApplicationTests {

    @Autowired
    Person person;

    @Autowired
    private BeanFactory factory;

    @Test
    public void contextLoads() {
        List<String> list = AutoConfigurationPackages.get(factory);

        System.out.println(factory);
        System.out.println(list);
    }

}
