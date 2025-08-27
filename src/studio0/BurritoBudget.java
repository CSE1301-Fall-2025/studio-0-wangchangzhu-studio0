package studio0;

public class BurritoBudget {

		public static void main(String args[]) {
		double burritosEatenWeek1 = 7.0;
		int burritosEatenWeek2 = 4;
		int burritosEatenWeek3 = 19; //don't judge me
		int burritosEatenWeek4 = 1;
		
		double totalBurritos = burritosEatenWeek1 + burritosEatenWeek2 + burritosEatenWeek3 + burritosEatenWeek4;
		double averageWeeklyBurritos = totalBurritos / 4;
		
		double burritoPrice = 7.50;
		double averageWeeklyPrice = averageWeeklyBurritos * burritoPrice;
		
		System.out.println("You have spent an average of $" + averageWeeklyPrice + " per week on burritos.");
		System.out.println("Can you afford to buy 10 burritos in one week? " + (averageWeeklyPrice * 10 < 100));
		System.out.println("Is Burritos really that delicious?");
		
	
	}
}
