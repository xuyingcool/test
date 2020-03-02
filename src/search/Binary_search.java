package search;

import java.util.Arrays;

public class Binary_search {
    int id = 3 ;
    public static int binary_search(int[] number_array,int check){
        int low = 0;
        int high= number_array.length-1;
        int mid = 0;
        while(low<=high){
            mid = (low+high)/2;
            if(number_array[mid]>check)
                high = mid - 1;
            else if (number_array[mid]<check)
                low = mid+1;
            else
                return mid+1;
        }
        return 0;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,15,16};
        int search = 5;
        int index = binary_search(arr,search);
        if(0!=index)
            System.out.println(search+"在第"+index+"位");
        else
            System.out.println("未找到");


    }
}
