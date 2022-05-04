package kr.hs.dgsw.java.K0406;

import java.util.Scanner;

public class divisor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.printf("%d의 약수는 1",n);
		for(int i=2; i<=n; i++) {
			if(n % i ==0) System.out.printf(", %d",i);
		}
		System.out.printf(" 입니다.");
		sc.close();
	}
}
