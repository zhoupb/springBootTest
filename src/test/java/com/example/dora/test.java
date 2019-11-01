package com.example.dora;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: zhoupb
 * @Description: test
 * @since: version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class test {

    @Test
    public void test2() {

        String[] a = {"1", "2", "3"};
        List<String> list = Arrays.asList(a);
        List<String> list1 = new ArrayList<>(list);
        list1.add("5");
        System.out.println(list);

    }

}
