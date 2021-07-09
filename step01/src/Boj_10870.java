import java.util.Scanner;

public class Boj_10870 {
    public static void main(String[] args) {
        //문제: 정수 n개로 이루어진 수열 a -> x보다 작은 수 모두 출력
        //정수 x
        //n하고 x 1보다 같거나크고 10000보다 같거나작아야함

        //수열a의 갯수를 만들 정수 n을 입력(스캐너사용)
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //정수x 입력
        int x = scanner.nextInt();

        //잘 입력됐나 출력
        System.out.println(n+" "+x);

        //수열a 만큼의 배열을 생성 (a[n])
        int a[] = new int[n];

        //length확인
        //System.out.println(a.length);
        int tmp;
        //배열에 들어갈 정수입력 (1<=x||x<=10000)
        for(int i=0; i<a.length; i++){
            tmp=scanner.nextInt();
            if(1<=tmp&&tmp<=10000){
                a[i]=tmp;
            }else{
                System.out.println("입력범위가 아닙니다");
            }
        }


        //배열에 잘 들어갔나 출력(for)
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        //배열을 뒤져서(for문) x보다 작으면 출력 (띄어쓰기 할것)
        for(int i=0; i<a.length; i++){
            if(a[i]<x) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
