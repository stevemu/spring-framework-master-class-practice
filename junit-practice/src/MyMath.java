public class MyMath {

    public static int counter = 0;

    public int sum(int[] numbers) {
        counter++;
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }
}
