import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> Patients = new ArrayList<>();
		
		Patients.add("kanchan");
		Patients.add("vicky");
		Patients.add("ram");
		Patients.add("mohit");
		Patients.add("amit");
		
		for(int i =0; i< Patients.size();i++) {
		System.out.println(Patients.get(i));
		}
	}

}
