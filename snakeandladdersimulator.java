package SnakeAndLadderSimulator;

public class snakeandladdersimulator {
	public static void main(String[] args) {
		int playerPosition = playingLadderAndSnake();
			System.out.println("The Player Position is: " + playerPosition);
}
			static int playingLadderAndSnake() {
				// Constant
				int LADDER = 1;
				int SNAKE = 2;
				// Variables
				int startPlayer = 0;
				int previousPosition;
				int counter = 0;
				while(true) {
					int name = (int)(Math.random() * 3 );
						System.out.println("the snake ladder "+name);
					int diceNumber = (int)( (Math.random() * 6 ) + 1 );
						System.out.println("the dice value is "+diceNumber);			
					if ( name == LADDER ) {
						previousPosition = startPlayer; 
						startPlayer= startPlayer + diceNumber;
						if ( startPlayer > 100 )
							startPlayer = previousPosition;
					}
					else if ( name == SNAKE) {
						startPlayer = startPlayer - diceNumber;
						if ( startPlayer < 0 )
							startPlayer = 0;
					}
					else 
						startPlayer = startPlayer;
						if ( startPlayer == 100 )
							break;
				counter++;
				System.out.println("The Position of The Player: " +startPlayer);
				}
					System.out.println("The Total Number of dice counted: " +counter);
					return startPlayer;
		}
}
