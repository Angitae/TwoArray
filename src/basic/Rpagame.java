package basic;
import java.util.Scanner;

//가위바위보 게임 : 컴퓨터 (난수)
// -> 인간이 이길경우 게임 계속 실행
// -> 게임이 종료 된  후 승리 횟수 출력


public class Rpagame {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		
		int win = 0;// 이긴 횟수 카운트
		while(true){ // 게임 반복 실행을 위한 반복문
			// 컴퓨터의 가위바위 보 입력
			// 1 가위 2 바위 3 보
			int com = (int)(Math.random()*10%3+1); // 1~3 범위의 난수 발생
			
			
			// 게이머의 가위바위보 입력
			// -> 1~3의 범위만 입력받는다.  범위 벗어나면 재입력하게 한다.
			int input;
			while(true){
				System.out.println("1 : 가위  2: 바위 3: 보");
				System.out.println("입력하세요 : ");
				input = sc.nextInt();
				if( input <3 || input  >=1)
				break;
//				System.out.println("에러 에러 다시 입력하세요");
			}
			if( com==1)
				System.out.println("컴퓨터 : 가위");
			else if(com == 2)
				System.out.println("컴퓨터 : 바위");
			else 
				System.out.println("컴퓨터 : 보");
			
			if(input == 1)
				System.out.println("사용자 : 가위");
			else if(input == 2)
				System.out.println("사용자 : 바위");
			else 
				System.out.println("사용자 : 보");
			
			if( com==1 && input ==3 || com == 2 && input ==1 || com == 3 && input == 2)
			break;
//			System.out.println("졌습니다.");
			if(com == input)
				System.out.println("비겼습니다");
			if(com == 3 && input == 1 || com == 1 && input == 2 || com == 2 && input == 3)
//				System.out.println("이겼습니다.");
				win++;

		}
		
		System.out.println("컴퓨터에게 이긴 횟수 : " + win);
		
	}
}
