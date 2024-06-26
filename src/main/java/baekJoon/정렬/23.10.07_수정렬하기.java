package baekJoon.정렬;

import java.util.*;
import java.io.*;

public class 수정렬하기 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];

		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);

		for(int num : arr) {
			sb.append(num).append('\n');
		}

		System.out.println(sb);
	}
}
