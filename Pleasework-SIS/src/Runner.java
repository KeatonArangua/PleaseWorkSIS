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
					
					//printNames();
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
							System.out.println("1, 2, 3");
							int periodGrade = scanner.nextInt();
							
							if(periodGrade == 1)
								{
								
									System.out.println("What would you like to change their 1st period grade to?");
									String gradeChange = scanner.nextLine();
									System.out.println();
								}
							if(periodGrade == 2)
								{
									System.out.println("What would you like to change their 2nd period grade to?");
									String gradeChange = scanner.nextLine();
									System.out.println("Their grade is now " + gradeChange);
								}
							if(periodGrade == 3)
								{
									System.out.println("What would you like to change their 3rd period grade to?");
									String gradeChange = scanner.nextLine();
									System.out.println("Their grade is now " + gradeChange);
								}
							
						}
					if(oneOrTwo == 2)
						{
							System.out.println("Which class period would you like to change?");
							System.out.println("1, 2, 3");
							
							int periodChange = scanner.nextInt();
							
							if(periodChange == 1)
								{
									System.out.println("Their current first period class is ____. What first period would you like to change them into?");
									String classInto = scanner.nextLine();
									System.out.println("They have been changed into first period " + classInto);
								}
							if(periodChange == 2)
								{
									System.out.println("Their current second period class is ____. What second period would you like to change them into?");
									String classInto = scanner.nextLine();
									System.out.println("They have been changed into second period " + classInto);
								}
							if(periodChange == 3)
								{
									System.out.println("Their current third period class is ____. What third period would you like to change them into?");
									String classInto = scanner.nextLine();
									System.out.println("They have been changed into third period " + classInto);
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
	}
	