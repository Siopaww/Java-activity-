import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("WW");
		System.out.println("Written work 1");
		int x = input.nextInt();
		System.out.println("Written work 2");
		int y = input.nextInt();
		System.out.println("Written work 3");
		int z = input.nextInt();

		int sum;
		sum = x + y + z;
		float ave;
		double gg;
		gg = sum * 0.20;
		ave = sum  /  3;

		System.out.println("Percent is:" + gg);
		System.out.println("Average is:" + ave);



	}
}