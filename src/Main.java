import java.util.Scanner;

public class Main {
    static int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 1;
        while (true) {
            if (nums[i] + nums[j] == target) {
                break;
            } else if (j == nums.length - 1) {
                i++;
                j = i + 1;
            } else j++;
        }
        return new int[]{i, j};
    }

    public static void main(String[] args) {
        //needs done
        int[] nums = new int[5];
        int target;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; ++i)
            nums[i] = scanner.nextInt();
        System.out.println("");
        target = scanner.nextInt();
        int[] rez = twoSum(nums, target);
        System.out.println("[" + rez[0] + "," + rez[1] + "]");
    }
}