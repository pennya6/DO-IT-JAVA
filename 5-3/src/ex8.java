
public class ex8 {
		static boolean[] flag_a = new boolean[8]; // �� �࿡ ���� �̹� ��ġ�Ǿ� �ִ°�?
		static boolean[] flag_b = new boolean[15]; // ���밢���� ���� �̹� ��ġ�Ǿ� �ִ°�?
		static boolean[] flag_c = new boolean[15]; // ���밢���� ���� �̹� ��ġ�Ǿ� �ִ°�?
		static int[] pos = new int[8]; // �� ���� ���� ��ġ

		// ü���� (�� ���� ���� ��ġ)�� ���
		static void print() {
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++)
					System.out.printf("%s", j == pos[i] ? "��" : "��");
				System.out.println();
			}
			System.out.println();
		}

		// i ���� �˸��� ��ġ�� ���� ��ġ
		static void set(int i) {
			for (int j = 0; j < 8; j++) {
				if (flag_a[j] == false && // ����(j��)�� �̹�ġ
						flag_b[i + j] == false && // ���밢���� �̹�ġ
						flag_c[i - j + 7] == false) { // ���밢���� �̹�ġ
					pos[i] = j; // ���� j�࿡ ��ġ
					if (i == 7) // ��� ���� ��ġ ��ħ
						print();
					else {
						flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
						set(i + 1);
						flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
					}
				}
			}
		}

		public static void main(String[] args) {
			set(0);
		}
	}


