import java.util.Scanner;

/*
문제 1번
d, e

문제 2번
2
*/

class Test3 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		System.out.println("sum = " + sum);
	}
}

class Test4 {
	public static void main(String[] args) {
		int[][] arr = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
			};
		int total = 0;
		float average = 0;

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
			}
			
		}
		average = total / (float)(arr.length * arr[0].length);
		System.out.println("total = "+ total);
		System.out.println("average = " + average);
	}
}

class Test5 {
	public static void main(String[] args) {
		int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] ball3 = new int[3];

		for(int i = 0; i < ballArr.length; i++) {
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
			
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}
		
		for(int i = 0; i < ball3.length; i++) {
			ball3[i] = ballArr[i];
			System.out.print(ball3[i]);
		}
	}
}

class Test6 {
	public static void main(String[] args) {
		int[] coinUnit = {500, 100, 50, 10};

		int money = 2680;
		System.out.println("money = " + money);

		for(int i = 0; i < coinUnit.length; i++) {
			int count = money / coinUnit[i];
			money %= coinUnit[i];
			System.out.println(coinUnit[i] + "원 : " + count);
		}
	}
}

class Test7 {
	public static void main(String args[]) {
		if(args.length != 1) {
			System.out.println("USAGE: java Exercise5_7 3120");
			System.exit(0);
	}

		int money = Integer.parseInt(args[0]);
		System.out.println("money = " + money);
		int[] coinUnit = {500, 100, 50, 10}; // 동전의 단위
		int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수
		for(int i=0;i<coinUnit.length;i++) {
			int coinNum = 0;
			coinNum = money / coinUnit[i];
			if(coin[i] >= coinNum) {
				coin[i] -= coinNum;
			} else {
				coinNum = coin[i];
				coin[i] = 0;				
			}
			money = money - coinUnit[i] * coinNum;
			System.out.println(coinUnit[i]+"원 : "+coinNum); 
		}

		if(money > 0) {
			System.out.println("거스름돈이 부족합니다."); 
			System.exit(0);
		}

		System.out.println("= 남은 동전의 개수 ="); 

		for(int i=0;i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+"원 :"+coin[i]); 
		}
	} 
}

class Test8 {
	public static void main(String[] args) {
		int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
		int[] counter = new int[4];

		for(int i = 0; i < answer.length; i++) {
			counter[answer[i]-1]++;
		}

		for(int i = 0; i < counter.length; i++) {
			System.out.print(counter[i]);

			for(int j =0; j < counter[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class Test9 {
	public static void main(String[] args) {
		char[][] star = {
				{'*', '*', ' ', ' ', ' '},
				{'*', '*', ' ', ' ', ' '},
				{'*', '*', '*', '*', '*'},
				{'*', '*', '*', '*', '*'}
			};

		char[][] result = new char[star[0].length][star.length];

		for(int i = 0; i < star.length; i++) {
			for(int j = 0; j< star[i].length; j++) {
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

class Test10 {
	public static void main(String[] args) {
		char[] abcCode =
			{ '`','~','!','@','#','$','%','^','&','*',
			'(',')','-','_','+','=','|','[',']','{',
			'}',';',':',',','.','/'};
				// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};

		String src = "abc123";
		String result = "";

			// src charAt() result 문자열 의 문자를 으로 하나씩 읽어서 변환 후 에 저장
		for(int i=0; i < src.length();i++) {
			char ch = src.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				result += abcCode[ch - 'a'];
			} else if(ch >= '0' && ch <= '9') {
				result += numCode[ch - '0'];
			}
		}
		System.out.println("src:"+src);
		System.out.println("result:"+result);
	}
}

class Test11 {
	public static void main(String[] args) {
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}
			};

		int[][] result = new int[score.length+1][score[0].length+1];

		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				result[i][j] = score[i][j];		
				result[i][score[0].length] += result[i][j];
				result[score.length][j] += result[i][j];
				result[score.length][score[0].length] += result[i][j];
			}               
		}

		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				System.out.printf("%4d", result[i][j]);
			}
			System.out.println();
		}
	}
}

class Test13 {
	public static void main(String[] args) {
		String[] words = {"television", "computer", "mouse", "phone"};

		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray();
		
			for(int j =0; j < question.length; j++) {
				int idx = (int)(Math.random() % question.length); 
				char temp;
				temp = question[j];
				question[j] = question[idx];
				question[idx] = temp;
			}
			
			System.out.printf("Q%d. %s의 정답을 입력하세요. ", i+1, new String(question));

			String answer = sc.nextLine();

			if(words[i].equals(answer.trim())) {
				System.out.println("맞았습니다. \n");
			} else {
				System.out.println("틀렸습니다. \n");
			}
		}
	}
}
	