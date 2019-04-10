import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a number: ");
		int input = scanner.nextInt();
		
		int prevNum = 0;
		for(int i= input;i>=0;i--) {
			prevNum = i + prevNum;
		}

		System.out.println(prevNum);
	}

}
