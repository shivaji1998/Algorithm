package linearSearch;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        int a1[] = new int[] {6,4,5,8,2,1,9};
        Scanner s1 = new Scanner(System.in);
        int count=0;
        System.out.println("Enter the element to be searched");
        int key =s1.nextInt();
        for (int i=0;i<a1.length;i++) {
            if (a1[i]==key)
                {
                System.out.println("Element found at index "+ i);
                count++;
               }

        }
        if (count==0)
            System.out.println("Elements not found");
    }
}
