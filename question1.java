import java.util.*;

public class question1 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int arr[] = new int[size];

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            List<List<Integer>> apList = findAllAPs(arr);
            // Print the found arithmetic progressions
            for (List<Integer> ap : apList) {
                System.out.print("AP: ");
                for (int num : ap) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }

    private static List<List<Integer>> findAllAPs(int[] arr) {
        List<List<Integer>> apList = new ArrayList<>();
        Map<Integer, List<List<Integer>>> diffMap = new HashMap<>();

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int diff = arr[i] - arr[j];
                List<Integer> ap = new ArrayList<>();
                ap.add(arr[j]);
                ap.add(arr[i]);

                if (diffMap.containsKey(diff)) {
                    List<List<Integer>> existingAPs = diffMap.get(diff);
                    List<List<Integer>> newAPs = new ArrayList<>();

                    for (List<Integer> existingAP : existingAPs) {
                        if (existingAP.get(existingAP.size() - 1) == arr[j]) {
                            List<Integer> newAP = new ArrayList<>(existingAP);
                            newAP.add(arr[i]);
                            newAPs.add(newAP);
                        }
                    }

                    for (List<Integer> newAP : newAPs) {
                        apList.add(newAP);
                    }

                    existingAPs.addAll(newAPs);
                }

                List<List<Integer>> diffList = diffMap.getOrDefault(diff, new ArrayList<>());
                diffList.add(ap);
                diffMap.put(diff, diffList);
            }
        }

        return apList;
    }
}

