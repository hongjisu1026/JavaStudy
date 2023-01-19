class LottoMain {
	public static void main(String[] args) {
		int[] lArr = new int[6];

		for(int i = 0; i < lArr.length; i++) {
			int rand = (int)(Math.random()*45)+1;
			lArr[i] = rand;
			for(int j = 0; j < i; j++) {
				if(lArr[i] == lArr[j]) {
					i--;
					break;
				}
			}
			System.out.print(lArr[i] + "\t");
		}

		
	}
}

