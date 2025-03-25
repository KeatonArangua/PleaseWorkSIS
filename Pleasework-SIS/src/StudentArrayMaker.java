import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayMaker
	{

		public static void armain()
			{
				try
					{
				Scanner myFile = new Scanner(new File("StudentList.txt"));
				String studFile = myFile.next();
				ArrayList<Student> studentList = new ArrayList<Student>();
				while(myFile.hasNext())
					{
						String nextLn = myFile.nextLine();
//						String[] studInfoMaster = "la";
						
//						studentList.add(new Student(fn, ln, fp, fpg, sp, spg, tp, tpg));
					}
				System.out.println(studentList);
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
			}

	}
