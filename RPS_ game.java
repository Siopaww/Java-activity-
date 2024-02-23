import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("<_G—A—M—E_>");
		System.out.println("(1) ROCK");
		System.out.println("(2) PAPER");
		System.out.println("(3) SCISSOR");
		
		System.out.print("PLAYER ONE(1) _");
		int x = input.nextInt();
		System.out.println("" + 
		        "==[ROCK]" + 
		        "==[PAPER]==" + 
		        "[SCISSOR]==");
		 System.out.print("PLAYER TWO(2) _");
		 int y = input.nextInt();
		 
		 if( x == 1&& y == 1) {
		     System.out.println("___________");
		     System.out.println(" DRAW");
		 } else if( x == 1&& y == 2) {
		     System.out.println("___________");
		     System.out.println(" P(2) WIN!");
		 } else if( x == 1&& y == 3) {
		     System.out.println("___________");
		     System.out.println("P(1) WIN!");
		 } else if( x == 2&& y == 1 ) {
		     System.out.println("___________");
		     System.out.println("P(1) WIN!");
		 } else if( x == 2&& y == 2 ) {
		     System.out.println("___________");
		     System.out.println("DRAW");
		 } else if( x == 2&& y == 3 ) {
		     System.out.println("___________");
		     System.out.println("P(2) WIN!");		 
		 } else if( x == 3&& y == 1 ) {
		     System.out.println("___________");
		     System.out.println("P(2) WIN!");		 
		 } else if( x == 3&& y == 2 ) {
		     System.out.println("___________");
		     System.out.println("P(1) WIN!");		 
		 } else if( x == 3&& y == 3) {
		     System.out.println("___________");
		     System.out.println("DRAW");
		 } else {		     
		     System.out.println("___________");
		     System.out.println("INVALID×");
		     System.out.print("Pls exit the program");    return;
		           }
		    input.close();
		           		
	}
}