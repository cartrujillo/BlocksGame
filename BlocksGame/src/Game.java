
public class Game {

	public static void main(String[] args) {
		Tablero tablero = new Tablero(5,5);
		tablero.showTablero();

		Block block1 = new Block('h', 1, 2, 2, tablero);
	}

}
