import java.util.ArrayList;

public class HeroSkill {

	static boolean hasjeonsa2Skillbook(ArrayList<String> skillbook) {
		for (String item : skillbook) {
			if (item.equals("파워 슬래시 스킬북")) {
				return true;
			}
		}
		return false;
	}

	static boolean hasjeonsa3Skillbook(ArrayList<String> skillbook) {
		for (String item : skillbook) {
			if (item.equals("사자의 노래 스킬북")) {
				return true;
			}
		}
		return false;
	}

	static boolean hasjeonsa4Skillbook() {
		if (heroStatus.level >= 15)
			return true;
		else
			return false;
	}

	static boolean hasgungsu2Skillbook(ArrayList<String> skillbook) {
		for (String item : skillbook) {
			if (item.equals("더블 샷 스킬북")) {
				return true;
			}
		}
		return false;
	}

	static boolean hasgungsu3Skillbook(ArrayList<String> skillbook) {
		for (String item : skillbook) {
			if (item.equals("화살비 스킬북")) {
				return true;
			}
		}
		return false;
	}

	static boolean hasgungsu4Skillbook() {
		if (heroStatus.level >= 15)
			return true;
		else
			return false;
	}

	static boolean hasmagician2Skillbook(ArrayList<String> skillbook) {
		for (String item : skillbook) {
			if (item.equals("기원참 스킬북")) {
				return true;
			}
		}
		return false;
	}

	static boolean hasmagician3Skillbook(ArrayList<String> skillbook) {
		for (String item : skillbook) {
			if (item.equals("파괴광선 스킬북")) {
				return true;
			}
		}
		return false;
	}

	static boolean hasmagician4Skillbook() {
		if (heroStatus.level >= 15)
			return true;
		else
			return false;
	}

	static boolean hasthief2Skillbook(ArrayList<String> skillbook) {
		for (String item : skillbook) {
			if (item.equals("새비지 블로우 스킬북")) {
				return true;
			}
		}
		return false;
	}

	static boolean hasthief3Skillbook(ArrayList<String> skillbook) {
		for (String item : skillbook) {
			if (item.equals("암살 스킬북")) {
				return true;
			}
		}
		return false;
	}

	static boolean hasthief4Skillbook() {
		if (heroStatus.level >= 15)
			return true;
		else
			return false;
	}

}
