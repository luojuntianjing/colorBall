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
		// *******1����ϵͳ����(red6����blue1��)*****************************
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

		// 2�������
		System.out.println("������6��������");
		for (int i = 0; i < 6; i++) {
			Scanner now = new Scanner(System.in);
			GiveRedball[i] = now.nextInt();
		}
		System.out.println("������1��������");
		Scanner Then = new Scanner(System.in);
		GiveBlueball = Then.nextInt();
		System.out.println("�������");
		// 3��֤����
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (TakeRedball[i] == GiveRedball[j]) {
					RedNumber++;
					System.out.println("���н������:" + GiveRedball[j]);
				}
			}
		}
		System.out.println("���н�����������:" + RedNumber);
		if (Takeblueball == GiveBlueball) {
			BlueNumber++;
		}
		System.out.println("���н�����������:" + BlueNumber);
		// 4����������н��ȼ����н����룩
		System.out.println("�н��������:");
		for (int i = 0; i < 6; i++) {
			System.out.print(TakeRedball[i] + "��");
		}
		System.out.println("\n");
		System.out.println("�н��������" + Takeblueball);
		if (RedNumber == 6 && BlueNumber == 1) {
			System.out.println("��ϲ����һ�Ƚ�500��");
		}
		if (RedNumber == 6 && BlueNumber == 0) {
			System.out.println("��ϲ���ö��Ƚ�50��");
		}
		if (RedNumber == 5 && BlueNumber == 1) {
			System.out.println("��ϲ�������Ƚ�1��");
		}
		if (RedNumber == 4) {
			System.out.println("��ϲ�����ĵȽ�10Ԫ");
		}
		if (RedNumber <= 3 || BlueNumber == 1) {
			System.out.println("��ϲ������Ƚ�5Ԫ");
		}
		if (RedNumber == 0 && BlueNumber == 0) {
			System.out.println("лл�ݹ�");
		}

	}

}
