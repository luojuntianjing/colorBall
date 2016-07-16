package ball;

import java.util.Random;
import java.util.Scanner;

public class Colorball {
	public static void main(String[] args) {
		int redBall[] = { 1, 2, 3, -1, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
				26, 27, 28, 29, 30, 31, 32, 33 };
		int blueBall[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };

		int[] TakeRedball = new int[6];
		int Takeblueball;

		int[] GiveRedball = new int[6];
		int GiveBlueball = 0;

		int RedNumber = 0;
		int BlueNumber = 0;

		int index = 0;
		// *******1产生系统号码(red6个，blue1个)*****************************
		Random Anydate = new Random();
		for (int i = 0; i < 6; i++) {
			while (true) {
				index = Anydate.nextInt(33);
				// System.out.print(index+" ");

				if (redBall[index] != -1) {
					TakeRedball[i] = redBall[index];
					redBall[index] = -1;
					break;
				}

			}

		}
		// System.out.println("\n");
		Takeblueball = Anydate.nextInt(16) + 1;

		// 2输入号码
		System.out.println("请输入6个红球数");
		for (int i = 0; i < 6; i++) {
			Scanner now = new Scanner(System.in);
			GiveRedball[i] = now.nextInt();
		}
		System.out.println("请输入1个蓝球数");
		Scanner Then = new Scanner(System.in);
		GiveBlueball = Then.nextInt();
		System.out.println("输入完毕");
		// 3验证号码
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (TakeRedball[i] == GiveRedball[j]) {
					RedNumber++;
					System.out.println("您中奖红球号:" + GiveRedball[j]);
				}
			}
		}
		System.out.println("您中奖红球数个数:" + RedNumber);
		if (Takeblueball == GiveBlueball) {
			BlueNumber++;
		}
		System.out.println("您中奖蓝球数个数:" + BlueNumber);
		// 4公布结果（中奖等级和中奖号码）
		System.out.println("中奖红球号码:");
		for (int i = 0; i < 6; i++) {
			System.out.print(TakeRedball[i] + "、");
		}
		System.out.println("\n");
		System.out.println("中奖蓝球号码" + Takeblueball);
		if (RedNumber == 6 && BlueNumber == 1) {
			System.out.println("恭喜你获得一等奖500万");
		}
		if (RedNumber == 6 && BlueNumber == 0) {
			System.out.println("恭喜你获得二等奖50万");
		}
		if (RedNumber == 5 && BlueNumber == 1) {
			System.out.println("恭喜你获得三等奖1万");
		}
		if (RedNumber == 4) {
			System.out.println("恭喜你获得四等奖10元");
		}
		if (RedNumber <= 3 || BlueNumber == 1) {
			System.out.println("恭喜你获得五等奖5元");
		}
		if (RedNumber == 0 && BlueNumber == 0) {
			System.out.println("谢谢惠顾");
		}

	}

}
