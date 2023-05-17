import java.util.Scanner;

public class ItemAtFight {
	static int selectItem;
	static Scanner in = new Scanner(System.in);
	static MyInventory k = new MyInventory();

	static void StartItemAtFight() {
		while (true) {
			System.out.println("0.돌아가기");
			MyInventory.printInventory();
			System.out.println("=====================================");
			System.out.printf("사용할 아이템 번호를 입력하세요. :");
			selectItem = in.nextInt();
			if (selectItem == 0)
				break;
			else if (selectItem <= (6 + MyInventory.skillbook.size())) {//아이템 사용시 몬스터 공격 추가
				if (selectItem>6) {
					HeroSkill.skillList.add(MyInventory.skillbook.get(selectItem-7));//임시
					System.out.println("스킬 "+MyInventory.skillbook.get(selectItem-7)+"를 획득했습니다.");
					MyInventory.outItem(selectItem);
				}else if (selectItem==1) {
					if (MyInventory.hpPotionCnt>0) {
						System.out.println("체력이 50회복 되었습니다");
						heroStatus.hp+=50;
						if (heroStatus.hp>heroStatus.maxHp) {
							heroStatus.hp=heroStatus.maxHp;
						}
						MyInventory.outItem(selectItem);
					}else {
						System.out.println("체력 회복포션 수가 부족합니다");
					}
					
				}else if (selectItem==2) {
					if (MyInventory.mpPotionCnt>0) {
						System.out.println("마나가 50회복 되었습니다");
						heroStatus.mp+=50;
						if (heroStatus.mp>heroStatus.maxMp) {
							heroStatus.mp=heroStatus.maxMp;
						}
						MyInventory.outItem(selectItem);
					}else {
						System.out.println("마나 회복포션 수가 부족합니다");
					}
				}else if (selectItem==3) {
					if (MyInventory.maxHpPotionCnt>0) {
						System.out.println("최대체력이 10증강 되었습니다");
						heroStatus.maxHp+=10;
						MyInventory.outItem(selectItem);
					}else {
						System.out.println("최대체력 증강포션 수가 부족합니다");
					}
				}else if (selectItem==4) {
					if (MyInventory.maxMpPotionCnt>0) {
						System.out.println("최대마나가 10증강 되었습니다");
						heroStatus.maxMp+=10;
						MyInventory.outItem(selectItem);
					}else {
						System.out.println("최대마나 증강포션 수가 부족합니다");
					}
				}else if (selectItem==5) {
					if (MyInventory.powerPotionCnt>0) {
						System.out.println("힘이 5증강 되었습니다");
						heroStatus.power+=5;
						MyInventory.outItem(selectItem);
					}else {
						System.out.println("힘 증강포션 수가 부족합니다");
					}
				}else if (selectItem==6) {
					if (MyInventory.magicPotionCnt>0) {
						System.out.println("마력이 5증강 되었습니다");
						heroStatus.magic+=5;
						MyInventory.outItem(selectItem);
					}else {
						System.out.println("마력 증강포션 수가 부족합니다");
					}
				}
				
			}
				
			else
				System.out.println("목록 내의 번호를 입력해주세요.");
		}
	}

}



