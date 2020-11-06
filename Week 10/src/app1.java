import java.util.*;

public class app1 {

	static Scanner keyboard = new Scanner(System.in);
	
	public class dmvGuest {
		String Name;
		int numLine;
		char licType;		
	
	public dmvGuest(String Name, int numLine, char licType) {
		super();
		this.Name = Name;
		this.numLine = numLine;
		this.licType = licType;
		
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			
		PriorityQueue<dmvGuest> dmvLine = new PriorityQueue<dmvGuest>();
		
		//Current Guest List
		
		dmvGuest guest1 = new dmvGuest("Mary Smith", 1, 'M');
		
		dmvGuest guest2 = new dmvGuest("Rich Atkin", 2, 'C');

		dmvGuest guest3 = new dmvGuest("Elon Mask", 3, 'C');
	
		dmvGuest guest4 = new dmvGuest("Monique Filmore", 4, 'M');
		
		dmvGuest guest5 = new dmvGuest("David Abernathy", 5, 'C');
		
		dmvGuest guest6 = new dmvGuest("Delphin Amert", 6, 'C');
		
		dmvGuest guest7 = new dmvGuest("Stewie Hubert", 7, 'C');
	
		dmvGuest guest8 = new dmvGuest("Moe Howard", 8, 'C');
	
		dmvGuest guest9 = new dmvGuest("Aaron Moe", 9, 'C');
		
		dmvGuest guest10 = new dmvGuest("Devon Nash", 10, 'C');
		
		//Adding Guests to Queue
			
			dmvLine.add(guest1);
			dmvLine.add(guest2);
			dmvLine.add(guest3);
			dmvLine.add(guest4);
			dmvLine.add(guest5);
			dmvLine.add(guest6);
			dmvLine.add(guest7);
			dmvLine.add(guest8);
			dmvLine.add(guest9);
			dmvLine.add(guest10);


		//Menu Choices print out
		
		int menuChoice = 0;
		
			
			System.out.println("Welcome to DMV line management system. \n");
			System.out.println("What would you like to do today? \n");
			System.out.println("1.   Add a new guest. \n");
			System.out.println("2.   Remove the first guest. \n");
			System.out.println("3.   Sort the guests by name. \n");
			System.out.println("4.   Search for a guest. \n");
			System.out.println("5.   Display guest list. \n");
			System.out.println("6.   Exit.");
			
		
			menuChoice = keyboard.nextInt();
		
		
			switch(menuChoice) {
			
			// Add new Guest
			case 1:
			
				String Name = keyboard.toString();
				int lineNum = keyboard.nextInt();
				char licType = keyboard.next().charAt(0);
				
				
		System.out.println("Please input the new Guest's information.");
			dmvLine.add(new dmvGuest(Name, lineNum, licType));
		
		    //Print out queue
				System.out.println(dmvLine);
				
				break;
		
			
			case 2:
				
				// Removing the first guest
				dmvLine.remove(guest1);
		
				System.out.println(dmvLine);
				
				break;
		
		
			case 3:
		
			// Sort the queue by name
		
			while(true) {
				dmvGuest name = dmvLine.poll();
				System.out.println(name);
				
				if(name == null) break;
				
			}
			
			//Search the List
			case 4:
			
				
			case 5:
				// Displaying list option
				System.out.print(dmvLine);
				
				break;
				
			case 6:
				//Exit option
				keyboard.close();
				
				break;
			
			
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

