package day1;

public class Array {

    public static void main(String[] args) {
        int a[] = {32, 53, 663, 663, 23, 4455, 2345, 566, 3443, 223, 56, 9};

        int b = 0;
        for (int x : a) {

            if (x>b){
                b = x;
            }

        }
        System.out.println(b);

    }

}
