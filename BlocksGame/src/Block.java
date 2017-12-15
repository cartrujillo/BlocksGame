
public class Block {
	private int id;
	private char orientation;
	private int x;
	private int y;
	private int length;
	
	protected static int numOfBlocks = 0;
	protected static Tablero tablero;

	public Block(char orientation, int x, int y, int length, Tablero tablero) {
		numOfBlocks++;
		this.id = numOfBlocks;
		this.orientation = orientation; // TO DO manejo de excepcion si no se introduce bien la orientacion
		this.x = x;
		this.y = y;
		this.length = length;
		this.tablero = tablero;
		// función para introducir el bloque en el tablero
	}
	
	public int getId() {
		return id;
	}

	public char getOrientation() {
		return orientation;
	}

	public int getX() {
		return x;
	}	

	public int getY() {
		return y;
	}

	public int getLength() {
		return length;
	}

	public static Tablero getTablero() {
		return tablero;
	}

	public void moveBlock(int number) {
		if (this.getOrientation() == 'h') {
			if (intoTheLimits(0, number)) {
				if (isEmpty(0, number)) {
					// mover 
				}
			}
		} else if (this.getOrientation() == 'v') {
			if (intoTheLimits(number, 0)) {
				// caso de los verticales
			}
		}
	}
	
	private boolean intoTheLimits (int sumX, int sumY) {
		int finalPos;
	
		if (sumY > 0) {
			finalPos = this.getY() + this.getLength() - 1 + sumY;
			if ((finalPos < getTablero().getColumns())) {
				return true;
			} else {
				return false;
			}
		}
		if (sumY < 0) {
			finalPos = this.getY() + sumY;
			if (finalPos >= 0) {
				return true;
			} else {
				return false;
			}
		}
		// falta hacer el caso de los verticales
		return false;
	}
	
	private boolean isEmpty (int sumX, int sumY) {
		int iniPos;
		if (sumY > 0) {
			iniPos = this.getY() + this.getLength() + sumY;
			for (int i = iniPos; i < getTablero().getColumns(); i++) {
				if (getTablero().getMatrix()[this.getX()][iniPos] != 0) {
					return false;
				}
			}
		} else if (sumY > 0) {
			iniPos = this.getY() + sumY;
			for (int i = iniPos; i < 0; i--) {
				if (getTablero().getMatrix()[this.getX()][iniPos] != 0) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
}
