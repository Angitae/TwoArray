package basic;
import java.util.Scanner;

//���������� ���� : ��ǻ�� (����)
// -> �ΰ��� �̱��� ���� ��� ����
// -> ������ ���� ��  �� �¸� Ƚ�� ���


public class Rpagame {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		
		int win = 0;// �̱� Ƚ�� ī��Ʈ
		while(true){ // ���� �ݺ� ������ ���� �ݺ���
			// ��ǻ���� �������� �� �Է�
			// 1 ���� 2 ���� 3 ��
			int com = (int)(Math.random()*10%3+1); // 1~3 ������ ���� �߻�
			
			
			// ���̸��� ���������� �Է�
			// -> 1~3�� ������ �Է¹޴´�.  ���� ����� ���Է��ϰ� �Ѵ�.
			int input;
			while(true){
				System.out.println("1 : ����  2: ���� 3: ��");
				System.out.println("�Է��ϼ��� : ");
				input = sc.nextInt();
				if( input <3 || input  >=1)
				break;
//				System.out.println("���� ���� �ٽ� �Է��ϼ���");
			}
			if( com==1)
				System.out.println("��ǻ�� : ����");
			else if(com == 2)
				System.out.println("��ǻ�� : ����");
			else 
				System.out.println("��ǻ�� : ��");
			
			if(input == 1)
				System.out.println("����� : ����");
			else if(input == 2)
				System.out.println("����� : ����");
			else 
				System.out.println("����� : ��");
			
			if( com==1 && input ==3 || com == 2 && input ==1 || com == 3 && input == 2)
			break;
//			System.out.println("�����ϴ�.");
			if(com == input)
				System.out.println("�����ϴ�");
			if(com == 3 && input == 1 || com == 1 && input == 2 || com == 2 && input == 3)
//				System.out.println("�̰���ϴ�.");
				win++;

		}
		
		System.out.println("��ǻ�Ϳ��� �̱� Ƚ�� : " + win);
		
	}
}
