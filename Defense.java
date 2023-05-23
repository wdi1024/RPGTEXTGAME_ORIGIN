import java.util.Scanner;

public class Defense {// 아직 안 올림
	static int selectMove;

	static void StartDefense() {
		int MonsterPower = 100;
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("0.돌아가기");
			System.out.println("1.방어");
			System.out.println("방어하시겠습니까? :");
			selectMove = in.nextInt();
			if (selectMove == 0) {
				break;
			} else if (selectMove == 1) {
				System.out.println("동료들과 방어진을 만들어 피해가 줄어듭니다");// 데미지 감소는 몬스터 공격력에서 플레이어와 동료 (힘+마력)/인원수 뺀 만큼
				int sum = 0;
				for (int i = 0; i < heroStatus.solNum.size(); i++) {
					sum += heroStatus.solNum.get(i).solPower + heroStatus.solNum.get(i).solMagic;
				}
				HeroAttack.heroAttacked(Monster.monsterAttack(
						Monster.MonsPower - (heroStatus.power + heroStatus.magic + sum) / heroStatus.solNum.size()));
				break;
			} else {
				System.out.println("알맞은 번호를 입력해주세요.");
			}
		}
	}
}