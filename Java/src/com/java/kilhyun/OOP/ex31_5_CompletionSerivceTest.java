package com.java.kilhyun.OOP;

import java.util.concurrent.*;

public class ex31_5_CompletionSerivceTest {

    public static void main(String[] args)
    {
        ExecutorService executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );

        CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(executorService);

        System.out.println("[�۾� ó�� ��û]");

        for(int i = 0; i < 3; i++)
        {
            completionService.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    int sum = 0;

                    for(int i = 0; i <= 10; i++)
                    {
                        sum += i;
                    }

                    return sum;
                }
            });
        }

        System.out.println("[ó�� �Ϸ�� �۾� Ȯ��]");

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    try {
                        Future<Integer> future = completionService.take();
                        int value = future.get();

                        System.out.println("[ó�� ���] " + value);

                    } catch(Exception e) {
                        break;
                    }
                }
            }
        });

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }

    }

}
