package SnakeAndLadderSimulator;

public class snakeandladdersimulator {
	public static void main(String[] args) {
		playingLadderAndSnake();
}
		static void playingLadderAndSnake() {
			// Constant
			int LADDER = 1;
			int SNAKE = 2;
			// Variables
			int startPlayerOne = 0;
			int previousPositionPlayerOne;
			int startPlayerTwo = 0;
			int previousPositionPlayerTwo;
			while(true) {
				int name = (int) (Math.random() * 3 );
					System.out.println("the snake ladder " +name);
				int diceNumber = (int)( (Math.random() * 6 ) + 1 );
					System.out.println("the dice value is " +diceNumber);			
				if ( name == LADDER ) {
					previousPositionPlayerOne = startPlayerOne; 
					startPlayerOne= startPlayerOne + diceNumber;
					if ( startPlayerOne > 100 )
						startPlayerOne = previousPositionPlayerOne;
					continue;
				}
				else if ( name == SNAKE) {
					startPlayerOne = startPlayerOne - diceNumber;
					if ( startPlayerOne < 0 )
						startPlayerOne = 0;
				}
				else 
					startPlayerOne = startPlayerOne;
					if ( startPlayerOne == 100 )	{
						System.out.println("The PlayerOne Win First");
						break;
					}
				startingPlayerTwo: if (true) {
				int naam = (int) (Math.random() * 3 );
					System.out.println("the snake ladder " +naam);
				int diceNumberTwo = (int)( (Math.random() * 6 ) + 1 );
					System.out.println("the dice value is " +diceNumberTwo);			
					if ( naam == LADDER ) {
						previousPositionPlayerTwo = startPlayerTwo; 
						startPlayerTwo= startPlayerTwo + diceNumberTwo;
						if ( startPlayerTwo > 100 )
							startPlayerTwo = previousPositionPlayerTwo;
						}
					else if ( naam == SNAKE) {
						startPlayerTwo = startPlayerTwo - diceNumberTwo;
						if ( startPlayerTwo < 0 )
							startPlayerTwo = 0;
					}
					else 
						startPlayerTwo = startPlayerTwo;
					if ( startPlayerTwo == 100 )	{
						System.out.println("The PlayerTwo Win First");
					break;
					}
				}
			}
		}
}
