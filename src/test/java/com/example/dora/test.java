package com.example.dora;

import com.example.dora.domain.User;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: zhoupb
 * @Description: test
 * @since: version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@SpringBootApplication
public class test {

    public static void main(String[] args) {

        int n[] = { 6, 5, 2, 7, 3, 9, 8 };
        //insertSort(n);
        System.out.print("插入排序结果：");
        for (int m : n) {
            System.out.print(m + " ");
        }

    }

}
