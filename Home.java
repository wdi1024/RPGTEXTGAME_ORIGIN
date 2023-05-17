import java.util.Scanner;

public class Home {
	int stageNum;
	static heroStatus hero = new heroStatus();
	static Scanner in = new Scanner(System.in);
	static int boss_clear = 0;

	static void selectMap() {
		int map;
		System.out.println("1.던전 \n2.상점 \n3.용병소 \n4.여관\n5.아이템 사용");
		System.out.printf("장소 번호를 입력하세요. : ");
		map = in.nextInt();
		if (map == 1) {
			System.out.println("=====================================");
			// SelectingDungeon.StartSelectingDungeon();
		} else if (map == 2) {
			System.out.println("=====================================");
			Shop.StartShop();
		} else if (map == 3) {
			System.out.println("=====================================");
			// SoldierCamp.StartSoldierCamp();
		} else if (map == 4) {
			System.out.println("=====================================");
			Inn.InnStart();
		} else if (map == 5) {
			System.out.println("=====================================");
			ItemAtHome.StartItemAtHome();
		} else {
			System.out.println("=====================================");
			System.out.println("장소 목록의 번호를 입력해주세요.");
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			heroStatus.solNum.add(new solClass(i + 1));
		}

		System.out.println("RPG TEXT GAME에 오신 것을 환영합니다.");
		System.out.printf("우선 ");
		heroStatus.setName();
		heroStatus.selectJob();
		hero.printStatus();
		System.out.println("모험을 시작해 마을에 도착했습니다.");
		System.out.println("==============================================");
		while (boss_clear != 1)
			selectMap();

		System.out.println("보스를 물리쳐 게임을 클리어하셨습니다! 축하합니다!");
	}

}
