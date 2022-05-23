
import java.util.*;
public class cartesianuc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of first line");
        int x1 = sc.nextInt();
        System.out.print("Enter length of  second line");
        int x2 = sc.nextInt();
        if (x1 == x2)
            System.out.println("both lines are equal");
        else
            System.out.println("both lines are not equal");
    }
}

