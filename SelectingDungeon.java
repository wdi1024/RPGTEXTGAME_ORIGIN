import java.util.Random;
import java.util.Scanner;

public class SelectingDungeon {

	static int dungeonNum;
	static boolean isItBossDungeon;

	static void StartDungeon() {
		Scanner in = new Scanner(System.in);
		Random random = new Random();

		while (true) {
			System.out.println("0. 돌아가기\n1. 신비의 숲\n2. 빛 바랜 성\n3. (보스) 파괴의 사원");
			System.out.print("던전 번호를 선택하세요 (0 선택 시 복귀) : ");
			dungeonNum = in.nextInt();
			System.out.println("====================================");

			if (dungeonNum == 0) {
				System.out.println("왔던 곳으로 돌아갑니다.");
				System.out.println("====================================");
				break;
			}
			if (dungeonNum == 1) {
				System.out.println("----- 신비의 숲 -----");
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
				System.out.println("던전에 입장했습니다. ");
				// 전투 시작
				Fight.selectAttack();

				if (Monster.monsHp > 0)
					continue;

				randomValue = random.nextDouble();
				if (randomValue < catProbability) {
					monster = new Cat();
				} else {
					monster = new Goblin();
				}
				// 전투 시작
				Fight.selectAttack();

				if (Monster.monsHp > 0)
					continue;

				randomValue = random.nextDouble();
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
				Monster monster;

				double catProbability = 0.8; // 고양이 등장 확률 (80%)
				double goblinProbability = 0.2; // 살쾡이 등장 확률 (20%)
				// 몬스터 등장 확률에 따라 몬스터 생성
				double randomValue = random.nextDouble();
				if (randomValue < catProbability) {
					monster = new Goblin();
				} else {
					monster = new Dragon();
				}
				System.out.println("던전에 입장했습니다. ");
				// 전투 시작
				Fight.selectAttack();

				if (Monster.monsHp > 0)
					continue;

				randomValue = random.nextDouble();
				if (randomValue < catProbability) {
					monster = new Goblin();
				} else {
					monster = new Dragon();
				}
				// 전투 시작
				Fight.selectAttack();

				if (Monster.monsHp > 0)
					continue;

				randomValue = random.nextDouble();
				if (randomValue < catProbability) {
					monster = new Goblin();
				} else {
					monster = new Dragon();
				}
				// 전투 시작
				Fight.selectAttack();

				if (Monster.monsHp > 0)
					continue;
			}
			if (dungeonNum == 3) {
				System.out.println("----- (보스) 파괴의 사원 -----.");
				isItBossDungeon = true;
				Monster monster;

				double catProbability = 0.8; // 고양이 등장 확률 (80%)
				double goblinProbability = 0.2; // 살쾡이 등장 확률 (20%)

				monster = new Dragon();

				System.out.println("보스 던전에 입장했습니다. ");
				// 전투 시작
				Fight.selectAttack();
				if (Monster.monsHp > 0)
					continue;

				monster = new Dragon();
				Fight.selectAttack();
				if (Monster.monsHp > 0)
					continue;
				monster = new Dragon();

				Fight.selectAttack();
				if (Monster.monsHp == 0) {
					Home.boss_clear = 1;
					break;
				}
			}
		}
	}

}
