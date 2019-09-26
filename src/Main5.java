
public class Main5 {

	public static void main(String[] args) {
		int[] numbers = {2, 7, 10, 15, 3, 50,101, 102,18,35};
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max)
				max= numbers[i];
		}
		System.out.println(max);
	}
}




