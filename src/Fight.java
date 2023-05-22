import java.util.Scanner;

public class Fight {
	
	static void selectAttack() {
		Scanner in = new Scanner(System.in);
		heroStatus.printStatus();
		System.out.println("던전에 입장했습니다. ");
		
		System.out.println("몬스터와 조우했습니다.");
		while (true) {
			// 행동 선택;
			int selection = in.nextInt();
			System.out.println("1. 전투 개시");
			System.out.println("2. 아이템 사용");
			System.out.println("3. 방어");
			System.out.println("4. 후퇴");
			System.out.println("어떻게 하시겠습니까?");
			if (selection == 1) {
				HeroAttack.StartHeroAttack();
			}
			else if (selection == 2) {
				ItemAtFight.StartItemAtFight();
			}
			else if (selection == 3) {
				Defense.StartDefense();
			}
			else if (selection == 4) {
				if (Run.checkRun()) {
					break;
				}	
			}
			else {
				System.out.println("리스트에서 선택해주세요.");
			}
			if (monster_hp <= 0) {
				Thread.sleep(1500);
				System.out.println("\n" + monster_name + "(이)가 죽었습니다. 사냥터에서 나갑니다.");
				hero_experience += monster_experience;
				hero_money += monster_money;
				break;
			
			if (hero_hp <= 0) {
				Thread.sleep(1500);
				System.out.println("\n" + hero_name + "(이)가 죽었습니다. 사냥터에서 나갑니다.");
				hero_hp = 1;
				Thread.sleep(1000);
				System.out.println(".");
				Thread.sleep(1000);
				System.out.println(".");
				Thread.sleep(1000);
				System.out.println(".");
				Thread.sleep(1000);
				System.out.println("!!! 신의 은총을 받아 " + hero_name + "이(가) 부활했습니다. !!!");
				break;
			
			
		}
	}
}

// 전투시 선택지 부여
// run 선택시에 while문 빠져나갈 수 있도록

