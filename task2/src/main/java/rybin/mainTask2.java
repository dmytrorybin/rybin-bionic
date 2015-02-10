package rybin;

import static rybin.task2.binarySearch;

/**
 * Created by eredin on 10.02.2015.
 */
public class mainTask2 {
    public static void main(String[] args) {
  //      int[] v = {5,3,7,1,9,8,4,2,6};
        int[] v = {1,2,3,4,5,6,7,8,9};
        int find = 2;
        int res = binarySearch(v, find);

        if (res == -1)
            System.out.println("error");
        else
            System.out.println("index of " + find + " is: " + res);
    }
}
