import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("[A] SNACKS");
        System.out.println("[B] DRINKS");

        System.out.println("Enter your choice");
        char choice = input.nextLine().charAt(0);

        if (choice == 'A') {
            System.out.println("(1) PIATOS");
            System.out.println("(2) NOVA");
            System.out.println("CHOOSE SNACKS");
        } else if (choice == 'B') {
            System.out.println("(3) MILKTEA");
            System.out.println("(4) STARBUCKS");
            System.out.println("CHOOSE DRINKS");
        } else {
            System.out.println("Invalid choice");
            return; // exit the program if the choice is invalid
        }

        int gg = input.nextInt();

        if (gg == 1) {
           
		System.out.println("PIATOS(P20)");
		int pia;
		pia = 20;
		System.out.println("Quantity");
		int x = input.nextInt();
		
		int quan;
		quan = x * pia;
		
		System.out.println("Total is :" + quan);
		
		System.out.println("Enter your cash :");
		int y = input.nextInt();
		
		int tot;
		tot = y - quan;
		
		System.out.println("Change is :"+ tot);
		System.out.println("Purchased Succesfull✓");
		
		    
        } else if (gg == 2) {
            
		System.out.println("NOVA(P25)");
		int nov;
		nov = 25;
		System.out.println("Quantity");
		int x = input.nextInt();
		
		int quan;
		quan = x * nov;
		
		System.out.println("Total is :" + quan);
		
		System.out.println("Enter your cash :");
		int y = input.nextInt();
		
		int tot;
		tot = y - quan;
		
		System.out.println("Change is :"+ tot);
		System.out.println("Purchased Succesful✓");
		    
        } else if (gg == 3) {
            
		System.out.println("MILKTEA(P50)");
		int tea;
		tea = 50;
		System.out.println("Quantity");
		int x = input.nextInt();
		
		int quan;
		quan = x * tea;
		
		System.out.println("Total is :" + quan);
		
		System.out.println("Enter your cash :");
		int y = input.nextInt();
		
		int tot;
		tot = y - quan;
		
		System.out.println("Change is :"+ tot);
		System.out.println("Purchased succesfull✓");
		    
        } else if (gg == 4) {
            
		System.out.println("STARBUCKS(P150)");
		int sta;
		sta = 150;
		System.out.println("Quantity");
		int x = input.nextInt();
		
		int quan;
		quan = x * sta;
		
		System.out.println("Total is :" + quan);
		
		System.out.println("Enter your cash :");
		int y = input.nextInt();
		
		int tot;
		tot = y - quan;
		
		System.out.println("Change is :"+ tot);
		System.out.println("Purchased Succesfull✓");
		    
        } else {
            System.out.println("Invalid choice");
        }

        input.close();
    }
}
