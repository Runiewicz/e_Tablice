public class Main4 {
    public static void main(String[] args) {
        int[] numbers = {12, 2, 50, 13, 100, 999, 4, 17, 19, 43};
        int sumOdd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers [i]);
            } else if (numbers[i] % 2 !=0)
                sumOdd += numbers[i];
        }
        System.out.println("Suma liczb nieparzystych to:" + " " + sumOdd);
    }

}