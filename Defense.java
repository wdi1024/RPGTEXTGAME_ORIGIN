import java.util.Scanner;

public class Defense {// 아직 안 올림
	static int selectMove;

	static void StartDefense() {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("0.돌아가기");
			System.out.println("1.방어");
			System.out.print("방어하시겠습니까? :");
			selectMove = in.nextInt();
			if (selectMove == 0) {
				break;
			} else if (selectMove == 1) {
				if (heroStatus.solNum.size() > 0) {
					System.out.println("동료들과 방어진을 만들어 피해가 줄어듭니다");// 데미지 감소는 몬스터 공격력에서 플레이어와 동료 (힘+마력)/인원수 뺀 만큼
					int def = 0;
					for (int i = 0; i < heroStatus.solNum.size(); i++) {
						def += heroStatus.solNum.get(i).solPower + heroStatus.solNum.get(i).solMagic;
					}
					HeroAttack.heroAttacked(
							Monster.monsterAttack(Monster.monsPower - (heroStatus.power + heroStatus.magic + def)
									/ (heroStatus.solNum.size() != 0 ? heroStatus.solNum.size() : 1)));
					break;
				} else {
					System.out.println("방어로 피해가 줄어듭니다");
					HeroAttack.heroAttacked(Monster.monsPower - (heroStatus.power + heroStatus.magic));
				}

			} else {
				System.out.println("알맞은 번호를 입력해주세요.");
			}
		}
	}
}