package Game;

public class solClass {
	static String solName;
	static int solNum, solHp, solMaxHp, solMp, solMaxMp, solPower, solMagic;

	void printSolStatus() {
		System.out.println("이름 : " + solName);
		System.out.println("체력 : " + solHp + " 최대체력 : " + solMaxHp);
		System.out.println("체력 : " + solMp + " 최대체력 : " + solMaxMp);
		System.out.println("힘 : " + solPower);
		System.out.println("마력 : " + solMagic);

	}

	public solClass solClasses(int solNum) {
		if (solNum == 1) {
			solName = "하급 전사";// hp,mp는 여기에 넣으면 초기화 되니까 일단 빼놓음
			solMaxHp = heroStaus.level * 30 + 100;
			solHp = heroStaus.level * 30 + 100;
			solMaxMp = heroStaus.level * 2 + 6;
			solMp = heroStaus.level * 2 + 6;
			solPower = heroStaus.level * 50 + 110;
			solMagic = 0;
			this.solNum = 1;
			return this;
		}

	}
}
