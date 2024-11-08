package Basic8thNov;

public class Main2 {

	public static void main(String[] args) {
		String[] countries = new String[3];
		countries[0]="India";
		countries[1]="USA";
		countries[2]="India";
		int count=0;
		for(String country : countries) {
			if(country.equals("India")) {
				count++;
			}
		}
		System.out.println(count);
		

	}

}
