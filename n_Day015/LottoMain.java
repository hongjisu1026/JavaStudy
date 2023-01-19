import java.util.*;

class LottoMain {
	static int[] lArr = new int[6];

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			randomLotto();
			printLotto();
		}

		System.out.println();
		randomLotto();
		shuffleLotto();
	}

	public static void randomLotto() {
		for(int i = 0; i < lArr.length; i++) {
			int rand = (int)(Math.random()*45)+1;
			lArr[i] = rand;
			for(int j = 0; j < i; j++) {
				if(lArr[i] == lArr[j]) {
					i--;
					break;
				}
			}
		}
	}

	public static void printLotto() {
		int temp;
		for(int i = 0; i < lArr.length; i++) {
			for(int j = i+1; j < lArr.length; j++) {
				if(lArr[i] > lArr[j]) {
					temp = lArr[i];
					lArr[i] = lArr[j];
					lArr[j] = temp;
				}
			}
			System.out.print(lArr[i] + "\t");
		}
		System.out.println();
	}

	public static void shuffleLotto() {
		Integer[] lArr2 = Arrays.stream(lArr).boxed().toArray(Integer[]::new);
		List<Integer> list = Arrays.asList(lArr2);

		Collections.shuffle(list);
		list.toArray(lArr2);
		System.out.println(Arrays.toString(lArr2));
	}
		
}
