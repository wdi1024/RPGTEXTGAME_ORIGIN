import java.util.Random;

public class SolSkill {

	static int solskill(int solnum) {
		Random random = new Random();
		int sum = 0;
		// 용병 1
		if (heroStatus.solNum.get(solnum).solNum == 1) {
			int randomNumber = random.nextInt(100) + 1;

			if (40 < randomNumber && randomNumber <= 70) {
				System.out.println("리차드 강타 (힘 2배 증가");
				sum = heroStatus.solNum.get(solnum).solPower * 50;
			} else if (70 < randomNumber && randomNumber <= 90) {
				System.out.println("리차드 무자비한 일격 (힘 4배 증가)");
				sum = heroStatus.solNum.get(solnum).solPower * 80;
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

			if (40 < randomNumber && randomNumber <= 70) {
				System.out.println("콜린 마법 화살 (마력 2배 증가");
				sum = heroStatus.solNum.get(solnum).solMagic * 50;
			} else if (70 < randomNumber && randomNumber <= 90) {
				System.out.println("콜린 마법 회복 (MaxHp 10 증가)");
				heroStatus.solNum.get(solnum).solMaxHp += 10;
			} else if (90 < randomNumber) {
				System.out.println("콜린 마력 증폭 (콜린 마력 4배 증가)");
				sum = heroStatus.solNum.get(solnum).solMagic * 80;
			} else {
				System.out.println("콜린 마법진");
				sum = heroStatus.solNum.get(solnum).solPower;
			}
		}
		// 용병 3
		if (heroStatus.solNum.get(solnum).solNum == 2) {
			int randomNumber = random.nextInt(100) + 1;

			if (40 < randomNumber && randomNumber <= 70) {
				System.out.println("안나 치유의 손길 (HP 10 증가");
				sum = heroStatus.solNum.get(solnum).solHp + 10;
			} else if (70 < randomNumber && randomNumber <= 90) {
				System.out.println("안나 생명력 흡수 (입힌 데미지만큼 체력 회복)");
				sum = heroStatus.solNum.get(solnum).solMagic;
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
		return sum;
	}	
}	