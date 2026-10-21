import java.util.Scanner;
public class FakeBinary
	{

		public static void main(String[] args)
			{
				Scanner userStringInput=new Scanner(System.in);
				System.out.println("Input a number.");
				String number = userStringInput.nextLine();
				String[] fakeBinaryArray = fakeBinary(number);
				for (int i = 0; i < fakeBinaryArray.length; i++ ) 
					{
					System.out.print(fakeBinaryArray[i]);
					}
			}
		public static String[] fakeBinary(String number) 
			{
				String[] newBinary = new String[number.length()];	
				for (int i = 0; i < number.length(); i++)
					{
				if (number.substring(i,i+1).equals("0") || number.substring(i,i+1).equals("1") || number.substring(i,i+1).equals("2") || number.substring(i,i+1).equals("3") || number.substring(i,i+1).equals("4"))
					{
					newBinary[i] = "0";	
					}
				else 
					{
						newBinary[i] ="1";
					}
				}
				
				return newBinary;	
			}
}
