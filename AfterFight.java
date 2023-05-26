import java.util.Random;

public class AfterFight {

	static void Drop() {
		// 일반 1
		if (Monster.monsName == "고양이") {
	        Random random = new Random();
	        int randomNumber = random.nextInt(100); 				
	        
	        if (randomNumber < 40) {
	            MyInventory.hpPotionCnt++; 								
	            System.out.println("체력포션 드랍");
	        } 
	        if (randomNumber < 20) {
	            MyInventory.powerPotionCnt++; 						
	            System.out.println("파워포션 드랍");
	        }
	        else if (randomNumber == 1) {
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
	        int randomNumber = random.nextInt(100); 					
	        
	        if (randomNumber >= 70 && randomNumber < 90) {
	            MyInventory.hpPotionCnt++; 								
	            System.out.println("체력포션드랍");
	        } 
	        else if (randomNumber >= 90) {
	            MyInventory.powerPotionCnt++; 							
	            System.out.println("파워포션드랍");
	        }
		}
		// 일반 3
		if (Monster.monsName == "골렘") {
	        Random random = new Random();
	        int randomNumber = random.nextInt(100); 					
	        
	        if (randomNumber >= 70 && randomNumber < 90) {
	            MyInventory.hpPotionCnt++; 								
	            System.out.println("체력포션드랍");
	        } 
	        else if (randomNumber >= 90) {
	            MyInventory.powerPotionCnt++; 							
	            System.out.println("파워포션드랍");
	        }
		}
		// 일반 4
		if (Monster.monsName == "스파이더") {
	        Random random = new Random();
	        int randomNumber = random.nextInt(100); 					
	        
	        if (randomNumber >= 70 && randomNumber < 90) {
	            MyInventory.hpPotionCnt++; 								
	            System.out.println("체력포션드랍");
	        } 
	        else if (randomNumber >= 90) {
	            MyInventory.powerPotionCnt++; 							
	            System.out.println("파워포션드랍");
	        }
		}
		// 일반 5
		if (Monster.monsName == "켄타우로스") {
	        Random random = new Random();
	        int randomNumber = random.nextInt(100); 					
	        
	        if (randomNumber >= 70 && randomNumber < 90) {
	            MyInventory.hpPotionCnt++; 								
	            System.out.println("체력포션드랍");
	        } 
	        else if (randomNumber >= 90) {
	            MyInventory.powerPotionCnt++; 							
	            System.out.println("파워포션드랍");
	        }
		}
		// 일반 6
		if (Monster.monsName == "구울") {
	        Random random = new Random();
	        int randomNumber = random.nextInt(100); 					
	        
	        if (randomNumber >= 70 && randomNumber < 90) {
	            MyInventory.hpPotionCnt++; 								
	            System.out.println("체력포션드랍");
	        } 
	        else if (randomNumber >= 90) {
	            MyInventory.powerPotionCnt++; 							
	            System.out.println("파워포션드랍");
	        }
		}
		// 일반 7
		if (Monster.monsName == "네크로실") {
	        Random random = new Random();
	        int randomNumber = random.nextInt(100); 					
	        
	        if (randomNumber >= 70 && randomNumber < 90) {
	            MyInventory.hpPotionCnt++; 								
	            System.out.println("체력포션드랍");
	        } 
	        else if (randomNumber >= 90) {
	            MyInventory.powerPotionCnt++; 							
	            System.out.println("파워포션드랍");
	        }
		}
		// 일반 8
		if (Monster.monsName == "어비스마스터") {
	        Random random = new Random();
	        int randomNumber = random.nextInt(100); 					
	        
	        if (randomNumber >= 70 && randomNumber < 90) {
	            MyInventory.hpPotionCnt++; 								
	            System.out.println("체력포션드랍");
	        } 
	        else if (randomNumber >= 90) {
	            MyInventory.powerPotionCnt++; 							
	            System.out.println("파워포션드랍");
	        }
		}
		// 일반 9
		if (Monster.monsName == "블러드레이븐") {
	        Random random = new Random();
	        int randomNumber = random.nextInt(100); 					
	        
	        if (randomNumber >= 70 && randomNumber < 90) {
	            MyInventory.hpPotionCnt++; 								
	            System.out.println("체력포션드랍");
	        } 
	        else if (randomNumber >= 90) {
	            MyInventory.powerPotionCnt++; 							
	            System.out.println("파워포션드랍");
	        }
		}
		// 일반 10
		if (Monster.monsName == "다크사이클론") {
	        Random random = new Random();
	        int randomNumber = random.nextInt(100); 					
	        
	        if (randomNumber >= 70 && randomNumber < 90) {
	            MyInventory.hpPotionCnt++; 								
	            System.out.println("체력포션드랍");
	        } 
	        else if (randomNumber >= 90) {
	            MyInventory.powerPotionCnt++; 							
	            System.out.println("파워포션드랍");
	        }
		}
	}
}
