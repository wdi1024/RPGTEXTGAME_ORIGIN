import java.util.Scanner;

public class Home {
	int stageNum;
	static heroStatus hero = new heroStatus();
	static Scanner in = new Scanner(System.in);
	static int boss_clear = 0;

	static void selectMap() throws InterruptedException {
		int map;
		System.out.println("1.던전 \n2.상점 \n3.용병소 \n4.여관\n5.아이템 사용\n6.캐릭터 정보 확인");
		System.out.printf("장소 번호를 입력하세요. : ");
		map = in.nextInt();
		if (map == 1) {
			System.out.println("=====================================");
			for (int i = 0; i < 3; i++) {
				Thread.sleep(500);
				System.out.print(".");
			}
			System.out.println("던전 입구에 도착했습니다.");
			System.out.println("=====================================");
			SelectingDungeon.StartDungeon();
		} else if (map == 2) {
			System.out.println("=====================================");
			for (int i = 0; i < 3; i++) {
				Thread.sleep(500);
				System.out.print(".");
			}
			System.out.println("상점에 도착했습니다.");
			System.out.println("=====================================");
			Shop.StartShop();
		} else if (map == 3) {
			System.out.println("=====================================");
			for (int i = 0; i < 3; i++) {
				Thread.sleep(500);
				System.out.print(".");
			}
			System.out.println("용병소에 도착했습니다.");
			System.out.println("=====================================");
			SoldierCamp.StartSoldierCamp();
		} else if (map == 4) {
			System.out.println("=====================================");
			for (int i = 0; i < 3; i++) {
				Thread.sleep(500);
				System.out.print(".");
			}
			System.out.println("여관에 도착했습니다.");
			System.out.println("=====================================");
			Inn.InnStart();
		} else if (map == 5) {
			System.out.println("=====================================");
			ItemAtHome.StartItemAtHome();
		} else if (map == 6) {
			System.out.println("=====================================");
			heroStatus.printStatus();
		} else {
			System.out.println("=====================================");
			System.out.println("장소 목록의 번호를 입력해주세요.");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 9; i++) {
			SoldierCamp.unhiredSoldier.add(new solClass(i + 1));
		}
		System.out.println("'다구리게임'에 오신 것을 환영합니다.\n");
		Thread.sleep(1500);
		System.out.println("평화로운 마을 리버스톤");
		Thread.sleep(1500);
		System.out.println("어느날 리버스톤에 드리워진 죽음의 그림자!!");
		Thread.sleep(1500);
		System.out.println("사람들은 죽어가고 마을은 황폐해져 간다..");
		Thread.sleep(1500);
		System.out.println("모두 극악무도한 죽음의 그림자 군주의 소행!!");
		Thread.sleep(1500);
		System.out.println("당신은 용병단을 구성해 죽음의 그림자 군주를 무찔러야 한다...!");
		Thread.sleep(1500);
		System.out.println("과연 당신은 리버스톤의 수호자가 될 수 있을것인가..!?\n");
		Thread.sleep(1500);
		System.out.printf("우선 ");
		heroStatus.setName();
		heroStatus.selectJob();
		heroStatus.printStatus();
		System.out.println("모험을 시작해 마을에 도착했습니다.");
		System.out.println("==============================================");
		while (boss_clear != 1)
			selectMap();
		System.out.println("축하합니다! 보스를 처치하여 모험을 완료했습니다!\n수고하셨습니다!");
		Thread.sleep(1500);
		System.out.println("\n\n다구리게임");
		Thread.sleep(1500);
		System.out.println("객체지향프로그래밍 / 김형균 교수");
		Thread.sleep(1500);
		System.out.println("powered by 팀 오리진 (원대인, 김종민, 김주환)");
	}
}