
public class Surgeon extends Doctor {
	
	boolean isOperating;

	public boolean isOperating() {
		return isOperating;
	}

	public void setOperating(boolean isOperating) {
		this.isOperating = isOperating;
	}

	@Override
	public String toString() {
		return "" +name + " "+ speciality+ " "+isOperating;
	}
	
	@Override
	public void work() {
		String Operating = "not operating";
		if(isOperating) {
			Operating = "operating";
		}
	}

	public Surgeon(String name, int number, String speciality, boolean isOperating) {
		super(name, number, speciality);
		this.isOperating = isOperating;
	}
	
	
	
	
	
	
	

}
