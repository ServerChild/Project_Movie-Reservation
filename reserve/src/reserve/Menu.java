package reserve;

import java.util.*;

public class Menu {

	public static void main(String[] args) {
		Join join = new Join();
		Reserve reserve = new Reserve();
		MovieList list = new MovieList();
		
		Scanner scanner = new Scanner(System.in);
				
		
		boolean check=false;
		ArrayList<Member> mlist = new ArrayList<Member>();
		
		while(true) {
		System.out.println("┌――――――――――――――――――― 영화예매 사이트――――――――――――");
		System.out.println("│	1. 회원가입");
		System.out.println("│	2. 로그인/로그아웃");
		System.out.println("│	3. 목록조회");
		System.out.println("│	4. 예매창");
		System.out.println("│	5. 예매내역확인");
		System.out.println("│	6. 예매취소");
		System.out.println("│	7. [로그인 되었을때] 내정보 확인 ");
		System.out.println("│	8. 종료");
		System.out.println("└――――――――――――――――――――――――――――――――――――――――――");
		System.out.println("└ 원하시는 서비스에 해당하는 번호를 입력해 주세요");
		int selectNum = scanner.nextInt();
		
		
		
		switch(selectNum) {
			case 1: //Join.java
				join.joinMember();
				continue;
			
			case 2: //Join.java
				if(check == false) {
					join.login();
					check = true;
					continue;
				} else {
					join.logout();
					continue;
				}
					
			case 3: //MovieList.java
				list.listCheck();
				continue;
			case 4: //MovieList.java
				list.reserve();
				continue;
			case 5: //Reserve.java
				reserve.checkBooking();
				continue;
			case 6: //Reserve.java
				reserve.cancelBooking();
				continue;
			case 7: //Join.java
				join.checkMyInfo();			
				continue;
			case 8: 
				System.out.println("시스템이 종료합니다.");
				System.exit(0);
				break;
				
			default:
				System.out.println("잘못누르셨습니다\n");
				continue;
		
		}
		
		
		
		
		
		
		
		
		
		}
		
	}

}
