import java.util.ArrayList;
import java.util.Scanner;

public class heroStatus {
	static String name, job;
	static int hp, maxHp, mp, maxMp, power, magic, selection = 0, money = 100000, exp = 0, level = 1;
	static ArrayList<solClass> solNum = new ArrayList<solClass>();
	static Scanner in = new Scanner(System.in);

	static void setName() {
		int good = 0;
		while (good != 1) {
			System.out.printf("캐릭터의 이름을 입력하세요 : ");
			name = in.nextLine();
			System.out.print("캐릭터의 이름으로 " + name + "을 사용하시겠습니까? (네:1 아니오:2 입력) : ");
			good = in.nextInt();
			if (good != 1 && good != 2)
				System.out.println("네:1 아니오:2 중에서 입력해주세요.");
		}
		System.out.println("==============================================");
	}

	static void selectJob() {
		while (selection < 1 || selection > 4) {
			System.out.println("1.전사 \n2.궁수 \n3.마법사 \n4.도적 ");
			System.out.printf("\n직업 번호를 선택하세요. : ");
			selection = in.nextInt();
			System.out.println("==============================================");
			if (selection == 1) {
				job = "전사";
				hp = 100;
				maxHp = 100;
				mp = 20;
				maxMp = 20;
				power = 10;
				magic = 2;
			} else if (selection == 2) {
				job = "궁수";
				hp = 80;
				maxHp = 80;
				mp = 25;
				maxMp = 25;
				power = 7;
				magic = 5;
			} else if (selection == 3) {
				job = "마법사";
				hp = 60;
				maxHp = 60;
				mp = 50;
				maxMp = 50;
				power = 2;
				magic = 10;
			} else if (selection == 4) {
				job = "도적";
				hp = 80;
				maxHp = 80;
				mp = 25;
				maxMp = 25;
				power = 7;
				magic = 5;
			} else
				System.out.println("직업 보기에 있는 번호를 선택하세요.");
		}
	}

	static void checkLevelup() {
		if (heroStatus.exp >= heroStatus.level * 100) {
			heroStatus.exp -= heroStatus.level * 100;
			heroStatus.level++;
			if (selection == 1) {
				heroStatus.hp += 30;
				heroStatus.maxHp += 30;
				heroStatus.power += 5;
				heroStatus.mp += 2;
				heroStatus.maxMp += 2;
			} else if (selection == 2) {
				heroStatus.hp += 30;
				heroStatus.maxHp += 30;
				heroStatus.power += 3;
				heroStatus.magic += 2;
				heroStatus.mp += 2;
				heroStatus.maxMp += 2;
			} else if (selection == 3) {
				heroStatus.hp += 30;
				heroStatus.maxHp += 30;
				heroStatus.magic += 5;
				heroStatus.mp += 2;
				heroStatus.maxMp += 2;
			} else if (selection == 4) {
				heroStatus.hp += 30;
				heroStatus.maxHp += 30;
				heroStatus.power += 2;
				heroStatus.magic += 3;
				heroStatus.mp += 2;
				heroStatus.maxMp += 2;
			}
			for (int i = 0; i < heroStatus.solNum.size(); i++) {
				if (heroStatus.solNum.get(i).solNum == 1) {
					heroStatus.solNum.get(i).solHp += 10;
					heroStatus.solNum.get(i).solMaxHp += 10;
					heroStatus.solNum.get(i).solPower += 2;
				} else if (heroStatus.solNum.get(i).solNum == 2) {
					heroStatus.solNum.get(i).solHp += 5;
					heroStatus.solNum.get(i).solMaxHp += 5;
					heroStatus.solNum.get(i).solPower += 1;
					heroStatus.solNum.get(i).solMagic += 5;
				} else if (heroStatus.solNum.get(i).solNum == 3) {
					heroStatus.solNum.get(i).solHp += 5;
					heroStatus.solNum.get(i).solMaxHp += 5;
					heroStatus.solNum.get(i).solPower += 1;
					heroStatus.solNum.get(i).solMagic += 2;
				} else if (heroStatus.solNum.get(i).solNum == 4) {
					heroStatus.solNum.get(i).solHp += 30;
					heroStatus.solNum.get(i).solMaxHp += 30;
					heroStatus.solNum.get(i).solPower += 3;
				} else if (heroStatus.solNum.get(i).solNum == 5) {
					heroStatus.solNum.get(i).solHp += 8;
					heroStatus.solNum.get(i).solMaxHp += 8;
					heroStatus.solNum.get(i).solPower += 2;
					heroStatus.solNum.get(i).solMagic += 7;
				} else if (heroStatus.solNum.get(i).solNum == 6) {
					heroStatus.solNum.get(i).solHp += 8;
					heroStatus.solNum.get(i).solMaxHp += 8;
					heroStatus.solNum.get(i).solPower += 2;
					heroStatus.solNum.get(i).solMagic += 3;
				} else if (heroStatus.solNum.get(i).solNum == 7) {
					heroStatus.solNum.get(i).solHp += 40;
					heroStatus.solNum.get(i).solMaxHp += 40;
					heroStatus.solNum.get(i).solPower += 6;
				} else if (heroStatus.solNum.get(i).solNum == 8) {
					heroStatus.solNum.get(i).solHp += 14;
					heroStatus.solNum.get(i).solMaxHp += 14;
					heroStatus.solNum.get(i).solPower += 3;
					heroStatus.solNum.get(i).solMagic += 10;
				} else if (heroStatus.solNum.get(i).solNum == 9) {
					heroStatus.solNum.get(i).solHp += 14;
					heroStatus.solNum.get(i).solMaxHp += 14;
					heroStatus.solNum.get(i).solPower += 3;
					heroStatus.solNum.get(i).solMagic += 6;
				}
			}
			System.out.println("==============================================");
			System.out.println("레벨이 올라가 능력치가 상승했습니다!");
			System.out.println("==============================================");
			heroStatus.printStatus();
		}
		if (heroStatus.level == 15) {
			if (selection == 1) {
				heroStatus.job = "기사";
				System.out.println("적정 레벨에 도달하여 '기사'로 전직했습니다. 축하합니다!");
			} else if (selection == 2) {
				heroStatus.job = "정예궁수";
				System.out.println("적정 레벨에 도달하여 '정예궁수'로 전직했습니다. 축하합니다!");
			} else if (selection == 3) {
				heroStatus.job = "현자";
				System.out.println("적정 레벨에 도달하여 '현자'로 전직했습니다. 축하합니다!");
			} else if (selection == 4) {
				heroStatus.job = "섀도어";
				System.out.println("적정 레벨에 도달하여 '섀도어'로 전직했습니다. 축하합니다!");
			}
			System.out.println("이제부터 새로운 스킬을 사용할 수 있습니다.");
		}
	}

	static void printStatus() {
		System.out.println("이름 : " + name);
		System.out.println("직업 : " + job);
		System.out.println("레벨 : " + level);
		System.out.println("체력 : " + hp + " / " + maxHp);
		System.out.println("마나 : " + mp + " / " + maxMp);
		System.out.println("힘 : " + power);
		System.out.println("마력 : " + magic);
		System.out.println("동행 용병 수 : " + heroStatus.solNum.size());
		System.out.println("돈 : " + money);
		System.out.println("경험치 : " + exp);
		System.out.println("==============================================");
	}
}
