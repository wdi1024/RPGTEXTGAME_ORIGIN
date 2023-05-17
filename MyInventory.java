package Game;

import java.util.ArrayList;

public class MyInventory {
	static int hpPotionCnt, mpPotionCnt, maxHpPotionCnt, maxMpPotionCnt, powerPotionCnt, magicPotionCnt;
	static ArrayList<String> skillbook = new ArrayList<>();

	void printInventory() {

		if (hpPotionCnt > 0) {
			System.out.println("1.체력 회복포션: " + hpPotionCnt + "개");
		}
		if (mpPotionCnt > 0) {
			System.out.println("2.마나 회복포션: " + mpPotionCnt + "개");
		}
		if (maxHpPotionCnt > 0) {
			System.out.println("3.최대체력 증강포션: " + maxHpPotionCnt + "개");
		}
		if (maxMpPotionCnt > 0) {
			System.out.println("4.최대마나 증강포션: " + maxMpPotionCnt + "개");
		}
		if (powerPotionCnt > 0) {
			System.out.println("5.힘 증강포션: " + powerPotionCnt + "개");
		}
		if (magicPotionCnt > 0) {
			System.out.println("6.마력 증강 포션: " + magicPotionCnt + "개");
		}

		for (int i = 0; i < skillbook.size(); i++) {//스킬북 번호는 그냥 포션 뒤에 얻는 순서대로 배당
			System.out.println((i + 7) + "." + skillbook.get(i));
		}
	}

	// 인벤토리 아이템 추가
	void addItem(int potionNum, int size) {
		if (potionNum == 1) {
			hpPotionCnt += size;
		} else if (potionNum == 2) {
			mpPotionCnt += size;
		} else if (potionNum == 3) {
			maxHpPotionCnt += size;
		} else if (potionNum == 4) {
			maxMpPotionCnt += size;
		} else if (potionNum == 5) {
			powerPotionCnt += size;
		} else if (potionNum == 6) {
			magicPotionCnt += size;
		} else {
			System.out.println("해당 번호의 포션은 존재하지 않습니다");
		}
	}

	void addItem(String skillbookName) {
		skillbook.add(skillbookName);
	}

	// 아이템 사용, 판매시 방출
	void outItem(int potionNum, int size) {
		if (potionNum == 1) {
			if (hpPotionCnt >= size) {
				hpPotionCnt -= size;
			} else {
				System.out.println("체력 회복포션이 부족합니다");
			}
		} else if (potionNum == 2) {
			if (mpPotionCnt >= size) {
				mpPotionCnt -= size;
			} else {
				System.out.println("마나 회복포션이 부족합니다");
			}
		} else if (potionNum == 3) {
			if (maxHpPotionCnt >= size) {
				maxHpPotionCnt -= size;
			} else {
				System.out.println("최대체력 증강포션이 부족합니다");
			}

		} else if (potionNum == 4) {
			if (maxMpPotionCnt >= size) {
				maxMpPotionCnt -= size;
			} else {
				System.out.println("최대마나 증강포션이 부족합니다");
			}
		} else if (potionNum == 5) {
			if (powerPotionCnt >= size) {
				powerPotionCnt -= size;
			} else {
				System.out.println("힘 증강포션이 부족합니다");
			}
		} else if (potionNum == 6) {
			if (magicPotionCnt >= size) {
				magicPotionCnt -= size;
			} else {
				System.out.println("마력 증강포션이 부족합니다");
			}
		} else {
			System.out.println("해당 번호의 포션은 존재하지 않습니다");
		}
	}

	void outItem(int itemNum) {
		if (itemNum == 1) {
			if (hpPotionCnt >= 1) {
				hpPotionCnt -= 1;
			} else {
				System.out.println("체력 포션이 부족합니다");
			}
		} else if (itemNum == 2) {
			if (mpPotionCnt >= 1) {
				mpPotionCnt -= 1;
			} else {
				System.out.println("마나 회복포션이 부족합니다");
			}
		} else if (itemNum == 3) {
			if (maxHpPotionCnt >= 1) {
				maxHpPotionCnt -= 1;
			} else {
				System.out.println("최대체력 증강포션이 부족합니다");
			}
		} else if (itemNum == 4) {
			if (maxMpPotionCnt >= 1) {
				maxMpPotionCnt -= 1;
			} else {
				System.out.println("최대마나 증강포션이 부족합니다");
			}
		} else if (itemNum == 5) {
			if (powerPotionCnt >= 1) {
				powerPotionCnt -= 1;
			} else {
				System.out.println("힘 증강포션이 부족합니다");
			}
		} else if (itemNum == 6) {
			if (magicPotionCnt >= 1) {
				magicPotionCnt -= 1;
			} else if (itemNum > 6) {//아이템 넘버에 -7해서 skillbook의 인덱스로 변환
				skillbook.remove(itemNum - 7);
			}
		} else {
			System.out.println("해당 번호의 아이템은 존재하지 않습니다");
		}
	}

	void outItem(String skillbookName) {//번호 쓸지 string 쓸지 생각해봐야 할듯
		skillbook.remove(skillbookName);
	}

}
