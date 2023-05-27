import java.util.Random;

public class SolSkill {

	static int solskill(int solnum) {
		Random random = new Random();
		int sum = 0;
		// 용병 1
		if (heroStatus.solNum.get(solnum).solNum == 1) {
			int randomNumber = random.nextInt(100) + 1;

			if (40 < randomNumber && randomNumber <= 70) {
				System.out.println("리차드 강타 (힘 10배 증가");
				sum = heroStatus.solNum.get(solnum).solPower * 10;
			} else if (70 < randomNumber && randomNumber <= 90) {
				System.out.println("리차드 무자비한 일격 (힘 20배 증가)");
				sum = heroStatus.solNum.get(solnum).solPower * 20;
			} else if (randomNumber > 90) {
				System.out.println("리차드 심연의 부름 (최대 체력 10 증가)");
				heroStatus.solNum.get(solnum).solMaxHp += 10;
			} else {
				System.out.println("리차드 베기");
				sum = heroStatus.solNum.get(solnum).solPower;
			}
		}
		// 용병 2
		if (heroStatus.solNum.get(solnum).solNum == 2) {
			int randomNumber = random.nextInt(100) + 1;

			if (58 < randomNumber && randomNumber <= 80) {
				System.out.println("콜린 마법 화살 (마력 10배 증가");
				sum = heroStatus.solNum.get(solnum).solMagic * 10;
			} else if (80 < randomNumber && randomNumber <= 95) {
				System.out.println("콜린 마법 회복 (MaxHp 10 증가)");
				heroStatus.solNum.get(solnum).solMaxHp += 10;
			} else if (95 < randomNumber) {
				System.out.println("콜린 마력 증폭 (힘 60배 증가)");
				sum = heroStatus.solNum.get(solnum).solMagic * 60;
			} else if (randomNumber > 30 && randomNumber <= 58) {
				System.out.println("콜린 마법진");
				sum = heroStatus.solNum.get(solnum).solPower;
			} else {
				System.out.println("Miss!");
			}
		}
		// 용병 3
		if (heroStatus.solNum.get(solnum).solNum == 3) {
			int randomNumber = random.nextInt(100) + 1;

			if (40 < randomNumber && randomNumber <= 70) {
				System.out.println("안나 치유의 손길 (HP 10 증가");
				sum = heroStatus.solNum.get(solnum).solHp + 30;
			} else if (70 < randomNumber && randomNumber <= 90) {
				System.out.println("안나 생명력 흡수 (입힌 데미지만큼 체력 회복)");
				sum = heroStatus.solNum.get(solnum).solMagic * 5;
				heroStatus.solNum.get(solnum).solHp += sum;
			} else if (90 < randomNumber) {
				System.out.println("안나 대규모 치유 (전체 HP 30 증가, 안나는 추가 10 증가");
				sum = heroStatus.solNum.get(solnum).solHp + 10;
				// 전체 용병에게 적용
				for (int i = 0; i < heroStatus.solNum.size(); i++)
					heroStatus.solNum.get(i).solHp += 30;
			} else {
				System.out.println("안나 신의 수호");
				sum = heroStatus.solNum.get(solnum).solPower;
			}
		}
		// 용병 4
		if (heroStatus.solNum.get(solnum).solNum == 4) {
			int randomNumber = random.nextInt(100) + 1;

			if (40 < randomNumber && randomNumber <= 70) {
				System.out.println("제이드 돌진 (힘 15배 증가");
				sum = heroStatus.solNum.get(solnum).solPower * 15;
			} else if (70 < randomNumber && randomNumber <= 90) {
				System.out.println("제이드 도발 (힘 22배 증가)");
				sum = heroStatus.solNum.get(solnum).solPower * 22;
			} else if (randomNumber > 90) {
				System.out.println("제이드 방어 태세 (최대 체력 20 증가)");
				heroStatus.solNum.get(solnum).solMaxHp += 20;
			} else {
				System.out.println("리차드 참격");
				sum = heroStatus.solNum.get(solnum).solPower;
			}
		}
		// 용병 5
		if (heroStatus.solNum.get(solnum).solNum == 5) {
			int randomNumber = random.nextInt(100) + 1;

			if (58 < randomNumber && randomNumber <= 80) {
				System.out.println("케이토 화염구 (마력 15배 증가");
				sum = heroStatus.solNum.get(solnum).solMagic * 15;
			} else if (80 < randomNumber && randomNumber <= 95) {
				System.out.println("케이토 번개 폭풍 (MaxHp 20 증가)");
				heroStatus.solNum.get(solnum).solMaxHp += 20;
			} else if (95 < randomNumber) {
				System.out.println("케이토 마법 소환 (힘 80배 증가)");
				sum = heroStatus.solNum.get(solnum).solPower * 80;
			} else if (randomNumber > 30 && randomNumber <= 58) {
				System.out.println("케이토 얼음창");
				sum = heroStatus.solNum.get(solnum).solPower;
			} else {
				System.out.println("Miss!");
			}
		}
		// 용병 6
		if (heroStatus.solNum.get(solnum).solNum == 6) {
			int randomNumber = random.nextInt(100) + 1;

			if (40 < randomNumber && randomNumber <= 70) {
				System.out.println("메이 신성한 빛 (HP 10 증가");
				sum = heroStatus.solNum.get(solnum).solHp + 40;
			} else if (70 < randomNumber && randomNumber <= 90) {
				System.out.println("메이 성스러운 회복 (입힌 데미지만큼 체력 회복)");
				sum = heroStatus.solNum.get(solnum).solMagic * 10;
				heroStatus.solNum.get(solnum).solHp += sum;
			} else if (90 < randomNumber) {
				System.out.println("메이 신의 손길 (전체 HP 30 증가, 안나는 추가 10 증가");
				sum = heroStatus.solNum.get(solnum).solHp + 20;
				// 전체 용병에게 적용
				for (int i = 0; i < heroStatus.solNum.size(); i++)
					heroStatus.solNum.get(i).solHp += 40;
			} else {
				System.out.println("메이 마력 강화");
				sum = heroStatus.solNum.get(solnum).solPower;
			}
		}
		// 용병 7
		if (heroStatus.solNum.get(solnum).solNum == 7) {
			int randomNumber = random.nextInt(100) + 1;

			if (40 < randomNumber && randomNumber <= 70) {
				System.out.println("알렉산더 대지 강타 (힘 20배 증가");
				sum = heroStatus.solNum.get(solnum).solPower * 20;
			} else if (70 < randomNumber && randomNumber <= 90) {
				System.out.println("알렉산더 전쟁의 포효 (힘 25배 증가)");
				sum = heroStatus.solNum.get(solnum).solPower * 25;
			} else if (randomNumber > 90) {
				System.out.println("알렉산더 방패 벽 (최대 체력 30 증가)");
				heroStatus.solNum.get(solnum).solMaxHp += 30;
			} else {
				System.out.println("알렉산더 격돌");
				sum = heroStatus.solNum.get(solnum).solPower;
			}
		}
		// 용병 8
		if (heroStatus.solNum.get(solnum).solNum == 8) {
			int randomNumber = random.nextInt(100) + 1;

			if (58 < randomNumber && randomNumber <= 80) {
				System.out.println("간달프 번개의 격노 (마력 20배 증가");
				sum = heroStatus.solNum.get(solnum).solMagic * 20;
			} else if (80 < randomNumber && randomNumber <= 95) {
				System.out.println("간달프 신비한 회복 (MaxHp 30 증가)");
				heroStatus.solNum.get(solnum).solMaxHp += 30;
			} else if (95 < randomNumber) {
				System.out.println("간달프 얼음 폭풍 (힘 100배 증가)");
				sum = heroStatus.solNum.get(solnum).solPower * 100;
			} else if (randomNumber > 30 && randomNumber <= 58) {
				System.out.println("간달프 어둠의 손길");
				sum = heroStatus.solNum.get(solnum).solPower;
			} else {
				System.out.println("Miss!");
			}
		}
		// 용병 9
		if (heroStatus.solNum.get(solnum).solNum == 9) {
			int randomNumber = random.nextInt(100) + 1;

			if (40 < randomNumber && randomNumber <= 70) {
				System.out.println("마리아 천사의 가호 (HP 10 증가");
				sum = heroStatus.solNum.get(solnum).solHp + 50;
			} else if (70 < randomNumber && randomNumber <= 90) {
				System.out.println("마리아 마법 봉인 (입힌 데미지만큼 체력 회복)");
				sum = heroStatus.solNum.get(solnum).solMagic * 15;
				heroStatus.solNum.get(solnum).solHp += sum;
			} else if (90 < randomNumber) {
				System.out.println("마리아 치유의 성역 (전체 HP 50 증가, 안나는 추가 30 증가");
				sum = heroStatus.solNum.get(solnum).solHp + 30;
				// 전체 용병에게 적용
				for (int i = 0; i < heroStatus.solNum.size(); i++)
					heroStatus.solNum.get(i).solHp += 50;
			} else {
				System.out.println("마리아 죽음의 선고");
				sum = heroStatus.solNum.get(solnum).solPower;
			}
		}

		return sum;
	}
}