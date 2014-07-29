import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;


public class dogetracker {

	public static void main(String[] args) throws IOException {		
		
		//Variables
		String dogeSingle = "0";
		String DogeOldVal = dogeSingle;
		String dogeMil = "0";
		String dogeMilOldVal = dogeMil;
		String BTCval = "0";
		String BTCvalOld = BTCval;
		
		Scanner console = new Scanner(System.in);
		System.out.println("What coin would you like?");
		System.out.println("1. Bitcoin\n2. DogeCoin \n3. DogeCoin 1 Million");
		String coin = console.nextLine();
		

		
		BTCval = updateValues.updateVal(coin, BTCvalOld);
		dogeSingle = updateValues.updateVal(coin, DogeOldVal);
		dogeMil = updateValues.updateVal(coin, dogeMilOldVal);	

		
		
		
		if (coin.equals("1")) {
			System.out.println(BTCval);
		}
		else if (coin.equals("2")){
			System.out.println(dogeSingle);
			
		}
		else if (coin.equals("3")){
			System.out.print(dogeMil);
		}
		

	}

}
