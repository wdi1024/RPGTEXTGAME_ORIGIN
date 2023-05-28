import java.util.Scanner;

public class Monster {
	static String monsName;
	static int monsHp, monsPower, monsDefense, monsMoney, monsExp;
	static Scanner in = new Scanner(System.in);

	public Monster(String name, int hp, int power, int defense, int money, int exp) {
		Monster.monsName = name;
		Monster.monsHp = hp;
		Monster.monsPower = power;
		Monster.monsDefense = defense;
		Monster.monsMoney = money;
		Monster.monsExp = exp;
	}

	public String getName() {
		return monsName;
	}

	public int getHp() {
		return monsHp;
	}

	public int getPower() {
		return monsPower;
	}

	public int getDefense() {
		return monsDefense;
	}

	public int getMoney() {
		return monsMoney;
	}

	public int getExp() {
		return monsExp;
	}

	static int monsterAttack(int monster_power) {
		int sum = 0;
		if (monster_power < 0) {
			monster_power = 0;
		}
		sum = monster_power;
		System.out.println(monsName + "의 공격입니다!");
		return sum;
	}

	static void monsterAttacked(int sum) {
		if (monsDefense >= sum) {
			System.out.println(monsName + "가 받은 데미지는 0입니다.");
			monsHp = monsHp - 0;
		} else {
			monsHp = monsHp + monsDefense - sum;
			System.out.println(monsName + "가 받은 데미지는 " + (sum - monsDefense) + "입니다");
		}
	}
}

// 일반 1  name, hp, power, defense, money, exp
class Cat extends Monster {
	public Cat() {
		super("고양이", 200, 20, 10, 10, 10);
	}
}

// 일반 2
class Goblin extends Monster {
	public Goblin() {
		super("고블린", 300, 30, 20, 20, 20);
	}
}

// 일반 3
class Golem extends Monster {
	public Golem() {
		super("골렘", 500, 50, 30, 30, 30);
	}
}

//일반 4
class Spider extends Monster {
	public Spider() {
		super("스파이더", 1000, 60, 40, 40, 40);
	}
}

//일반 5
class Centaurus extends Monster {
	public Centaurus() {
		super("캔타우로스", 1500, 70, 50, 50, 50);
	}
}

//일반 6
class Ghoul extends Monster {
	public Ghoul() {
		super("구울", 2000, 80, 60, 60, 60);
	}
}

//일반 7
class Necrosyl extends Monster {
	public Necrosyl() {
		super("네크로실", 2500, 100, 70, 70, 70);
	}
}

//일반 8
class Abyssmaster extends Monster {
	public Abyssmaster() {
		super("어비스마스터", 3000, 110, 80, 80, 80);
	}
}

//일반 9
class Bloodraven extends Monster {
	public Bloodraven() {
		super("블러드레이븐", 3500, 120, 90, 90, 90);
	}
}

//일반 10 
class Darkcyclone extends Monster {
	public Darkcyclone() {
		super("다크사이클론", 4000, 130, 100, 100, 100);
	}
}

//보스 1
class Dragon extends Monster {
	public Dragon() {
		super("철갑 드래곤", 10000, 150, 100, 1000, 200);
	}
}

//보스 2
class KingofDemon extends Monster {
	public KingofDemon() {
		super("불멸의 악마왕", 20000, 175, 200, 1500, 300);
	}
}

//보스 3
class DeadLord extends Monster {
	public DeadLord() {
		super("죽음의 그림자 군주", 35000, 200, 300, 2000, 400);
	}
}
