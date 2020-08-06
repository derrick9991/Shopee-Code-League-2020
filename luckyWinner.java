import java.util.Arrays;
import java.util.Scanner;

public class luckyWinner {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, k;
		n = input.nextInt();
		k = input.nextInt();

		int[][] temp = new int[n][3];

		for (int i = 0; i < n; i++)
			for (int j = 0; j < 3; j++)
				temp[i][j] = input.nextInt();

		Arrays.sort(temp, (i, j) -> i[0] - j[0]);

//		for (int i = 0; i < n; i++) {
//			System.out.println();
//			for (int j = 0; j < 3; j++)
//				System.out.print(temp[i][j] + " ");
//		}
		int loop = 1;
		int total = 0;
		do {
			int i = temp.length - loop;
			int max = -99;
			int max2 = -99;

			for (int j = 0; j < 3; j++) {
				if (temp[i][j] > max) {
					max2 = max;
					max = temp[i][j];
				} else if (temp[i][j] > max2) {
					max2 = temp[i][j];
				}
			}
			total += max + max2;

			loop++;
		} while (loop <= k);

		System.out.println(total);
	}
}
