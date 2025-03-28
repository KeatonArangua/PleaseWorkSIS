import java.util.ArrayList;
import java.util.Scanner;

public class Runner
	{
		
		public static void main (String args[])
			{
			StudentArrayMaker.armain();
			GradeOrClassChange();

			}
		
		
		public static void GradeOrClassChange()
			{
				System.out.println("Which student would you like to modify?");
				printNames();
				
					Scanner scanner = new Scanner(System.in);
					int number = scanner.nextInt();
					
					
				System.out.println(StudentArrayMaker.studentList.get(number - 1).getFirstname() + " " + StudentArrayMaker.studentList.get(number - 1).getLastname()  );
					System.out.println("1. " + StudentArrayMaker.studentList.get(number - 1).getPeriodone() + " " + StudentArrayMaker.studentList.get(number - 1).getPeriodoneg());
					System.out.println("2. " + StudentArrayMaker.studentList.get(number - 1).getPeriodTwo() + " " + StudentArrayMaker.studentList.get(number - 1).getPeriodTwog());
					System.out.println("3. " + StudentArrayMaker.studentList.get(number - 1).getPeriodThree() + " " + StudentArrayMaker.studentList.get(number - 1).getPeriodThreeg());
					
					System.out.println();
					System.out.println("What would you like to do?");
					System.out.println("1. Change Grade");
					System.out.println("2. Switch Classes");
					int oneOrTwo = scanner.nextInt();
					
					
					if(oneOrTwo == 1)
						{
							//need to access all information for student including grades
							System.out.println("Which period grade would you like to change?");
							
							int periodGrade = scanner.nextInt();
							
							if(periodGrade == 1)
								{
								
									System.out.println("P1 grade is currently: " + StudentArrayMaker.studentList.get(number-1).getPeriodoneg());
									System.out.println("What would you like to change it to?");
									
									System.out.println();
									String newGrade = scanner.nextLine();
									String gradeChange = scanner.nextLine();
									StudentArrayMaker.studentList.get(number-1).setPeriodoneg(gradeChange);
									System.out.println("P1 new grade is: " + StudentArrayMaker.studentList.get(number - 1).getPeriodone() + " " + StudentArrayMaker.studentList.get(number - 1).getPeriodoneg());
									namesAndGrades();
								}
							if(periodGrade == 2)
								{
									System.out.println("P2 grade is currently: " + StudentArrayMaker.studentList.get(number-1).getPeriodTwog());
									System.out.println("What would you like to change it to?");
									
									System.out.println();
									String newGrade = scanner.nextLine();
									String gradeChange = scanner.nextLine();
									StudentArrayMaker.studentList.get(number-1).setPeriodTwog(gradeChange);
									System.out.println("P2 new grade is: " + StudentArrayMaker.studentList.get(number - 1).getPeriodTwo() + " " + StudentArrayMaker.studentList.get(number - 1).getPeriodTwog());
									namesAndGrades();
								}
							if(periodGrade == 3)
								{
									System.out.println("P3 grade is currently: " + StudentArrayMaker.studentList.get(number-1).getPeriodThreeg());
									System.out.println("What would you like to change it to?");
									
									System.out.println();
									String newGrade = scanner.nextLine();
									String gradeChange = scanner.nextLine();
									StudentArrayMaker.studentList.get(number-1).setPeriodThreeg(gradeChange);
									System.out.println("P3 new grade is: " + StudentArrayMaker.studentList.get(number - 1).getPeriodThree() + " " + StudentArrayMaker.studentList.get(number - 1).getPeriodThreeg());
									namesAndGrades();
								}
							
						}
					if(oneOrTwo == 2)
						{
							System.out.println("Which class period would you like to change?");
							
							
							int periodChange = scanner.nextInt();
							
							if(periodChange == 1)
								{
									System.out.println("Their current first period class is " + StudentArrayMaker.studentList.get(number-1).getPeriodone() + ". What first period would you like to change them into?");
									String classInto = scanner.nextLine();
									String newClass = scanner.nextLine();
									System.out.println("They have been changed into first period " + newClass);
									StudentArrayMaker.studentList.get(number-1).setPeriodone(classInto);
								}
							if(periodChange == 2)
								{
									System.out.println("Their current second period class is " + StudentArrayMaker.studentList.get(number-1).getPeriodTwo() + ". What second period would you like to change them into?");
									String classInto = scanner.nextLine();
									String newClass = scanner.nextLine();
									System.out.println("They have been changed into second period " + newClass);
									StudentArrayMaker.studentList.get(number-1).setPeriodTwo(classInto);
									System.out.println(StudentArrayMaker.studentList.get(number-1).getPeriodTwo());
								}
							if(periodChange == 3)
								{
									System.out.println("Their current third period class is " + StudentArrayMaker.studentList.get(number-1).getPeriodTwo() + ". What third period would you like to change them into?");
									String classInto = scanner.nextLine();
									String newClass = scanner.nextLine();
									System.out.println("They have been changed into third period " + newClass);
									StudentArrayMaker.studentList.get(number-1).setPeriodThree(classInto);
								}
						}
					else 
						{
							//System.out.println("That is not an option.");
							
						}

				}
		
		public static void printNames()
		{
			for(int i = 0; i < StudentArrayMaker.studentList.size(); i++)
				{
					System.out.println(i+1 + ". " + StudentArrayMaker.studentList.get(i).getFirstname() + " " + StudentArrayMaker.studentList.get(i).getLastname());
					//System.out.println(StudentArrayMaker.studentList.get(i).getLastname());
				}
		}
		
		public static void namesAndGrades()
		{
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			
			
			System.out.println(StudentArrayMaker.studentList.get(number - 1).getFirstname() + " " + StudentArrayMaker.studentList.get(number - 1).getLastname()  );
				System.out.println("1. " + StudentArrayMaker.studentList.get(number - 1).getPeriodone() + " " + StudentArrayMaker.studentList.get(number - 1).getPeriodoneg());
				System.out.println("2. " + StudentArrayMaker.studentList.get(number - 1).getPeriodTwo() + " " + StudentArrayMaker.studentList.get(number - 1).getPeriodTwog());
				System.out.println("3. " + StudentArrayMaker.studentList.get(number - 1).getPeriodThree() + " " + StudentArrayMaker.studentList.get(number - 1).getPeriodThreeg());
		}
	}
	