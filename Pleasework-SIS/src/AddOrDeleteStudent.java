import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class AddOrDeleteStudent
	{

		public static void studentMain()
			{
				Scanner answer= new Scanner(System.in);
				System.out.println("Welcome! Would you like to:");
				System.out.println("1. Add a student");
				System.out.println("2. Delete a student");
				String answerA = answer.nextLine();
				if(answerA.equals("1"))
					{
						op1();
					}
				else if(answerA.equals("2"))
					{
						op2();
					}
				else
					{
						System.out.println("Please select a valid option.");
						studentMain();
					}
			}
		public static void op1()
		{
			try
				{
			Scanner myFile = new Scanner(new File("StudentList.txt"));
			String studFile = myFile.next();
			ArrayList<Student> studentList = new ArrayList<Student>();
			while(myFile.hasNext())
				{
					String fn = myFile.next();
					String ln = myFile.next();
					String fp = myFile.next();
					String fpg = myFile.next();
					String sp = myFile.next();
					String spg = myFile.next();
					String tp = myFile.next();
					String tpg = myFile.next();
					
					studentList.add(new Student(fn, ln, fp, fpg, sp, spg, tp, tpg));
				}
			System.out.println(studentList);
				System.out.println("Please enter your student's fullname,"
						+ " first period class, grade for first period,"
						+ " second period class, grade for second period,"
						+ " third period class, and grade for third period.");
				Scanner studi = new Scanner(System.in);
				String stud = studi.nextLine();
				String[] studInfo = stud.split(" ");
				studentList.add(new Student(studInfo[0], studInfo[1], studInfo[2], studInfo[3], studInfo[4], studInfo[5], studInfo[6], studInfo[7]));
				System.out.println(studentList.getLast());
				}
			catch(NullPointerException x)
				{
				System.out.println("No more students.");
				}
			catch(FileNotFoundException y)
				{
				System.out.println("No file found.");
				}
			catch(ArrayIndexOutOfBoundsException z)
				{
				System.out.println("Out of bounds.");
				z.printStackTrace();
				}
		}
		
		public static void op2()
		{
			System.out.println("2");
		}

	}