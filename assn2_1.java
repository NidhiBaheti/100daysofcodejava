/*Java Program to demonstrate the use of If else-if ladder. • program of grading system for fail (<50), • D grade -marks>=50 && marks<60
• C grade- marks>=60 && marks<70, • B grade- marks>=70 && marks<80 , • A grade- marks>=80 && marks<90 • and A+ - marks>=90 && marks<100 */

package assn2;

import java.util.Scanner;
public class assn2_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of subjects: ");
		int x = sc.nextInt(),marks;
		String grade;int i=1;
		while(i<=x) {
			System.out.println("Enter Marks of subject "+i);
			marks=sc.nextInt();
			grade = grade(marks);
			System.out.println("Your grade for subject "+i+" is "+grade+"\n");
			i++;
			
		}
		sc.close();
	}

	public static String grade(int marks) {
		// TODO Auto-generated method stub
		if(marks>=90 && marks<=100)
			return "A+";
		else if(marks>=80 && marks<90)
			return "A";
		else if(marks>=70 && marks<80)
			return "B";
		else if(marks>=60 && marks<70)
			return "C";
		else if(marks>=50 && marks<60)
			return "D";
		else if(marks<50)
			return "F";
		else
			return "Invalid Marks";
			}


}
