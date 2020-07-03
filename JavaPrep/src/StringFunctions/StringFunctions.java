package StringFunctions;

public class StringFunctions {

	public static void main(String[] args) {
		
		String str = "Hello Wolrd!";
		String str2 = new String("Hello Wolrd!");
		System.out.println(str.length());
		System.out.println(str.charAt(1));
		System.out.println(str.substring(7));
		System.out.println(str.substring(7,10));
		System.out.println(str.contains("Hello"));
		System.out.println(str.equals(str2));
		System.out.println(str.isEmpty());
		System.out.println(str.concat(str2));
		String cars = "Hyundai,Maruti,Skoda,Lamborghini,Ferari";
		String[] arr = cars.split(",");
		for(String car:arr){
			System.out.println(car);
		}
		System.out.println(str.indexOf('h'));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.trim());
	

	}
}
