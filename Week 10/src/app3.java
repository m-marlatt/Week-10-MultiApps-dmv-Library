import java.util.*;

public class app3 {

	static Scanner keyboard = new Scanner(System.in);
	
	public class returBk {
		String Name;
		String Genre;
		int numDrop;
		int dayLate;		
		char truVar;
		
	public returBk(String Name, String Genre, int numDrop, int dayLate, char truVar) {
		super();
		this.Name = Name;
		this.Genre = Genre;
		this.numDrop = numDrop;
		this.dayLate = dayLate;
		this.truVar = truVar;
		
		}
	public int compareTo(returBk book1, returBk book2, returBk book3, returBk book4, returBk book5,returBk book6)
	{
		// TODO Auto-generated method stub
		
		return (book1.dayLate, book2.dayLate, book3.dayLate, book4.dayLate, book5.dayLate, book6.dayLate);
	}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<returBk> bookDrop = new Stack<returBk>();
		
		
		returBk book1 = new returBk("Dust in the Desert", "Historical Fiction", 1, 20, 'F');
		returBk book2 = new returBk("Eragon", "Fantasy", 2, 35, 'F');
		returBk book3 = new returBk("JFK the Facts", "Biographies", 3, 54, 'T');
		returBk book4 = new returBk("Life in The Congo","World Travels", 4, 0, 'T');
		returBk book5 = new returBk("The Nuremburg Trials", "History", 5, 12, 'T');
		returBk book6 = new returBk("The Odyssey", "Greek Classics", 6, 7, 'F');
		
		//Adding books to return pile
			
			bookDrop.add(book1);
			returBk.add(book2);
			returBk.add(book3);
			returBk.add(book4);
			returBk.add(book5);
			returBk.add(book6);


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
				char licType = keyboard.char();
				
				
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
