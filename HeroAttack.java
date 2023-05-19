import java.util.Scanner;//selectingDungeon의 monsterStatus와 연계필요

public class HeroAttack {
	static int selectMove;

	static void StartHeroAttack() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("0.돌아가기");
			System.out.println("1.공격");
			System.out.println("공격하시겠습니까? :");
			selectMove = in.nextInt();
			if (selectMove == 0) {
				break;
			} else {
				System.out.println(heroStatus.name + "의 공격입니다");
				monsterAttacked(heroAttack(heroStatus.level, heroStatus.power));
				System.out.println(//monsterName + "의 공격입니다");
				heroAttacked(monsterAttack(//monsterPower));
				break;
			}

		}
	}

	// 히어로 공격에서 solskill, heroskill 과 연계 필요
	static int heroAttack(int hero_level, int hero_power) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		while (true) {
			if (heroStatus.selection == 1) {// 직업이 전사일 경우
				System.out.println("1.쓰러스트");
				if (HeroSkill.Skill2 == true) {// 히어로 스킬에서 스킬북으로 스킬 배웠는지 true false로 구분
					System.out.println("2.전사 2 스킬");
				}
				if (HeroSkill.Skill3 == true) {
					System.out.println("3.전사 3 스킬");
				}
				if (HeroSkill.Skill4 == true) {
					System.out.println("4.전사 4 스킬");
				}
				System.out.println("사용할 스킬을 선택해주세요 :");
				int attackSelet = in.nextInt();
				if (attackSelet == 1) {
					System.out.println("쓰러스트 공격!");
					sum = heroStatus.power * 20 + heroStatus.level * 10;
					break;
				} else if (attackSelet == 2) {
					if (HeroSkill.Skill2 == true) {
						if (heroStatus.mp >= 2) {
							System.out.println("전사 스킬 2 공격!");
							sum = heroStatus.power * 30 + heroStatus.level * 15;
							heroStatus.mp -= 2;
							break;
						} else {
							System.out.println("마나가 부족해 공격에 실패했습니다!");
						}
					} else {
						System.out.println("그 스킬은 배우지 않았습니다");
					}

				} else if (attackSelet == 3) {
					if (HeroSkill.Skill3 == true) {
						if (heroStatus.mp >= 4) {
							System.out.println("전사 스킬 3 공격!");
							sum = heroStatus.power * 40 + heroStatus.level * 20;
							heroStatus.mp -= 4;
							break;
						} else {
							System.out.println("마나가 부족해 공격에 실패했습니다!");
						}
					} else {
						System.out.println("그 스킬은 배우지 않았습니다");
					}

				} else if (attackSelet == 4) {
					if (HeroSkill.Skill4 == true) {
						if (heroStatus.mp >= 10) {
							System.out.println("전사 스킬 4 공격!");
							sum = heroStatus.power * 60 + heroStatus.level * 30;
							heroStatus.mp -= 10;
							break;
						} else {
							System.out.println("마나가 부족해 공격에 실패했습니다!");
						}
					} else {
						System.out.println("그 스킬은 배우지 않았습니다");
					}

				} else {
					System.out.println("알맞은 번호를 입력해주세요");
				}
			}
		}

		return sum;
	}

	static int monsterAttack(int monster_power) {
		int sum = 0;
		if (monster_power<0) {
			monster_power=0;
		}
		sum = monster_power;
		return sum;
	}

	// 히어로 어택드에서 solclass와 연계필요
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
