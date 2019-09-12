package lego;

public class Boite {
	private int number;
	private String name;
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

	
	

	public Boite(int figurines) {
		super();
		this.figurines = figurines;
	}


	public int getFigurines() {
		return figurines;
	}


	public void setFigurines(int figurines) {
		this.figurines = figurines;
	}		
	
	
	
}
