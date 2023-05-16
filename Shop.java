package Game;

import java.util.Scanner;

public class Shop {
	static int selectshop;
	static Scanner in = new Scanner(System.in);

	static boolean checkMind() {
		String checkmind;
		System.out.printf("해당 물품을 구매/판매하시겠습니까? y/n");
		checkmind = in.next();
		if (checkmind.equals("y"))
			return true;
		else
			return false;

	}

	static void buyOrSell() {
		int buyorsell;
		int productnum;
		while (true) {
			System.out.println("1.구매\n2.판매\n3.돌아가기");
			System.out.printf("행동 번호를 입력하세요. :");
			buyorsell = in.nextInt();
			System.out.println("=====================================");
			if (buyorsell == 3)
				break;
			while (true) {
				System.out.println("1. \n2. \n3.\n4.\n5.\n6. \n7. \n8. \n9. \n10. \n");
				System.out.printf("구매/판매할 물품 번호를 입력하세요. :");
				productnum = in.nextInt();
				if (productnum == 10)
					break;
				if (checkMind()) {
					if (buyorsell == 1)
						MyInventory.addItem(productnum);
					else
						MyInventory.outItem(productnum);

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
			else if (selectshop == 2) {
			}
			// MyInventory.printInventory();
			else if (selectshop == 3)
				break;
			else
				System.out.println("장소 목록 내의 번호를 입력해주세요.");

		}
	}
}
