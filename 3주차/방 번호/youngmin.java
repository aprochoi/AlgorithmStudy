package CodingTest;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1475_room_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        sc.close();
        String[] arr = n.split("");     // n을 ""로 나눠서 배열 arr에 저장

        int[] num = new int[10];             // 0~9까지의 숫자를 담을 num 선언

        for (int i = 0; i < arr.length; i++) {
            int a = Integer.parseInt(arr[i]);       // ex) 9999 일때, arr[0] -> 9이므로 9를 int형으로 변환
            if(a == 6) a = 9;                       // 6과 9는 같으므로 6이면 9로 설정
            num[a]++;                               // num[9]의 값을 +
        }

        if(num[9] != 0) num[9] = num[9]/2 + num[9]%2;       // 6을 9로 몰아 버렸기 때문에 2로 나눔, 또한 만약 나머지가 있을 시 1세트 추가를해줘야하기 때문에 나머지를 더함.

        Arrays.sort(num);       // 오름차순 정렬
        System.out.println(num[9]); // 마지막값 출력

    }
}


/*
* 방 번호
* ---------------
* 한 세트에는 (0,1,2,3,4,5,6,7,8,9) 까지 하나씩 있다.
* 방 번호가 주어졌을 때, 필요한 세트의 개수의 최솟값을 구해라.
* (6은 9를 뒤집어서 사용할 수 있고, 9는 6을 뒤집어서 사용이 가능)
* ex ) 9999일 경우 -> 한 세트에 6,9로 9를 대체 할 수있으니 총 2세트 필요.
*/

