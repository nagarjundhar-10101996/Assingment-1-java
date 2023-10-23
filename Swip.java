
import java.util.Scanner;



public class Swip {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), reversed = 0;
        int place = 1;
    System.out.println( num);
    // run loop until num becomes 9
    while(num > 9) {
        reversed += place * 10 *(num%10);
        num /= 10;
        reversed += place * (num%10);
        num /= 10;
        place *= 100;
    }
    System.out.println( reversed + place *num);
        
    } 
}
