public class euler26 {
    public static void main(String[] args) {
        int maxCycleLength = 0;
        int dWithMaxCycle = 0;

        for (int d = 2; d < 2000; d++) {
            int[] remainders = new int[d];
            int value = 1;
            int position = 0;

            while (value != 0 && remainders[value] == 0) {
                remainders[value] = position;
                value = (value * 10) % d;
                position++;
            }

            if (position - remainders[value] > maxCycleLength) {
                maxCycleLength = position - remainders[value];
                dWithMaxCycle = d;
            }
        }

        System.out.println("Number with the longest recurring cycle is: " + dWithMaxCycle);
        System.out.println("Length of the recurring cycle is: " + maxCycleLength);
    }
}
