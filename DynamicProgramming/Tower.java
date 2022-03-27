package towerOfHanoi;

public class Tower {
    public static void main(String[] args) {
        int n=3;
        shiftDisk(n,'A','B','C');

    }
    public static void shiftDisk(int n,char TA,char TB,char TC) {
        if (n==1) {
            System.out.println("Disk 1 is shifted from "+TA + " to " +TC);}
            else
            {
                shiftDisk(n-1,TA,TC,TB);
                System.out.println("Disk "+n+ " from "+TA+" is shifted to "+TB);
                shiftDisk(n-1,TB,TA,TC);
            }
        }
    }


/* OUTPUT

Disk 1 is shifted from A to C
Disk 2 from A is shifted to B
Disk 1 is shifted from B to C
Disk 3 from A is shifted to B
Disk 1 is shifted from B to C
Disk 2 from B is shifted to A
Disk 1 is shifted from A to C
*/

