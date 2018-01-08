public class GolfScoreCardClient 
{
	private int golferage;
	private int rank;
	private String golfername;
	private int sum = 0;
	private int holenum;
	private int parstrokes;
	private int golferstrokes;
	
	//This is where the golfer enters into the tournament.
public String Golfer (String a, int b, int c)
	{
		golfername = a;
		golferage = b;
		rank = c;
		System.out.println("Golfer's name is: " + golfername + "\nGolfer's age is: " + golferage + "\nYour rank is: " + rank);
		return ("Golfer's name is: " + golfername + "\nGolfer's age is: " + golferage + "\nYour rank is: " + rank);
	}




//Joey Code. this method keeps track of the score for the 1st hole	
public String HoleOneScore (int d, int e, int f)
	{
		holenum = d;
		parstrokes = e;
		golferstrokes = f;
		int hole1score = golferstrokes;
		String score1 = "a score out of the score range";

		if (parstrokes + 3 <= golferstrokes)
		{
			score1 = "more than a double bogey";
		}
		else 
		{
			if (golferstrokes == parstrokes - 2)
			{
				score1 = "an eagle";
			}
			if (golferstrokes == parstrokes - 1)
			{
				score1 = "a birdie";
			}
			if (golferstrokes == parstrokes)
			{
				score1 = "a par";
			}
			if (golferstrokes == parstrokes + 1)
			{
				score1 = "a bogey";
			}
			if (golferstrokes == parstrokes + 2)
			{
				score1 = "a double bogey";
			}
		}
		sum += hole1score;
		System.out.println ("You earned " + score1 + " on this hole.");
			return ("You earned " + score1 + " on this hole.");
	}



//Joey Code, this method keeps track of the score for the 2nd hole
public String HoleTwoScore (int d, int e, int f)
	{
		holenum = d;
		parstrokes = e;
		golferstrokes = f;
		int hole2score = golferstrokes;
		String score2 = "a score out of the score range";

		if (parstrokes + 3 <= golferstrokes)
		{
			score2 = "more than a double bogey";
		}
		else 
		{
			if (golferstrokes == parstrokes - 2)
			{
				score2 = "an eagle";
			}
			if (golferstrokes == parstrokes - 1)
			{
				score2 = "a birdie";
			}
			if (golferstrokes == parstrokes)
			{
				score2 = "a par";
			}
			if (golferstrokes == parstrokes + 1)
			{
				score2 = "a bogey";
			}
			if (golferstrokes == parstrokes + 2)
			{
				score2 = "a double bogey";
			}
		}
		sum += hole2score;
		System.out.println ("You earned " + score2 + " on this hole.");
			return ("You earned " + score2 + " on this hole.");
	}


//Kenny Code, This methods keeps track of the score for the third hole 
public String HoleThreeScore (int d, int e, int f)
	{
		holenum = d;
		parstrokes = e;
		golferstrokes = f;
		int hole3score = golferstrokes;
		String score3 = "a score out of the score range";

		if (parstrokes + 3 <= golferstrokes)
		{
			score3 = "more than a double bogey";
		}
		else 
		{
			if (golferstrokes == parstrokes - 2)
			{
				score3 = "an eagle";
			}
			if (golferstrokes == parstrokes - 1)
			{
				score3 = "a birdie";
			}
			if (golferstrokes == parstrokes)
			{
				score3 = "a par";
			}
			if (golferstrokes == parstrokes + 1)
			{
				score3 = "a bogey";
			}
			if (golferstrokes == parstrokes + 2)
			{
				score3 = "a double bogey";
			}
		}
		sum += hole3score;
		System.out.println ("You earned " + score3 + " on this hole.");
			return ("You earned " + score3 + " on this hole.");
	}



//Kenny Code, This method keeps track of the score for the fourth hole
public String HoleFourScore (int d, int e, int f)
	{
		holenum = d;
		parstrokes = e;
		golferstrokes = f;
		int hole4score = golferstrokes;
		String score4 = "a score out of the score range";

		if (parstrokes + 3 <= golferstrokes)
		{
			score4 = "more than a double bogey";
		}
		else 
		{
			if (golferstrokes == parstrokes - 2)
			{
				score4 = "an eagle";
			}
			if (golferstrokes == parstrokes - 1)
			{
				score4 = "a birdie";
			}
			if (golferstrokes == parstrokes)
			{
				score4 = "a par";
			}
			if (golferstrokes == parstrokes + 1)
			{
				score4 = "a bogey";
			}
			if (golferstrokes == parstrokes + 2)
			{
				score4 = "a double bogey";
			}
		}
		sum += hole4score;
		System.out.println ("You earned " + score4 + " on this hole.");
			return ("You earned " + score4 + " on this hole.");
	}



//Brandon Code- this method keeps track of the score for the fifth hole.
	public String HoleFiveScore (int d, int e, int f)
	{
		holenum = d;
		parstrokes = e;
		golferstrokes = f;
		int hole5score = golferstrokes;
		String score5 = "a score out of the score range";

		if (parstrokes + 3 <= golferstrokes)
		{
			score5 = "more than a double bogey";
		}
		else 
		{
			if (golferstrokes == parstrokes - 2)
			{
				score5 = "an eagle";
			}
			if (golferstrokes == parstrokes - 1)
			{
				score5 = "a birdie";
			}
			if (golferstrokes == parstrokes)
			{
				score5 = "a par";
			}
			if (golferstrokes == parstrokes + 1)
			{
				score5 = "a bogey";
			}
			if (golferstrokes == parstrokes + 2)
			{
				score5 = "a double bogey";
			}
		}
		sum += hole5score;
		System.out.println ("You earned " + score5 + " on this hole.");
			return ("You earned " + score5 + " on this hole.");
	}



//Brandon Code- this method keeps track of the score for the sixth hole.
public String HoleSixScore (int d, int e, int f)
	{
		holenum = d;
		parstrokes = e;
		golferstrokes = f;
		int hole6score = golferstrokes;
		String score6 = "a score out of the score range";

		if (parstrokes + 3 <= golferstrokes)
		{
			score6 = "more than a double bogey";
		}
		else 
		{
			if (golferstrokes == parstrokes - 2)
			{
				score6 = "an eagle";
			}
			if (golferstrokes == parstrokes - 1)
			{
				score6 = "a birdie";
			}
			if (golferstrokes == parstrokes)
			{
				score6 = "a par";
			}
			if (golferstrokes == parstrokes + 1)
			{
				score6 = "a bogey";
			}
			if (golferstrokes == parstrokes + 2)
			{
				score6 = "a double bogey";
			}
		}
		sum += hole6score;
		System.out.println ("You earned " + score6 + " on this hole.");
			return ("You earned " + score6 + " on this hole.");
	}



//Ethan Code- this method keeps track of the score for the seventh hole
public String HoleSevenScore (int d, int e, int f)
	{
		holenum = d;
		parstrokes = e;
		golferstrokes = f;
		int hole7score = golferstrokes;
		String score7 = "a score out of the score range";

		if (parstrokes + 3 <= golferstrokes)
		{
			score7 = "more than a double bogey";
		}
		else 
		{
			if (golferstrokes == parstrokes - 2)
			{
				score7 = "an eagle";
			}
			if (golferstrokes == parstrokes - 1)
			{
				score7 = "a birdie";
			}
			if (golferstrokes == parstrokes)
			{
				score7 = "a par";
			}
			if (golferstrokes == parstrokes + 1)
			{
				score7 = "a bogey";
			}
			if (golferstrokes == parstrokes + 2)
			{
				score7 = "a double bogey";
			}
		}
		sum += hole7score;
		System.out.println ("You earned " + score7 + " on this hole.");
			return ("You earned " + score7 + " on this hole.");
	}



//Ethan Code- this method keeps track of the score for the eighth hole
public String HoleEightScore (int d, int e, int f)
	{
		holenum = d;
		parstrokes = e;
		golferstrokes = f;
		int hole8score = golferstrokes;
		String score8 = "a score out of the score range";

		if (parstrokes + 3 <= golferstrokes)
		{
			score8 = "more than a double bogey";
		}
		else 
		{
			if (golferstrokes == parstrokes - 2)
			{
				score8 = "an eagle";
			}
			if (golferstrokes == parstrokes - 1)
			{
				score8 = "a birdie";
			}
			if (golferstrokes == parstrokes)
			{
				score8 = "a par";
			}
			if (golferstrokes == parstrokes + 1)
			{
				score8 = "a bogey";
			}
			if (golferstrokes == parstrokes + 2)
			{
				score8 = "a double bogey";
			}
		}
		sum += hole8score;
		System.out.println ("You earned " + score8 + " on this hole.");
			return ("You earned " + score8 + " on this hole.");
	}



//ChrisCode - this method keeps track of the score for the ninth hole.
public String HoleNineScore (int d, int e, int f)
	{
		holenum = d;
		parstrokes = e;
		golferstrokes = f;
		int hole9score = golferstrokes;
		String score9 = "a score out of the score range";

		if (parstrokes + 3 <= golferstrokes)
		{
			score9 = "more than a double bogey";
		}
		else 
		{
			if (golferstrokes == parstrokes - 2)
			{
				score9 = "an eagle";
			}
			if (golferstrokes == parstrokes - 1)
			{
				score9 = "a birdie";
			}
			if (golferstrokes == parstrokes)
			{
				score9 = "a par";
			}
			if (golferstrokes == parstrokes + 1)
			{
				score9 = "a bogey";
			}
			if (golferstrokes == parstrokes + 2)
			{
				score9 = "a double bogey";
			}
		}
		sum += hole9score;
		System.out.println ("You earned " + score9 + " on this hole.");
			return ("You earned " + score9 + " on this hole.");
	}



//ChrisCode - this method keeps track of the score for the tenth hole.
public String HoleTenScore (int d, int e, int f)
	{
		holenum = d;
		parstrokes = e;
		golferstrokes = f;
		int hole10score = golferstrokes;
		String score10 = "a score out of the score range";

		if (parstrokes + 3 <= golferstrokes)
		{
			score10 = "more than a double bogey";
		}
		else 
		{
			if (golferstrokes == parstrokes - 2)
			{
				score10 = "an eagle";
			}
			if (golferstrokes == parstrokes - 1)
			{
				score10 = "a birdie";
			}
			if (golferstrokes == parstrokes)
			{
				score10 = "a par";
			}
			if (golferstrokes == parstrokes + 1)
			{
				score10 = "a bogey";
			}
			if (golferstrokes == parstrokes + 2)
			{
				score10 = "a double bogey";
			}
		}
		sum += hole10score;
		System.out.println ("You earned " + score10 + " on this hole.");
			return ("You earned " + score10 + " on this hole.");
	}



//D-Rob Code- this method keeps track of the score for the eleventh hole.
public String HoleElevenScore (int d, int e, int f)
	{
		holenum = d;
		parstrokes = e;
		golferstrokes = f;
		int hole11score = golferstrokes;
		String score11 = "a score out of the score range";

		if (parstrokes + 3 <= golferstrokes)
		{
			score11 = "more than a double bogey";
		}
		else 
		{
			if (golferstrokes == parstrokes - 2)
			{
				score11 = "an eagle";
			}
			if (golferstrokes == parstrokes - 1)
			{
				score11 = "a birdie";
			}
			if (golferstrokes == parstrokes)
			{
				score11 = "a par";
			}
			if (golferstrokes == parstrokes + 1)
			{
				score11 = "a bogey";
			}
			if (golferstrokes == parstrokes + 2)
			{
				score11 = "a double bogey";
			}
		}
		sum += hole11score;
		System.out.println ("You earned " + score11 + " on this hole.");
			return ("You earned " + score11 + " on this hole.");
	}



//D-Rob Code- this method keeps track of the score for the twelfth hole.
public String HoleTwelveScore (int d, int e, int f)
	{
		holenum = d;
		parstrokes = e;
		golferstrokes = f;
		int hole12score = golferstrokes;
		String score12 = "a score out of the score range";

		if (parstrokes + 3 <= golferstrokes)
		{
			score12 = "more than a double bogey";
		}
		else 
		{
			if (golferstrokes == parstrokes - 2)
			{
				score12 = "an eagle";
			}
			if (golferstrokes == parstrokes - 1)
			{
				score12 = "a birdie";
			}
			if (golferstrokes == parstrokes)
			{
				score12 = "a par";
			}
			if (golferstrokes == parstrokes + 1)
			{
				score12 = "a bogey";
			}
			if (golferstrokes == parstrokes + 2)
			{
				score12 = "a double bogey";
			}
		}
		sum += hole12score;
		System.out.println ("You earned " + score12 + " on this hole.");
			return ("You earned " + score12 + " on this hole.");
	}



//Wayne Code- this method keeps track of the score for the thirteenth hole.
public String HoleThirteenScore (int d, int e, int f)
	{
		holenum = d;
		parstrokes = e;
		golferstrokes = f;
		int hole13score = golferstrokes;
		String score13 = "a score out of the score range";

		if (parstrokes + 3 <= golferstrokes)
		{
			score13 = "more than a double bogey";
		}
		else 
		{
			if (golferstrokes == parstrokes - 2)
			{
				score13 = "an eagle";
			}
			if (golferstrokes == parstrokes - 1)
			{
				score13 = "a birdie";
			}
			if (golferstrokes == parstrokes)
			{
				score13 = "a par";
			}
			if (golferstrokes == parstrokes + 1)
			{
				score13 = "a bogey";
			}
			if (golferstrokes == parstrokes + 2)
			{
				score13 = "a double bogey";
			}
		}
		sum += hole13score;
		System.out.println ("You earned " + score13 + " on this hole.");
			return ("You earned " + score13 + " on this hole.");
	}
	


//Wayne Code- this method keeps track of the score for the fourteenth hole.
	public String HoleFourteenScore (int d, int e, int f)
	{
		holenum = d;
		parstrokes = e;
		golferstrokes = f;
		int hole14score = golferstrokes;
		String score14 = "a score out of the score range";
		
		if (parstrokes + 3 <= golferstrokes)
		{
			score14 = "more than a double bogey";
		}
		else 
		{
			if (golferstrokes == parstrokes - 2)
			{
				score14 = "an eagle";
			}
			if (golferstrokes == parstrokes - 1)
			{
				score14 = "a birdie";
			}
			if (golferstrokes == parstrokes)
			{
				score14 = "a par";
			}
			if (golferstrokes == parstrokes + 1)
			{
				score14 = "a bogey";
			}
			if (golferstrokes == parstrokes + 2)
			{
				score14 = "a double bogey";
			}
		}
		sum += hole14score;
		System.out.println ("You earned " + score14 + " on this hole.");
			return ("You earned " + score14 + " on this hole.");
	}





//Joey Code- this method keeps track of the score for the fifteenth hole.
	public String HoleFifteenScore (int d, int e, int f)
	{
		holenum = d;
		parstrokes = e;
		golferstrokes = f;
		int hole15score = golferstrokes;
		String score15 = "a score out of the score range";

		if (parstrokes + 3 <= golferstrokes)
		{
			score15 = "more than a double bogey";
		}
		else 
		{
			if (golferstrokes == parstrokes - 2)
			{
				score15 = "an eagle";
			}
			if (golferstrokes == parstrokes - 1)
			{
				score15 = "a birdie";
			}
			if (golferstrokes == parstrokes)
			{
				score15 = "a par";
			}
			if (golferstrokes == parstrokes + 1)
			{
				score15 = "a bogey";
			}
			if (golferstrokes == parstrokes + 2)
			{
				score15 = "a double bogey";
			}
		}
		sum += hole15score;
		System.out.println ("You earned " + score15 + " on this hole.");
			return ("You earned " + score15 + " on this hole.");
	}


	//Joey Code- this method keeps track of the score for the sixteenth hole.
public String HoleSixteenScore (int d, int e, int f)
	{
		holenum = d;
		parstrokes = e;
		golferstrokes = f;
		int hole16score = golferstrokes;
		String score16 = "a score out of the score range";

		if (parstrokes + 3 <= golferstrokes)
		{
			score16 = "more than a double bogey";
		}
		else 
		{
			if (golferstrokes == parstrokes - 2)
			{
				score16 = "an eagle";
			}
			if (golferstrokes == parstrokes - 1)
			{
				score16 = "a birdie";
			}
			if (golferstrokes == parstrokes)
			{
				score16 = "a par";
			}
			if (golferstrokes == parstrokes + 1)
			{
				score16 = "a bogey";
			}
			if (golferstrokes == parstrokes + 2)
			{
				score16 = "a double bogey";
			}
		}
		sum += hole16score;
		System.out.println ("You earned " + score16 + " on this hole.");
			return ("You earned " + score16 + " on this hole.");
	}


//Wayne Code- this is the method that keeps track of the score for the seventeenth hole.
public String HoleSeventeenScore (int d, int e, int f)
	{
		holenum = d;
		parstrokes = e;
		golferstrokes = f;
		int hole17score = golferstrokes;
		String score17 = "a score out of the score range";

		if (parstrokes + 3 <= golferstrokes)
		{
			score17 = "more than a double bogey";
		}
		else 
		{
			if (golferstrokes == parstrokes - 2)
			{
				score17 = "an eagle";
			}
			if (golferstrokes == parstrokes - 1)
			{
				score17 = "a birdie";
			}
			if (golferstrokes == parstrokes)
			{
				score17 = "a par";
			}
			if (golferstrokes == parstrokes + 1)
			{
				score17 = "a bogey";
			}
			if (golferstrokes == parstrokes + 2)
			{
				score17 = "a double bogey";
			}
		}
		sum += hole17score;
		System.out.println ("You earned " + score17 + " on this hole.");
			return ("You earned " + score17 + " on this hole.");
	}



//Wayne Code- this is the method that keeps track of the score for the eighteenth hole.
	public String HoleEighteenScore (int d, int e, int f)
	{
		holenum = d;
		parstrokes = e;
		golferstrokes = f;
		int hole18score = golferstrokes;
		String score18 = "a score out of the score range";
		
		if (parstrokes + 3 <= golferstrokes)
		{
			score18 = "more than a double bogey";
		}
		else 
		{
			if (golferstrokes == parstrokes - 2)
			{
				score18 = "an eagle";
			}
			if (golferstrokes == parstrokes - 1)
			{
				score18 = "a birdie";
			}
			if (golferstrokes == parstrokes)
			{
				score18 = "a par";
			}
			if (golferstrokes == parstrokes + 1)
			{
				score18 = "a bogey";
			}
			if (golferstrokes == parstrokes + 2)
			{
				score18 = "a double bogey";
			}
		}
		sum += hole18score;
		System.out.println ("You earned " + score18 + " on this hole.");
			return ("You earned " + score18 + " on this hole.");
	}



//Wayne Code- this method calculates the total score
public String TotalRoundScore ()
	{
		return ("\"" + golfername + " scored a " + sum + " on this round of tournament play.\"\n");
	}
//Wayne Code- this method converts the object to a string
	public String toString ()
	{
		return ("\"" + golfername + " scored a " + sum + " on this round of tournament play.\"\n");
	}
}
