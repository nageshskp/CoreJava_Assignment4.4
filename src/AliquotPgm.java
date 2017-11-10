// Importing the scanner class
import java.util.Scanner;
 
public class AliquotPgm {


	public int GetAliquotSum(int intNumber) {
		

        int remains = 1;

        int sum = remains;


        for(int i = 2; i <= intNumber / 2; i++)
        {
            if(intNumber % i == 0) sum += i;
        }

        
		return sum;
	}
	//Declaring Main Class for AliquotPgm class
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 	int result ;
		 	int i;
			Scanner read = new Scanner(System.in);


			System.out.println("Please enter a number to find out the AliquotSum:");

			int input = read.nextInt();
	        

			AliquotPgm aliquotSum =new AliquotPgm();
			

			System.out.print("Aliquotsum of given number is : " + aliquotSum.GetAliquotSum(input));
			System.out.println();
			
			System.out.println("Print All the Perfect numbers between 1 to 100");
			for (i= 1 ; i<=100 ; i++) {
			 
				result=aliquotSum.GetAliquotSum(i);
			 
				if (result==i)
				{
					System.out.println(i);
				}
			}
			
	   
	    read.close();
	}

}