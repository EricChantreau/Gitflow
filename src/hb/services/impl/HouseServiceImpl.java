package hb.services.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

import hb.generators.HouseGenerator;
import hb.pojos.Blazon;
import hb.pojos.House;
import hb.pojos.Member;
import hb.services.HouseService;

public class HouseServiceImpl implements HouseService {

	private Map<String, House> houses;

	public HouseServiceImpl() {
		this.houses = new HouseGenerator().getHouses();
	}

	@Override
	public void printHouses() {
		Iterator<Entry<String, House>> it = houses.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, House> entry = it.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

	@Override
	public Blazon getHouseBlazon(String house) {
		House h = houses.get(house);
		return h == null ? null : h.getBlazon();
	}

	@Override
	public List<Blazon> getBlazonWithCertainColor(String color) {
		List<Blazon> blazons = new ArrayList<>();
		for (House house : houses.values()) {
			Blazon blazon = house.getBlazon();
			for (String c : blazon.getColors()) {
				if (c.equals(color)) {
					blazons.add(blazon);
					// continue;
					break;
				}
			}
		}
		return blazons;
	}

	@Override
	public int getTotalNumberofMembers() {
		int numberOfMembers = 0;
		for (House house : houses.values()) {
			numberOfMembers += house.getMembers().size();
		}
		return numberOfMembers;
	}

	@Override
	public List<String> getMemberWithoutTraitsPersonality() {
		List<String> members = new ArrayList<>();
		for (House house : houses.values()) {
			for (Member member : house.getMembers()) {
				if (member.getPersonalityTraits().length == 0) {
					members.add(member.getFirstname() + " " + member.getLastname());
				}
			}
		}
		return members;
	}

	@Override
	public House getRandomHouse() {
		int random = new Random().nextInt(houses.size());
		int count = 0;
		for (House house : houses.values()) {
			if (count == random) {
				return house;
			}
			count++;
		}
		return null;
	}

	@Override
	public List<Member> getHouseMembers(String house) {
		House h = houses.get(house);
		return h == null ? new ArrayList<>() : h.getMembers();
	}

	@Override
	public List<String> getMemberFirstnameStartWithCertainLetter(char letter) {
		List<String> members = new ArrayList<>();

		letter = Character.toLowerCase(letter);
		for (House house : houses.values()) {
			for (Member member : house.getMembers()) {
				if (member.getFirstname().toLowerCase().startsWith(String.valueOf(letter))) {
					members.add(member.getFirstname());
				}
			}
		}
		return members;
	}

	@Override
	public int getNumberOfHouseMembersWithTwoColorsInEyes(String house) {
		int number = 0;

		House h = houses.get(house);
		if (h != null) {
			for (Member member : h.getMembers()) {
				if (member.getEyeColor().split(",").length == 2) {
					number++;
				}
			}
		}
		return number;
	}

	@Override
	public String getMemberPersonalityTraits(String firstname) {
		Member memberToFind = null;
		for (House house : houses.values()) {
			for (Member member : house.getMembers()) {
				if (member.getFirstname().equals(firstname)) {
					memberToFind = member;
					break;
				}
			}
		}
		if (memberToFind == null) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		for (String trait : memberToFind.getPersonalityTraits()) {
			sb.append(trait);
			sb.append(" ");
		}
		return sb.toString().trim();
	}

	@Override
	public String[] getNumberOfMembersForEachHouse() {
		String[] numbers = new String[houses.size()];

		int count = 0;
		for (House house : houses.values()) {
			StringBuilder sb = new StringBuilder();
			sb.append(house.getName());
			sb.append(":");
			sb.append(house.getMembers().size());
			numbers[count] = sb.toString();
			count++;
		}
		return numbers;
	}

	@Override
	public List<String> getMembersWithoutEyesColor() {
		List<String> members = new ArrayList<>();
		for (House house : houses.values()) {
			for (Member member : house.getMembers()) {
				if (member.getEyeColor().isEmpty()) {
					members.add(member.getFirstname());
				}
			}
		}
		return members;
	}

	@Override
	public String[] getMembersWithoutHairColor() {
		String[] members = null;
		int count = 0;
		for (House house : houses.values()) {
			for (Member member : house.getMembers()) {
				if (member.getHairColor().isEmpty()) {
					count++;
				}
			}
		}
		members = new String[count];
		count = 0;
		for (House house : houses.values()) {
			for (Member member : house.getMembers()) {
				if (member.getHairColor().isEmpty()) {
					members[count] = member.getFirstname();
					count++;
				}
			}
		}
		return members;
	}

	@Override
	public Collection<String> getDistinctMemberRoles() {
		Collection<String> roles = new HashSet<>();
		for (House house : houses.values()) {
			for (Member member : house.getMembers()) {
				roles.add(member.getRole());
			}
		}
		return roles;
	}

}
