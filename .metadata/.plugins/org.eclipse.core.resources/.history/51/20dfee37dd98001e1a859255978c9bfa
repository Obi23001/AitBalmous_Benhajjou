package exercices;

import java.util.Arrays;
import java.util.List;

import exercices.Member.Type;

public class Member {
	private String LastName;
	private String FirstName;
	private Type type;
	private int Handicap;
	private String Team;
	private char Gender;
	
	
	public String getLastName() {
		return LastName;
	}
	
	
	
	public static enum Type{
		Junior, Senior,Social;
		
		
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public int getHandicap() {
		return Handicap;
	}
	public void setHandicap(int handicap) {
		Handicap = handicap;
	}
	public String getTeam() {
		return Team;
	}
	public void setTeam(String team) {
		Team = team;
	}
	public char getGender() {
		return Gender;
	}
	public void setGender(char gender) {
		Gender = gender;
	}
	public Member(String lastName, String firstName, Type type, int handicap, String team, char gender) {
		super();
		LastName = lastName;
		FirstName = firstName;
		this.type = type;
		Handicap = handicap;
		Team = team;
		Gender = gender;
	}
	@Override
	public String toString() {
		return "Member [LastName=" + LastName + ", FirstName=" + FirstName + ", type=" + type + ", Handicap=" + Handicap
				+ ", Team=" + Team + ", Gender=" + Gender + "]";
	}
	public static List<Member>  members = Arrays.asList(
			new Member( "McKenzie", "Melissa", Type.Junior, 35, "TeamA", 'F'),
			new Member("Stone", "Michael", Type.Senior,  30,  "TeamB", 'M'),
			new Member( "Nolan", "Brenda", Type.Senior, 11, "TeamB", 'F'),
			new Member("Branch", "Helen", Type.Social, 20, "TeamA", 'F'),
			new Member("Beck", "Sarah", Type.Social, 25, "TeamC", 'F'),
			new Member("Burton", "Sandra", Type.Junior, 26,  "TeamC", 'F'),
			new Member("Cooper", "William", Type.Senior, 14, "TeamB", 'M'),
			new Member("Spence", "Thomas", Type.Senior,  10,  "TeamB", 'M'),
			new Member("Pollard", "Robert", Type.Junior, 19, "TeamB", 'M'),
			new Member("Sexton", "Thomas", Type.Senior, 26, "TeamA", 'M'),
			new Member("Wilcox", "Daniel", Type.Senior,  3, "TeamA", 'M'),
			new Member("Wilcox", "Daniel", Type.Senior, 2, "TeamA", 'M')
			);
	
	
	
	

}
