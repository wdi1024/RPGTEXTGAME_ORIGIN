import java.util.ArrayList;
import java.util.Scanner;

public class HeroSkill {
	
	static boolean hasjeonsa2Skillbook(ArrayList<String> skillbook) {
        // 예를 들어, playerInventory 리스트에 "skillbook" 문자열이 포함되어 있는지 확인합니다.
        for (String item : skillbook) {
            if (item.equals("전사 2 스킬 스킬북")) {
                return true;  // skillbook이 인벤토리에 있으면 true 반환
            }
        }
        return false;  // skillbook이 인벤토리에 없으면 false 반환
    }
	
	static boolean hasjeonsa3Skillbook(ArrayList<String> skillbook) {
        // 예를 들어, playerInventory 리스트에 "skillbook" 문자열이 포함되어 있는지 확인합니다.
        for (String item : skillbook) {
            if (item.equals("전사 3 스킬 스킬북")) {
                return true;  // skillbook이 인벤토리에 있으면 true 반환
            }
        }
        return false;  // skillbook이 인벤토리에 없으면 false 반환
    }
	
	static boolean hasjeonsa4Skillbook(ArrayList<String> skillbook) {
        // 예를 들어, playerInventory 리스트에 "skillbook" 문자열이 포함되어 있는지 확인합니다.
        for (String item : skillbook) {
            if (item.equals("전사 4 스킬 스킬북")) {
                return true;  // skillbook이 인벤토리에 있으면 true 반환
            }
        }
        return false;  // skillbook이 인벤토리에 없으면 false 반환
    }
	
	
}
