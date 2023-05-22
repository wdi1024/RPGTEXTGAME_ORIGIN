import java.util.ArrayList;
import java.util.Scanner;

public class Monster {
	static String monsName;
	static int monsHp, monsPower, monsDefense, monsMoney, monsExp;
	static Scanner in = new Scanner(System.in);
//
//	static void selectMonster() {
//		if (SelectingDungeon.dungeonNum == 1) {
//			monsName = "고양이";
//			monsHp = 50;
//			monsDefense = 20;
//			monsPower = 10;
//			monsMoney = 10;
//			monsExp = 10;
//		}
//		if (SelectingDungeon.dungeonNum == 2) {
//			monsName = "살쾡이";
//			monsHp = 100;
//			monsDefense = 40;
//			monsPower = 20;
//			monsMoney = 50;
//			monsExp = 20;
//		} 
//		if (SelectingDungeon.dungeonNum == 3) {
//			monsName = "철갑드래곤";
//			monsHp = 1000;
//			monsDefense = 200;
//			monsPower = 50;
//			monsMoney = 300;
//			monsExp = 200;
//		} 
//	}
//}

    public Monster(String name, int hp, int power, int defense, int money, int exp) {
        this.monsName = name;
        this.monsHp = hp;
        this.monsPower = power;
        this.monsDefense = defense; 
        this.monsMoney = money;
        this.monsExp = exp;
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
			System.out.println(monsName + "의 데미지는 0입니다");
			monsHp = monsHp - 0;
		} else {
			monsHp = monsHp + monsDefense  - sum;
			System.out.println(monsName + "의 데미지는 " + sum + "입니다");
		}
	}
}

class Cat extends Monster {
    public Cat() {
        super("고양이", 50, 20, 10, 10, 10);
    }
}

class Goblin extends Monster {
    public Goblin() {
        super("고블린", 80, 15);
    }

    @Override
    public void attack() {
        System.out.println(getName() + "이(가) 창을 휘두르며 공격합니다!");
    }
}

