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
				System.out.println("방어해서 피해가 줄어듭니다.");// 데미지 감소는 몬스터 공격력에서 플레이어 힘+마력 뺀 만큼
				HeroAttack.heroAttacked(HeroAttack.monsterAttack(MonsterPower - (heroStatus.power + heroStatus.magic)));
				break;
			} else {
				System.out.println("알맞은 번호를 입력해주세요.");
			}
		}
	}
}