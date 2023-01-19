import java.util.Arrays;

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	SutdaCard() {
		this(1, true);	
	}

	public String info() {
		return num + (isKwang ? "K" : " "); 	
	}
}

class SutdaCardMain {
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();

		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}

class Student {
	String name;
	int ban, no, kor, eng, math;

	Student() {	}
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getTotal() {
		return kor + eng + math;
	}

	public float getAverage() {
		return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
	}

	public String info() {
		return name + ", " +ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + getTotal() + ", " + getAverage();
	}
}

class StudentMain {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;

		System.out.println("이름 : " + s.name);
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());
	}
}

class StudentMain_1 {
	public static void main(String[] args) {
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
		
		System.out.println(s.info());
	}
}

class Distance {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);

		System.out.println(p.getDistance(2, 2));
	}
}

class MyPoint {
	int x, y;

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double getDistance(int x1, int y1) {
		double result = Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2));
		return result;
	}
}

/*
문제 8번
- 클래스변수 : width, height
- 인스턴스 변수 : kind, num
- 지역변수 : k, n, card, args

문제 9번
- weapon, armor
: 모든 병사의 공격력과 방어력이 같아야 하기 때문에

문제 10번
b, e

문제 11번
b

문제 12번
c, d

문제 13번
b, c, d

문제 14번
c, e

문제 15번
a

문제 16번
a, e

문제 17번
b

문제 18번
A : static 변수의 초기화에 인스턴스 변수 사용 불가
B : static 메서드에 인스턴스 변수 사용 불가
D : static 메서드에 인스턴스 메서드 사용 불가

문제 19번
ABC123
After change:ABC123

*/

class Test20 {
	public static void main(String[] args) {
		int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(original));

		int result[] = shuffle(original);
		System.out.println(Arrays.toString(result));
	}

	public static int[] shuffle(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int j = (int)(Math.random() * arr.length);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		return arr;
	}
}

class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;

	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	public void turnOnOff() {
		isPowerOn = !isPowerOn;
	}

	public void volumeUp() {
		if(volume < MAX_VOLUME) {
			volume++;
		}
	}

	public void volumeDown() {
		if(volume > MIN_VOLUME) {
			volume--;
		}
	}

	public void channelUp() {
		if(channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		} else {
			channel ++;
		}
	}

	public void channelDown() {
		if(channel == MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		} else {
			channel --;
		}
	}
}

class MyTvMain {
	public static void main(String[] args) {
		MyTv t = new MyTv();

		t.channel = 100;
		t.volume = 0;
		System.out.println("CH : " + t.channel + ", VOL : " + t.volume);

		t.channelDown();
		t.volumeDown();
		System.out.println("CH : " + t.channel + ", VOL : " + t.volume);

		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH : " + t.channel + ", VOL : " + t.volume);
	}
}

class Test22 {
	public static void main(String[] args) {
		String str1 = "123";
		System.out.println(str1 + "는 숫자입니까? " + isNumber(str1));

		String str2 = "1234o";
		System.out.println(str2 + "는 숫자입니까? " + isNumber(str2));
	}

	public static boolean isNumber(String str) {
		boolean result = false;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if(ch >= '0' && ch <= '9') {
				result = true;
			} else {
				result = false;
				break;
			}
		}

		return result;
	}
}

class Test23 {
	public static void main(String[] args) {
		int[] data = {3, 2, 9, 4, 7};
		System.out.println(Arrays.toString(data));
		System.out.println("최대값 : " + max(data));
		System.out.println("최대값 : " + max(null));
		System.out.println("최대값 : " + max(new int[] { }));
	}

	public static int max(int[] arr) {
		int maxNum = 0;
		if(arr == null || arr.length == 0) {
			return -999999;
		} else {
			Arrays.sort(arr);
			maxNum = arr[arr.length-1];
		}
		return maxNum;
	}
}

class Test24 {
	public static void main(String[] args) {
		int value1 = 5;
		System.out.println(value1 + "의 절대값 : " + abs(value1));
		int value2 = -10;
		System.out.println(value2 + "의 절대값 : " + abs(value2));
	}

	public static int abs(int value) {
		if(value < 0) {
			return -value;
		}

		return value;
	}
}
		