package lego;

public class Boite {
	private int number;
	private String name;
	private int pieces;
	private int figurines;

	
	public Boite(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Boite(int number, String name, int pieces, int figurines) {
		super();
		this.number = number;
		this.name = name;
		this.pieces = pieces;
		this.figurines = figurines;
	}


	public int getPieces() {
		return pieces;
	}


	public void setPieces(int pieces) {
		this.pieces = pieces;

	}	
	


	public int getFigurines() {
		return figurines;
	}


	public void setFigurines(int figurines) {
		this.figurines = figurines;

	}		
	
	
	
}
