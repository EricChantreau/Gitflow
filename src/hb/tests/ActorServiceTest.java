package hb.tests;

import java.util.Arrays;

import hb.exceptions.BadParameterException;
import hb.pojos.Actor;
import hb.services.ActorService;
import hb.services.impl.ActorServiceImpl;

public class ActorServiceTest {

	public static void main(String[] args) {
		ActorService as = new ActorServiceImpl();

		System.out.println("Test de la m�thode getYoungestActor");
		System.out.println(as.getYoungestActor());

		System.out.println("\nTest de la m�thode getOldestActor");
		System.out.println(as.getOldestActor());

		System.out.println("\nTest de la m�thode getDisctinctBirthYears");
		System.out.println(as.getDisctinctBirthYears());

		System.out.println("\nTest de la m�thode getNumberOfActorBornInCertainMonth (octobre)");
		System.out.println(as.getNumberOfActorBornInCertainMonth("octobre"));

		System.out.println("\nTest de la m�thode getNumberOfActorBornInCertainYear (1986)");
		System.out.println(as.getNumberOfActorBornInCertainYear(1986));

		System.out.println("\nTest de la m�thode getIdentityOfTheTallestActor");
		System.out.println(as.getIdentityOfTheTallestActor());

		System.out.println("\nTest de la m�thode getRoleOfTheSmallestActor");
		System.out.println(as.getRoleOfTheSmallestActor());

		System.out.println("\nTest de la m�thode getActorsBySex (H)");
		try {
			System.out.println(Arrays.toString(as.getActorsBySex('H')));
		} catch (BadParameterException e) {
			e.printStackTrace();
		}

		System.out.println("\nTest de la m�thode getActorsBySex (F)");
		try {
			System.out.println(Arrays.toString(as.getActorsBySex('F')));
		} catch (BadParameterException e) {
			e.printStackTrace();
		}

		System.out.println("\nTest de la m�thode getSomeActors (5)");
		try {
			for (Actor actor : as.getSomeActors(5)) {
				System.out.println(actor);
			}
		} catch (BadParameterException e) {
			e.printStackTrace();
		}

		System.out.println("\nTest de la m�thode writeActorsInFile (resources/actors.txt)");
		try {
			as.writeActorsInFile("resources/actors.txt", as.getSomeActors(3));
		} catch (BadParameterException e) {
			e.printStackTrace();
		}

		System.out.println("\nTest de la m�thode writeActorsInFile (resources/actors.txt)");
		for (Actor actor : as.readActorsInFile("resources/actors2.txt")) {
			System.out.println(actor.getLastname() + " " + actor.getFirstname());
		}

		System.out.println("\n-----Test des erreurs-----");

		System.out.println("Test de la m�thode getActorsBySex (c)");
		try {
			System.out.println(Arrays.toString(as.getActorsBySex('c')));
		} catch (BadParameterException e) {
			e.printStackTrace();
		}

		System.out.println("Test de la m�thode getSomeActors (-2)");
		try {
			for (Actor actor : as.getSomeActors(-2)) {
				System.out.println(actor);
			}
		} catch (BadParameterException e) {
			e.printStackTrace();
		}

		System.out.println("Test de la m�thode getSomeActors (8)");
		try {
			for (Actor actor : as.getSomeActors(8)) {
				System.out.println(actor);
			}
		} catch (BadParameterException e) {
			e.printStackTrace();
		}
	}
}
