public class solClass {
	String solName;
	int solNum, solHp, solMaxHp, solMp, solMaxMp, solPower, solMagic;

	static void printSolStatus(solClass K) {
		System.out.println("이름 : " + K.solName);
		System.out.println("체력 : " + K.solHp + " 최대체력 : " + K.solMaxHp);
		System.out.println("힘 : " + K.solPower);
		System.out.println("마력 : " + K.solMagic);

	}

	public solClass(int Num) {
		if (Num == 1) {
			solName = "하급 전사 리차드";// 힘과 체력이 높음
			solHp = heroStatus.level * 10 + 60;
			solMaxHp = heroStatus.level * 10 + 60;
			solPower = heroStatus.level * 2 + 6;
			solMagic = 0;
			solNum = 1;
		} else if (Num == 2) {// 마력 높음
			solName = "하급 마법사 콜린";
			solMaxHp = heroStatus.level * 5 + 40;
			solHp = heroStatus.level * 5 + 40;
			solPower = heroStatus.level * 1 + 3;
			solMagic = heroStatus.level * 5 + 10;
			solNum = 2;
		} else if (Num == 3) {// 힐 스킬 사용 가능
			solName = "하급 성직자 안나";
			solMaxHp = heroStatus.level * 5 + 40;
			solHp = heroStatus.level * 5 + 40;
			solPower = heroStatus.level * 1 + 3;
			solMagic = heroStatus.level * 2 + 10;
			solNum = 3;
		} else if (Num == 4) {
			solName = "중급 전사 제이드";
			solMaxHp = heroStatus.level * 30 + 80;
			solHp = heroStatus.level * 30 + 80;
			solPower = heroStatus.level * 3 + 10;
			solMagic = 0;
			solNum = 4;
		} else if (Num == 5) {
			solName = "중급 마법사 케이토";
			solMaxHp = heroStatus.level * 8 + 60;
			solHp = heroStatus.level * 8 + 60;
			solPower = heroStatus.level * 2 + 4;
			solMagic = heroStatus.level * 7 + 15;
			solNum = 5;
		} else if (Num == 6) {
			solName = "중급 성직자 메이";
			solMaxHp = heroStatus.level * 8 + 60;
			solHp = heroStatus.level * 8 + 60;
			solPower = heroStatus.level * 2 + 4;
			solMagic = heroStatus.level * 3 + 15;
			solNum = 6;
		} else if (Num == 7) {
			solName = "상급 전사 알렉산더";
			solMaxHp = heroStatus.level * 40 + 120;
			solHp = heroStatus.level * 40 + 120;
			solPower = heroStatus.level * 6 + 25;
			solMagic = 0;
			solNum = 7;
		} else if (Num == 8) {
			solName = "상급 마법사 간달프";
			solMaxHp = heroStatus.level * 14 + 80;
			solHp = heroStatus.level * 14 + 80;
			solPower = heroStatus.level * 3 + 9;
			solMagic = heroStatus.level * 10 + 25;
			solNum = 8;
		} else if (Num == 9) {
			solName = "상급 성직자 마리아";
			solMaxHp = heroStatus.level * 14 + 80;
			solHp = heroStatus.level * 14 + 80;
			solPower = heroStatus.level * 3 + 9;
			solMagic = heroStatus.level * 6 + 20;
			solNum = 9;
		}
	}
}
