package reserve;

import java.util.*;

public class MovieList {
	Scanner scanner = new Scanner(System.in);
	
	// + 3. 목록조회
	public void listCheck() {
		System.out.println("3.목록조회");
		System.out.println("  a.영화");
		System.out.println("  b.지역[3~4]");
		System.out.println("  c.극장[3~4]");
		System.out.println("  d.예매 가능 확인");
	}
	
	// +4. 예매창
	public void reserve() {
		System.out.println("4. 예매창");
		System.out.println("  a.날짜");
		System.out.println("  b.상영관 / 시간");
		System.out.println("  c.좌석");
		System.out.println("  d.예매성공");
	}
}
