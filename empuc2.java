


import java.util.*;
public class cartesianuc3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3length of first line1");
        int line1 = sc.nextInt();
        System.out.print("Enter length of second line2");
        int line2 = sc.nextInt();

        if (line1 > line2) {
            System.out.print(line1 + " line1 is greater then line2");
        }
        else if (line1 < line2){
            System.out.print( line1+ " line2 is lesser then line2");
        }
        else
            System.out.print( "both lines are equal");
    }
}

