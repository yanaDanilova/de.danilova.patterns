package behavioral.strategy;

import java.util.Arrays;

public class SelectionSort implements Strategy{
    @Override
    public void sort(int[] arr) {
        System.out.println("SelectionSort");
        System.out.println("before:\t" + Arrays.toString(arr));

        for(int barrier = 0;barrier<arr.length-1;barrier++){
            for(int i = barrier+1; i < arr.length; i++){
                if(arr[i]<arr[barrier]){
                    int temp = arr[i];
                    arr[i]=arr[barrier];
                    arr[barrier]=temp;
                }
            }
        }
        System.out.println("after:\t" + Arrays.toString(arr));
    }
}
