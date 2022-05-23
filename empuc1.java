public class empuc1 {
    public static void main(String[] args) {
        int present=1;
        int abscent=0;
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == present)
            System.out.println("emp is present");
        else if (empcheck == abscent)
            System.out.println("emp is abscent");

        }
