import java.util.Scanner;

public class Fight {

	static void selectAttack() {
		Scanner in = new Scanner(System.in);
		if (SelectingDungeon.isItBossDungeon == false) {
			System.out.println("몬스터 " + Monster.monsName + "과(와) 조우했습니다.");
			while (true) {
				// 행동 선택;
				System.out.println("0. 전투상황");
				System.out.println("1. 전투 개시");
				System.out.println("2. 아이템 사용");
				System.out.println("3. 방어");
				System.out.println("4. 후퇴");
				System.out.printf("어떻게 하시겠습니까?");
				int selection = in.nextInt();
				System.out.println("====================================");
				if (selection == 0) {
					heroStatus.printStatus();
					System.out.println(Monster.monsName);
					System.out.println("HP = " + Monster.monsHp);
					System.out.println("Power = " + Monster.monsPower);
					System.out.println("Defense = " + Monster.monsDefense);
					System.out.println("====================================");
				} else if (selection == 1) {
					HeroAttack.StartHeroAttack();
				} else if (selection == 2) {
					ItemAtFight.StartItemAtFight();
				} else if (selection == 3) {
					Defense.StartDefense();
				} else if (selection == 4) {
					if (Run.checkRun() == true) {
						break;
					}
				} else {
					System.out.println("리스트에서 선택해주세요.");
					System.out.println("=====================================");
				}
				if (Monster.monsHp <= 0) {
					System.out.println(Monster.monsName + "(이)가 죽었습니다. 사냥터에서 나갑니다.");
					heroStatus.exp += Monster.monsExp;
					heroStatus.money += Monster.monsMoney;
					AfterFight.Drop();
					break;
				}
				if (heroStatus.hp <= 0) {
					System.out.println(heroStatus.name + "(이)가 죽었습니다. 사냥터에서 나갑니다.");
					heroStatus.hp = 1;
					heroStatus.money *= heroStatus.money * 1 / 2;
					System.out.println("!!! 신의 은총을 받아 " + heroStatus.name + "이(가) 부활했습니다. !!!");
					System.out.println("돈의 50%가 삭감됐습니다.");
					System.out.println("던전 선택화면으로 되돌아왔습니다.");
					System.out.println("=====================================");
					break;
				}
			}
		}

		else if (SelectingDungeon.isItBossDungeon == true) {
			int cnt = 0;
			System.out.println("보스 몬스터 " + Monster.monsName + "과(와) 조우했습니다.");
			while (true) {
				if (cnt == 20) {
					System.out.println("HP = " + Monster.monsHp);
					System.out.println("Power = " + Monster.monsPower);
					System.out.println("HP = " + Monster.monsDefense);
					Monster.monsHp *= 2;
					Monster.monsPower *= 2;
					Monster.monsDefense *= 2;
					System.out.println("20턴이 지나 보스의 인내심이 한계에 달해 광폭화됩니다. (모든 스탯 2배)");
					System.out.println("HP = " + Monster.monsHp);
					System.out.println("Power = " + Monster.monsPower);
					System.out.println("HP = " + Monster.monsDefense);
				}
				// 행동 선택;
				System.out.println("0. 전투상황");
				System.out.println("1. 전투 개시");
				System.out.println("2. 아이템 사용");
				System.out.println("3. 방어");
				System.out.println("4. 후퇴");
				System.out.printf("어떻게 하시겠습니까?");
				int selection = in.nextInt();
				System.out.println("====================================");
				if (selection == 0) {
					heroStatus.printStatus();
				} else if (selection == 1) {
					++cnt;
					HeroAttack.StartHeroAttack();
				} else if (selection == 2) {
					++cnt;
					ItemAtFight.StartItemAtFight();
				} else if (selection == 3) {
					++cnt;
					Defense.StartDefense();
				} else if (selection == 4) {
					if (Run.checkRun() == true) {
						break;
					}
				} else {
					System.out.println("리스트에서 선택해주세요.");
					System.out.println("=====================================");
				}
				if (Monster.monsHp <= 0) {
					System.out.println(Monster.monsName + "(이)가 죽었습니다. 사냥터에서 나갑니다.");
					System.out.println("=====================================");
					heroStatus.exp += Monster.monsExp;
					heroStatus.money += Monster.monsMoney;
					AfterFight.Drop();
				}
				if (heroStatus.hp <= 0) {
					System.out.println(heroStatus.name + "(이)가 죽었습니다. 사냥터에서 나갑니다.");
					heroStatus.hp = 1;
					heroStatus.money *= heroStatus.money * 1 / 2;
					System.out.println("!!! 신의 은총을 받아 " + heroStatus.name + "이(가) 부활했습니다. !!!");
					System.out.println("돈의 50%가 삭감됐습니다.");
					System.out.println("던전 선택화면으로 되돌아왔습니다.");
					System.out.println("=====================================");
					break;
				}
			}
		}
	}
}
