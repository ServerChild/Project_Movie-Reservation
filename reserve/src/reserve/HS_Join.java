package reserve;

import java.util.*;

// 회원가입시 비밀번호 확인
// 로그인시 비밀번호 3회 제한!!!!!
// 성별 1.남, 2.여 선택으로


public class HS_Join {
	Scanner scanner = new Scanner(System.in);
	ArrayList<HS_Member>mlist = new ArrayList<HS_Member>();
	boolean check=false;

	//+ 1. 회원가입
	public void joinMember() {
		System.out.println("ID를 입력해 주세요 : ");
		String id = scanner.next();
		System.out.println("비밀번호를 입력해 주세요 : ");
		String password = scanner.next();
		System.out.println("이름 입력해 주세요 : ");
		String name = scanner.next();

		mlist.add(new HS_Member(id, password, name));

		System.out.println("지역 입력해 주세요 : 1.서울 / 2.경기 / 3.인천");
		String region = scanner.next();
		System.out.println("가입이 완료되었습니다.\n");
		System.out.println(id + "님 환영합니다.\n");
		check = false;
	}

	//+ 2-a. 로그인
	public void login() {
		System.out.println("ID 입력해 주세요 : ");
		String getId = scanner.next();
		System.out.println("비밀번호를 입력해 주세요 : ");
		String getPassword = scanner.next();

		for(int i=0 ; i <3 ; i ++) {
			if(mlist.get(i).getId().equals(getId)) {
				if(mlist.get(i).getPassword().equals(getPassword)) {
					System.out.println("로그인 성공");
					check= true;
					return;
				} else {
					System.out.println("로그인에 실패했습니다.");
				}
			}

		}
	}


	//+ 2-b. 로그아웃
	public void logout() {
		System.out.println("로그아웃 하시겠습니까? y / n ");
		String answer = scanner.next();
		if(answer =="y") {
			System.out.println("로그아웃 되었습니다.");
			check=false;
			//continue;
		} else if(answer =="n") {
			System.out.println("로그아웃을 취소합니다. 메뉴로 돌아갑니다");

		}
	}

	//+7 [로그인 되었을 때] 내정보 확인하기
	public void checkMyInfo() {
		System.out.println("  a.아이디");
		System.out.println("  b.비밀번호");
		System.out.println("  c.이름");
	}
}
