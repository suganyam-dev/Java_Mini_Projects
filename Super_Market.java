package SuperMarket;
import java.util.Scanner;
import java.util.ArrayList;

public class Super_Market {
	
	

	

			public static void main(String[] args) {
				Scanner mar =new Scanner(System.in);
		      int c;
		      int item;
		      int qua;
		      int total = 0;
		      char choice;

		      ArrayList<String> billList = new ArrayList<>();

		      do {
		    	 
		    	 System.out.println("1. Biscuit");
		    	 System.out.println("2. Juice");
		    	 System.out.println("3. Chocolate");
		    	 System.out.println("4 exit");
		    	 System.out.println("Enter the item number:" );
		    	 c = mar.nextInt();
		    	 
		         switch (c) {
		        case 1:
		        	 System.out.println("1. Parle     - 1 pack (Rs.40)");
		             System.out.println("2. Good Day  - 1 pack (Rs.50)");
		             System.out.println("3. Oreo      - 1 pack (Rs.30)");
		             System.out.println("Enter your choice: ");
		             item = mar.nextInt();
		             System.out.println("Enter pack: ");
		             qua = mar.nextInt();
		             switch (item) {
		             case 1:
		                 total += qua * 40;
		                 billList.add("Parle       x" + qua + " pack = Rs." + (qua * 40));
		                 break;
		             case 2:
		                 total += qua * 50;
		                 billList.add("Good Day    x" + qua + " pack = Rs." + (qua * 50));
		                 break;
		             case 3:
		                 total += qua * 30;
		                 billList.add("Oreo        x" + qua + " pack = Rs." + (qua * 30));
		                 break;
		             default:
		                 System.out.println("Invalid choice!!");
		         }
		         break;
		        case 2:
		            System.out.println("1. Orange Juice     - 1 bottle (Rs.200)");
		            System.out.println("2. Watermelon Juice - 1 bottle (Rs.500)");
		            System.out.println("3. Mango Juice      - 1 bottle (Rs.150)");
		            System.out.println("Enter your choice: ");
		            item = mar.nextInt();
		            System.out.println("Enter bottle: ");
		            qua = mar.nextInt();
		            switch (item) {
		                case 1:
		                    total += qua * 200;
		                    billList.add("Orange Juice     x" + qua + " btl = Rs." + (qua * 200));
		                    break;
		                case 2:
		                    total += qua * 500;
		                    billList.add("Watermelon Juice x" + qua + " btl = Rs." + (qua * 500));
		                    break;
		                case 3:
		                    total += qua * 150;
		                    billList.add("Mango Juice      x" + qua + " btl = Rs." + (qua * 150));
		                    break;
		                default:
		                    System.out.println("Invalid choice!!");
		            }
		            break;

		        case 3:
		            System.out.println("1. Ferrero Rocher - 1 bar (Rs.80)");
		            System.out.println("2. KitKat         - 1 bar (Rs.100)");
		            System.out.println("3. Munch          - 1 bar (Rs.40)");
		            System.out.println("Enter your choice: ");
		            item = mar.nextInt();
		            System.out.println("Enter pack: ");
		            qua = mar.nextInt();
		            switch (item) {
		                case 1:
		                    total += qua * 80;
		                    billList.add("Ferrero Rocher   x" + qua + " bar = Rs." + (qua * 80));
		                    break;
		                case 2:
		                    total += qua * 100;
		                    billList.add("KitKat           x" + qua + " bar = Rs." + (qua * 100));
		                    break;
		                case 3:
		                    total += qua * 40;
		                    billList.add("Munch            x" + qua + " bar = Rs." + (qua * 40));
		                    break;
		                default:
		                    System.out.println("Invalid choice!!");
		            }
		            break;

		        case 4:
		            System.out.println("Exiting...");
		            break;

		        default:
		            System.out.println("Invalid choice!!");
		    }

		    if (c != 4) {
		        System.out.println("Do you want to continue shopping (y/n): ");
		        choice = mar.next().toLowerCase().charAt(0);
		    } else {
		        choice = 'n';
		    }

		} while (choice == 'y');

		System.out.println("          FINAL BILL          ");
		if (billList.isEmpty()) {
		    System.out.println("  No items purchased.");
		} else {
		    System.out.println("  Item                   Price");
		    System.out.println("------------------------------");
		    for (String entry : billList) {
		        System.out.println("  " + entry);
		    }
		    System.out.println("------------------------------");
		    System.out.println("  TOTAL          :  Rs." + total);
		}

		mar.close();
		}
		


	


}
