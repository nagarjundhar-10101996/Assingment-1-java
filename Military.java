public class Military {
    public static void main(String[] args) {
        int n=2350;
		
		int hour=n/100;
		int min=n%100;
		int th=hour/2;
		
		System.out.println(th+":"+min+"pm");   
    }
}
