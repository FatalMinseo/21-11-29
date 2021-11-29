import java.util.Random;
import java.util.Scanner;

public class Ex06_야구게임 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int[] result = new int[3];
		int[] input = new int[3];
		System.out.println("야구 게임 시작!");
		System.out.println("숫자 3개가 나왔습니다! 맞춰보세요!");
		for (int cnt = 0; cnt < 3; cnt++) {
			result[cnt] = rd.nextInt(9) + 1;
		}
		while (true) {
			for (int cnt2 = 0; cnt2 < 3; cnt2++) {
				input[cnt2] = sc.nextInt();
				if (input[cnt2] > 9 || input[cnt2] < 1) {
					cnt2--;
					System.out.println("1~9 사이의 숫자로 다시 입력해주세요.");
				}
			}
			int ball = 0;
			int strike = 0;
			for (int a = 0; a < result.length; a++) {
				for (int b = 0 + a; b < result.length; b++)
					if (a == b) {
						if (result[a] == input[b]) {
							strike++;
						}
					} else {
						if (result[a] == input[b]) {
							ball++;
						}
					}
			}

			System.out.println(strike + " 스트라이크  " + ball + " 볼");
			if (strike == 3) {
				System.out.println("정답");
				break;
			}
		}
	}
}
