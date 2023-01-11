package behavioral.strategy;

import java.util.Arrays;

public class BubbleSort implements Strategy{
    @Override
    public void sort(int[] arr) {
        System.out.println("BubbleSort");
        System.out.println("before:\t" + Arrays.toString(arr));
        for (int barrier = arr.length-1;barrier>=0;barrier--){
            for (int i = 0; i<barrier;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        System.out.println("after:\t" + Arrays.toString(arr));
    }
}
