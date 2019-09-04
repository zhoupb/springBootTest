package com.example.dora;

import com.example.dora.domain.User;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.java2d.pipe.SpanIterator;

import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

/**
 * @author: zhoupb
 * @Description: test
 * @since: version 1.0
 */
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
public class test {

    public static void main(String[] args) {

        User user = new User();
//        User user1 = new User();
//        user.setAge(11);
//        user1.setAge(12);
//
//        Comparator<User> comparator = new Comparator<User>() {
//            @Override
//            public int compare(User User, User user1) {
//                return user.getAge().compareTo(user1.getAge());
//            }
//        };
        // 1. 声明一个空的Optional  ：通过静态工厂方法,创建一个空的Optional对象：
        Optional<User> optionalUser = Optional.empty();

        // 依据一个非空值创建一个Option:  如果car是一个null，这段代码会立即ઊ出一个NullPointerException，而不是等到你
        //ណ图访问car的属性值时才返回一个错误。
        Optional<User> user1 = Optional.of(user);

    }

}
