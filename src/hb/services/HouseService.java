package hb.services;

import java.util.Collection;
import java.util.List;

import hb.pojos.Blazon;
import hb.pojos.House;
import hb.pojos.Member;

public interface HouseService {

	public void printHouses();

	public Blazon getHouseBlazon(String house);

	public List<Blazon> getBlazonWithCertainColor(String color);

	public int getTotalNumberofMembers();

	public List<String> getMemberWithoutTraitsPersonality();

	public House getRandomHouse();

	public List<Member> getHouseMembers(String house);

	public List<String> getMemberFirstnameStartWithCertainLetter(char letter);

	public int getNumberOfHouseMembersWithTwoColorsInEyes(String house);

	public String getMemberPersonalityTraits(String member);

	public String[] getNumberOfMembersForEachHouse();

	public List<String> getMembersWithoutEyesColor();

	public String[] getMembersWithoutHairColor();

	public Collection<String> getDistinctMemberRoles();
}
