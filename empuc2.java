public class empuc2 {
    public static void main(String[] args) {
        int  present=1;
        int hours=8;
        int rateperhour=20;
        int salary=0;
        double empcheck = Math.floor(Math.random() * 10) % 2;
           if (present == empcheck)
     salary=(rateperhour * hours);
     System.out.println(salary);

    }
