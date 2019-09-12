package lego.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lego.Boite;


class TestBoiteLego {

	@Test
	void testConstructor() {
		// given
		var number =21318;
		var name = "La cabane dans l'arbre";
		// when
		var boite = new Boite(number, name);
		// then
		assertAll(
				() -> assertEquals(number, boite.getNumber(), "number"),
				() -> assertEquals(name, boite.getName(), "name")
		);
	}
	
	@Test
	void testConstructor1() {
		// given
		var number =21318;
		var name = "La cabane dans l'arbre";
		var figurines = 4;
		var pieces = 3036;
		// when
		var boite = new Boite(number, name, figurines, pieces);
		// then
		assertAll(
				() -> assertEquals(number, boite.getNumber(), "number"),
				() -> assertEquals(name, boite.getName(), "name"),
				() -> assertEquals(figurines, boite.getFigurines(),"figurines"),
				() -> assertEquals(pieces, boite.getPieces(), "pieces")
		);
	}
	
	@Test
	void testConstructor2() {
		// given
		var price = 199.99;
		var name = "La cabane dans l'arbre";
		// when
		var boite = new Boite(price, name);
		// then
		assertAll(
				() -> assertEquals(price, boite.getPrice(), "price"),
				() -> assertEquals(name, boite.getName(), "name")
		);
}
}
