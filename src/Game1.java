import java.util.Scanner;

public class Game1 {
	
	private Scanner input;
	private int winPoints = 10;
//	private int a;
	private int b;
	
	
	public void playMe(User user) {
		
		input = new Scanner(System.in);
		System.out.print("Type something: ");
		
		if(input.nextLine().equals("A")) {
			
			user.setPoints(winPoints);
			user.won(true);
			
		} else {
			
			user.won(false);
			
		}
	}
}