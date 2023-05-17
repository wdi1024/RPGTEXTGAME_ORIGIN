package Game;

import java.util.Scanner;
//안녕

public class Shop {
	static int selectshop;
	static Scanner in = new Scanner(System.in);
	static MyInventory k = new MyInventory();

	static boolean checkMind() {
		int checkmind;
		System.out.printf("해당 물품을 구매/판매하시겠습니까? (네:1 아니요:2 입력) : ");
		checkmind = in.nextInt();
		if (checkmind == 1)
			return true;
		else
			return false;

	}

	static void buyOrSell() {
		int buyorsell;
		int productnum, productcnt;
		while (true) {
			System.out.println("1.구매\n2.판매\n3.돌아가기");
			System.out.printf("행동 번호를 입력하세요. :");
			buyorsell = in.nextInt();
			System.out.println("=====================================");
			if (buyorsell == 3)
				break;
			else if (buyorsell == 1) {
				while (true) {
					System.out.println("0.돌아가기");
					MyInventory.printInventory();
					System.out.println("=====================================");
					System.out.printf("구매할 물품 번호를 입력하세요. :");
					productnum = in.nextInt();
					if (productnum == 0) {
						System.out.println("=====================================");
						break;
					}
					System.out.printf("구매할 물건 개수를 입력하세요. :");
					productcnt = in.nextInt();
					System.out.println("=====================================");
					if (checkMind()) {
						MyInventory.addItem(productnum, productcnt);
					}
				}
			} else if (buyorsell == 2) {
				while (true) {
					System.out.println("0.돌아가기");
					MyInventory.printInventory();
					System.out.println("=====================================");
					System.out.printf("판매할 물품 번호를 입력하세요. :");
					productnum = in.nextInt();
					if (productnum == 0) {
						System.out.println("=====================================");
						break;
					}
					System.out.printf("판매할 물건 개수를 입력하세요. :");
					productcnt = in.nextInt();
					System.out.println("=====================================");
					if (checkMind()) {
						MyInventory.outItem(productnum, productcnt);
					}
				}
			}
		}
	}

	static void StartShop() {
		while (true) {
			System.out.println("1.구매/판매\n2.인벤토리 확인\n3.돌아가기");
			System.out.printf("행동 번호를 입력하세요. :");
			selectshop = in.nextInt();
			System.out.println("=====================================");
			if (selectshop == 1)
				buyOrSell();
			else if (selectshop == 2)
				MyInventory.printInventory();
			else if (selectshop == 3)
				break;
			else
				System.out.println("장소 목록 내의 번호를 입력해주세요.");

		}
	}
}
