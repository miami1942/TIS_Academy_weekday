package DAY09;

public class Snail {

	private int[ ][ ] snailArray = new int[5][5];// �迭 ����

	public Snail() { 
	}

	public void execute() {
		int limit = 5;
		int row = 0;// ��
		int col = -1;// ��
		int direction = 1;
		int number = 1;
		while (true) {
			if (limit == 0) {
				break;// 5�� 5���� ��� ä������ break;
			}
			for (int i = 0; i < limit; i++) {
				col += direction;
				snailArray[row][col] = number;
				number++;
			}
			
			limit--;

			for (int j = 0; j < limit; j++) {
				row += direction;
				snailArray[row][col] = number;
				number++;
			}
			direction *= -1;
		}
	}

	public void print() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(snailArray[i][j]+"\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {//����
		Snail snailArray = new Snail();
		snailArray.execute();
		snailArray.print();
	}
}

/*5��5�� 2���� �迭�� �����ؼ� �Ʒ��� ���� ���� ������ �� ����ϼ���

 1  2   3   4  5
16 17 18 19  6
15 24 25 20  7
14 23 22 21  8
13 12 11 10  9 

(0,0) (0,1) (0,2) (0,3) (0,4)
(1,0) (1,1) (1,2) (1,3) (1,4)
(2,0) (2,1) (2,2) (2,3) (2,4)
(3,0) (3,1) (3,2) (3,3) (3,4)
(4,0) (4,1) (4,2) (4,3) (4,4)
3+1len


1  2  3  4  5  6
20               7
19	      8
18	      9
17	      10
16,15,14,13,12,11*/