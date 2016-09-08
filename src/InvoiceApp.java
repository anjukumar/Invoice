import java.util.InputMismatchException;
import java.util.Scanner;
public class InvoiceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		double myPrices[] = new double[100];
		//add prices to array. 
		//Use a counter to keep track of how many items are in your array.
		int counter = 0;//add prices to array. 
		Scanner keyboard = new Scanner(System.in);
		double number=0;
		double total =0;
		System.out.println("Enter tax rate");

		double tax = keyboard.nextDouble(); 
		keyboard.nextLine();
		try
		{
			for(int x=0 ; x <100; x++)
			{

				System.out.println("Enter price");
				number =keyboard.nextDouble(); 
				counter +=1;

				if(number==0)
					break;
				else 
				{	
					myPrices[x]=number;
					total = total + number;
				}

			}
				for (int i=0;i <counter; i++)
				{
					System.out.printf("The price is %.02f\n",myPrices[i]);
				} 


				double Final = total* (tax/100);
				System.out.println("The total "+total);
				System.out.println("The tax : "+Final);

			
		}
		catch(InputMismatchException Ex)
		{
			System.out.println("Input has to be a Number");
			//System.out.println(Ex.getMessage());
		}

		finally
		{
			keyboard.close();
		}
	}

}


