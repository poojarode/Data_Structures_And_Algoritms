
import java.util.Scanner;
public class StringOp{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		char p = sc.next().charAt(0);
			String s = new String("Pooja");
			String a = "Pooja";
			String b = " Rode";
			String cars = "Ferrari, Audi, BMW , Mercedies, Lambhorghini, Swift, Toyota, rangrover";
			System.out.println(p);
			if( s == a){
				System.out.println("true");
			}else{
				System.out.println("false");
			}
			System.out.println(a.equals(s));
			System.out.println(a.indexOf("P") + " " + a.charAt(0));
			System.out.println(a.replace('P','a'));
			System.out.println(a.isEmpty());
			System.out.println(a.concat(b));
			System.out.println(a.length());
			System.out.println(b.trim());
			String[] carC = cars.split(",");
			for (String car: carC ) {
				System.out.println(car);
			}
			
		}
}