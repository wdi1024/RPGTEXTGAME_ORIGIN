import java.util.Random;
import java.util.Scanner;

public class SelectingDungeon {

	static int dungeonNum;
	static boolean isItBossDungeon;

	static void StartDungeon() throws InterruptedException {
		Scanner in = new Scanner(System.in);
		Random random = new Random();

		while (true) {
			System.out.println("0. 돌아가기\n1. 신비의 숲\n2. 빛 바랜 성\n3. 화염의 강\n4. 세계의 끝\n5. (보스) 파괴의 사원");
			System.out.print("\n던전 번호를 선택하세요 (0 선택 시 복귀) : ");
			dungeonNum = in.nextInt();
			System.out.println("====================================");

			if (dungeonNum == 0) {
				System.out.println("왔던 곳으로 돌아갑니다.");
				System.out.println("=====================================");
				for (int i = 0; i < 3; i++) {
					Thread.sleep(500);
					System.out.print(".");
				}
				System.out.println("마을에 도착했습니다.");
				System.out.println("=====================================");
				break;
			}
			// 던전 1
			if (dungeonNum == 1) {
				if (heroStatus.solNum.size() >= 4) {
					System.out.println("일반 던전은 동료를 3명까지만 데리고 올 수 있습니다.");
					System.out.println("=====================================");
				} else {
					System.out.println("----- 신비의 숲 -----");
					Monster monster;
//					int cat = 60; 				
//					int goblin = 40; 			

					int randomValue = random.nextInt(100);
					if (randomValue < 60) {
						monster = new Cat();
					} else {
						monster = new Goblin();
					}
					System.out.println("=====================================");
					for (int i = 0; i < 3; i++) {
						Thread.sleep(500);
						System.out.print(".");
					}
					System.out.println("! ");
					System.out.println("신비의 숲에 입장했습니다. ");
					Fight.selectAttack();
					heroStatus.checkLevelup();

					if (Monster.monsHp > 0)
						continue;

					randomValue = random.nextInt(100);
					if (randomValue < 60) {
						monster = new Cat();
					} else {
						monster = new Goblin();
					}

					System.out.println("=====================================");
					for (int i = 0; i < 3; i++) {
						Thread.sleep(500);
						System.out.print(".");
					}
					System.out.print("! ");
					Fight.selectAttack();
					heroStatus.checkLevelup();

					if (Monster.monsHp > 0)
						continue;

					randomValue = random.nextInt(100);
					if (randomValue < 60) {
						monster = new Cat();
					} else {
						monster = new Goblin();
					}
					System.out.println("=====================================");
					for (int i = 0; i < 3; i++) {
						Thread.sleep(500);
						System.out.print(".");
					}
					System.out.print("! ");
					Fight.selectAttack();
					heroStatus.checkLevelup();
					System.out.println("=====================================");
					for (int i = 0; i < 3; i++) {
						Thread.sleep(500);
						System.out.print(".");
					}
					System.out.println("!\n던전 공략을 완료하여 던전 입구로 돌아갑니다.");
					System.out.println("=====================================");
				}
			}
			// 던전 2
			if (dungeonNum == 2) {
				if (heroStatus.solNum.size() >= 4) {
					System.out.println("일반 던전은 동료를 3명까지만 데리고 올 수 있습니다.");
					System.out.println("=====================================");
				} else {
					System.out.println("----- 빛 바랜 성 -----.");
					Monster monster;
//					int cat = 40; 				
//					int goblin = 30; 			
//					int golem = 20;
//					int spider = 10;

					int randomValue = random.nextInt(100);
					if (randomValue < 40) {
						monster = new Cat();
					} else if (randomValue >= 40 && randomValue < 70) {
						monster = new Goblin();
					} else if (randomValue >= 70 && randomValue < 90) {
						monster = new Golem();
					} else {
						monster = new Spider();
					}
					System.out.println("=====================================");
					for (int i = 0; i < 3; i++) {
						Thread.sleep(500);
						System.out.print(".");
					}
					System.out.println("! ");
					System.out.println("빛 바랜 성에 입장했습니다. ");
					Fight.selectAttack();
					heroStatus.checkLevelup();

					if (Monster.monsHp > 0)
						continue;

					randomValue = random.nextInt(100);
					if (randomValue < 40) {
						monster = new Cat();
					} else if (randomValue >= 40 && randomValue < 70) {
						monster = new Goblin();
					} else if (randomValue >= 70 && randomValue < 90) {
						monster = new Golem();
					} else {
						monster = new Spider();
					}
					System.out.println("=====================================");
					for (int i = 0; i < 3; i++) {
						Thread.sleep(500);
						System.out.print(".");
					}
					System.out.print("! ");
					Fight.selectAttack();
					heroStatus.checkLevelup();

					if (Monster.monsHp > 0)
						continue;

					randomValue = random.nextInt(100);
					if (randomValue < 40) {
						monster = new Cat();
					} else if (randomValue >= 40 && randomValue < 70) {
						monster = new Goblin();
					} else if (randomValue >= 70 && randomValue < 90) {
						monster = new Golem();
					} else {
						monster = new Spider();
					}
					System.out.println("=====================================");
					for (int i = 0; i < 3; i++) {
						Thread.sleep(500);
						System.out.print(".");
					}
					System.out.print("! ");
					Fight.selectAttack();
					heroStatus.checkLevelup();
					System.out.println("=====================================");
					for (int i = 0; i < 3; i++) {
						Thread.sleep(500);
						System.out.print(".");
					}
					System.out.println("!\n던전 공략을 완료하여 던전 입구로 돌아갑니다.");
					System.out.println("=====================================");
				}
			}
			// 던전 3
			if (dungeonNum == 3) {
				if (heroStatus.solNum.size() >= 4) {
					System.out.println("일반 던전은 동료를 3명까지만 데리고 올 수 있습니다.");
					System.out.println("=====================================");
				} else {
					System.out.println("----- 화염의 강 -----");
					Monster monster;
//					int golem = 30; 				
//					int spider = 20; 			
//					int centaurus = 20;
//					int ghoul = 20;
//					int necrosyl = 10;

					int randomValue = random.nextInt(100);
					if (randomValue < 30) {
						monster = new Golem();
					} else if (randomValue >= 30 && randomValue < 50) {
						monster = new Spider();
					} else if (randomValue >= 50 && randomValue < 70) {
						monster = new Centaurus();
					} else if (randomValue >= 70 && randomValue < 90) {
						monster = new Ghoul();
					} else {
						monster = new Necrosyl();
					}
					System.out.println("=====================================");
					for (int i = 0; i < 3; i++) {
						Thread.sleep(500);
						System.out.print(".");
					}
					System.out.println("! ");
					System.out.println("화염의 강에 입장했습니다. ");
					Fight.selectAttack();
					heroStatus.checkLevelup();

					if (Monster.monsHp > 0)
						continue;

					randomValue = random.nextInt(100);
					if (randomValue < 30) {
						monster = new Golem();
					} else if (randomValue >= 30 && randomValue < 50) {
						monster = new Spider();
					} else if (randomValue >= 50 && randomValue < 70) {
						monster = new Centaurus();
					} else if (randomValue >= 70 && randomValue < 90) {
						monster = new Ghoul();
					} else {
						monster = new Necrosyl();
					}
					System.out.println("=====================================");
					for (int i = 0; i < 3; i++) {
						Thread.sleep(500);
						System.out.print(".");
					}
					System.out.print("! ");
					Fight.selectAttack();
					heroStatus.checkLevelup();

					if (Monster.monsHp > 0)
						continue;

					randomValue = random.nextInt(100);
					if (randomValue < 30) {
						monster = new Golem();
					} else if (randomValue >= 30 && randomValue < 50) {
						monster = new Spider();
					} else if (randomValue >= 50 && randomValue < 70) {
						monster = new Centaurus();
					} else if (randomValue >= 70 && randomValue < 90) {
						monster = new Ghoul();
					} else {
						monster = new Necrosyl();
					}
					System.out.println("=====================================");
					for (int i = 0; i < 3; i++) {
						Thread.sleep(500);
						System.out.print(".");
					}
					System.out.print("! ");
					Fight.selectAttack();
					heroStatus.checkLevelup();
					System.out.println("=====================================");
					for (int i = 0; i < 3; i++) {
						Thread.sleep(500);
						System.out.print(".");
					}
					System.out.println("!\n던전 공략을 완료하여 던전 입구로 돌아갑니다.");
					System.out.println("=====================================");
				}

			}
			// 던전 4
			if (dungeonNum == 4) {
				if (heroStatus.solNum.size() >= 4) {
					System.out.println("일반 던전은 동료를 3명까지만 데리고 올 수 있습니다.");
					System.out.println("=====================================");
				} else {
					System.out.println("----- 세계의 끝 -----.");
					Monster monster;
//					int ghoul = 20;
//					int necrosyl = 20;
//					int abyssmaster = 20; 				
//					int bloodraven = 20;
//					int darkcyclone = 20; 

					int randomValue = random.nextInt(100);
					if (randomValue < 20) {
						monster = new Ghoul();
					} else if (randomValue >= 20 && randomValue < 40) {
						monster = new Necrosyl();
					} else if (randomValue >= 40 && randomValue < 60) {
						monster = new Abyssmaster();
					} else if (randomValue >= 60 && randomValue < 80) {
						monster = new Bloodraven();
					} else {
						monster = new Darkcyclone();
					}
					System.out.println("=====================================");
					for (int i = 0; i < 3; i++) {
						Thread.sleep(500);
						System.out.print(".");
					}
					System.out.println("! ");
					System.out.println("세계의 끝에 입장했습니다. ");
					Fight.selectAttack();
					heroStatus.checkLevelup();

					if (Monster.monsHp > 0)
						continue;

					randomValue = random.nextInt(100);
					if (randomValue < 20) {
						monster = new Ghoul();
					} else if (randomValue >= 20 && randomValue < 40) {
						monster = new Necrosyl();
					} else if (randomValue >= 40 && randomValue < 60) {
						monster = new Abyssmaster();
					} else if (randomValue >= 60 && randomValue < 80) {
						monster = new Bloodraven();
					} else {
						monster = new Darkcyclone();
					}
					System.out.println("=====================================");
					for (int i = 0; i < 3; i++) {
						Thread.sleep(500);
						System.out.print(".");
					}
					System.out.print("! ");
					Fight.selectAttack();
					heroStatus.checkLevelup();

					if (Monster.monsHp > 0)
						continue;

					randomValue = random.nextInt(100);
					if (randomValue < 20) {
						monster = new Ghoul();
					} else if (randomValue >= 20 && randomValue < 40) {
						monster = new Necrosyl();
					} else if (randomValue >= 40 && randomValue < 60) {
						monster = new Abyssmaster();
					} else if (randomValue >= 60 && randomValue < 80) {
						monster = new Bloodraven();
					} else {
						monster = new Darkcyclone();
					}
					System.out.println("=====================================");
					for (int i = 0; i < 3; i++) {
						Thread.sleep(500);
						System.out.print(".");
					}
					System.out.print("! ");
					Fight.selectAttack();
					heroStatus.checkLevelup();
					System.out.println("=====================================");
					for (int i = 0; i < 3; i++) {
						Thread.sleep(500);
						System.out.print(".");
					}
					System.out.println("!\n던전 공략을 완료하여 던전 입구로 돌아갑니다.");
					System.out.println("=====================================");
				}

			}
			// 보스던전
			if (dungeonNum == 5) {
				System.out.println("----- (보스) 파괴의 사원 -----.");
				isItBossDungeon = true;

				Monster monster = new Dragon();
				System.out.println("=====================================");
				for (int i = 0; i < 3; i++) {
					Thread.sleep(500);
					System.out.print(".");
				}
				System.out.println("! ");
				System.out.println("보스 던전에 입장했습니다. ");
				Fight.selectAttack();
				heroStatus.checkLevelup();
				if (Monster.monsHp > 0)
					continue;

				monster = new Dragon();
				System.out.println("=====================================");
				for (int i = 0; i < 3; i++) {
					Thread.sleep(500);
					System.out.print(".");
				}
				System.out.print("! ");
				Fight.selectAttack();
				heroStatus.checkLevelup();
				if (Monster.monsHp > 0)
					continue;
				monster = new Dragon();
				System.out.println("=====================================");
				for (int i = 0; i < 3; i++) {
					Thread.sleep(500);
					System.out.print(".");
				}
				System.out.print("! ");
				Fight.selectAttack();
				heroStatus.checkLevelup();
				if (Monster.monsHp <= 0) {
					Home.boss_clear = 1;
					break;
				}
			}
		}
	}

}
