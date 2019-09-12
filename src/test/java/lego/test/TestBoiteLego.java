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
		var figurines = 4;
		// when
		var boite = new Boite(figurines);
		// then
		assertAll(
				() -> assertEquals(figurines, boite.getFigurines(), "figurines"),

}
