import java.util.Scanner;

public class PatikaProje {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Bir sayı giriniz : ");
		int num = input.nextInt();
		double harmonikSolution = 0;
		for (double i = 1; i <= num; i++) {
			harmonikSolution += 1 / i;
		}
		System.out.println("Harmonik sonuç -> " + harmonikSolution);
	}

}
