package threads.mergeSort;

import constructorChaining.A;

import java.util.concurrent.Callable;
import java.util.*;

public class MergeSorter implements Callable<List<Integer>> {
    List<Integer> listToSort;

    public MergeSorter(List<Integer> listToSort){
        this.listToSort = listToSort;
    }


    @Override
    public List<Integer> call()  {
        //Implement our Merge Sort Logic

        //Base case
        if(this.listToSort.size()<=1){
            return this.listToSort;
        }

        int mid = listToSort.size()/2;

        List<Integer> leftList = new ArrayList<>();

        List<Integer> rightList = new ArrayList<>();

        for(int i=0;i<mid;i++){
            leftList.add(this.listToSort.get(i));
        }

        for(int i=mid;i<this.listToSort.size();i++){
            rightList.add(this.listToSort.get(i));
        }

        MergeSorter leftMergeSorter = new MergeSorter(leftList);
        MergeSorter rightMergeSorter = new MergeSorter(rightList);

        List<Integer> leftSortedList = leftMergeSorter.call();
        List<Integer> rightSortedList = rightMergeSorter.call();

        //Merge 2 sorted arrays
        List<Integer> sortedList = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(i<leftSortedList.size() && j<rightSortedList.size()){
            if(leftSortedList.get(i) <= rightSortedList.get(j)){
                sortedList.add(leftSortedList.get(i));
                i++;
            }
            else{
                sortedList.add(rightSortedList.get(j));
                j++;
            }
        }

        if(i<leftSortedList.size()){
            for(int idx = i;idx<leftSortedList.size();idx++ ){
                sortedList.add(leftSortedList.get(idx));
            }
        }
        else{
            for(int idx = j;idx<rightSortedList.size();idx++){
                sortedList.add(rightSortedList.get(idx));
            }
        }


        return sortedList;
    }
}
