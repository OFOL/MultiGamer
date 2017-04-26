public class User {
	
	private String name = "Default";
	private int points = 0;//count in-game points
	private int lost = 0; //count lost games
	private int won = 0;//count won games
	private int playerID;
//	private Scanner input;
	
//	private int teamID;
//	private int age = 0;
//	private int totalPlayTime = 0;	
//	private int totalPoints = 0;//counts total gained points.
//	private int maxPointsPerGame = 0;
//	private boolean allTimeChamp = false; //indicates if player is all time champ
	
//	public int getAge(){return age;}
//	public void setAge(int setAge){age = setAge;}	
//	public int getTotalPoints(){ return totalPoints; }
//	private void setTotalPoints(int addTotalPoints){ totalPoints += addTotalPoints; }
//	public boolean getChamp(){ return allTimeChamp; }
//	public void setChamp(boolean isChamp){ allTimeChamp = isChamp; }	
	
	public int getID() { return playerID; }
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
		
	public int getPoints() { return points; }
	public void setPoints (int points){ 
		this.points += points;
		System.out.println(this.points);
	}	

	public int getLosses(){ return lost; }
	public int getWins() { return won; }
	public void won(boolean won) { 
		if(won){ this.won++; } 
		else { this.lost++; }
	}
	
	public User() {
	    playerID = (int) (Math.random() * (9999 - 1000) + 1000);
	}
}