package sortSolutions;

public class Sort {
    public static void selectionSort(int[] a1) {
        for (int i=0;i<a1.length;i++) {
            int k1 = i;
            for (int j=i+1;j<a1.length;j++) {
                if (a1[j]<a1[k1]) {
                    k1=j;
                }
            }
            int swap = a1[i];
            a1[i]=a1[k1];
            a1[k1]= swap;
        }
        for (int i=0;i<a1.length;i++) {
            System.out.print(a1[i]+ " ");
        }
    }
    public static void main(String[] args) {
            int[] a1= new int[] {3,7,8,2,1,9,4};
            selectionSort(a1);
    }
}
