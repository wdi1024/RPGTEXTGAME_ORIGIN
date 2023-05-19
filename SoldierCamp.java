import java.util.ArrayList;
import java.util.Scanner;

public class SoldierCamp {
	static ArrayList<solClass> unhiredSoldier = new ArrayList<solClass>();
	static ArrayList<solClass> waitingSoldier = new ArrayList<solClass>();
	static int waitingCnt = waitingSoldier.size(),
			hiredSoldierCnt = heroStatus.hiredSoldierCnt + SoldierCamp.waitingCnt;
	static Scanner sc = new Scanner(System.in);

	static void checkUnhiredSoldier() {
		System.out.println("고용되지 않은 용병 목록");
		System.out.println("-------------------------------------------");
		for (int i = 0; i < unhiredSoldier.size(); i++)
			System.out.println(i + ". " + unhiredSoldier.get(i).solName);
	}

	static void checkHiredSoldier() {
		System.out.println("동행중인 용병 목록");
		System.out.println("-------------------------------------------");
		for (int i = 0; i < heroStatus.solNum.size(); i++)
			System.out.println(i + ". " + heroStatus.solNum.get(i).solName);
		System.out.println("=====================================");
		for (int i = 0; i < waitingSoldier.size(); i++)
			System.out.println(waitingSoldier.get(i).solName);
	}

	static void checkWaitingSoldier() {
		System.out.println("대기중인 용병 목록");
		System.out.println("-------------------------------------------");
		for (int i = 0; i < waitingSoldier.size(); i++)
			System.out.println(waitingSoldier.get(i).solName);
		System.out.println("=====================================");
	}

	static void StartSoldierCamp() {
		while (true) {
			int sel;
			System.out.println("1.용병고용 \n2.용병대기소 \n3.용병해고 \n4.동행중인 용병확인\n5.대기중인 용병확인\n6.돌아가기");
			System.out.printf("행동 번호를 입력하세요. : ");
			sel = sc.nextInt();
			System.out.println("=====================================");

			if (sel == 1)
				while (true) {
					checkUnhiredSoldier();
					System.out.println(unhiredSoldier.size() + ". 돌아가기");
					System.out.printf("용병 번호를 입력하세요. : ");
					int hs = sc.nextInt();
					System.out.println("=====================================");
					if (hs == unhiredSoldier.size())
						break;
					else if (hs < unhiredSoldier.size()) {
						if (heroStatus.hiredSoldierCnt <= 5) {
							System.out.println(unhiredSoldier.get(hs) + "을(를) 고용했습니다.");
							heroStatus.solNum.add(unhiredSoldier.get(hs));
							unhiredSoldier.remove(hs);
							System.out.println("=====================================");
						} else {
							System.out.println("동행 가능한 최대 인원수입니다.\n용병대기소에 용병을 대기시키거나 해고하십시오.");
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
								System.out.println(heroStatus.solNum.get(wss) + "을(를) 대기시켰습니다.");
								System.out.println("=====================================");
								waitingSoldier.add(heroStatus.solNum.get(wss));
								heroStatus.solNum.remove(heroStatus.solNum.get(wss));
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
								System.out.println(waitingSoldier.get(wss) + "을(를) 데려왔습니다.");
								System.out.println("=====================================");
								heroStatus.solNum.add(waitingSoldier.get(wss));
								waitingSoldier.remove(waitingSoldier.get(wss));
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
					System.out.printf("해고할 용병 번호를 입력하세요. : ");
					int fs = sc.nextInt();
					if (fs < heroStatus.solNum.size()) {
						System.out.println(heroStatus.solNum.get(fs) + "을(를) 해고했습니다.");
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
				break;
			} else {
				System.out.println("행동 목록 내의 번호를 입력하세요.");
				System.out.println("=====================================");
			}
		}
	}
}
