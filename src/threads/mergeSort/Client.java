package threads.mergeSort;

import java.time.Clock;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();

       for(int i=10000000;i>=1;i--){
           list.add(i);
       }

        sequential(list);

        callableExecutors(list);

    }

    public static void sequential(ArrayList<Integer> arrayList){

        long start = System.currentTimeMillis();

        MergeSorter mergeSorter = new MergeSorter(arrayList);

        var ans = mergeSorter.call();

        long end = System.currentTimeMillis();

        var time = (end-start);

        System.out.println(time);
    }

    public static void callableExecutors(ArrayList<Integer> arrayList) throws Exception {
        long start = System.currentTimeMillis();

        MergeSorter mergeSorter = new MergeSorter(arrayList);
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<List<Integer>> sortedListFuture = executorService.submit(mergeSorter);

        var res = sortedListFuture.get();

        long end = System.currentTimeMillis();

        var time = (end-start);

        System.out.println(time);
    }


}
