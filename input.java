import java.util.Scanner;

class input{
    public static void main ( String args[])
    {

    int marks[]= new int [100];
    System.out.println("Enter  your marks");
    Scanner sc= new Scanner(System.in);
    marks[0] = sc.nextInt();
     marks[1] = sc.nextInt();
      marks[2] = sc.nextInt();
    System.out.println( " physices marks" + marks[0]);

 System.out.println( " Chemsetry marks" + marks[1]);
 System.out.println( " Math  marks" + marks[2]);
 

    
    }
}