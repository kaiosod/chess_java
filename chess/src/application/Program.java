package application;

import boardgame.Position;
import boardgame.Board;

public class Program {
	public static void main (String[] args) {
		
		Board x = new Board(10,2);
		
		System.out.println(x.getColumns());
	}
}
