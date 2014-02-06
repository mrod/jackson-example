package jackson.example.model;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;


public class User {
 
	@Getter @Setter
	private int age = 29;
	@Getter @Setter
	private String name = "mkyong";
	@Getter @Setter
	private List<String> messages = new ArrayList<String>() {
		{
			add("msg 1");
			add("msg 2");
			add("msg 3");
		}
	};
	
	@Getter @Setter
	private List<Profile> profiles = new ArrayList<Profile>(){
		{
			add(new Profile("prof1","desc1"));
			add(new Profile("prof2","desc2"));
		}
	};
 
	//getter and setter methods
 
	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + ", " +
				"messages=" + messages + "]";
	}
}