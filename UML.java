// week 7 - hw 2
// implement an odd/even game using objects
// design objects using UML before implementation
// make sure to include constructor

public class UML {
	
 	private int randomNum;
 	
 	public UML (int compNum)
 	{
 		randomNum = compNum;
 	}
 	public int getRandomNumber(int compNum)
 	{
 		compNum = 1 + (int) (Math.random() * 10);
 		return compNum;
 	}
 }