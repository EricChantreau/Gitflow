package hb.tests;

import java.util.Arrays;

import hb.pojos.Blazon;
import hb.pojos.Member;
import hb.services.HouseService;
import hb.services.impl.HouseServiceImpl;

public class GameOfThroneDiscovery {

	public static void main(String[] args) {
		HouseService hs = new HouseServiceImpl();

		System.out.println("Test de la m�thode printHouses");
		hs.printHouses();

		System.out.println("\nTest de la m�thode getHouseBlazon (Baratheon)");
		System.out.println(hs.getHouseBlazon("Baratheon"));

		System.out.println("\nTest de la m�thode getBlazonWithCertainColor (noir)");
		for (Blazon blazon : hs.getBlazonWithCertainColor("noir")) {
			System.out.println(blazon);
		}

		System.out.println("\nTest de la m�thode getTotalNumberofMembers");
		System.out.println(hs.getTotalNumberofMembers());

		System.out.println("\nTest de la m�thode getMemberWithoutTraitsPersonality");
		System.out.println(hs.getMemberWithoutTraitsPersonality());

		System.out.println("\nTest de la m�thode getRandomHouse");
		System.out.println(hs.getRandomHouse());

		System.out.println("\nTest de la m�thode getHouseMembers (Stark)");
		for (Member member : hs.getHouseMembers("Stark")) {
			System.out.println(member);
		}

		System.out.println("\nTest de la m�thode getMemberFirstnameStartWithCertainLetter (J)");
		for (String name : hs.getMemberFirstnameStartWithCertainLetter('J')) {
			System.out.println(name);
		}

		System.out.println("\nTest de la m�thode getNumberOfHouseMembersWithTwoColorsInEyes (Lannister)");
		System.out.println(hs.getNumberOfHouseMembersWithTwoColorsInEyes("Lannister"));

		System.out.println("\nTest de la m�thode getMemberPersonalityTraits (Sansa)");
		System.out.println(hs.getMemberPersonalityTraits("Sansa"));

		System.out.println("\nTest de la m�thode getMemberPersonalityTraits (Tywin)");
		System.out.println(hs.getMemberPersonalityTraits("Tywin"));

		System.out.println("\nTest de la m�thode getNumberOfMembersForEachHouse");
		System.out.println(Arrays.toString(hs.getNumberOfMembersForEachHouse()));

		System.out.println("\nTest de la m�thode getMembersWithoutEyesColor");
		for (String name : hs.getMembersWithoutEyesColor()) {
			System.out.println(name);
		}

		System.out.println("\nTest de la m�thode getMembersWithoutHairColor");
		System.out.println(Arrays.toString(hs.getMembersWithoutHairColor()));

		System.out.println("\nTest de la m�thode getDistinctMemberRoles");
		for (String role : hs.getDistinctMemberRoles()) {
			System.out.println(role);
		}
	}
}
