package BinarySearch;

public class Search {

    public static int BinarySearch(int[] a1,int key,int first,int last) {
        int mid = (first+last)/2;
        if (first<=last) {
            if (key==a1[mid]) {
                return mid;
            }
            if (key<a1[mid])
                return BinarySearch(a1,key,first,mid-1);
            else
                return BinarySearch(a1,key,mid+1,last);
        }
        return -1;
    }
    public static void main(String[] args) {

        int [] a1= new int[] {3,5,7,9,10};
        int index = BinarySearch(a1,5,0,a1.length-1);

        if (index==-1)
            System.out.println("Element not found");

        else
            System.out.println("Element found at index "+ index);


    }
}

