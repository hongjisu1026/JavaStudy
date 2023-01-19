import java.util.Scanner;
import java.util.stream.Stream;

class BaseBallMain{
    static Scanner sc = new Scanner(System.in);
    static int[] numArr = new int[3];
    static int userNum = 0;

    public static void main(String[]args){
        int userNum = 0;
        SetNumberNCheck baseball = new SetNumberNCheck();
        numArr = baseball.setNumber();
        while(true){
            System.out.println("자, 공격하세요.");
            userNum = sc.nextInt();
            if(baseball.checkUserNum(userNum)){
                System.out.println("숫자는 100 이상 999 이하 겹치지 않는 숫자여야 합니다.");
                continue;
            }
            else{


            }
        }
    }
}

class SetNumberNCheck{
    Scanner sc = BaseBallMain.sc;
    int [] numArr = new int[3];
    int comIndex = 0, userIndex=0;
    int i, userNum, comNum, index;

    public int[] setNumber(){
        for(i=0;i<numArr.length;i++){
            do {
                index = (int)(Math.random()*10); // 0부터 9까지의 한자리 변수 생성
            } while (checkComNum(numArr,index));	 // 배열과 변수 중복여부 체크
            numArr[i] = index;	            	 // 중복되지 않는 수만 배열에 저장
        }
        for(int num: numArr){ //배열로 획득한 int[3] 을 세자리 수로 변환
            comNum *= 10;
            comNum += num;
        }
        if(comNum<100) setNumber();
        return numArr;
    }

    public boolean checkComNum(int[] numArr,int index){
        for(int i =0; i<numArr.length;i++){
            if(numArr[i]==index)  	//중복 시 true 반환, 중복 없을 시 false 반환
                return true;
        }
        return false;
    }

    public boolean checkUserNum(int userNum,int index){
        this.userNum = userNum;
        if(userNum<100||userNum>999) return false;
        int[] numArr = Stream.of(String.valueOf(userNum).split("")).mapToInt(Integer::parseInt).toArray();

        for(int i =0; i<numArr.length;i++){
            if(numArr[i]==index)  	//중복 시 true 반환, 중복 없을 시 false 반환
                return true;
        }
        return false;
    }
}