package com.example.dora;

import java.util.concurrent.CountDownLatch;

/**
 * @author: zhoupb
 * @Description: TestVolatile
 * @since: version 1.0
 */
public class TestVolatile implements Runnable{

    private volatile Integer num = 0;
    private static CountDownLatch latch = new CountDownLatch(10);
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++){
            num++;
        }
        latch.countDown();
    }
    public Integer getNum() {
        return num;
    }
    public static void main(String[] args) throws InterruptedException {
        TestVolatile test = new TestVolatile();
        for(int i = 0; i < 10; i++){
            new Thread(test).start();
        }
        latch.await();
        System.out.println(test.getNum());
    }

}
