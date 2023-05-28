import java.util.ArrayList;
import java.util.Scanner;

public class SoldierCamp {
	static ArrayList<solClass> unhiredSoldier = new ArrayList<solClass>();
	static ArrayList<solClass> waitingSoldier = new ArrayList<solClass>();
	static Scanner sc = new Scanner(System.in);

	static void checkUnhiredSoldier() {
		System.out.println("고용되지 않은 용병 목록");
		System.out.println("-------------------------------------------");
		for (int i = 0; i < unhiredSoldier.size(); i++)
			System.out.println(i + ". " + unhiredSoldier.get(i).solName);
	}

	static void checkHiredSoldier() {
		System.out.println("대기 중인 용병 목록");
		System.out.println("-------------------------------------------");
		for (int i = 0; i < waitingSoldier.size(); i++)
			System.out.println(waitingSoldier.get(i).solName);
		System.out.println("=====================================");
		System.out.println("동행 중인 용병 목록");
		System.out.println("-------------------------------------------");
		for (int i = 0; i < heroStatus.solNum.size(); i++)
			System.out.println(i + ". " + heroStatus.solNum.get(i).solName);
		System.out.println("=====================================");
	}

	static void checkWaitingSoldier() {
		System.out.println("대기중인 용병 목록");
		System.out.println("-------------------------------------------");
		for (int i = 0; i < waitingSoldier.size(); i++)
			System.out.println(i + ". " + waitingSoldier.get(i).solName);
		System.out.println("=====================================");
	}

	static void StartSoldierCamp() throws InterruptedException {
		while (true) {
			int sel, price = 100;
			System.out.println("1.용병고용 \n2.용병대기소 \n3.용병해고 \n4.동행중인 용병확인\n5.대기중인 용병확인\n6.돌아가기");
			System.out.printf("행동 번호를 입력하세요. : ");
			sel = sc.nextInt();
			System.out.println("=====================================");

			if (sel == 1)
				while (true) {
					checkUnhiredSoldier();
					System.out.println(unhiredSoldier.size() + ". 돌아가기");
					System.out.println("하급 용병은 100, 중급 용병은 500, 상급 용병은 1000을 지불하면 고용할 수 있습니다.");
					System.out.printf("용병 번호를 입력하세요. : ");
					int hs = sc.nextInt();
					System.out.println("=====================================");
					if (hs == unhiredSoldier.size())
						break;
					else if (hs < unhiredSoldier.size()) {
						if (unhiredSoldier.get(hs).solName.charAt(0) == '하')
							price = 100;
						else if (unhiredSoldier.get(hs).solName.charAt(0) == '중')
							price = 500;
						else if (unhiredSoldier.get(hs).solName.charAt(0) == '상')
							price = 1000;

						if (heroStatus.money >= price) {
							if (heroStatus.solNum.size() < 5) {
								System.out.println(unhiredSoldier.get(hs).solName + "을(를) 고용했습니다.");
								heroStatus.solNum.add(new solClass(unhiredSoldier.get(hs).solNum));
								unhiredSoldier.remove(hs);
								heroStatus.money -= price;
								System.out.println("=====================================");
							} else {
								System.out.println("동행 가능한 최대 인원수입니다.\n용병대기소에 용병을 대기시키거나 해고하십시오.");
								System.out.println("=====================================");
							}
						} else {
							System.out.println("보유 금액이 모자랍니다.");
							System.out.println("=====================================");
						}
					} else {
						System.out.println("목록 내의 번호를 입력해주세요.");
						System.out.println("=====================================");
					}
				}
			else if (sel == 2)
				while (true) {
					int ws;
					System.out.println("1.용병 맡기기\n2.용병 데려오기 \n3.돌아가기");
					System.out.printf("행동 번호를 입력하세요. : ");
					ws = sc.nextInt();
					System.out.println("=====================================");
					if (ws == 1)
						while (true) {
							checkHiredSoldier();
							System.out.println(heroStatus.solNum.size() + ". 돌아가기");
							System.out.printf("맡길 용병 번호를 입력하세요. : ");
							int wss = sc.nextInt();
							System.out.println("=====================================");
							if (wss < heroStatus.solNum.size() && waitingSoldier.size() < 5) {
								System.out.println(heroStatus.solNum.get(wss).solName + "을(를) 대기시켰습니다.");
								System.out.println("=====================================");
								waitingSoldier.add(heroStatus.solNum.get(wss));
								heroStatus.solNum.remove(heroStatus.solNum.get(wss));
							} else if (wss < heroStatus.solNum.size() && waitingSoldier.size() >= 5) {
								System.out.println("대기 용병 수가 최대입니다.");
							} else if (wss == heroStatus.solNum.size()) {
								System.out.println("이전 단계로 돌아갑니다.");
								System.out.println("=====================================");
								break;
							} else {
								System.out.println("목록 내의 번호를 입력하세요.");
								System.out.println("=====================================");
							}
						}
					else if (ws == 2)
						while (true) {
							checkWaitingSoldier();
							System.out.println(waitingSoldier.size() + ". 돌아가기");
							System.out.printf("데려갈 용병 번호를 입력하세요. : ");
							int wss = sc.nextInt();
							System.out.println("=====================================");
							if (wss < waitingSoldier.size() && heroStatus.solNum.size() < 5) {
								System.out.println(waitingSoldier.get(wss).solName + "을(를) 데려왔습니다.");
								System.out.println("=====================================");
								heroStatus.solNum.add(new solClass(waitingSoldier.get(wss).solNum));
								waitingSoldier.remove(waitingSoldier.get(wss));
							} else if (wss < waitingSoldier.size() && heroStatus.solNum.size() >= 5) {
								System.out.println("동행 용병 수가 최대입니다.");
							} else if (wss == waitingSoldier.size()) {
								System.out.println("이전 단계로 돌아갑니다.");
								System.out.println("=====================================");
								break;
							} else {
								System.out.println("목록 내의 번호를 입력하세요.");
								System.out.println("=====================================");
							}
						}
					else if (ws == 3) {
						System.out.println("이전 단계로 돌아갑니다.");
						System.out.println("=====================================");
						break;
					} else {
						System.out.println("목록 내의 번호를 입력하세요.");
						System.out.println("=====================================");
					}

				}
			else if (sel == 3) {
				while (true) {
					checkHiredSoldier();
					System.out.println(heroStatus.solNum.size() + ". 돌아가기");
					System.out.println("용병 해고 시 용병 고용비를 환불해드리지 않습니다.");
					System.out.printf("해고할 용병 번호를 입력하세요. : ");
					int fs = sc.nextInt();
					if (fs < heroStatus.solNum.size()) {
						System.out.println(heroStatus.solNum.get(fs).solName + "을(를) 해고했습니다.");
						System.out.println("=====================================");
						unhiredSoldier.add(heroStatus.solNum.get(fs));
						heroStatus.solNum.remove(heroStatus.solNum.get(fs));
					} else if (fs == heroStatus.solNum.size()) {
						System.out.println("이전 단계로 돌아갑니다.");
						System.out.println("=====================================");
						break;
					} else {
						System.out.println("목록 내의 번호를 입력하세요.");
						System.out.println("=====================================");
					}
				}
			} else if (sel == 4)
				checkHiredSoldier();
			else if (sel == 5)
				checkWaitingSoldier();
			else if (sel == 6) {
				System.out.println("왔던 곳으로 돌아갑니다.");
				System.out.println("=====================================");
				for (int i = 0; i < 3; i++) {
					Thread.sleep(500);
					System.out.print(".");
				}
				System.out.println("마을에 도착했습니다.");
				System.out.println("=====================================");
				break;
			} else {
				System.out.println("행동 목록 내의 번호를 입력하세요.");
				System.out.println("=====================================");
			}
		}
	}
}
