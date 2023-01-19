import java.util.Scanner;

class Test1 {
	public static void main(String[] args) {
		int sum = 0;
		int[] arr = {10, 20, 30, 40, 50};
		for(int e: arr) {
			sum += e;
		}
		System.out.println(sum);
	}
}

class Test2 {
	public static void main(String[] args) {
		int[] coin = {500, 100, 50, 10};
		int[] count = {5, 5, 5, 5};

		int money = Integer.parseInt(args[0]);

		for(int i = 0; i < coin.length; i++) {
			int coinNum = 0;
			coinNum = money / coin[i];

			if(count[i] < coinNum) {
				coinNum = count[i];
				count[i] = 0;
			} else {
				count[i] -= coinNum;
			}
			money -= (coin[i] * coinNum);
			System.out.println(coin[i] + "원 : " + coinNum);
		}
		if(money > 0) {
			System.out.println("거스름돈이 부족합니다."); 
			System.exit(0);
		}

		System.out.println("= 남은 동전의 개수 ="); 

		for(int i=0;i<coin.length;i++) {
			System.out.println(coin[i]+"원 :"+count[i]); 
		}
	}
}

class Test3 {
	public static void main(String[] args) {
		int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
		int[] count = new int[4];

		for(int i = 0; i < answer.length; i++) {
			count[answer[i]-1]++;
		}

		for(int i = 0; i < count.length; i++) {
			System.out.print(count[i]);

			for(int j = 0; j < count[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class Test4 {
	public static void main(String[] args) {
		char[][] star = {
			{'*', '*', ' ', ' ', ' '},
			{'*', '*', ' ', ' ', ' '},
			{'*', '*', '*', '*', '*'},
			{'*', '*', '*', '*', '*'}
		};
		char[][] result = new char[star[0].length][star.length];

		for(int i = 0; i < star.length; i++) {
			for(int j = 0; j < star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		for(int i = 0; i < star.length; i++) {
			for(int j = 0; j < star[i].length; j++) {
				result[j][star.length-1-i] = star[i][j];
			}
		}

		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}
}	

class Test5 {
	public static void main(String[] args) {
		char[] abcCode =
			{ '`','~','!','@','#','$','%','^','&','*',
			'(',')','-','_','+','=','|','[',']','{',
			'}',';',':',',','.','/'};
				// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};	

		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요.");
		String str = sc.nextLine();
		String result = "";

		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				result += abcCode[ch - 'a'];
			} else if(ch >= 'A' && ch <= 'Z') {
				result += abcCode[ch - 'A'];
			} else if(ch >= '0' && ch <= '9') {
				result += numCode[ch - '0'];
			}
		}
		
		System.out.println("암호화 결과 : " + result);
	}
}

class Test6 {
	public static void main(String[] args) {
		int[][] score = {
			{100, 100, 100}, 
			{20, 20, 20}, 
			{30, 30, 30}, 
			{40, 40, 40}, 
			{50, 50, 50}
		};
		int[][] result = new int[5][5];

		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++) {
				result[i][j] = score[i][j];
				result[i][score[0].length] += result[i][j];
				result[score.length][j] += result[i][j];
				result[score.length][score[0].length] += result[i][j];
			}
		}

		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "EUC-KR");
		String[][] words = {
			{"dog", "cat", "rabbit", "horse"},
			{"개", "고양이", "토끼", "말"}
		};

		for(int i = 0; i < words[0].length; i++) {
			String word = words[0][i];
			System.out.println(word + " 의 뜻은?");
			System.out.print("정답 : ");
			String answer = sc.nextLine();

			if(answer.compareTo(words[1][i]) == 0) {
				System.out.println("정답입니다.");
			} else {
				System.out.println("틀렸습니다.");
			}
		}
	}
}

class Test8 {
	public static void main(String[] args) {
		String[] words = {"television", "computer", "mouse", "phone"};
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray();
			for(int j = 0; j < question.length; j++) {
				int idx = (int)(Math.random() % question.length);
				char temp;
				temp = question[j];
				question[j] = question[idx];
				question[idx] = temp;
			}
			System.out.print(question);
			System.out.println(" 정답을 입력하세요.");
			String answer = sc.nextLine();

			if(words[i].equals(answer.trim())) {
				System.out.println("맞았습니다.");
			} else {
				System.out.println("틀렸습니다.");
			}
		}
	}
}

class Test9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하세요.");
		String str = sc.nextLine();
		System.out.println(isNumber(str));
	}

	public static boolean isNumber(String str) {
		boolean result = false;
		if(str == null || str.equals("")) {
			return false;
		}
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= '0' && ch <= '9') {
				result = true;
			} else {
				result = false;
			}
		}
		return result;
	}
}

class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("16진수 문자열을 입력하세요");
		String str = sc.nextLine();
		String result = "";
		boolean flag = true;

		String[] bArr = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};

		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if(ch >= '0' && ch <= '9') {
				result += bArr[ch-'0'];
			} else if(ch >= 'a' && ch <= 'f') {
				result += bArr[ch-'a'+10];
			} else if(ch >= 'A' && ch <= 'F') {
				result += bArr[ch-'A'+10];
			} else {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println(result);
		} else {
			System.out.println("2진수 변환 실패");
		}
	}
}