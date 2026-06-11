import java.util.*;
class Starpatterns1{
	
	public static void printPattern(int count){
		for (int i = 0; i < count; i++)
		{
		for (int j = 0; j < count; j++)
		{
			System.out.print("*");
		}
		System.out.println();
		}
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter count you need print squar pattern: ");
		int count = input.nextInt();
		printPattern(count);
	}
	
}
