import java.util.Random;
import java.util.Scanner;

public class Ex06_야구게임 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int[] result = new int[3];	// 랜덤으로 나올 숫자
		int[] input = new int[3];	// 입력할 숫자
		System.out.println("야구 게임 시작!");
		System.out.println("숫자 3개가 나왔습니다! 맞춰보세요!"); 
		for (int cnt = 0; cnt < 3; cnt++) {
			result[cnt] = rd.nextInt(9) + 1;	//1~9까지 숫자 랜덤으로 출력
		}
		while (true) {					// for 문이나 cnt 변수 기입하여 횟수를 줄 수 있음
			for (int cnt2 = 0; cnt2 < 3; cnt2++) {
				input[cnt2] = sc.nextInt();	// 플레이어의 숫자 기입
				if (input[cnt2] > 9 || input[cnt2] < 1) {
					cnt2--;
					System.out.println("1~9 사이의 숫자로 다시 입력해주세요.");
				}
			}
			int ball = 0;
			int strike = 0;
			for (int a = 0; a < result.length; a++) {
				for (int b = 0 + a; b < result.length; b++)
					if (a == b) {				//  자리가 같으면 값이 같다면 strike 카운트 증가
						if (result[a] == input[b]) {	
							strike++;
						}
					} else {
						if (result[a] == input[b]) {	// 자리가 다를 때 값이 같다면 ball 카운트 증가
							ball++;
						}
					}
			}

			System.out.println(strike + " 스트라이크  " + ball + " 볼");
			if (strike == 3) {					// 스트라이크가 3번 나오면 정답 게임종료
				System.out.println("정답");
				break;
			}
		}
	}
}
