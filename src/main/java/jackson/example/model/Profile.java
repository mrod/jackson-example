package jackson.example.model;
import lombok.Getter;
import lombok.Setter;


public class Profile {

	@Getter @Setter
	private String name;
	@Getter @Setter
	private String description;
	
	public Profile(){
	}
	
	public Profile(String _name, String _desc) {
		name = _name;
		description = _desc;
	}

	//	@Override
//	public String toString(){
//		
//	}
	
}
