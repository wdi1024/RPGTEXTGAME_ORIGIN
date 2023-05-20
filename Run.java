import java.util.Scanner;

public class Run {

	void checkRun() {
		if (SelectingDungeon.isItBossDungeon == true) {
			canRun();
		} else {
			canNotRun();
		}
	}

	boolean canRun() {
		Scanner in = new Scanner(System.in);
		System.out.print("홈으로 도망가시겠습니까?(네:1 아니요:2 입력) : ");
		int answer = in.nextInt();
		System.out.println("=====================================");
		if (answer == 1) {
			System.out.printf("\n헐레벌떡 도망치느라 hp가 1이 되었고 돈을 %d원 잃어버려습니다.", heroStatus.money * 25 / 100);
			heroStatus.hp = 1;
			heroStatus.money = heroStatus.money * 75 / 100;
			return true;// 홈으로 돌아감
		} else {
			return false;
		}
	}

	boolean canNotRun() {
		System.out.print("보스에게서는 도망칠 수 없습니다!");
		return false;
	}

}
