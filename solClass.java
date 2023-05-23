public class solClass {
	static String solName;
	static int solNum, solHp, solMaxHp, solMp, solMaxMp, solPower, solMagic;

// 나는 바보다, 진짜
	static void printSolStatus() {
		System.out.println("이름 : " + solName);
		System.out.println("체력 : " + solHp + " 최대체력 : " + solMaxHp);
		System.out.println("체력 : " + solMp + " 최대체력 : " + solMaxMp);
		System.out.println("힘 : " + solPower);
		System.out.println("마력 : " + solMagic);

	}

	public solClass(int Num) {
		if (Num == 1) {
			solName = "하급 전사 리차드";// 힘과 체력이 높음
			solHp = heroStatus.level * 10 + 50;
			solMaxHp = heroStatus.level * 10 + 50;
			solMaxMp = heroStatus.level * 1 + 6;
			solMp = heroStatus.level * 1 + 6;
			solPower = heroStatus.level * 2 + 10;
			solMagic = 0;
			solNum = 1;
		} else if (Num == 2) {// 마력과 마나 높음, 하지만 마나는 성직자보다 낮고 마력은 더 높음
			solName = "하급 마법사 콜린";
			solMaxHp = heroStatus.level * 5 + 20;
			solHp = heroStatus.level * 5 + 20;
			solMaxMp = heroStatus.level * 10 + 50;
			solMp = heroStatus.level * 10 + 50;
			solPower = heroStatus.level * 1 + 3;
			solMagic = heroStatus.level * 5 + 10;
			;
			solNum = 2;
		} else if (Num == 3) {// 마력과 마나 높음, 하지만 마나는 마법사보다 높고 마력은 더 낮음
			solName = "하급 성직자 안나";
			solMaxHp = heroStatus.level * 5 + 20;
			solHp = heroStatus.level * 5 + 20;
			solMaxMp = heroStatus.level * 20 + 50;
			solMp = heroStatus.level * 20 + 50;
			solPower = heroStatus.level * 1 + 3;
			solMagic = heroStatus.level * 2 + 10;
			;
			solNum = 3;
		} else if (Num == 4) {
			solName = "중급 전사 제이드";
			solMaxHp = heroStatus.level * 15 + 80;
			solHp = heroStatus.level * 15 + 80;
			solMaxMp = heroStatus.level * 2 + 6;
			solMp = heroStatus.level * 2 + 6;
			solPower = heroStatus.level * 3 + 15;
			solMagic = 0;
			;
			solNum = 4;
		} else if (Num == 5) {
			solName = "중급 마법사 케이토";
			solMaxHp = heroStatus.level * 8 + 40;
			solHp = heroStatus.level * 8 + 40;
			solMaxMp = heroStatus.level * 15 + 80;
			solMp = heroStatus.level * 15 + 80;
			solPower = heroStatus.level * 2 + 4;
			solMagic = heroStatus.level * 7 + 15;
			;
			solNum = 5;
		} else if (Num == 6) {
			solName = "중급 성직자 메이";
			solMaxHp = heroStatus.level * 8 + 40;
			solHp = heroStatus.level * 8 + 40;
			solMaxMp = heroStatus.level * 25 + 90;
			solMp = heroStatus.level * 25 + 90;
			solPower = heroStatus.level * 2 + 4;
			solMagic = heroStatus.level * 3 + 15;
			;
			solNum = 6;
		} else if (Num == 7) {
			solName = "상급 전사 알렉산더";
			solMaxHp = heroStatus.level * 25 + 120;
			solHp = heroStatus.level * 25 + 120;
			solMaxMp = heroStatus.level * 4 + 10;
			solMp = heroStatus.level * 4 + 10;
			solPower = heroStatus.level * 6 + 25;
			solMagic = 0;
			;
			solNum = 7;
		} else if (Num == 8) {
			solName = "상급 마법사 간달프";
			solMaxHp = heroStatus.level * 14 + 60;
			solHp = heroStatus.level * 14 + 60;
			solMaxMp = heroStatus.level * 25 + 120;
			solMp = heroStatus.level * 25 + 120;
			solPower = heroStatus.level * 3 + 9;
			solMagic = heroStatus.level * 10 + 25;
			;
			solNum = 8;
		} else if (Num == 9) {
			solName = "상급 성직자 마리아";
			solMaxHp = heroStatus.level * 14 + 60;
			solHp = heroStatus.level * 14 + 60;
			solMaxMp = heroStatus.level * 35 + 130;
			solMp = heroStatus.level * 35 + 130;
			solPower = heroStatus.level * 3 + 9;
			solMagic = heroStatus.level * 5 + 20;
			;
			solNum = 9;
		}

	}
}
