/*
1. contains
2. indexOf
3. lastIndexOf
 */

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Test4 {
    public static void main(String[] args) {
        double num = 3.141592;

        num = (Math.round(num * 100) / 100.0);
        System.out.println(num);
    }
}

class Test5 {
    public static void main(String[] args) {
        int num = 2;
        num = (int) Math.pow(num, 4);

        System.out.println(num);
    }
}

class Test6 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = -10;

        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        System.out.println(num1 + " " + num2);
    }
}

class Test7 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        System.out.println("min = " + Math.min(num1, num2));
    }
}

class Test8 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        System.out.println("max = " + Math.max(num1, num2));
    }
}

class Test9 {
    public static void main(String[] args) {
        String str = "010-1234-5678";
        String tmp = "";

        tmp = str.replace("-", "");
        System.out.println(tmp);
    }
}

class Test10 {
    public static void main(String[] args) {
        String str = "0123456789";
        System.out.println(str);
        System.out.println(str.substring(3));
        System.out.println(str.substring(5));
    }
}

class Test11 {
    public static void main(String[] args) {
        char[] arr = new char[10];

        Arrays.fill(arr, '0');
        System.out.println(Arrays.toString(arr));
    }
}

class Test12 {
    public static void main(String[] args) {
        char[] arr = new char[5];
        Arrays.fill(arr, '0');
        System.out.println("원본 : " + Arrays.toString(arr));

        char[] newArr = new char[arr.length];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        System.out.println("복사본 : " + Arrays.toString(newArr));
    }
}

class Test13 {
    public static void main(String[] args) {
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num);
    }
}

class Test14 {
    public static void main(String[] args) {
        int num = 123;
        String str = String.valueOf(num);
        System.out.println(str);
    }
}

/*
15. ca, co, car, combat, count,
16.
Pattern : .*  결과: bat,baby,bonus,c,cA,ca,co,c.,c0,c#,car,combat,count,date,disc,
Pattern : c[a-z]*  결과: c,ca,co,car,combat,count,
Pattern : c[a-z]  결과: ca,co,
Pattern : c[a-zA-Z]  결과: cA,ca,co,
Pattern : c[a-zA-Z0-9]  결과: cA,ca,co,c0,
Pattern : c.  결과: cA,ca,co,c.,c0,c#,
Pattern : c.*  결과: c,cA,ca,co,c.,c0,c#,car,combat,count,
Pattern : c\.  결과: c.,
Pattern : c\w  결과: cA,ca,co,c0,
Pattern : c\d  결과: c0,
Pattern : c.*t  결과: combat,count,
Pattern : [b|c].*  결과: bat,baby,bonus,c,cA,ca,co,c.,c0,c#,car,combat,count,
Pattern : .*a.*  결과: bat,baby,ca,car,combat,date,
Pattern : .*a.+  결과: bat,baby,car,combat,date,
Pattern : [b|c].{2}  결과: bat,car,

17.
- .
- []
- [a-z]
- [^]
- 없거나 한개 이상
- 한개 이상
- 한개의 숫자
- 공백 문자
- 한개의 알파벳, 언더바, 숫자 [a-zA-Z_0-9]
- n개
- n개 이상
- n개 부터 m개 까지
- 없음 또는 한개
- ()
- ^
- $
- \.
 */

class Test18 {
    public static void main(String[] args) {
        String[] data = {"123","012", "3GT", "안녕", "Hello"};
        Pattern p = Pattern.compile("^[0-9]+$");

        for(int i = 0; i < data.length; i++) {
            Matcher m = p.matcher(data[i]);
            if(m.find()) {
                System.out.println(data[i] + "는 숫자입니다.");
            } else {
                System.out.println(data[i] + "는 숫자가 아닙니다.");
            }
        }
    }
}

class Test19 {
    public static void main(String[] args) {
        String[] data = {"123","012", "3GT", "안녕", "Hello"};
        Pattern p = Pattern.compile("^[a-zA-Z]+$");

        for(int i = 0; i < data.length; i++) {
            Matcher m = p.matcher(data[i]);
            if(m.find()) {
                System.out.println(data[i] + "는 영문자입니다.");
            } else {
                System.out.println(data[i] + "는 영문자가 아닙니다.");
            }
        }
    }
}

class Test20 {
    public static void main(String[] args) {
        String[] data = {"123","012", "3GT", "안녕", "Hello"};
        Pattern p = Pattern.compile("^[가-힣]+$");

        for(int i = 0; i < data.length; i++) {
            Matcher m = p.matcher(data[i]);
            if(m.find()) {
                System.out.println(data[i] + "는 한글입니다.");
            } else {
                System.out.println(data[i] + "는 한글이 아닙니다.");
            }
        }
    }
}

/*
25.
1: 011-1111-1111 -> 011, 1111, 1111
2: 02-999-9999 -> 02, 999, 9999
 */

class Test26 {
    public static void main(String[] args) {
        String source  = "A broken hand works, but not a broken heart.";
        String pattern = "broken";
        int count = 0;
        StringBuffer sb = new StringBuffer();
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(source);

        while(m.find()) {
            count++;
            System.out.println(count + "번째 매칭 : " + m.start() + "~" + m.end());
            m.appendReplacement(sb, "drunken");
        }

        m.appendTail(sb);
        System.out.println("Replacement count : " + count);
		System.out.println("result:"+sb.toString());
    }
}

class TestBigDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 >> ");
        String val1 = sc.nextLine();
        String val2 = sc.nextLine();
        BigDecimal bigDecimal1 = new BigDecimal(val1);
        BigDecimal bigDecimal2 = new BigDecimal(val2);

        System.out.println(bigDecimal1.subtract(bigDecimal2).abs());
    }
}

/*
1. BigInteger, BigDecimal
 */

class RegularEx2 {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
    }
}

class RegularEx3 {
    public static void main(String[] args) {
        String val1 = "100000000000000000000";
        BigInteger bigInteger1 = new BigInteger(val1);
        String val2 = "-99999999999999999999";
        BigInteger bigInteger2 = new BigInteger(val2);

        System.out.println(bigInteger1.add(bigInteger2));
        System.out.println(bigInteger1.multiply(bigInteger2));
    }
}

class RegularEx4 {
    public static void main(String[] args) {
        String val1 = "1.6";
        String val2 = "0.1";

        BigDecimal num1 = new BigDecimal(val1);
        BigDecimal num2 = new BigDecimal(val2);

        System.out.println(num1.add(num2));
        System.out.println(num1.multiply(num2));
    }
}

/*
5. currentTimeMillis
6. System.currentTimeMillis() 생성자를 호출한다
7. nextToken()
8. hasMoreTokens
 */

class RegularEx10 {
    public static void main(String[] args) {
        String str = "11:22:33:44:55";
        StringTokenizer tokenizer = new StringTokenizer(str, ":");

        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}

class RegularEx11 {
    public static void main(String[] args) {
        String str1 = "TEL 82-02-997-2059";
        String str2 = "num+=1";

        StringTokenizer tokenizer1 = new StringTokenizer(str1);
        StringTokenizer tokenizer2 = new StringTokenizer(str1, " -");
        StringTokenizer tokenizer3 = new StringTokenizer(str2, "+=", true);

        while(tokenizer1.hasMoreTokens()) {
            System.out.println(tokenizer1.nextToken());
        }
        System.out.println("==========================");
        while (tokenizer2.hasMoreTokens()) {
            System.out.println(tokenizer2.nextToken());
        }
        System.out.println("==========================");
        while (tokenizer3.hasMoreTokens()) {
            System.out.println(tokenizer3.nextToken());
        }
    }
}