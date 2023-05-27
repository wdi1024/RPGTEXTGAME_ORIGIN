import java.util.Scanner;

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
					System.out.println("1.체력 회복포션 (10원)");
					System.out.println("2.마나 회복포션 (10원)");
					System.out.println("3.최대체력 증강포션 (100원)");
					System.out.println("4.최대마나 증강포션: (100원)");
					System.out.println("5.힘 증강포션 (50원)");
					System.out.println("6.마력 증강 포션 (50원)");
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
					if (productcnt == 0)
						continue;
					if (productnum == 1) {
						System.out.printf("가격은 %d입니다.\n", 10 * productcnt);
						if (checkMind()) {
							if (heroStatus.money >= 10 * productcnt) {
								MyInventory.addItem(productnum, productcnt);
								heroStatus.money -= (10 * productcnt);
							} else
								System.out.println("돈이 모자랍니다.");
						}
					} else if (productnum == 2) {
						System.out.printf("가격은 %d입니다.\n", 10 * productcnt);
						if (checkMind()) {
							if (heroStatus.money >= 10 * productcnt) {
								MyInventory.addItem(productnum, productcnt);
								heroStatus.money -= (10 * productcnt);
							} else
								System.out.println("돈이 모자랍니다.");
						}
					} else if (productnum == 3) {
						System.out.printf("가격은 %d입니다.\n", 100 * productcnt);
						if (checkMind()) {
							if (heroStatus.money >= 100 * productcnt) {
								MyInventory.addItem(productnum, productcnt);
								heroStatus.money -= (100 * productcnt);
							} else
								System.out.println("돈이 모자랍니다.");
						}
					} else if (productnum == 4) {
						System.out.printf("가격은 %d입니다.\n", 100 * productcnt);
						if (checkMind()) {
							if (heroStatus.money >= 100 * productcnt) {
								MyInventory.addItem(productnum, productcnt);
								heroStatus.money -= (100 * productcnt);
							} else
								System.out.println("돈이 모자랍니다.");
						}
					} else if (productnum == 5) {
						System.out.printf("가격은 %d입니다.\n", 50 * productcnt);
						if (checkMind()) {
							if (heroStatus.money >= 50 * productcnt) {
								MyInventory.addItem(productnum, productcnt);
								heroStatus.money -= (50 * productcnt);
							} else
								System.out.println("돈이 모자랍니다.");
						}
					} else if (productnum == 6) {
						System.out.printf("가격은 %d입니다.\n", 50 * productcnt);
						if (checkMind()) {
							if (heroStatus.money >= 50 * productcnt) {
								MyInventory.addItem(productnum, productcnt);
								heroStatus.money -= (50 * productcnt);
							} else
								System.out.println("돈이 모자랍니다.");
						}
					} else {
						System.out.println("목록 내의 번호를 입력해주십시오.");
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
					if (productcnt == 0)
						continue;
					if (productnum == 1) {
						System.out.printf("가격은 %d입니다.\n", 5 * productcnt);
						if (checkMind()) {
							MyInventory.outItem(productnum, productcnt);
							heroStatus.money += 5 * productcnt;
						}
					} else if (productnum == 2) {
						System.out.printf("가격은 %d입니다.\n", 5 * productcnt);
						if (checkMind()) {
							MyInventory.outItem(productnum, productcnt);
							heroStatus.money += 5 * productcnt;
						}
					} else if (productnum == 3) {
						System.out.printf("가격은 %d입니다.\n", 50 * productcnt);
						if (checkMind()) {
							MyInventory.outItem(productnum, productcnt);
							heroStatus.money += 5 * productcnt;
						}
					} else if (productnum == 4) {
						System.out.printf("가격은 %d입니다.\n", 50 * productcnt);
						if (checkMind()) {
							MyInventory.outItem(productnum, productcnt);
							heroStatus.money += 5 * productcnt;
						}
					} else if (productnum == 5) {
						System.out.printf("가격은 %d입니다.\n", 25 * productcnt);
						if (checkMind()) {
							MyInventory.outItem(productnum, productcnt);
							heroStatus.money += 5 * productcnt;
						}
					} else if (productnum == 6) {
						System.out.printf("가격은 %d입니다.\n", 25 * productcnt);
						if (checkMind()) {
							MyInventory.outItem(productnum, productcnt);
							heroStatus.money += 5 * productcnt;
						}
					} else if (productnum > 6) {
						System.out.printf("가격은 %d입니다.\n", 100);
						if (checkMind()) {
							MyInventory.outItem(productnum);
							heroStatus.money += 100;
						}
					}
				}
			}
		}
	}

	static void StartShop() throws InterruptedException {
		while (true) {
			System.out.println("1.구매/판매\n2.인벤토리 확인\n3.돌아가기");
			System.out.printf("행동 번호를 입력하세요. :");
			selectshop = in.nextInt();
			System.out.println("=====================================");
			if (selectshop == 1)
				buyOrSell();
			else if (selectshop == 2) {
				MyInventory.printInventory();
				System.out.println("=====================================");
			} else if (selectshop == 3) {
				System.out.println("왔던 곳으로 돌아갑니다.");
				System.out.println("=====================================");
				for (int i = 0; i < 3; i++) {
					Thread.sleep(500);
					System.out.print(".");
				}
				System.out.println("!\n마을에 도착했습니다.");
				System.out.println("=====================================");
				break;
			} else
				System.out.println("장소 목록 내의 번호를 입력해주세요.");

		}
	}
}
