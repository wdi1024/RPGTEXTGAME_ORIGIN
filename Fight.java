import java.util.Scanner;

public class Fight {

	static void selectAttack() {
		Scanner in = new Scanner(System.in);
		heroStatus.printStatus();

		System.out.println("몬스터와 조우했습니다.");
		while (true) {
			// 행동 선택;
			System.out.println("1. 전투 개시");
			System.out.println("2. 아이템 사용");
			System.out.println("3. 방어");
			System.out.println("4. 후퇴");
			System.out.printf("어떻게 하시겠습니까?");
			int selection = in.nextInt();
			System.out.println("====================================");
			if (selection == 1) {
				HeroAttack.StartHeroAttack();
				heroStatus.printStatus();
			} else if (selection == 2) {
				ItemAtFight.StartItemAtFight();
				heroStatus.printStatus();
			} else if (selection == 3) {
				Defense.StartDefense();
				heroStatus.printStatus();
			} else if (selection == 4) {
				if (Run.checkRun() == true) {
					break;
				}
			} else {
				System.out.println("리스트에서 선택해주세요.");
				System.out.println("=====================================");
			}
			if (Monster.monsHp <= 0) {
				System.out.println("\n" + Monster.monsName + "(이)가 죽었습니다. 사냥터에서 나갑니다.");
				heroStatus.exp += Monster.monsExp;
				heroStatus.money += Monster.monsMoney;
				break;
			}
			if (heroStatus.hp <= 0) {
				System.out.println("\n" + heroStatus.name + "(이)가 죽었습니다. 사냥터에서 나갑니다.");
				heroStatus.hp = 1;
				heroStatus.money *= heroStatus.money * 1 / 2;
				System.out.println("!!! 신의 은총을 받아 " + heroStatus.name + "이(가) 부활했습니다. !!!");
				System.out.println("돈의 50%가 삭감됐습니다.");
				System.out.println("Home으로 되돌아왔습니다.");
				break;
			}
		}
	}
}

// 전투시 선택지 부여
// run 선택시에 while문 빠져나갈 수 있도록
