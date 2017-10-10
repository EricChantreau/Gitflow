package hb.services;

import java.util.Collection;
import java.util.List;

import hb.exceptions.BadParameterException;
import hb.pojos.Actor;

public interface ActorService {

	public Actor getYoungestActor();

	public String getOldestActor();

	public Collection<Integer> getDisctinctBirthYears();

	public int getNumberOfActorBornInCertainMonth(String month);

	public int getNumberOfActorBornInCertainYear(int year);

	public String[] getActorsBySex(char sex) throws BadParameterException;

	public String getIdentityOfTheTallestActor();

	public String getRoleOfTheSmallestActor();

	public List<Actor> getSomeActors(int number) throws BadParameterException;

	public void writeActorsInFile(String filename, List<Actor> actors);

	public List<Actor> readActorsInFile(String filename);
}
