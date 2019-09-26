public class Main2 {

	public static void main(String[] args) {
		String[] fruits = new String[]{"malina", "banan", "jabłko", "truskawka"};
		fruits[0] = "malina";
		fruits[1] = "banan";
		fruits[2] = "jabłko";
		fruits[3] = "truskawka";
		String last = fruits[fruits.length-1];
		System.out.println("pierwszy owoc to:"  + " " + fruits [0]);
		System.out.println("ostatni owoc to:"  + " " + last);

		for (int i=0; i<fruits.length; i++) {
			System.out.println(fruits[i] + " ");
		}
	}
}