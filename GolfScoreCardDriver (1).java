
//Parkers Code
//this instantiates each golfer and then prints out their score for each hole and their total tournament score.
public class GolfScoreCardDriver {

	public static void main(String[] args) 
	{
	GolfScoreCardClient golfer1 = new GolfScoreCardClient();
	golfer1.Golfer("Wayne", 17, 3);
	
	
	golfer1.HoleOneScore(1,3,6);
	golfer1.HoleTwoScore(2,5,5);
	golfer1.HoleThreeScore(3,4,3);
	golfer1.HoleFourScore(4,2,1);
	golfer1.HoleFiveScore(5,5,4);
	golfer1.HoleSixScore(6,3,3);
	golfer1.HoleSevenScore(7,1,2);
	golfer1.HoleEightScore(8,2,4);
	golfer1.HoleNineScore(9,4,6);
	golfer1.HoleTenScore(10,1,4);
	golfer1.HoleElevenScore(11,3,2);
	golfer1.HoleTwelveScore(12,5,6);
	golfer1.HoleThirteenScore(13,4,4);
	golfer1.HoleFourteenScore(14,3,2);
	golfer1.HoleFifteenScore(15,2,3);
	golfer1.HoleSixteenScore(16,2,4);
	golfer1.HoleSeventeenScore(17,1,2);
	golfer1.HoleEighteenScore(18,3,2);
		
		System.out.println(golfer1);
	
	GolfScoreCardClient golfer2 = new GolfScoreCardClient();
	golfer2.Golfer("Parker", 18, 4);
	
	golfer2.HoleOneScore(1,3,6);
	golfer2.HoleTwoScore(2,5,5);
	golfer2.HoleThreeScore(3,4,3);
	golfer2.HoleFourScore(4,2,1);
	golfer2.HoleFiveScore(5,5,4);
	golfer2.HoleSixScore(6,3,3);
	golfer2.HoleSevenScore(7,1,2);
	golfer2.HoleEightScore(8,2,4);
	golfer2.HoleNineScore(9,4,6);
	golfer2.HoleTenScore(10,1,4);
	golfer2.HoleElevenScore(11,3,2);
	golfer2.HoleTwelveScore(12,5,6);
	golfer2.HoleThirteenScore(13,4,4);
	golfer2.HoleFourteenScore(14,3,2);
	golfer2.HoleFifteenScore(15,2,3);
	golfer2.HoleSixteenScore(16,2,4);
	golfer2.HoleSeventeenScore(17,1,2);
	golfer2.HoleEighteenScore(18,3,2);
		
		System.out.println(golfer2);
	
	}

}
