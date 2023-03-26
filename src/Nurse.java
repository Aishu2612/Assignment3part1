
public class Nurse extends HospitalEmployee{
	int numOfPatients;

	public int getNumOfPatients() {
		return numOfPatients;
	}

	public void setNumOfPatients(int numOfPatients) {
		this.numOfPatients = numOfPatients;
	}

	@Override
	public String toString() {
		return "" + name + " " +number+ "has "+ numOfPatients + " patients ";
	}

	public Nurse(String name, int number, int numOfPatients) {
		super(name, number);
		this.numOfPatients = numOfPatients;
	}
	
	@Override
	public void work() {
		System.out.println(name+ "works for the hospital."+ name+ "is a nurse with" + numOfPatients+ "Patient");
	}
	
	
	

}
