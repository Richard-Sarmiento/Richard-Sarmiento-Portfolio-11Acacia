import java.util.Scanner;
public class YenToPesoConversion {
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
	System.out.println("Enter the amount of money in Yen");
	
	double Yen = myScanner.nextDouble();
	double Peso = Yen * .397344;
	
	System.out.println("¥" + Yen + " is equal to" + "P" + Peso);
		
	}
}