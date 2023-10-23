import java.util.Scanner;

class Time
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int timemillsec = sc.nextInt();
        long second = timemillsec / 1000;//7000
        long sec = timemillsec % 1000;
        long mt = second / 60;
        long r=second%60;
        long sec1=sec%60;
        long hour= mt/60;
        long min=mt%60;
        System.out.print(hour+":"+min+":"+r);
    } 
}