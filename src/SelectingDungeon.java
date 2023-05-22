import java.util.Scanner;
import java.util.Random;


public class SelectingDungeon {

	static int dungeonNum;
	static boolean isItBossDungeon;
	
	static void StartDungeon() {
		Scanner in = new Scanner(System.in);
        Random random = new Random();

		while (true) {
			System.out.print("던전 번호를 선택하세요 (0 선택 시 복귀) : ");
			dungeonNum = in.nextInt();
			
			if (dungeonNum == 0) {
				System.out.println("돌아갑니다.");
				break;
			}
			if (dungeonNum == 1) {
	            System.out.println("----- 신비한 숲 -----");
	            Monster monster;

	            double catProbability = 0.8; // 고양이 등장 확률 (80%)
	            double goblinProbability = 0.2; // 살쾡이 등장 확률 (20%)

	            // 몬스터 등장 확률에 따라 몬스터 생성
	            double randomValue = random.nextDouble();
	            if (randomValue < catProbability) {
	            	monster = new Cat();
	            } else {
	            	monster = new Goblin();
	            }

	            // 전투 시작
	            Fight.selectAttack();
			}
			if (dungeonNum == 2) {
				System.out.println("----- 빛 바랜 성 -----.");
				Fight.selectAttack();
			}
			if (dungeonNum == 3) {
				System.out.println("----- (보스) 파괴의 사원 -----.");
				isItBossDungeon = true;
				Fight.selectAttack();
			}
		}	
	}

}
