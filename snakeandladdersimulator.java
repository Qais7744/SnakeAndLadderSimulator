package SnakeAndLadderSimulator;

public class snakeandladdersimulator {
	public static void main(String[] args) {
				// Constant
				int LADDER = 1;
				int SNAKE = 2;
				// Variable
				double playerMovesAhead, playerMovesBehind;
					int startingPosition = 0;
						System.out.println("The Player Position is: " + startingPosition);
				int diceNumber = (int) (((Math.random() * 10) % 6) + 1);
					System.out.println("The Dice Number is: " + diceNumber);
				int name = (int) ((Math.random() * 10) % 3);
					System.out.println("The name is " + name);
				// if Condition
				if (name == LADDER)	{
						playerMovesAhead = (diceNumber + startingPosition);
						System.out.println("The Player will Moves Forword Positions " + playerMovesAhead);
				}
						else if (name == SNAKE)	{
							playerMovesBehind = (diceNumber - startingPosition);
							System.out.println("The Player Moves Backward Position " + playerMovesBehind);
						}
						else
							System.out.println("There is No_Play and Player will Stay at the same place" );
				
				
			
		}
}
