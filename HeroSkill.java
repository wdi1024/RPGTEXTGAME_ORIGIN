import java.util.ArrayList;

public class HeroSkill {

	static boolean hasjeonsa2Skillbook(ArrayList<String> skillbook) {
		// 예를 들어, playerInventory 리스트에 "skillbook" 문자열이 포함되어 있는지 확인합니다.
		for (String item : skillbook) {
			if (item.equals("파워 슬래시 스킬북")) {
				return true; // skillbook이 인벤토리에 있으면 true 반환
			}
		}
		return false; // skillbook이 인벤토리에 없으면 false 반환
	}

	static boolean hasjeonsa3Skillbook(ArrayList<String> skillbook) {
		// 예를 들어, playerInventory 리스트에 "skillbook" 문자열이 포함되어 있는지 확인합니다.
		for (String item : skillbook) {
			if (item.equals("사자의 노래 스킬북")) {
				return true; // skillbook이 인벤토리에 있으면 true 반환
			}
		}
		return false; // skillbook이 인벤토리에 없으면 false 반환
	}

	static boolean hasjeonsa4Skillbook() {
		if (heroStatus.level >= 40)
			return true;
		else
			return false;
	}

	static boolean hasgungsu2Skillbook(ArrayList<String> skillbook) {
		// 예를 들어, playerInventory 리스트에 "skillbook" 문자열이 포함되어 있는지 확인합니다.
		for (String item : skillbook) {
			if (item.equals("더블 샷 스킬북")) {
				return true; // skillbook이 인벤토리에 있으면 true 반환
			}
		}
		return false; // skillbook이 인벤토리에 없으면 false 반환
	}

	static boolean hasgungsu3Skillbook(ArrayList<String> skillbook) {
		// 예를 들어, playerInventory 리스트에 "skillbook" 문자열이 포함되어 있는지 확인합니다.
		for (String item : skillbook) {
			if (item.equals("화살비 스킬북")) {
				return true; // skillbook이 인벤토리에 있으면 true 반환
			}
		}
		return false; // skillbook이 인벤토리에 없으면 false 반환
	}

	static boolean hasgungsu4Skillbook() {
		if (heroStatus.level >= 40)
			return true;
		else
			return false;
	}

	static boolean hasmagician2Skillbook(ArrayList<String> skillbook) {
		// 예를 들어, playerInventory 리스트에 "skillbook" 문자열이 포함되어 있는지 확인합니다.
		for (String item : skillbook) {
			if (item.equals("기원참 스킬북")) {
				return true; // skillbook이 인벤토리에 있으면 true 반환
			}
		}
		return false; // skillbook이 인벤토리에 없으면 false 반환
	}

	static boolean hasmagician3Skillbook(ArrayList<String> skillbook) {
		// 예를 들어, playerInventory 리스트에 "skillbook" 문자열이 포함되어 있는지 확인합니다.
		for (String item : skillbook) {
			if (item.equals("파괴광선 스킬북")) {
				return true; // skillbook이 인벤토리에 있으면 true 반환
			}
		}
		return false; // skillbook이 인벤토리에 없으면 false 반환
	}

	static boolean hasmagician4Skillbook() {
		if (heroStatus.level >= 40)
			return true;
		else
			return false;
	}

	static boolean hasthief2Skillbook(ArrayList<String> skillbook) {
		// 예를 들어, playerInventory 리스트에 "skillbook" 문자열이 포함되어 있는지 확인합니다.
		for (String item : skillbook) {
			if (item.equals("새비지 블로우 스킬북")) {
				return true; // skillbook이 인벤토리에 있으면 true 반환
			}
		}
		return false; // skillbook이 인벤토리에 없으면 false 반환
	}

	static boolean hasthief3Skillbook(ArrayList<String> skillbook) {
		// 예를 들어, playerInventory 리스트에 "skillbook" 문자열이 포함되어 있는지 확인합니다.
		for (String item : skillbook) {
			if (item.equals("암살 스킬북")) {
				return true; // skillbook이 인벤토리에 있으면 true 반환
			}
		}
		return false; // skillbook이 인벤토리에 없으면 false 반환
	}

	static boolean hasthief4Skillbook() {
		if (heroStatus.level >= 40)
			return true;
		else
			return false;
	}

}
