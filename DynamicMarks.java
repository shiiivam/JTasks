import java.util.Scanner;
public class DynamicMarks
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int no,j=1;
    double avg=0;
    System.out.println("Enter number of students : ");
	no = sc.nextInt();
	double[] marks = new double[no];
	for(int i=0;i<marks.length;i++){
	    System.out.println("Enter marks "+j+":");
	    marks[i] = sc.nextDouble();
	    j++;
	}

	for(int i=0;i<marks.length;i++){
	    System.out.println("Marks of student "+j+":"+marks[i]);
	    avg = avg + marks[i];
	    j++;
	}
	System.out.println("Average marks of students : "+(avg/marks.length));
	
	}
}
