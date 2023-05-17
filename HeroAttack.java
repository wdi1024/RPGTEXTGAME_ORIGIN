import java.util.Scanner;//selectingDungeon의 monsterStatus와 연계필요

public class HeroAttack {
	static int selectMove;
	
	static void StartHeroAttack() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("0.돌아가기");
			System.out.println("1.공격");
			System.out.println("공격하시겠습니까? :");
			selectMove=in.nextInt();
			if (selectMove==0) {
				break;
			}else {
				System.out.println(heroStatus.name + "의 공격입니다");
				monsterAttacked(heroAttack(heroStatus.level, heroStatus.power));
				System.out.println(monsterName + "의 공격입니다");
				heroAttacked(monsterAttack(monsterPower));
				break;
			}
					
			
			
			}
	}
	

	//히어로 공격에서 solskill, heroskill 과 연계 필요
	static int heroAttack(int hero_level, int hero_power) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 쓰러스트");
		System.out.printf("공격 번호를 입력하세요 : ");
		int sum = 0;
		int attack_type = sc.nextInt();
		
		if (attack_type == 1) {
			if (job_num == 1) {
				sum += hero_level * 10;
				sum += hero_power * 30;
			} else {
				sum += hero_level * 15;
				sum += hero_power * 25;
			}
		}
		return sum;
	}

	static int monsterAttack(int monster_power) {
		int sum = 0;
		sum = monster_power;
		return sum;
	}
	//히어로 어택드에서 solclass와 연계필요
	static void heroAttacked(int sum) {
		heroStatus.hp = heroStatus.hp - sum;
		System.out.println(heroStatus.name + "의 데미지는 " + sum + "입니다");
		
	}

	static void monsterAttacked(int sum) {

		if (monsterDefense >= sum) {
			System.out.println(monsterName + "의 데미지는 0입니다");
			monsterHp = monsterHp - 0;
		} else {
			monsterHp = monsterHp + monsterDefense - sum;
			System.out.println(monsterName + "의 데미지는 " + sum + "입니다");
		}
	}

}
