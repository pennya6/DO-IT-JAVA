package study12;


// �ش� ���� �޼���� �ҽ� �ڵ��� �� �Ʒ��ʿ� �ֽ��ϴ�.

public class Intset {
	private int max; // ������ �ִ� ����
	private int num; // ������ ��� ����
	private int[] set; // ���� ��ü

	// ������
	public Intset(int capacity) {
		num = 0;
		max = capacity;
		try {
			set = new int[max]; // ���� �迭 ����
		} catch (OutOfMemoryError e) { // �迭 ���� ����
			max = 0;
		}
	}

	// ������ �ִ� ����
	public int capacity() {
		return max;
	}

	// ������ ��� ����
	public int size() {
		return num;
	}

	// ���տ��� n�� �˻��մϴ�(index ��ȯ).
	public int indexOf(int n) {
		for (int i = 0; i < num; i++)
			if (set[i] == n)
				return i; // �˻� ����
		return -1; // �˻� ����
	}

	// ���տ� n�� �ִ��� ������ Ȯ���մϴ�.
	public boolean contains(int n) {
		return (indexOf(n) != -1) ? true : false;
	}

	// ���տ� n�� �߰��մϴ�.
	public boolean add(int n) {
		if (num >= max || contains(n) == true) // ���� á�ų� �̹� n�� �����մϴ�.
			return false;
		else {
			set[num++] = n; // ���� ������ �ڸ��� �߰��մϴ�.
			return true;
		}
	}

	// ���տ��� n�� �����մϴ�.
	public boolean remove(int n) {
		int idx; // n�� ����� ����� �ε���

		if (num <= 0 || (idx = indexOf(n)) == -1) // ��� �ְų� �̹� n�� �����մϴ�.
			return false;
		else {
			set[idx] = set[--num]; // ������ ��Ҹ� ������ ������ �ű�ϴ�.
			return true;
		}
	}

	// ���� s�� �����մϴ�.
	public void copyTo(Intset s) {
		int n = (s.max < num) ? s.max : num; // ������ ��� ����
		for (int i = 0; i < n; i++)
			s.set[i] = set[i];
		s.num = n;
	}

	// ���� s�� �����մϴ�.
	public void copyFrom(Intset s) {
		int n = (max < s.num) ? max : s.num; // ������ ��� ����
		for (int i = 0; i < n; i++)
			set[i] = s.set[i];
		num = n;
	}

	// ���� s�� ������ Ȯ���մϴ�.
	public boolean equalTo(Intset s) {
		if (num != s.num) // ��� ������ ���� ������
			return false; // ���յ� ���� �ʽ��ϴ�.

		for (int i = 0; i < num; i++) {
			int j = 0;
			for (; j < s.num; j++)
				if (set[i] == s.set[j])
					break;
			if (j == s.num) // set[i]�� s�� ���Ե��� �ʽ��ϴ�.
				return false;
		}
		return true;
	}

	// ���� s1�� s2�� �������� �����մϴ�.
	public void unionOf(Intset  s1, Intset s2) {
		copyFrom(s1); // ���� s1�� �����մϴ�.
		for (int i = 0; i < s2.num; i++) // ���� s2�� ��Ҹ� �߰��մϴ�.
			add(s2.set[i]);
	}

	// "{ a b c }"������ ���ڿ��� ǥ���� �ٲߴϴ�.
	public String toString() {
		StringBuffer temp = new StringBuffer("{ ");
		for (int i = 0; i < num; i++)
			temp.append(set[i] + " ");
		temp.append("}");
		return temp.toString();
	}

	// ������ ��� �ִ°�?
	public boolean isEmpty() {
		return num == 0;
	}

	// ������ ���� á�°�?
	public boolean isFull() {
		return num >= max;
	}

	// ������ ���(��� ��Ҹ� ����)
	public void clear() {
		num = 0;
	}
	// ���� s�� ������
		public boolean add(Intset s) {
			boolean flag = false;
			for (int i = 0; i < num; i++)
				if (add(set[i]) == true)
					flag = true;
			return flag;
		}

		// ���� s�� ������
		public boolean retain(Intset s) {
			boolean flag = false;
			for (int i = 0; i < num; i++)
				if (s.contains(set[i]) == false) {
					remove(set[i]);
					flag = true;
				}
			return flag;
		}

		// ���� s�� ������
		public boolean remove(Intset s) {
			boolean flag = false;
			for (int i = 0; i < num; i++)
				if (s.contains(set[i]) == true) {
					remove(set[i]);
					flag = true;
				}
			return flag;
		}
}