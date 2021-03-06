package com.ancyxing.designpatterns;

import com.ancyxing.designpatterns.builderpatterns.usepatterns.simpleimpl.ConcreteBuilder;
import com.ancyxing.designpatterns.builderpatterns.usepatterns.simpleimpl.Director;
import com.sun.glass.ui.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class designPatternsTest {
    @Test
    public void test(){
        ConcreteBuilder concreteBuilder = new ConcreteBuilder();
        Director director = new Director(concreteBuilder);
        director.constructBuilder("productId1","productName1", new BigDecimal(10));
        System.out.println(concreteBuilder.getProduct());
    }
}
