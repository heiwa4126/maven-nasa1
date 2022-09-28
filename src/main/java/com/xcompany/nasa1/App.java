package com.xcompany.nasa1;

/**
 * Hello world!
 *
 */
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class App
{
    public static void main( String[] args ) throws
        IOException, InterruptedException, ExecutionException
    {
        System.out.println("-------------------- start" );
        //JavaHttpURLConnectionDemo.run();
        // JavaHttpClientDemo.run();
        ApacheHttpClientDemo.run();
        // OkHttpDemo.run();
        //RetrofitDemo.run();

        System.out.println("-------------------- end" );
    }
}
