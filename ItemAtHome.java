package Game;

import java.util.Scanner;

public class ItemAtHome {
	static int selectItem;
	static Scanner in = new Scanner(System.in);

	static void StartItemAtHome() {
		while (true) {
			MyInventory.printInventory();
			System.out.println("=====================================");
			System.out.printf("사용할 아이템 번호를 입력하세요. :");
			selectItem = in.nextInt();
			MyInventory.outItem(selectItem);
			if (selectItem == 0)
				break;
		}
	}

}
