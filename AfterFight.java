import java.util.Random;

public class AfterFight {

	static void Drop() {
		if (Monster.monsName == "고양이") {
	        Random random = new Random();
	        int randomNumber = random.nextInt(100); 					// 0부터 99까지의 난수 생성
	        
	        if (randomNumber >= 1 && randomNumber < 90) {
	            MyInventory.hpPotionCnt++; 								// HP 포션 드롭
	            System.out.println("체력포션드랍");
	        } 
	        else if (randomNumber >= 90) {
	            MyInventory.powerPotionCnt++; 							// Power 포션 드롭
	            System.out.println("파워포션드랍");
	        }
		}
	}
}
