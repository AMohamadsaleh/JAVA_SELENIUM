package day1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int a[] = {100,222,3345,324,56,23,335,66,195};
        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(a));

        String s[] = {"AZ", "AM", "Mu", "Mb"};

        System.out.println(Arrays.toString(s));
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));

        }



    }




