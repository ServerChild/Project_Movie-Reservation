package reserve;

import java.util.*;

public class Menu {

	public static void main(String[] args) {
		
		// 영화 : "겨울왕국" , "코코", "아바타", "매트릭스"
		// 지역 : "서울", "경기", "인천"
		// 극장 : "CGV", "메가박스", "롯데시네마", "씨네큐"
		// 시간 : "9:00", "12:30". "14:30", "19:00", "23:30"
		// 좌석 : ABCD, 12345

		String[] movies  = {"겨울왕국", "코코", "아바타", "매트릭스"};
		String[] location = {"서울", "경기", "인천"};
		String[] distributor = {"CGV", "메가박스", "롯데시네마"};
		String[] time = {"9:00", "12:30","14:30","19:00","23:30"};
		String[] seat = {"A1","A2","A3","A4","A5","B1","B2","B3","B4","B5", "C1","C2","C3","C4","C5","D1","D2","D3","D4","D5"};
		
		while(true) {
			System.out.println("┌――――――――――――――――――― 영화 예매 사이트―――――――――――――――――――┑");
			System.out.println("│		1. 회원가입							    	│");
			System.out.println("│		2. 로그인 / 로그아웃							│");
			System.out.println("│		3. 목록 조회							 	 	│");
			System.out.println("│		4. 예매 창							 		│");
			System.out.println("│		5. 예매 내역 확인							 	│");
			System.out.println("│		6. 예매 취소							 	 	│");
			System.out.println("│		7. [로그인 되었을 때] 내정보 확인				 	│");
			System.out.println("│		8. 종료							 		 	│");
			System.out.println("└―――――――――――――――――――――――――――――――――――――――――――――――――――┚");
			System.out.println("  └ 원하시는 서비스에 해당하는 번호를 입력해 주세요");
		}
		
	}

}
