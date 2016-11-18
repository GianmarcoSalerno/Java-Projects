package notebook;

public class Security {
	
	private String password = "kitten";
	
	protected boolean checkPassword(String x){
		if(x.length()<15 && x.equals(password)) return true;
		return false;
	}
	
}
