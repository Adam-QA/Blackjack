
public class Blackjack {
	

	public int Winner() {
	int[] dealer = new int[2];
	int[] player = new int[2];
	int totaldealer, totalplayer;
	
	dealer[0] = 16;
	dealer[1] = 6;
	player[0] = 12;
	player[1] = 10;
	
	totaldealer = dealer[0] + dealer[1];
	totalplayer = player[0] + player[1];
	if(totaldealer > 21 & totalplayer > 21) {
		System.out.println("You both bust");
		return 0;
		
	}
	if(totaldealer > 21) {
		System.out.println("Player wins!");
		return totalplayer;
	}
	if(totalplayer > 21) {
		System.out.println("Dealer wins");
		return totaldealer;
	}
	
	if(totaldealer >= totalplayer) {
		System.out.println("Dealer wins");
		return totaldealer;
	}
	else {
		System.out.println("Player wins!");
		return totalplayer;
	}

	}
}