package basic;

public class TwoArray {

	
	public static void main(String[] args) {
		
		int [][] b =  {{10, 20 ,30}, {40, 50 ,60 }};
		
		for(int[] array : b){ // ���� �ѱ�� ������ �迭 ǥ���ϱ�
			for(int value: array){
				System.out.print(value+"  ");
			}
			System.out.println("");
		}
		
		// �������迭�� �����迭
		// -> ���� ����� ������ �ٸ��� ������ �� �ִ� �迭 
		int [][] c = new int[3][]; // �����迭
		
		c[0] = new int[3];
		c[1] = new int[2];
		c[2] = new int[4];
		
		c[0][0] = 10;
		c[0][1] = 20;
		c[0][2] = 30;
		c[1][0] = 40;
		c[1][1] = 50;
		c[2][0] = 60;
		c[2][1] = 70;
		c[2][2] = 80;
		c[2][3] = 90;
		
		for(int i  = 0;  i< c.length; i++){
			for(int j= 0;  j < c[i].length; j++){
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
					/*	10   20   30
							40   50  
							60   70   80   90*/
	}
}
