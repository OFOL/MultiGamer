import java.util.Scanner;

public class TeamManager {
	String teamName;
//	int sessionWins = 0;
//	int gameWins = 0;
//	int highScore = 0;
//	int teamSize = 0;
	int teamID;
	int [] memberIDs = new int[6];
	private Scanner input;
	
//	public void joinTeam(int playerID) { memberIDs[0] = playerID; } //---automate insertion into array---
	
	public int getTeamID() { return teamID; }
	public String getTeamName(){ return teamName; }
	public void setTeamName(String teamName){ this.teamName = teamName; } //--- make sure it's a string
	
//	public int[] getTeamPlayers() { return memberIDs; }
	
	public TeamManager() {
		input = new Scanner(System.in);
	    System.out.print("Select team name: ");
	    teamName = input.nextLine();
		teamID = (int) (Math.random() * (999 - 100) + 100);
	}
}

