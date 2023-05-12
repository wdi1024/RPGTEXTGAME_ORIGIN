package Game;

import java.util.ArrayList;

public class heroStatus {
	static String name, job;
	static int selection, level, hp, maxHp, mp, maxMp, power, magic, hiredSoldierCnt, money, exp;
	static ArrayList<Integer> solNum = new ArrayList<>();

	void printStatus() {
		System.out.println("이름 : " + name);
		System.out.println("직업 : " + job);
		System.out.println("레벨 : " + level);
		System.out.println("체력 : " + hp + " 최대체력 : " + maxHp);
		System.out.println("체력 : " + mp + " 최대체력 : " + maxMp);
		System.out.println("힘 : " + power);
		System.out.println("마력 : " + magic);
		System.out.println("동행 용병 수 : " + hiredSoldierCnt);
		System.out.println("돈 : " + money);
		System.out.println("경험치 : " + exp);
	}
}
