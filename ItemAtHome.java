package Game;

import java.util.Scanner;

public class ItemAtHome {
	static int selectItem;
	static Scanner in = new Scanner(System.in);
	static MyInventory k = new MyInventory();

	static void StartItemAtHome() {
		while (true) {
			System.out.println("0.돌아가기");
			MyInventory.printInventory();
			System.out.println("=====================================");
			System.out.printf("사용할 아이템 번호를 입력하세요. :");
			selectItem = in.nextInt();
			if (selectItem == 0)
				break;
			else if (selectItem <= (6 + MyInventory.skillbook.size()))
				MyInventory.outItem(selectItem);
			else
				System.out.println("목록 내의 번호를 입력해주세요.");
		}
	}

}
