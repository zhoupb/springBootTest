package com.example.springbootdemo;

import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

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

        // 无参创建
        //CompletableFuture<String> noArgFuture = new CompletableFuture<>();
        // 传入相应任务，无返回值
        // runAsync方法可以在后台执行异步运算，但是并没有返回值，  持有一个Runable对象
//        CompletableFuture noReturn = CompletableFuture.runAsync(()->{
//            // 执行逻辑，无返回值
//        });

        // 传入相应任务，有返回值
        // 此时我们返回的事Completable<T> T是你想返回的返回值的类型  其中Suppplier<T>是一个简单的函数式接口
        CompletableFuture<String> future = CompletableFuture.supplyAsync(new Supplier<String>() {
            @Override
            public String get() {
                return "hasReturn";
            }
        });

        // 也可以使用lambda表达式使上边的逻辑更加简单
//        CompletableFuture<String> hasReturnLambda = CompletableFuture.supplyAsync(TestFuture::get);
//CompletableFutureCompletableFuture
//        private static String get() {
//            return "hasReturnLambda";
//        }

            test.get();







    }

    // 获取返回值
    // 异步任务也是有返回值的，当我们需要用到异步任务的返回值的时候，我们可以调用CompletableFuture的get()方法
    //  进行阻塞，知道异步任务执行完毕才往下执行
    private static String get(){
        System.out.println("开始");
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("结束");
        return "牛逼了你";
    }
}
