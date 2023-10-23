import java.util.Scanner;
class Days {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        
        int y = days/365;
        int m1 = days%365;
        int m = m1/30;
        int m2 = m1%30;
        int w = m2/7;
        int d = m2%7;
        System.out.print(y+" : Year ");
        System.out.print(m+": Month ");
        System.out.print(w+": Week ");
        System.out.print(d+": days ");
    }
}
