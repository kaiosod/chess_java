package boardgame;

public class Position {
	private int row;
	private int column;
	
	public Position() {
		
	}
	
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	public void setValues(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	public String toString() {
		return row + "x" + column;
	}
}
