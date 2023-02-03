package cat.ilg.generics.main;

import cat.ilg.generics.classes.Pair;

import cat.ilg.generics.classes.Person;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person laura = new Person("Laura", "Cases");
		Pair<String, Double> nota = new Pair<>("Laura",7.8);
		System.out.println();
	}

}
