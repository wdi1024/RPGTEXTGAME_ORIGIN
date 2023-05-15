package Game;

import java.util.ArrayList;
import java.util.Scanner;

public class heroStatus {
	static String name, job;
	static int hp, maxHp, mp, maxMp, power, magic, selection = 0, hiredSoldierCnt = 0, money = 0, exp = 0, level = 1;
	static ArrayList<Integer> solNum = new ArrayList<>();
	static Scanner in = new Scanner(System.in);

	static void setName() {
		String good = "0";
		while (!good.equals("y")) {
			System.out.printf("캐릭터의 이름을 입력하세요 : ");
			name = in.nextLine();
			System.out.println("캐릭터의 이름으로 " + name + "을 사용하시겠습니까? y/n");
			good = in.nextLine();
		}
		System.out.println("==============================================");
	}

	static void selectJob() {
		while (selection < 1 || selection > 4) {
			System.out.println("1.전사 \n2.궁수 \n3.마법사 \n4.도적 ");
			System.out.printf("직업 번호를 선택하세요. : ");
			selection = in.nextInt();
			System.out.println("==============================================");
			if (selection == 1) {
				job = "전사";
				hp = 50;
				maxHp = 50;
				mp = 20;
				maxMp = 20;
				power = 10;
				magic = 2;
			} else if (selection == 2) {
				job = "궁수";
				hp = 40;
				maxHp = 40;
				mp = 25;
				maxMp = 25;
				power = 7;
				magic = 5;
			} else if (selection == 3) {
				job = "마법사";
				hp = 30;
				maxHp = 30;
				mp = 50;
				maxMp = 50;
				power = 2;
				magic = 10;
			} else if (selection == 4) {
				job = "도적";
				hp = 40;
				maxHp = 40;
				mp = 25;
				maxMp = 25;
				power = 7;
				magic = 5;
			} else
				System.out.println("직업 보기에 있는 번호를 선택하세요.");
		}
	}

	void printStatus() {
		System.out.println("이름 : " + name);
		System.out.println("직업 : " + job);
		System.out.println("레벨 : " + level);
		System.out.println("체력 : " + hp + " 최대체력 : " + maxHp);
		System.out.println("체력 : " + mp + " 최대체력 : " + maxMp);
		System.out.println("힘 : " + power);
		System.out.println("마력 : " + magic);
		System.out.println("동행 용병 수 : " + hiredSoldierCnt);
		System.out.println("돈 : " + money);
		System.out.println("경험치 : " + exp);
		System.out.println("==============================================");
	}
}
