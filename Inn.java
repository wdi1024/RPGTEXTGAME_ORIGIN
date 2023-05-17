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
				System.out.println("=====================================");
			} else {
				System.out.println("체력이 최대치입니다.");
				System.out.println("=====================================");
			}
		} else {
			System.out.println("보유금액이 지불해야 할 금액보다 적거나 0입니다.");
			System.out.println("=====================================");
		}
	}

	static void recoverSol() {
		for (int i = 0; i < heroStatus.solNum.size(); i++)
			if (heroStatus.solNum.get(i).solHp != heroStatus.solNum.get(i).solMaxHp) {
				heroStatus.solNum.get(i).solHp = heroStatus.solNum.get(i).solMaxHp;
				System.out.println(heroStatus.solNum.get(i).solName + "의 체력이 최대치로 회복되었습니다.");
				System.out.println("=====================================");
			} else {
				System.out.println(heroStatus.solNum.get(i).solName + "의 체력이 최대치입니다.");
				System.out.println("=====================================");
			}
	}

	static void checkMoney() {
		System.out.println("현재 돈을 " + heroStatus.money + " 만큼 보유하고 있습니다.");
		System.out.println("=====================================");
	}

	static void takePrice() {
		heroStatus.money -= charge;
		System.out.println("숙박료를 " + charge + "만큼 지불했습니다.");
		System.out.println("=====================================");
	}

	static void InnStart() {
		while (true) {
			int selection;
			System.out.println("1.캐릭터 회복\n2.용병 회복\n3.보유금액 확인\n4.숙박비 지불\n5.돌아가기");
			System.out.printf("행동 번호를 입력하세요. :");
			selection = in.nextInt();
			System.out.println("=====================================");
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
