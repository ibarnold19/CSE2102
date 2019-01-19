import java.util.Scanner; //import for use later

/* Bryan Arnold
 * CSE 2102
 * Lab01
 * 2/3/17
 */

/* MineSweeper Class
 * Purpose: this class creates a primitive version
 * of the game mine sweeper. It takes input from the user
 * to determine the dimensions of the board, checks if the input is valid,
 * the creates a board. The board is then printed, displaying bombs every third
 * spot as an asterisk, and empty spaces in all the other spaces as periods. Next, this
 * board is displayed. After that, the empty spots are replaced with the number of neighboring
 * bombs, so up, down left, right, and diagonally. This new board with replaced numbers is then
 * displayed.
 */
public class MineSweeper { //start class

	/* createGame Method
	 * Purpose: this method gets input from the
	 * user to determine the dimensions of the board
	 * for mine sweeper. It also creates the board, placing bombs in every third spot
	 * as an asterisk, and empty spots with periods. It checks for valid dimension inputs.
	 * Parameters: none, just needs input and to create a board.
	 * Returns: char[][] board, the mine sweeper game board with bombs and empty
	 * spaces as the positions in the array.
	 */
	public char[][] createGame(){ //start method

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in); //scanner for input
		System.out.print("Enter the desired height of the board: ");

		int height = s.nextInt(); //height of board

		while(height < 1){ //start while, checks if number is greater than 0

			System.out.print("The height must be greater than 0. Please re-enter a desired height: ");

			height = s.nextInt();

		} //end while

		System.out.print("Enter the desired length of the board: ");

		int length = s.nextInt(); //length of the board

		while(length < 1){ //start while, checks if input is greater than 0

			System.out.print("The length must be greater than 0. Please re-enter a desired length: ");

			length = s.nextInt();

		} //end while

		char[][] board = new char[height][length]; //board dimensions for array set
		int counter = 1; //tracks every third spot for bomb placing

		for(int i = 0; i < height; i++){ //start if i

			for(int j = 0; j < length; j++){ //start if j

				if(counter == 3){ //start if, a third spot

					board[i][j] = '*'; //place bombs
					counter = 1; //reset counter

				} else { //start else 

					board[i][j] = '.'; //place empty spot
					counter++; //add counter

				} //end else if chain

			} //end for j

		} //end for i

		return board; //returns a 2D array of the board

	} //end method

	/* numberEmpties Method
	 * Purpose: this method takes in the created board earlier, 
	 * then checks each empty position's neighbors if they are bombs or not. 
	 * After the neighbors have been checked, the number of total bomb neighbors
	 * is then put into the empty spot to show how many neighboring bombs there are.
	 * Parameters: char[][] array, the board created in createBoard method
	 * Returns: nothing, only needs to alter board
	 */
	public static void numberEmpties(char[][] array){ //start method

		for(int i = 0; i < array.length; i++){ //start for i

			for(int j = 0; j < array[0].length; j++){ //start for j

				int counter = 0; //total neighbors that are bombs

				if(array[i][j] == '.'){ //start if, only checks empty positions

					if(j != array[0].length - 1){ //start if, checks left of the empty spot

						if(array[i][j + 1] == '*'){//start if

							counter++;

						} //end if

					} if(j != 0){ //start if, checks left of the empty spot

						if(array[i][j - 1] == '*'){ //start if

							counter++;

						} //end if

					} if(i != array.length - 1){ //start if, checks below the empty spot

						if(array[i + 1][j] == '*'){ //start if

							counter++;

						} //end if

					} if(i != 0){ //start if, checks above the empty spot

						if(array[i - 1][j] == '*'){ //start if

							counter++;

						} //end if

					} if(i != 0 && j != 0){ //start if, checks diagonally down to the left

						if(array[i - 1][j - 1] == '*'){ //start if

							counter++;

						} //end if

					} if(i != array.length - 1 && j != 0){ //start if, check diagonally up to the left

						if(array[i + 1][j - 1] == '*'){ //start if

							counter++;

						} //end if

					} if(i != 0 && j != array[0].length - 1){ //start if, checks diagonally up to the right

						if(array[i - 1][j + 1] == '*'){ //start if

							counter++;

						} //end if

					} if(i != array.length - 1 && j != array[0].length - 1){ //start if, checks diagonally down to the right

						if(array[i + 1][j + 1] == '*'){ //start if

							counter++;

						} //end if

					} //end if

					char neighborBombs = (char)(counter + '0'); //changes number of neighbors that are bombs into a character to match board type

					array[i][j] = neighborBombs; //replaces empty spot with number of bomb neighbors

				} //end if

			} //end for j

		} //end for i

	} //end method

	/* arrayToString Method
	 * Purpose: this method turns the 2D array of the board
	 * created and turns it into a string to be displayed to the user.
	 * It prints both the initially made board, and the number version.
	 * Parameters: char[][] array, the board to be displayed
	 * Returns: String str, a string representation of the board
	 */
	public static String arrayToString(char[][] array){ //start method

		String str = ""; //string representation

		for(int i = 0; i < array.length; i++){ //start for i

			for(int j = 0; j < array[0].length; j++){ //start for j

				str += array[i][j] + " "; //adds position in board to string, seperated by a space

			} //end for j

			str += "\n"; //newline to match board dimensions

		} //end for i

		return str; //returns string representation of the board

	} //end method

	/* Main Method
	 * Purpose: this method runs the methods of the
	 * program together. It first runs the method to get
	 * user input to make the board and make the board, then displays
	 * that. It then alters the empty spots using the numberEmpties method,
	 * then displays that.
	 */
	public static void main(String[] args){ //start method

		MineSweeper a = new MineSweeper(); //new MineSweeper object to run methods

		char[][] board = a.createGame(); //create a board using createGame method, by getting user input for dimensions

		String boardDisplay = arrayToString(board); //string representations of initial board

		System.out.println(); //space for neatness
		System.out.println(boardDisplay); //displays initial board

		numberEmpties(board); //alters the empties in the board
		String finalBoardDisplay = arrayToString(board); //string representation for initial board

		System.out.println(finalBoardDisplay); //displays final board

	} //end method

} //end class
