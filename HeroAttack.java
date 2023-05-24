import java.util.Random;
import java.util.Scanner;//selectingDungeon의 monsterStatus와 연계필요

public class HeroAttack {
	static int selectMove, attackSelect;

	static void StartHeroAttack() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("0.돌아가기");
			System.out.println("1.공격");
			System.out.printf("공격하시겠습니까? :");
			selectMove = in.nextInt();
			System.out.println("=====================================");
			if (selectMove == 0) {
				break;
			} else {
				System.out.println(heroStatus.name + "의 공격입니다");
				// 히어로 공격
				Monster.monsterAttacked(heroAttack(heroStatus.level, heroStatus.power));
				// monster 공격
				heroAttacked(Monster.monsterAttack(Monster.monsPower));
				System.out.println("=====================================");
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
				attackSelect = in.nextInt();
				System.out.println("=====================================");
				if (attackSelect == 1) {
					System.out.println("쓰러스트 공격!");
					sum = heroStatus.power * 20 + heroStatus.level * 10;
					break;
				} else if (attackSelect == 2) {
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

				} else if (attackSelect == 3) {
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

				} else if (attackSelect == 4) {
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

	// 히어로 어택드에서 solclass와 연계필요
	static void heroAttacked(int sum) {
		Random r = new Random();
		if (sum < 0) {
			sum = 0;
		}
		while (true) {// 적이 난수에 따라 용병이나 플레이어 공격하도록 변경, 플레이어 공격시 hp 떨어진 용병 공격 못하게 할 필요있음
			int target = r.nextInt(heroStatus.solNum.size());
			if (target == heroStatus.solNum.size()) {
				System.out.println(Monster.monsName + "이 " + heroStatus.name + "를 공격!");
				heroStatus.hp = heroStatus.hp - sum;
				System.out.println(heroStatus.name + "의 데미지는 " + sum + "입니다");
			} else if (heroStatus.solNum.get(target).solHp > 0) {
				System.out.println(Monster.monsName + "이 " + heroStatus.solNum.get(target).solName + "를 공격!");
				heroStatus.solNum.get(target).solHp -= sum;
				System.out.println(heroStatus.solNum.get(target).solName + "의 데미지는 " + sum + "입니다");
				if (heroStatus.solNum.get(target).solHp <= 0) {
					System.out.println(heroStatus.solNum.get(target).solName + "이 쓰러졌습니다!");
				}
			} else {
				continue;
			}
		}

	}
}
