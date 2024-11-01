import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = 8;
        int[] nums = new int[num];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < num; i++) {
            nums[i] = input.nextInt();
        }

        int count = 0;
        for (int i = 0; i < num - 1; i++) {
            if (nums[i] < nums[i + 1]) count--;
            if (nums[i] > nums[i + 1]) count++;
        }

        if (count == 7) {
            System.out.println("descending");
        } else if (count == -7) {
            System.out.println("ascending");
        } else {
            System.out.println("mixed");
        }
    }
}
