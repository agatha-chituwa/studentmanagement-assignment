//AGATHA CHITUWA 
//BSC-COM-06-18
import java.util.Scanner;
public class StudentMan{
	public static void main(String [] args){
		
                   //CRREATING SCANNER OBJECT
	Scanner input = new Scanner(System.in);
	               //ALLOWTHE USER TO ENTER THE NAME
    System.out.print("ENTER YOOR NAME PLEASE :");
    String name = input.nextLine();
                   //ASK THE USER TO ENTER GRADES
     double [] grades= new double[3];
    System.out.println("ENTER YOR THREE GRADES SCORED :");
    for (int i = 0; i < grades.length; i++){
    grades[i] = input.nextDouble();
}