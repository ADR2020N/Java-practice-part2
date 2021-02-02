package Part_1.M;

public class Questio_6 {

	public static void main(String[] args) {
		int n[] = { 4,7,13};
		int res = isFilter(n);
		System.out.print(res);
	}

	static int isFilter(int[] a) {
		boolean has9 = false, has11 = false, has7 = false, has13 = false;
		for (int i = 0; i < a.length; i++) {
			switch (a[i]) {
			case 9:
				has9 = true;
				break;
			case 11:
				has11 = true;
				break;
			case 7:
				has7 = true;
				break;
			case 13:
				has13 = true;
				break;
			default:
				break;
			}

		}
		if ((((has9 && has11) || (has11 && !has9)) || ((has7 && !has13) || (has13 && !has7))))
			return 1;

		return 0;

	}

	static int isFilter2(int[] a) {
		boolean has9 = false, has11 = false, has7 = false, has13 = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 9) {
				has9 = true;
				break;
			}
			if (a[i] == 11) {
				has11 = true;
				break;
			}
			if (a[i] == 7) {
				has7 = true;
				break;
			}
			if (a[i] == 13) {
				has13 = true;
				break;
			}

		}
		if ((has9 && has11) || (has11 && !has9) || ((has7 && !has13) || (has13 && !has7)))
			return 1;

		return 0;
	}
}
