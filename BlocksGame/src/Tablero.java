
public class Tablero {
	private int rows;
	private int columns;
	private int[][] matrix; // En el tablero los 0's significa que ese espacio está libre
	
	public Tablero(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		this.matrix = new int[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public int[][] getMatrix() {
		return matrix;
	}
	
	public void showTablero() {
		for (int i = 0; i < this.getRows(); i++) {
			for (int j = 0; j < this.getColumns(); j++) {
				System.out.print(this.getMatrix()[i][j] + " ");
			}
			System.out.println();
		}
	}

}
