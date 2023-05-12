package Game;
import java.util.Scanner;

public class Run {
	
	void checkRun() {
		if (SelectingDungeon.isItBossDungeon==true) {
			canRun();
		}else {
			canNotRun();
		}
	}
	void canRun() {
		Scanner in = new Scanner(System.in);
		System.out.print("홈으로 도망가시겠습니까?(네:1 아니요:2 입력) : ");
		int answer=in.nextInt();
		if (answer==1) {
			System.out.printf("\n헐레벌떡 도망치느라 hp가 1이 되었고 돈을 %d원 잃어버려습니다.",heroStaus.money*25/100);
			heroStaus.hp=1;
			heroStaus.money=heroStaus.money*75/100;
			break;//홈으로 돌아감
		}
		else {
			continue;//전투 반복문 다시 시작
		}
	}

}
