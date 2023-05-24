import java.util.Scanner;

public class Run {

	static boolean checkRun() {
		if (SelectingDungeon.isItBossDungeon == false) {
			return canRun();
		} else {
			return canNotRun();
		}
	}

	static boolean canRun() {
		Scanner in = new Scanner(System.in);
		System.out.print("홈으로 도망가시겠습니까?(네:1 아니요:2 입력) : ");
		int answer = in.nextInt();
		System.out.println("=====================================");
		if (answer == 1) {
			System.out.printf("헐레벌떡 도망치느라 hp가 1이 되었고 돈을 %d원 잃어버렸습니다.\n", heroStatus.money * 25 / 100);
			heroStatus.hp = 1;
			heroStatus.money = heroStatus.money * 75 / 100;
			return true;// 홈으로 돌아감
		} else {
			return false;
		}
	}

	static boolean canNotRun() {
		System.out.print("보스에게서는 도망칠 수 없습니다!\n");
		return false;
	}

}
