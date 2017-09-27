package students;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class studentApp {

	//This makes sure the scanner for the user input is always open for the duration of the program
	//This is because user input is always needed
	private static Scanner scanner = new Scanner(System.in);;
	//This adds a new student to the Arraylist with proper prompts(I could create a check to make
	//sure the name is valid but the user can check to make sure of that
	private static void addStudent(ArrayList<student> arrayStudents) {
		 
		 String firstName = "";
		 String lastName = "";
		 String major = "";
		 double gpa = 0;
	     
		 System.out.print("First Name: ");
		 firstName = scanner.next();
		 
		 System.out.print("Last Name: ");
		 lastName = scanner.next();
		 
		 System.out.print("Major: ");
		 major = scanner.next();
		 
		 System.out.print("GPA: ");
		 gpa = scanner.nextDouble();
		 //add the student to the ArrayList
	     arrayStudents.add(new student(firstName, lastName, major, gpa)); 

	     return;
	}
	
	//Deletes a student based on sNumber stored in the arralist 
	private static void removeStudent(ArrayList<student> arrayStudents) {
		int sNum = 0;
		int arrIndex = 0;
		
		System.out.print("Delete a student with sNumber S");
		try{			
			sNum = scanner.nextInt();
		}catch(InputMismatchException exception)
		{			
			sNum = 0;
			System.out.println("That is not a number");
			scanner.close();
			
		}
		if(sNum != 0){	
			 arrIndex = sNum -1010100;
			 arrayStudents.remove(arrIndex);
			 System.out.println("Student Deleted.");
		}
		return;
			 
		
	}
	
	//this will find the student based on their Student Number
	private static void findStudent(ArrayList<student> students) {
		int sNum = 0;
		int arrIndex = 0;
		
		System.out.print("Find a Student with sNumber S");
		try{			
			sNum = scanner.nextInt();
		}catch(InputMismatchException exception)
		{			
			sNum = 0;
			System.out.println("That is not a number");
			
		}
		if(sNum != 0){	
			 arrIndex = sNum -1010100;
			System.out.println(arrIndex);
	    	 System.out.printf("S%d %s %s (%s) gpa:%.1f%n", students.get(arrIndex).getsNumber(),
								students.get(arrIndex).getFirstName(),
								students.get(arrIndex).getLastName(),
								students.get(arrIndex).getMajor(),
								students.get(arrIndex).getGpa());			
		}
		return;
	}

	//This will print the contents of the arraylist in a readable manner
	private static void printStudents(ArrayList<student> students) {
	     for (int i = 0; i < students.size(); ++i) {
	    	 System.out.printf("S%d %s %s (%s) gpa:%.1f%n", students.get(i).getsNumber(),
	    			 			students.get(i).getFirstName(),
	    			 			students.get(i).getLastName(),
	    			 			students.get(i).getMajor(),
	    			 			students.get(i).getGpa());
	    	 
	     }
	     return;
	}
	public static void main(String[] args) {
		ArrayList<student> arrayStudents = new ArrayList<student>();	
		int n = 0; // Scans the next token of the input as an int.
		
		arrayStudents.add(new student("Hilary", "Clinton", "D", 1.9));
		arrayStudents.add(new student("Donald", "Trump", "R", 1.5));
		arrayStudents.add(new student("Garry", "Johnson", "L", 4.0));
		do{
			dispayMenu();
			System.out.println("Enter your selection: ");
			//Makes sure the input is an interger so that the program does not produce and error
			try{			
				n = scanner.nextInt();
			}catch(InputMismatchException exception)
			{
				n = 0;
			}
			//The menus selection and proper calls to methods to carry out what the user requests				
			switch(n){
				case 1:
					//add a student with entry prompts
					addStudent(arrayStudents);
					break;
				case 2:
					//Find a student with their S number
					findStudent(arrayStudents);
					break;
				case 3:
					//Removes a student entry
					removeStudent(arrayStudents);
					break;
				case 4:
					//prints all student data
					printStudents(arrayStudents);
					break;
				case 5:
					//Displays the number of students
					System.out.println("Number of Students: " + arrayStudents.size());					
					break;
				case 6:
					//Exit out when user wishes to with proper parting message
					System.out.println("Bye-bye");
					break;
				default:
					//Exit out when user enters invalid entry
					System.out.println("Invalid Entry, must select 1 - 6");
			}			
		}while(n >= 1 && n <= 5);
		scanner.close();
	}

//Displays the menu
	private static void dispayMenu(){
		System.out.println("");
		System.out.println("1. Add a student");
		System.out.println("2. Find a student");
		System.out.println("3. Delete a student");
		System.out.println("4. Display all students");
		System.out.println("5. Display number of students in a list");
		System.out.println("6. Exit");
	}

}
