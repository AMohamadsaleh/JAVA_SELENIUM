package day1;

public class SearchElementInArray {
    public static void main(String[] args) {
        int a[] = {12,34,56,89,23,33};
        int search_element = 89;
        boolean status = false;

        for(int i:a){
            if(i==search_element){
                System.out.println("Element Found");
                status = true;
                break;
            }

        }
        if (!status){
        System.out.println("Element Not Found");}
    }

}
