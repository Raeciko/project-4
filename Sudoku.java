public class Sudoku {

	int[][] board;

	public Sudoku() {

		for(int i = 0 ; i < board.length ; i++) {
			for(int j = 0; j < board[0].length ; j++) {
				
				board[i][j] = 0;
				
			}
			
		}
		
	}

	public Sudoku(int[][] board) {

		for(int i = 0 ; i < board.length ; i++) {
			for(int j = 0; j < board[0].length ; j++) {
				
				this.board[i][j] = board[i][j];
				
			}
			
		}
		
	}

	public int[][] board() {

		return (this.board);
	}

	public boolean[] candidates(int row, int column) {

		return null;
	}

	public boolean isSolved() {

		return false;
	}

	public void solve() {

	}

	public boolean nakedSingles() {

		return false;
	}

	public boolean hiddenSingles() {

		return false;
	}

	public void printBoard() {

		char init = 'A';

		System.out.println("    1 2 3   4 5 6   7 8 9");
		System.out.println("  +-------+-------+-------+");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%c |", init);
			for (int j = 1; j <= 9; j++) {
				if (board[i][j] == 0) {
				System.out.printf(" 0");
				}
				else {
					System.out.printf(" %d", board[i][j]);
					
				}
				if (j % 3 == 0) {
					System.out.printf(" |");
				}
			}
			System.out.println();
			if (i % 3 == 0) {

				System.out.println("  +-------+-------+-------+");
			}

			init++;
		}

	}

	public static void main(String[] args) {

		Sudoku test = new Sudoku();
	}

}