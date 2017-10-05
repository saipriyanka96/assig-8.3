//In this program we are using Aliquot sum of perfect nummbers
//by using Has-A relationship
package aliquot;
//we  created a package which represent the program
public class AliquotSum {
//this is the main class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//main method
		int a=20;
//here i used an integer type to check whether it a perfect number or not
		long aliquotSum=findAliquotSum(a);
//here declaring a long data type which is of 8 bytes and inserting argument in the method
		System.out.println("Aliquot Sum of" +aliquotSum+"is"+aliquotSum+".");
		//here we are applying if & else condition to check the condition
		if(aliquotSum==a)
		{
		//if aliquotSum equals to number then it print if condition otherwise it prints else statement
		System.out.println(a+"is a perfect number");
		}
		else
		{
			System.out.println(a+"is a perfect number");
		}
		System.out.println("perfect number between 1 to 100 are:");
		//here we are initializing the number between 1 to 100
		
		for(int i=1;i<100;i++){
			a=i;
			if(findAliquotSum(i)==a)
			{
				System.out.print(a+"");
			}
		}
	}
	//here we are implemented the method for finding the aliquot sum
public static long findAliquotSum(int n)
{
	int show=0;
	for(byte i=1;i<=(n/2);i++)
		//here it checks condition of the number and adds the sum of divisors
	{
		if(n%i==0)
		{
			show +=i;
		}
	}
	return show;
}
}
