package hb.services.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

import hb.exceptions.BadParameterException;
import hb.pojos.Actor;
import hb.services.ActorService;

public class ActorServiceImpl implements ActorService {

	private Collection<Actor> actors;
	private String[] months;

	public ActorServiceImpl() {
		actors = new HashSet<>();
		Calendar c = Calendar.getInstance();
		c.set(1986, 9, 23);
		actors.add(new Actor("Clarke", "Emilia", 'F', 1.57, c.getTime(), "Londres", "Daenerys Targaryen"));
		c.set(1997, 3, 15);
		actors.add(new Actor("Williams", "Maisie", 'F', 1.55, c.getTime(), "Bristol", "Arya Stark"));
		c.set(1996, 1, 21);
		actors.add(new Actor("Turner", "Sophie", 'F', 1.75, c.getTime(), "Northampton", "Sansa Stark"));
		c.set(1973, 9, 3);
		actors.add(new Actor("Headay", "Lena", 'F', 1.66, c.getTime(), "Hamilton", "Cersei Lannister"));
		c.set(1986, 11, 26);
		actors.add(new Actor("Harington", "Kit", 'H', 1.73, c.getTime(), "Acton", "Jon Snow"));
		c.set(1970, 6, 27);
		actors.add(new Actor("Coster-Waldau", "Nikolaj", 'H', 1.87, c.getTime(), "Rudkøbing", "Jaime Lannister"));
		c.set(1981, 3, 23);
		actors.add(new Actor("Whelan", "Gemma", 'F', 1.68, c.getTime(), "Leeds", "Asha Greyjoy"));

		months = DateFormatSymbols.getInstance(Locale.FRENCH).getMonths();
	}

	@Override
	public Actor getYoungestActor() {
		Actor youngest = null;
		for (Actor actor : actors) {
			if (youngest == null) {
				youngest = actor;
			}
			if (actor.getBirthdate().after(youngest.getBirthdate())) {
				youngest = actor;
			}
		}
		return youngest;
	}

	@Override
	public String getOldestActor() {
		Actor oldest = null;
		for (Actor actor : actors) {
			if (oldest == null) {
				oldest = actor;
			}
			if (actor.getBirthdate().before(oldest.getBirthdate())) {
				oldest = actor;
			}
		}
		return oldest.getLastname() + " " + oldest.getFirstname();
	}

	@Override
	public Collection<Integer> getDisctinctBirthYears() {
		Collection<Integer> years = new HashSet<>();
		Calendar c = Calendar.getInstance();
		for (Actor actor : actors) {
			c.setTime(actor.getBirthdate());
			years.add(c.get(Calendar.YEAR));
		}
		return years;
	}

	@Override
	public int getNumberOfActorBornInCertainMonth(String month) {
		int indexOfMonth = 0;
		for (String m : months) {
			if (m.equals(month)) {
				break;
			}
			indexOfMonth++;
		}
		int numberOfActors = 0;
		Calendar c = Calendar.getInstance();
		for (Actor actor : actors) {
			c.setTime(actor.getBirthdate());
			if (c.get(Calendar.MONTH) == indexOfMonth) {
				numberOfActors++;
			}
		}
		return numberOfActors;
	}

	@Override
	public int getNumberOfActorBornInCertainYear(int year) {
		int numberOfActors = 0;
		Calendar c = Calendar.getInstance();
		for (Actor actor : actors) {
			c.setTime(actor.getBirthdate());
			if (c.get(Calendar.YEAR) == year) {
				numberOfActors++;
			}
		}
		return numberOfActors;
	}

	@Override
	public String[] getActorsBySex(char sex) throws BadParameterException {
		if (sex != 'F' && sex != 'H') {
			throw new BadParameterException("Le sexe est soit H soit F");
		}
		String[] actorsBySex = null;
		int count = 0;
		for (Actor actor : actors) {
			if (actor.getSex() == sex) {
				count++;
			}
		}
		actorsBySex = new String[count];
		count = 0;
		for (Actor actor : actors) {
			if (actor.getSex() == sex) {
				actorsBySex[count] = actor.getLastname() + " " + actor.getFirstname();
				count++;
			}
		}
		return actorsBySex;
	}

	@Override
	public String getIdentityOfTheTallestActor() {
		Actor tallest = null;
		for (Actor actor : actors) {
			if (tallest == null) {
				tallest = actor;
			}
			if (actor.getHeight() > tallest.getHeight()) {
				tallest = actor;
			}
		}
		return tallest.getLastname() + " " + tallest.getFirstname();
	}

	@Override
	public String getRoleOfTheSmallestActor() {
		Actor smallest = null;
		for (Actor actor : actors) {
			if (smallest == null) {
				smallest = actor;
			}
			if (actor.getHeight() < smallest.getHeight()) {
				smallest = actor;
			}
		}
		return smallest.getRole();
	}

	@Override
	public List<Actor> getSomeActors(int number) throws BadParameterException {
		int size = actors.size();
		if (number < 1 || number > size) {
			throw new BadParameterException("Vous devez récupérer au moins 1 acteur et au plus " + size + " acteurs");
		}
		List<Actor> someActors = new ArrayList<>();
		/* Code original */
		// for (int i = 0; i < number; i++) {
		// for (Actor actor : actors) {
		// if (!someActors.contains(actor)) {
		// someActors.add(actor);
		// break;
		// }
		// }
		// }

		/* New code */
		someActors.addAll(actors);
		Collections.shuffle(someActors);
		someActors = someActors.subList(0, number);
		return someActors;
	}

	@Override
	public void writeActorsInFile(String filename, List<Actor> actors) {
		try {
			PrintWriter pw = new PrintWriter(filename);
			for (Actor actor : actors) {
				pw.println(actor);
			}
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Actor> readActorsInFile(String filename) {
		List<Actor> actors = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String line = br.readLine();

			while (line != null) {
				String[] names = line.split(",");
				if (names.length == 2) {
					actors.add(new Actor(names[0], names[1], 'F', 0, new Date(), "", ""));
				}
				line = br.readLine();
			}

			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return actors;
	}

}
