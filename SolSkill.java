import java.util.Random;

public class SolSkill {
	
	static int solskill() {
        Random random = new Random();
		int sum = 0;
        if (solClass.solNum == 1) {
			System.out.println("리차드 어택");
			int RAPercent = 40; // 리차드 어택 확률 (40%)
            int RDPercent = 30; // 리차드 힐 확률 (30%)
            int RHPercent = 30; // 리차드 강력어택 확률 (30%)
            int randomNumber = random.nextInt(100) + 1;
            
            if (randomNumber < RAPercent) {
    			System.out.println("리차드 어택");
            	sum = solClass.solPower + 10;
            }           
            else if  (RAPercent < randomNumber && randomNumber < 70) {
    			System.out.println("리차드 힐");
            	sum = solClass.solHp + 20;
            }
            else if (randomNumber > 70) {
    			System.out.println("리차드 강력어택");
            	sum = solClass.solPower + 20;
            	// 전체 용병에게 적용 
            	for (int i =0; i<heroStatus.solNum.size(); i++)
            	sum = heroStatus.solNum.get(i).solPower + 20;
            }
		}
        return sum;
        if (solClass.solNum == 2) {
//			System.out.println("리차드 어택");
//			int RAPercent = 40; // 리차드 어택 확률 (40%)
//            int RDPercent = 30; // 리차드 힐 확률 (30%)
//            int RHPercent = 30; // 리차드 강력어택 확률 (30%)
//            int randomNumber = random.nextInt(100) + 1;
//            
//            if (randomNumber < RAPercent) {
//    			System.out.println("리차드 어택");
//            	sum = solClass.solPower + 10;
//            }           
//            else if  (RAPercent < randomNumber && randomNumber < 70) {
//    			System.out.println("리차드 힐");
//            	sum = solClass.solHp + 20;
//            }
//            else if (randomNumber > 70) {
//    			System.out.println("리차드 강력어택");
//            	sum = solClass.solPower + 20;
//            	// 전체 용병에게 적용 
//            	for (int i =0; i<heroStatus.solNum.size(); i++)
//            	sum = heroStatus.solNum.get(i).solPower + 20;
//            }
//		}
//        if (solClass.solNum == 1) {
//			System.out.println("리차드 어택");
//			int RAPercent = 40; // 리차드 어택 확률 (40%)
//            int RDPercent = 30; // 리차드 힐 확률 (30%)
//            int RHPercent = 30; // 리차드 강력어택 확률 (30%)
//            int randomNumber = random.nextInt(100) + 1;
//            
//            if (randomNumber < RAPercent) {
//    			System.out.println("리차드 어택");
//            	sum = solClass.solPower + 10;
//            }           
//            else if  (RAPercent < randomNumber && randomNumber < 70) {
//    			System.out.println("리차드 힐");
//            	sum = solClass.solHp + 20;
//            }
//            else if (randomNumber > 70) {
//    			System.out.println("리차드 강력어택");
//            	sum = solClass.solPower + 20;
//            	// 전체 용병에게 적용 
//            	for (int i =0; i<heroStatus.solNum.size(); i++)
//            	sum = heroStatus.solNum.get(i).solPower + 20;
//            }
//		}
	}
}