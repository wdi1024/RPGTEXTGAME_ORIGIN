import java.util.Random;

public class AfterFight {

	static void Drop() {
		// 일반 1
		if (Monster.monsName == "고양이") {
			Random random = new Random();
			int a = random.nextInt(100);
			int b = random.nextInt(100);

			if (a < 40) {
				MyInventory.hpPotionCnt++;
				System.out.println("체력 회복 포션 드랍");
			}
			if (b < 40) {
				MyInventory.mpPotionCnt++;
				System.out.println("마나 회복 포션 드랍");
			}
			if (a < 15) {
				if (heroStatus.job == "전사") {
					if (HeroSkill.hasjeonsa2Skillbook(MyInventory.skillbook) == false)
						System.out.println("파워 슬래시 스킬북 드랍");
					MyInventory.addItem("파워 슬래시 스킬북");
				}
				if (heroStatus.job == "궁수") {
					if (HeroSkill.hasgungsu2Skillbook(MyInventory.skillbook) == false)
						System.out.println("더블 샷 스킬북 드랍");
					MyInventory.addItem("더블 샷 스킬북");
				}
				if (heroStatus.job == "마법사") {
					if (HeroSkill.hasmagician2Skillbook(MyInventory.skillbook) == false)
						System.out.println("기원참 스킬북 드랍");
					MyInventory.addItem("기원참 스킬북");
				}
				if (heroStatus.job == "도적") {
					if (HeroSkill.hasthief2Skillbook(MyInventory.skillbook) == false)
						System.out.println("새비지 블로우 스킬북 드랍");
					MyInventory.addItem("새비지 블로우 스킬북");
				}
			}
		}
		// 일반 2
		if (Monster.monsName == "고블린") {
			Random random = new Random();
			int a = random.nextInt(100);
			int b = random.nextInt(100);
			int c = random.nextInt(100);

			if (a < 40) {
				MyInventory.hpPotionCnt++;
				System.out.println("체력 회복 포션 드랍");
			}
			if (b < 20) {
				MyInventory.powerPotionCnt++;
				System.out.println("파워 증강 포션 드랍");
			}
			if (c < 40) {
				MyInventory.mpPotionCnt++;
				System.out.println("마나 회복 포션 드랍");
			}
		}
		// 일반 3
		if (Monster.monsName == "골렘") {
			Random random = new Random();
			int a = random.nextInt(100);
			int b = random.nextInt(100);
			int c = random.nextInt(100);
			int d = random.nextInt(100);

			if (a < 40) {
				MyInventory.hpPotionCnt++;
				System.out.println("체력 회복 포션 드랍");
			}
			if (b < 20) {
				MyInventory.powerPotionCnt++;
				System.out.println("파워 증강 포션 드랍");
			}
			if (c < 40) {
				MyInventory.mpPotionCnt++;
				System.out.println("마나 회복 포션 드랍");
			}
			if (d < 30) {
				MyInventory.magicPotionCnt++;
				System.out.println("마력 회복 포션 드랍");
			}
		}
		// 일반 4
		if (Monster.monsName == "스파이더") {
			Random random = new Random();
			int a = random.nextInt(100);
			int b = random.nextInt(100);
			int c = random.nextInt(100);
			int d = random.nextInt(100);
			int e = random.nextInt(100);

			if (a < 40) {
				MyInventory.hpPotionCnt++;
				System.out.println("체력 회복 포션 드랍");
			}
			if (b < 20) {
				MyInventory.powerPotionCnt++;
				System.out.println("파워 증강 포션 드랍");
			}
			if (c < 40) {
				MyInventory.mpPotionCnt++;
				System.out.println("마나 회복 포션 드랍");
			}
			if (d < 30) {
				MyInventory.magicPotionCnt++;
				System.out.println("마력 회복 포션 드랍");
			}
			if (e < 30) {
				MyInventory.maxMpPotionCnt++;
				System.out.println("최대마나 증강 포션 드랍");
			}
		}
		// 일반 5
		if (Monster.monsName == "켄타우로스") {
			Random random = new Random();
			int a = random.nextInt(100);
			int b = random.nextInt(100);
			int c = random.nextInt(100);
			int d = random.nextInt(100);
			int e = random.nextInt(100);

			if (a < 40) {
				MyInventory.hpPotionCnt++;
				System.out.println("체력 회복 포션 드랍");
			}
			if (b < 20) {
				MyInventory.powerPotionCnt++;
				System.out.println("파워 증강 포션 드랍");
			}
			if (c < 40) {
				MyInventory.mpPotionCnt++;
				System.out.println("마나 회복 포션 드랍");
			}
			if (d < 30) {
				MyInventory.magicPotionCnt++;
				System.out.println("마력 회복 포션 드랍");
			}
			if (e < 30) {
				MyInventory.maxHpPotionCnt++;
				System.out.println("최대체력 증강 포션 드랍");
			}
		}
		// 일반 6
		if (Monster.monsName == "구울") {
			Random random = new Random();
			int a = random.nextInt(100);
			int b = random.nextInt(100);
			int c = random.nextInt(100);
			int d = random.nextInt(100);
			int e = random.nextInt(100);

			if (a < 50) {
				MyInventory.hpPotionCnt++;
				System.out.println("체력 회복 포션 드랍");
			}
			if (b < 30) {
				MyInventory.powerPotionCnt++;
				System.out.println("파워 증강 포션 드랍");
			}
			if (c < 50) {
				MyInventory.mpPotionCnt++;
				System.out.println("마나 회복 포션 드랍");
			}
			if (d < 40) {
				MyInventory.magicPotionCnt++;
				System.out.println("마력 회복 포션 드랍");
			}
			if (e < 30) {
				MyInventory.maxMpPotionCnt++;
				System.out.println("최대마나 회복 포션 드랍");
			}
			if (e > 70) {
				MyInventory.maxHpPotionCnt++;
				System.out.println("최대체력 회복 포션 드랍");
			}
			if (a < 15) {
				if (heroStatus.job == "전사") {
					if (HeroSkill.hasjeonsa3Skillbook(MyInventory.skillbook) == false)
						System.out.println("사자의 노래 스킬북 드랍");
					MyInventory.addItem("사자의 노래 스킬북");
				}
				if (heroStatus.job == "궁수") {
					if (HeroSkill.hasgungsu3Skillbook(MyInventory.skillbook) == false)
						System.out.println("화살비 스킬북 드랍");
					MyInventory.addItem("화살비 스킬북");
				}
				if (heroStatus.job == "마법사") {
					if (HeroSkill.hasmagician3Skillbook(MyInventory.skillbook) == false)
						System.out.println("파괴광선 스킬북 드랍");
					MyInventory.addItem("파괴광선 스킬북");
				}
				if (heroStatus.job == "도적") {
					if (HeroSkill.hasthief3Skillbook(MyInventory.skillbook) == false)
						System.out.println("암살 스킬북 드랍");
					MyInventory.addItem("암살 스킬북");
				}
			}
		}
		// 일반 7
		if (Monster.monsName == "네크로실") {
			Random random = new Random();
			int a = random.nextInt(100);
			int b = random.nextInt(100);
			int c = random.nextInt(100);
			int d = random.nextInt(100);
			int e = random.nextInt(100);

			if (a < 50) {
				MyInventory.hpPotionCnt++;
				System.out.println("체력 회복 포션 드랍");
			}
			if (b < 40) {
				MyInventory.powerPotionCnt++;
				System.out.println("파워 증강 포션 드랍");
			}
			if (c < 50) {
				MyInventory.mpPotionCnt++;
				System.out.println("마나 회복 포션 드랍");
			}
			if (d < 40) {
				MyInventory.magicPotionCnt++;
				System.out.println("마력 회복 포션 드랍");
			}
			if (e < 35) {
				MyInventory.maxMpPotionCnt++;
				System.out.println("최대마나 회복 포션 드랍");
			}
			if (e > 70) {
				MyInventory.maxHpPotionCnt++;
				System.out.println("최대체력 회복 포션 드랍");
			}
		}
		// 일반 8
		if (Monster.monsName == "어비스마스터") {
			Random random = new Random();
			int a = random.nextInt(100);
			int b = random.nextInt(100);
			int c = random.nextInt(100);
			int d = random.nextInt(100);
			int e = random.nextInt(100);

			if (a < 60) {
				MyInventory.hpPotionCnt++;
				System.out.println("체력 회복 포션 드랍");
			}
			if (b < 40) {
				MyInventory.powerPotionCnt++;
				System.out.println("파워 증강 포션 드랍");
			}
			if (c < 60) {
				MyInventory.mpPotionCnt++;
				System.out.println("마나 회복 포션 드랍");
			}
			if (d < 40) {
				MyInventory.magicPotionCnt++;
				System.out.println("마력 회복 포션 드랍");
			}
			if (e < 35) {
				MyInventory.maxMpPotionCnt++;
				System.out.println("최대마나 회복 포션 드랍");
			}
			if (e > 70) {
				MyInventory.maxHpPotionCnt++;
				System.out.println("최대체력 회복 포션 드랍");
			}
		}
		// 일반 9
		if (Monster.monsName == "블러드레이븐") {
			Random random = new Random();
			int a = random.nextInt(100);
			int b = random.nextInt(100);
			int c = random.nextInt(100);
			int d = random.nextInt(100);
			int e = random.nextInt(100);
			int f = random.nextInt(100);

			if (a < 60) {
				MyInventory.hpPotionCnt++;
				System.out.println("체력 회복 포션 드랍");
			}
			if (b < 40) {
				MyInventory.powerPotionCnt++;
				System.out.println("파워 증강 포션 드랍");
			}
			if (c < 60) {
				MyInventory.mpPotionCnt++;
				System.out.println("마나 회복 포션 드랍");
			}
			if (d < 50) {
				MyInventory.magicPotionCnt++;
				System.out.println("마력 회복 포션 드랍");
			}
			if (e < 40) {
				MyInventory.maxMpPotionCnt++;
				System.out.println("최대마나 회복 포션 드랍");
			}
			if (f < 40) {
				MyInventory.maxHpPotionCnt++;
				System.out.println("최대체력 회복 포션 드랍");
			}
		}
		// 일반 10
		if (Monster.monsName == "다크사이클론") {
			Random random = new Random();
			int a = random.nextInt(100);
			int b = random.nextInt(100);
			int c = random.nextInt(100);
			int d = random.nextInt(100);
			int e = random.nextInt(100);
			int f = random.nextInt(100);

			if (a < 60) {
				MyInventory.hpPotionCnt++;
				System.out.println("체력 회복 포션 드랍");
			}
			if (b < 40) {
				MyInventory.powerPotionCnt++;
				System.out.println("파워 증강 포션 드랍");
			}
			if (c < 60) {
				MyInventory.mpPotionCnt++;
				System.out.println("마나 회복 포션 드랍");
			}
			if (d < 50) {
				MyInventory.magicPotionCnt++;
				System.out.println("마력 회복 포션 드랍");
			}
			if (e < 50) {
				MyInventory.maxMpPotionCnt++;
				System.out.println("최대마나 회복 포션 드랍");
			}
			if (f < 40) {
				MyInventory.maxHpPotionCnt++;
				System.out.println("최대체력 회복 포션 드랍");
			}
		}
		// 보스 1
		if (Monster.monsName == "철갑 드래곤") {
			Random random = new Random();
			int randomNumber = random.nextInt(100);
			int randomhp = random.nextInt(10) + 6; // 6 to 15
			int randompw = random.nextInt(5) + 2; // 2 to 6

			int cnt = 0;
			for (int i = 5; i < randomhp; i++) {
				MyInventory.hpPotionCnt++;
				cnt++;
			}
			System.out.printf("체력 회복 포션 드랍 (%d개)\n", cnt);

			cnt = 0;
			for (int i = 5; i < randomhp; i++) {
				MyInventory.mpPotionCnt++;
				cnt++;
			}
			System.out.printf("마나 회복 포션 드랍 (%d개)\n", cnt);

			cnt = 0;
			for (int i = 0; i < randompw; i++) {
				MyInventory.powerPotionCnt++;
				cnt++;
			}
			System.out.printf("힘 증강 포션 드랍 (%d개)\n", cnt);

			if (randomNumber < 50) {
				MyInventory.maxHpPotionCnt++;
				MyInventory.maxHpPotionCnt++;
				System.out.println("최대 체력 증강 포션 드랍");
			}

			if (randomNumber < 50) {
				MyInventory.maxMpPotionCnt++;
				MyInventory.maxMpPotionCnt++;
				System.out.println("최대 마나 증강 포션 드랍");
			}
		}
		// 보스 2
		if (Monster.monsName == "불멸의 악마왕") {
			Random random = new Random();
			int randomNumber = random.nextInt(100);
			int randomhp = random.nextInt(5) + 2; // 2 to 6
			int randommp = random.nextInt(5) + 2; // 2 to 6
			int randompw = random.nextInt(5) + 2; // 2 to 6

			int cnt = 0;
			for (int i = 0; i < randomhp; i++) {
				MyInventory.hpPotionCnt++;
				cnt++;
			}
			System.out.printf("체력 회복 포션 드랍 (%d개)\n", cnt);

			cnt = 0;
			for (int i = 0; i < randommp; i++) {
				MyInventory.mpPotionCnt++;
				cnt++;
			}
			System.out.printf("마나 회복 포션 드랍 (%d개)\n", cnt);

			cnt = 0;
			for (int i = 0; i < randompw; i++) {
				MyInventory.powerPotionCnt++;
				cnt++;
			}
			System.out.printf("힘 증강 포션 드랍 (%d개)\n", cnt);

			if (randomNumber < 50) {
				MyInventory.maxHpPotionCnt++;
				MyInventory.maxHpPotionCnt++;
				System.out.println("최대 체력 증강 포션 드랍");
			}

			if (randomNumber < 50) {
				MyInventory.maxMpPotionCnt++;
				MyInventory.maxMpPotionCnt++;
				System.out.println("최대 마나 증강 포션 드랍");
			}
		}
		// 보스 3
		if (Monster.monsName == "죽음의 그림자 군주") {
			Random random = new Random();
			int randomNumber = random.nextInt(100);
			int randomhp = random.nextInt(6) + 5; // 5 to 10
			int randommp = random.nextInt(6) + 5; // 6 to 10
			int randompw = random.nextInt(4) + 5; // 5 to 8

			int cnt = 0;
			for (int i = 0; i < randomhp; i++) {
				MyInventory.hpPotionCnt++;
				cnt++;
			}
			System.out.printf("체력 회복 포션 드랍 (%d개)\n", cnt);

			cnt = 0;
			for (int i = 0; i < randommp; i++) {
				MyInventory.mpPotionCnt++;
				cnt++;
			}
			System.out.printf("마나 회복 포션 드랍 (%d개)\n", cnt);

			cnt = 0;
			for (int i = 0; i < randompw; i++) {
				MyInventory.powerPotionCnt++;
				cnt++;
			}
			System.out.printf("힘 증강 포션 드랍 (%d개)\n", cnt);

			if (randomNumber < 50) {
				MyInventory.maxHpPotionCnt++;
				MyInventory.maxHpPotionCnt++;
				System.out.println("최대 체력 증강 포션 드랍");
			}

			if (randomNumber < 50) {
				MyInventory.maxMpPotionCnt++;
				MyInventory.maxMpPotionCnt++;
				System.out.println("최대 마나 증강 포션 드랍");
			}
		}
	}
}
