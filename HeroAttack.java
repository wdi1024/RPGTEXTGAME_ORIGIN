import java.util.Random;
import java.util.Scanner;//selectingDungeon의 monsterStatus와 연계필요

public class HeroAttack {
	static int selectMove, attackSelect;

	static void StartHeroAttack() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("0. 돌아가기");
			System.out.println("1. 공격");
			System.out.printf("공격하시겠습니까? : ");
			selectMove = in.nextInt();
			System.out.println("=====================================");
			if (selectMove == 0) {
				break;
			} else {
				System.out.println(heroStatus.name + "의 공격입니다.");
				// 히어로 공격
				Monster.monsterAttacked(heroAttack());
				if (Monster.monsHp <= 0)
					break;
				for (int i = 0; i < heroStatus.solNum.size(); i++) {
					if (heroStatus.solNum.get(i).solHp > 0) {
						System.out.println(heroStatus.solNum.get(i).solName + "의 공격입니다.");
						Monster.monsterAttacked(SolSkill.solskill(i));
						if (Monster.monsHp <= 0)
							break;
					} else {
						continue;
					}

				}
				if (Monster.monsHp <= 0)
					break;
				// monster 공격
				heroAttacked(Monster.monsterAttack(Monster.monsPower));
				break;
			}

		}
	}

	// 히어로 공격에서 solskill, heroskill 과 연계 필요
	static int heroAttack() {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		while (true) {
			if (heroStatus.selection == 1) {// 직업이 전사일 경우
				System.out.println("1. 쓰러스트");
				if (HeroSkill.hasjeonsa2Skillbook(MyInventory.skillbook) == true) { // 히어로 스킬에서 스킬북으로 스킬 배웠는지 true
																					// false로 구분
					System.out.println("2. 파워 슬래시");
				}
				if (HeroSkill.hasjeonsa3Skillbook(MyInventory.skillbook) == true) {
					System.out.println("3. 사자의 노래");
				}
				if (HeroSkill.hasjeonsa4Skillbook()) {
					System.out.println("4. 신검합일");
				}
				System.out.printf("사용할 스킬을 선택해주세요 : ");
				attackSelect = in.nextInt();
				System.out.println("=====================================");
				if (attackSelect == 1) {
					System.out.println("쓰러스트 공격!");
					sum = heroStatus.power * 20 + heroStatus.level * 10 + heroStatus.magic * 5;
					break;
				} else if (attackSelect == 2) {
					if (HeroSkill.hasjeonsa2Skillbook(MyInventory.skillbook) == true) {
						if (heroStatus.mp >= 2) {
							System.out.println("파워 슬래시 공격!");
							sum = heroStatus.power * 30 + heroStatus.level * 15 + heroStatus.magic * 10;
							heroStatus.mp -= 2;
							break;
						} else {
							System.out.println("마나가 부족해 공격에 실패했습니다!");
						}
					} else {
						System.out.println("그 스킬은 배우지 않았습니다.");
					}

				} else if (attackSelect == 3) {
					if (HeroSkill.hasjeonsa3Skillbook(MyInventory.skillbook) == true) {
						if (heroStatus.mp >= 4) {
							System.out.println("사자의 노래 공격!");
							sum = heroStatus.power * 40 + heroStatus.level * 20 + heroStatus.magic * 15;
							heroStatus.mp -= 4;
							break;
						} else {
							System.out.println("마나가 부족해 공격에 실패했습니다!");
						}
					} else {
						System.out.println("그 스킬은 배우지 않았습니다.");
					}

				} else if (attackSelect == 4) {
					if (HeroSkill.hasjeonsa4Skillbook()) {
						if (heroStatus.mp >= 10) {
							System.out.println("신검합일 공격!");
							sum = heroStatus.power * 60 + heroStatus.level * 30 + heroStatus.magic * 25;
							heroStatus.mp -= 10;
							break;
						} else {
							System.out.println("마나가 부족해 공격에 실패했습니다!");
						}
					} else {
						System.out.println("그 스킬은 배우지 않았습니다.");
					}

				} else {
					System.out.println("알맞은 번호를 입력해주세요.");
				}
			} else if (heroStatus.selection == 2) {// 직업이 궁수일 경우
				System.out.println("1. 과녁맞히기");
				if (HeroSkill.hasgungsu2Skillbook(MyInventory.skillbook) == true) {// 히어로 스킬에서 스킬북으로 스킬 배웠는지 true false로
																					// 구분
					System.out.println("2. 더블 샷");
				}
				if (HeroSkill.hasgungsu3Skillbook(MyInventory.skillbook) == true) {
					System.out.println("3. 화살비");
				}
				if (HeroSkill.hasgungsu4Skillbook()) {
					System.out.println("4. 폭풍의 시");
				}
				System.out.printf("사용할 스킬을 선택해주세요 : ");
				attackSelect = in.nextInt();
				System.out.println("=====================================");
				if (attackSelect == 1) {
					System.out.println("과녁맞히기 공격!");
					sum = heroStatus.power * 15 + heroStatus.level * 10 + heroStatus.magic * 10;
					break;
				} else if (attackSelect == 2) {
					if (HeroSkill.hasgungsu2Skillbook(MyInventory.skillbook) == true) {
						if (heroStatus.mp >= 2) {
							System.out.println("더블 샷 공격!");
							sum = heroStatus.power * 20 + heroStatus.level * 15 + heroStatus.magic * 20;
							heroStatus.mp -= 2;
							break;
						} else {
							System.out.println("마나가 부족해 공격에 실패했습니다!");
						}
					} else {
						System.out.println("그 스킬은 배우지 않았습니다.");
					}

				} else if (attackSelect == 3) {
					if (HeroSkill.hasgungsu3Skillbook(MyInventory.skillbook) == true) {
						if (heroStatus.mp >= 4) {
							System.out.println("화살비 공격!");
							sum = heroStatus.power * 30 + heroStatus.level * 20 + heroStatus.magic * 25;
							heroStatus.mp -= 4;
							break;
						} else {
							System.out.println("마나가 부족해 공격에 실패했습니다!");
						}
					} else {
						System.out.println("그 스킬은 배우지 않았습니다.");
					}

				} else if (attackSelect == 4) {
					if (HeroSkill.hasgungsu4Skillbook()) {
						if (heroStatus.mp >= 10) {
							System.out.println("폭풍의 시 공격!");
							sum = heroStatus.power * 45 + heroStatus.level * 30 + heroStatus.magic * 40;
							heroStatus.mp -= 10;
							break;
						} else {
							System.out.println("마나가 부족해 공격에 실패했습니다!");
						}
					} else {
						System.out.println("그 스킬은 배우지 않았습니다.");
					}

				} else {
					System.out.println("알맞은 번호를 입력해주세요.");
				}
			} else if (heroStatus.selection == 3) {// 직업이 마법사일 경우
				System.out.println("1. 매직클로");
				if (HeroSkill.hasmagician2Skillbook(MyInventory.skillbook) == true) {// 히어로 스킬에서 스킬북으로 스킬 배웠는지 true /
																						// false로 구분
					System.out.println("2. 기원참 스킬");
				}
				if (HeroSkill.hasmagician3Skillbook(MyInventory.skillbook) == true) {
					System.out.println("3. 파괴광선 스킬");
				}
				if (HeroSkill.hasmagician4Skillbook()) {
					System.out.println("4. 엘레멘탈 버스트 스킬");
				}
				System.out.printf("사용할 스킬을 선택해주세요 : ");
				attackSelect = in.nextInt();
				System.out.println("=====================================");
				if (attackSelect == 1) {
					System.out.println("매직클로 공격!");
					sum = heroStatus.power * 5 + heroStatus.level * 10 + heroStatus.magic * 20;
					break;
				} else if (attackSelect == 2) {
					if (HeroSkill.hasmagician2Skillbook(MyInventory.skillbook) == true) {
						if (heroStatus.mp >= 2) {
							System.out.println("기원참 공격!");
							sum = heroStatus.power * 10 + heroStatus.level * 15 + heroStatus.magic * 30;
							heroStatus.mp -= 2;
							break;
						} else {
							System.out.println("마나가 부족해 공격에 실패했습니다!");
						}
					} else {
						System.out.println("그 스킬은 배우지 않았습니다.");
					}

				} else if (attackSelect == 3) {
					if (HeroSkill.hasmagician3Skillbook(MyInventory.skillbook) == true) {
						if (heroStatus.mp >= 4) {
							System.out.println("파괴광선 공격!");
							sum = heroStatus.power * 15 + heroStatus.level * 20 + heroStatus.magic * 40;
							heroStatus.mp -= 4;
							break;
						} else {
							System.out.println("마나가 부족해 공격에 실패했습니다!");
						}
					} else {
						System.out.println("그 스킬은 배우지 않았습니다.");
					}

				} else if (attackSelect == 4) {
					if (HeroSkill.hasmagician4Skillbook()) {
						if (heroStatus.mp >= 10) {
							System.out.println("엘레멘탈 버스트 공격!");
							sum = heroStatus.power * 25 + heroStatus.level * 30 + heroStatus.magic * 60;
							heroStatus.mp -= 10;
							break;
						} else {
							System.out.println("마나가 부족해 공격에 실패했습니다!");
						}
					} else {
						System.out.println("그 스킬은 배우지 않았습니다.");
					}

				} else {
					System.out.println("알맞은 번호를 입력해주세요.");
				}
			} else if (heroStatus.selection == 4) { // 직업이 도적일 경우
				System.out.println("1. 표창던지기");
				if (HeroSkill.hasthief2Skillbook(MyInventory.skillbook) == true) {// 히어로 스킬에서 스킬북으로 스킬 배웠는지 true false로
																					// 구분
					System.out.println("2. 새비지 블로우");
				}
				if (HeroSkill.hasthief3Skillbook(MyInventory.skillbook) == true) {
					System.out.println("3. 암살 스킬");
				}
				if (HeroSkill.hasthief4Skillbook()) {
					System.out.println("4. 사우전드 나이프 스킬");
				}
				System.out.printf("사용할 스킬을 선택해주세요 : ");
				attackSelect = in.nextInt();
				System.out.println("=====================================");
				if (attackSelect == 1) {
					System.out.println("표창던지기 공격!");
					sum = heroStatus.power * 10 + heroStatus.level * 10 + heroStatus.magic * 15;
					break;
				} else if (attackSelect == 2) {
					if (HeroSkill.hasthief2Skillbook(MyInventory.skillbook) == true) {
						if (heroStatus.mp >= 2) {
							System.out.println("새비지 블로우 공격!");
							sum = heroStatus.power * 20 + heroStatus.level * 15 + heroStatus.magic * 20;
							heroStatus.mp -= 2;
							break;
						} else {
							System.out.println("마나가 부족해 공격에 실패했습니다!");
						}
					} else {
						System.out.println("그 스킬은 배우지 않았습니다.");
					}

				} else if (attackSelect == 3) {
					if (HeroSkill.hasthief3Skillbook(MyInventory.skillbook) == true) {
						if (heroStatus.mp >= 4) {
							System.out.println("암살 공격!");
							sum = heroStatus.power * 25 + heroStatus.level * 20 + heroStatus.magic * 30;
							heroStatus.mp -= 4;
							break;
						} else {
							System.out.println("마나가 부족해 공격에 실패했습니다!");
						}
					} else {
						System.out.println("그 스킬은 배우지 않았습니다.");
					}

				} else if (attackSelect == 4) {
					if (HeroSkill.hasthief4Skillbook()) {
						if (heroStatus.mp >= 10) {
							System.out.println("사우전드 나이프 공격!");
							sum = heroStatus.power * 40 + heroStatus.level * 30 + heroStatus.magic * 45;
							heroStatus.mp -= 10;
							break;
						} else {
							System.out.println("마나가 부족해 공격에 실패했습니다!");
						}
					} else {
						System.out.println("그 스킬은 배우지 않았습니다.");
					}

				} else {
					System.out.println("알맞은 번호를 입력해주세요.");
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
			int target;
			if (heroStatus.solNum.size() == 0)
				target = 0;
			else
				target = r.nextInt(((heroStatus.solNum.size() != 0) ? (heroStatus.solNum.size() + 1) : 1));
			if (target == heroStatus.solNum.size()) {
				System.out.println(Monster.monsName + "이(가) " + heroStatus.name + "를 공격!");
				heroStatus.hp = heroStatus.hp - sum;
				System.out.println(heroStatus.name + "이(가) 받은 데미지는 " + sum + "입니다.");
				System.out.println("=====================================");
				break;
			} else if (heroStatus.solNum.get(target).solHp > 0) {
				System.out.println(Monster.monsName + "이 " + heroStatus.solNum.get(target).solName + "를 공격!");
				heroStatus.solNum.get(target).solHp -= sum;
				System.out.println(heroStatus.solNum.get(target).solName + "이(가) 받은 데미지는 " + sum + "입니다.");
				System.out.println("=====================================");
				if (heroStatus.solNum.get(target).solHp <= 0) {
					System.out.println(heroStatus.solNum.get(target).solName + "이(가) 쓰러졌습니다!");
					System.out.println("=====================================");
				}
				break;
			} else {
				continue;
			}
		}

	}
}
