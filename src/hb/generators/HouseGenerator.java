package hb.generators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import hb.pojos.Blazon;
import hb.pojos.House;
import hb.pojos.Member;

public class HouseGenerator {

	private Map<String, House> houses;

	public HouseGenerator() {
		this.houses = new HashMap<>();
		// house Stark
		House stark = new House("Stark", "Winterfell", "Nord", "Winter Is Coming");
		Blazon starkBlazon = new Blazon("loup garou");
		starkBlazon.setColors(new String[] { "gris", "blanc" });
		stark.setBlazon(starkBlazon);
		List<Member> starks = new ArrayList<>();
		Member lordEddard = new Member("Stark", "Lord Eddard", "gris", "brun", "Sire de Winterfell");
		lordEddard.setPersonalityTraits(new String[] { "froid", "affecteux" });
		starks.add(lordEddard);
		Member robb = new Member("Stark", "Robb", "bleu", "auburn", "Fils ain� et h�ritier de Winterfell");
		robb.setPersonalityTraits(new String[] { "juste", "respectueux" });
		starks.add(robb);
		Member jon = new Member("Snow", "Jon", "gris", "noir", "B�tard de Winterfell");
		jon.setPersonalityTraits(new String[] {});
		starks.add(jon);
		Member sansa = new Member("Stark", "Sansa", "bleu", "auburn", "Fille a�n�e");
		sansa.setPersonalityTraits(new String[] { "belle", "pr�cieuse" });
		starks.add(sansa);
		Member arya = new Member("Stark", "Arya", "", "brun", "Seconde fille");
		arya.setPersonalityTraits(new String[] { "rebelle", "aventuri�re" });
		starks.add(arya);
		Member brandon = new Member("Stark", "Brandon", "", "", "Second fils");
		brandon.setPersonalityTraits(new String[] { "r�veur", "agile" });
		starks.add(brandon);
		Member rickon = new Member("Stark", "Rickon", "", "", "Trois�me fils");
		rickon.setPersonalityTraits(new String[] {});
		starks.add(rickon);
		Member benjen = new Member("Stark", "Benjen", "bleu,gris", "", "Fr�re cadet");
		benjen.setPersonalityTraits(new String[] { "maigre" });
		starks.add(benjen);

		stark.setMembers(starks);
		this.houses.put(stark.getName(), stark);

		// house Lannister
		House lannister = new House("Lannister", "Castral Roc", "Terres de l'Ouest", "Hear Me Roar");
		Blazon lannisterBlazon = new Blazon("lion");
		lannisterBlazon.setColors(new String[] { "or", "rouge" });
		lannister.setBlazon(lannisterBlazon);
		List<Member> lannisters = new ArrayList<>();
		Member tywin = new Member("Lannister", "Tywin", "vert,or", "ras�", "Seigneur de la maison");
		tywin.setPersonalityTraits(new String[] { "froid", "inflexible", "calculateur" });
		lannisters.add(tywin);
		Member jaime = new Member("Lannister", "Jaime", "vert", "blond", "R�gicide");
		jaime.setPersonalityTraits(new String[] { "courageux", "arrogant", "s�r de lui" });
		lannisters.add(jaime);
		Member cersei = new Member("Lannister", "Cersei", "vert", "blond", "Epouse du roi Robert Baratheon");
		cersei.setPersonalityTraits(new String[] { "belle" });
		lannisters.add(cersei);
		Member tyrion = new Member("Lannister", "Tyrion", "noir,vert", "blanc", "Second fils");
		tyrion.setPersonalityTraits(new String[] { "nain", "laid", "intelligent", "rus�" });
		lannisters.add(tyrion);

		lannister.setMembers(lannisters);
		this.houses.put(lannister.getName(), lannister);

		// house Baratheon
		House baratheon = new House("Baratheon", "Accalmie", "Terres de l'Orage", "Ours is the Fury");
		Blazon baratheonBlazon = new Blazon("cerf");
		baratheonBlazon.setColors(new String[] { "or", "noir" });
		baratheon.setBlazon(baratheonBlazon);
		List<Member> baratheons = new ArrayList<>();
		Member robert = new Member("Baratheon", "Robert", "bleu clair", "noir", "Roi des sept couronnes");
		robert.setPersonalityTraits(new String[] { "infid�le", "emp�t�" });
		baratheons.add(robert);
		Member joffrey = new Member("Baratheon", "Joffrey", "vert", "blond", "Fils a�n� et h�ritier");
		joffrey.setPersonalityTraits(new String[] { "imbu", "d�daigneux" });
		baratheons.add(joffrey);
		Member myrcella = new Member("Baratheon", "Myrcella", "vert", "or", "Fille unique");
		myrcella.setPersonalityTraits(new String[] { "douce", "timide" });
		baratheons.add(myrcella);
		Member tommen = new Member("Baratheon", "Tommen", "vert", "or", "Deuxi�me fils");
		tommen.setPersonalityTraits(new String[] { "randouillard", "enjou�" });
		baratheons.add(tommen);
		Member stannis = new Member("Baratheon", "Stannis", "vert", "or", "Fr�re cadet");
		stannis.setPersonalityTraits(new String[] { "maigre", "dur", "tenace", "jaloux" });
		baratheons.add(stannis);
		Member renly = new Member("Baratheon", "Renly", "", "noir", "Sire d'Accalmie");
		renly.setPersonalityTraits(new String[] { "charismatique", "beau", "�l�gant", "impulsif", "moqueur" });
		baratheons.add(renly);

		baratheon.setMembers(baratheons);
		this.houses.put(baratheon.getName(), baratheon);

		// house Targaryen
		House targaryen = new House("Targaryen", "", "", "Fire and Blood");
		Blazon targaryenBlazon = new Blazon("dragon");
		targaryenBlazon.setColors(new String[] { "rouge", "noir" });
		targaryen.setBlazon(targaryenBlazon);
		List<Member> targaryens = new ArrayList<>();
		Member viserys = new Member("Targaryen", "Viseris", "lilas", "or", "H�ritier l�gitime des sept couronnes");
		viserys.setPersonalityTraits(new String[] { "orgueilleux", "ambitieux", "col�rique", "brutal" });
		targaryens.add(viserys);
		Member daenerys = new Member("Targaryen", "Daenerys", "violet", "or,argent", "Fille unique");
		daenerys.setPersonalityTraits(new String[] { "timide", "svelte" });
		targaryens.add(daenerys);

		targaryen.setMembers(targaryens);
		this.houses.put(targaryen.getName(), targaryen);

		// house Greyjoy
		House greyjoy = new House("Greyjoy", "Pyk", "�les de Fer", "We Do Not Sow");
		Blazon greyjoyBlazon = new Blazon("seiche");
		greyjoyBlazon.setColors(new String[] { "dor�", "noir" });
		greyjoy.setBlazon(greyjoyBlazon);
		List<Member> greyjoys = new ArrayList<>();
		Member theon = new Member("Greyjoy", "Theon", "", "", "Dernier fils vivant");
		theon.setPersonalityTraits(new String[] { "arrogant", "s�duisant", "s�r de lui" });
		greyjoys.add(theon);

		greyjoy.setMembers(greyjoys);
		this.houses.put(greyjoy.getName(), greyjoy);
	}

	public Map<String, House> getHouses() {
		return houses;
	}
}
