package hb.tests;

import java.util.Arrays;

import hb.pojos.Blazon;
import hb.pojos.Member;
import hb.services.HouseService;
import hb.services.impl.HouseServiceImpl;

public class GameOfThroneDiscovery {

	public static void main(String[] args) {
		HouseService hs = new HouseServiceImpl();

		System.out.println("Test de la méthode printHouses");
		hs.printHouses();

		System.out.println("\nTest de la méthode getHouseBlazon (Baratheon)");
		System.out.println(hs.getHouseBlazon("Baratheon"));

		System.out.println("\nTest de la méthode getBlazonWithCertainColor (noir)");
		for (Blazon blazon : hs.getBlazonWithCertainColor("noir")) {
			System.out.println(blazon);
		}

		System.out.println("\nTest de la méthode getTotalNumberofMembers");
		System.out.println(hs.getTotalNumberofMembers());

		System.out.println("\nTest de la méthode getMemberWithoutTraitsPersonality");
		System.out.println(hs.getMemberWithoutTraitsPersonality());

		System.out.println("\nTest de la méthode getRandomHouse");
		System.out.println(hs.getRandomHouse());

		System.out.println("\nTest de la méthode getHouseMembers (Stark)");
		for (Member member : hs.getHouseMembers("Stark")) {
			System.out.println(member);
		}

		System.out.println("\nTest de la méthode getMemberFirstnameStartWithCertainLetter (J)");
		for (String name : hs.getMemberFirstnameStartWithCertainLetter('J')) {
			System.out.println(name);
		}

		System.out.println("\nTest de la méthode getNumberOfHouseMembersWithTwoColorsInEyes (Lannister)");
		System.out.println(hs.getNumberOfHouseMembersWithTwoColorsInEyes("Lannister"));

		System.out.println("\nTest de la méthode getMemberPersonalityTraits (Sansa)");
		System.out.println(hs.getMemberPersonalityTraits("Sansa"));

		System.out.println("\nTest de la méthode getMemberPersonalityTraits (Tywin)");
		System.out.println(hs.getMemberPersonalityTraits("Tywin"));

		System.out.println("\nTest de la méthode getNumberOfMembersForEachHouse");
		System.out.println(Arrays.toString(hs.getNumberOfMembersForEachHouse()));

		System.out.println("\nTest de la méthode getMembersWithoutEyesColor");
		for (String name : hs.getMembersWithoutEyesColor()) {
			System.out.println(name);
		}

		System.out.println("\nTest de la méthode getMembersWithoutHairColor");
		System.out.println(Arrays.toString(hs.getMembersWithoutHairColor()));

		System.out.println("\nTest de la méthode getDistinctMemberRoles");
		for (String role : hs.getDistinctMemberRoles()) {
			System.out.println(role);
		}
	}
}
