package hb.pojos;

import java.util.ArrayList;
import java.util.List;

public class House {

	private String name;
	private String headquarters;
	private String region;
	private String motto;
	private Blazon blazon;
	private List<Member> members;

	public House(String name, String headquarters, String region, String motto) {
		this.name = name;
		this.headquarters = headquarters;
		this.region = region;
		this.motto = motto;
		this.members = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHeadquarters() {
		return headquarters;
	}

	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getMotto() {
		return motto;
	}

	public void setMotto(String motto) {
		this.motto = motto;
	}

	public Blazon getBlazon() {
		return blazon;
	}

	public void setBlazon(Blazon blazon) {
		this.blazon = blazon;
	}

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	@Override
	public String toString() {
		return "House [name=" + name + ", headquarters=" + headquarters + ", region=" + region + ", motto=" + motto
				+ ", blazon=" + blazon + ",\n" + "members=" + toStringMembers() + "\n]";
	}

	private String toStringMembers() {
		StringBuilder sb = new StringBuilder();
		for (Member member : members) {
			sb.append(member);
			sb.append("\n");
		}
		if (sb.length() > 1) {
			sb = sb.deleteCharAt(sb.length() - 1);
		}
		return sb.toString();
	}
}
