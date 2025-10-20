package org.example.MultiThread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *  @Overview:
 *      { extend Thread } vs { implement Runnable }
 *
 *  @Method:
 *      start()
 *      run()
 *      sleep()
 *      join()
 *      yeild()
 *      setPriority()
 *      isAlive()
 *
 *  @Thread-Synchonization
 *  class-level lock  vs  object-level lock
 *
 *  @Executor-Service
 *  @Thread-Pool
 *      Thread Pool Manager
 *      Executor Service để quản lý nhiều Thread, cái thiện performance
 *
 *  @DeadLock
 *  @LiveLock
 */
public class MT {
    static class Counter {
        int count;
        public Counter(int count) {
            this.count = count;
        }
        public synchronized void increase() {
            count++;
            //System.out.println("Count is "+count);
        }
    }
    static class TestThread2 implements Runnable {

        String nameThread;
        Counter counter;
        public TestThread2(String nameThread, Counter counter) {
            this.nameThread = nameThread;
            this.counter = counter;
        }
        private void increase() throws InterruptedException {
            Thread.sleep(10);
            counter.increase();
        }
        @Override
        public void run() {
            for (int i =0 ; i< 100;i++) {
                try {
                    increase();
                //    System.out.println(this.nameThread + " with index "+i+ " run on "+Thread.currentThread().getName()+" count "+count);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
              //  count++;
              //  System.out.println(this.nameThread + " with index "+i+ " run on "+Thread.currentThread().getName()+" count "+count);
            }
        }
    }
    static class TestThread extends Thread {
        String nameThread;
        public TestThread(String nameThread) {
            this.nameThread = nameThread;
        }

        @Override
        public void run() {
            for (int i =0 ; i< 100;i++) {
                System.out.println(this.nameThread + " with index "+i + " run on "+ Thread.currentThread().getName());
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TestThread thread1 = new TestThread("thread 1");
        Counter counter = new Counter(0);
        Thread thread2 = new Thread(new TestThread2("thread 2", counter));
        Thread thread3 = new Thread(new TestThread2("thread 3", counter));
        Thread thread4 = new Thread(new TestThread2("thread 4", counter));
        // TestThread2 thread3 = new TestThread2("thread 3");
        //thread1.start();
        /*  Khi bạn gọi .start():
                + JVM tạo một luồng mới
                + Và luồng đó sẽ tự động gọi lại run() trong Runnable
         */
//        thread2.start();
//        thread3.start();
//        thread4.start();
//
//        // Đợi các Thread cùng hoàn thành
//        thread2.join();
//        thread3.join();
//        thread4.join();
        System.out.println("before count: "+counter.count);

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i< 100; i++) {
            // Passing runnable task
            // Mỗi lần gọi submit(task) là nộp một task mới vào hàng đợi (queue) của ExecutorService.
            // Nó sẽ lần lượt được thread trong pool lấy ra chạy song song hoặc nối tiếp, tùy cấu hình pool.
            executorService.submit(new TestThread2("thread " + i, counter));
        }

        // shutdown() → không nhận task mới, nhưng các task cũ vẫn chạy.
        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS); // 🔹 Đợi tất cả task xong
        System.out.println("after count: "+counter.count);

    }
}
