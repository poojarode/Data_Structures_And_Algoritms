import java.util.*;
class randomNo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No");
		
		int rand = new Random().nextInt(6)+1;
		double my = 10.1111100;
		System.out.printf("$%4.2f\n", my);
		//if(no == rand){
		//	System.out.println("You won no is:" + no);
		//}else{
		//	System.out.println("You loose no is :" + rand );	
		int no = sc.nextInt();
		while(no!=rand){
			no = sc.nextInt();
			System.out.println("Try again :");

		}
		int count = 0;
		while(count != 3){
		for(int i = 0; i<5 ;i++ ) {
			for(int j =0;j<=i ;j++ ) {
				System.out.print("*");
				
			}
			System.out.println();
			if (i == 2) {
					break;
				}
		}
		count++;
		}

	}

		
	
}