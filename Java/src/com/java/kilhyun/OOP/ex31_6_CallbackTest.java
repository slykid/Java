package com.java.kilhyun.OOP;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ex31_6_CallbackTest {
    private ExecutorService executorService;

    public ex31_6_CallbackTest() {
        executorService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );
    }

    private CompletionHandler<Integer, Void> callback = new CompletionHandler<Integer, Void>()
    {
        @Override
        public void completed(Integer result, Void attachment) {
            System.out.println("completed() ½ÇÇà " + result);
        }

        @Override
        public void failed(Throwable exc, Void attachment) {
            System.out.println("failed() ½ÇÇà " + exc.toString());
        }
    };

    public void doWork(final String x, final String y)
    {
        Runnable task = new Runnable() {
          @Override
          public void run() {
              try {
                  int intX = Integer.parseInt(x);
                  int intY = Integer.parseInt(y);
                  int result = intX + intY;

                  callback.completed(result, null);
              } catch (NumberFormatException e) {
                  callback.failed(e, null);;
              }
          }
        };
        executorService.submit(task);
    }

    public void finish() {
        executorService.shutdown();
    }

    public static void main(String[] args)
    {
        ex31_6_CallbackTest test = new ex31_6_CallbackTest();
        test.doWork("3", "3");
        test.doWork("3", "»ï");
        test.finish();
    }

}
