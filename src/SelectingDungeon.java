import java.util.Scanner;

public class SelectingDungeon {

	static int dungeonNum;
	static boolean isItBossDungeon;
	
	static void StartDungeon() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.print("던전 번호를 선택하세요 (0 선택 시 복귀) : ");
			dungeonNum = in.nextInt();
			
			if (dungeonNum == 0) {
				System.out.println("돌아갑니다.");
				break;
			}
			if (dungeonNum == 1) {
				System.out.println("----- 신비한 숲 -----");
				Fight.selectAttack();
			}
			if (dungeonNum == 2) {
				System.out.println("----- 빛 바랜 성 -----.");
				Fight.selectAttack();
			}
			if (dungeonNum == 3) {
				System.out.println("----- ㅇㅇㅇㅇ(보스) 파괴의 사원 -----.");
				isItBossDungeon = true;
				Fight.selectAttack();
			}
		}	
	}

}
