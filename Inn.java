package Game;

import java.util.Scanner;

public class Inn {
	static int charge = 0;
	static Scanner in = new Scanner(System.in);

	static void rest() {
		if (heroStatus.money > charge) {
			if (heroStatus.hp != heroStatus.maxHp) {
				charge++;
				heroStatus.hp += heroStatus.maxHp * 0.1;
				System.out.println("체력이 " + (heroStatus.maxHp * 0.1) + "만큼 회복되었습니다.");
			} else
				System.out.println("체력이 최대치입니다.");
		}
	}

	static void recoverSol() {
		for (int i : heroStatus.solNum)
			if (solClass.solClasses[i].solHp != solClass.solClasses[i].solMaxHp) {
				solClass.solClasses[i].solHp = solClass.solClasses[i].solMaxHp;
				System.out.println(solClass.solClasses[i].solName + "의 체력이 최대치로 회복되었습니다.");
			} else
				System.out.println(solClass.solClasses[i].solName + "의 체력이 최대치입니다.");
	}

	static void checkMoney() {
		System.out.println("현재 돈을 " + heroStatus.money + " 만큼 보유하고 있습니다.");
	}

	static void takePrice() {
		System.out.println("숙박료를 " + charge + "만큼 지불했습니다.");
		heroStatus.money -= charge;
	}

	static void InnStart() {
		while (true) {
			int selection;
			selection = in.nextInt();
			if (selection == 1)
				rest();
			else if (selection == 2)
				recoverSol();
			else if (selection == 3)
				checkMoney();
			else if (selection == 4)
				takePrice();
			else if (selection == 5) {
				if (charge == 0) {
					System.out.println("왔던 곳으로 돌아갑니다.");
					break;
				} else
					System.out.println("숙박료를 지불한 후 다시 시도해주세요.");
			} else
				System.out.println("1~5 사이의 숫자로 다시 입력하세요.");
		}
	}
}
