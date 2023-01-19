import java.util.Scanner;

class BinaryTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("16진수 입력 : ");
		String str = sc.nextLine();
		str = str.toUpperCase();
		boolean flag;
		
		String[] bArr = {"0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
		char[] hArr = {'1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};	

		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			for(int j = 0; j < hArr.length; j++) {
				if(ch >= '0' && ch <= '9') {
					flag = true;
				} else if(ch >= 'A' && ch <= 'F') {
					flag = true;
				} else {
					flag = false;
				}

				if(flag) {
					if(hArr[j] == ch) {
						System.out.print(bArr[j]);
					}
				} else {
					System.out.println("2진수 변환 실패");
					break;
				}
			}
		}
	}
}