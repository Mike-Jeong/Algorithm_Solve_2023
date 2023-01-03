package backjoon;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

//하노이 탑
//03012023

public class b03012023 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        BigInteger hanoiNum = new BigInteger("2");
        hanoiNum = hanoiNum.pow(n);
        hanoiNum = hanoiNum.subtract(BigInteger.ONE);

        System.out.println(hanoiNum);

        if (n <= 20) {
            hanoi(n, 1, 2, 3);
        }

    }

    static void hanoi(int n, int start, int mid, int end) {

        if (n == 1) {
            System.out.println(start + " " + end);
            return;
        }

        hanoi(n - 1, start, end, mid);

        System.out.println(start + " " + end);

        hanoi(n - 1, mid, start, end);

    }
}

//하노이이의 탑 알고리즘

// 장대 1, 2, 3 이 있을경우
// n개의 플레이트를 1 에서 3으로 옮기는 방법의 수는
// 2 ^ n - 1 
// 위의 공식으로 구할 수 있다. (시간 복잡도 : O(2^n) )

// 위의 공식을 유도하기 위해 필요한 생각은
// 1 - > 3 으로 n 번째 플레이트를 옮기기 위해서는 
// 1-> 2 으로 (n - 1) 개의 플레이트를 옮기는 연산을 수행해야하고 (hanoi(n - 1))
// 그 이후 1-> 3으로 n번째 플레이트를 옮긴 후(+ 1)
// 다시 2 -> 3 으로 (n - 1) 개의 플레이트를 옮기는 연산을 수행하면 된다 (hanoi(n - 1))
// 유도 정리 https://st-lab.tistory.com/96

/*
 스택을 사용하여 각 장대에 일어나는 일을 확인 할 수 있는 
 하노이의 탑 코드 


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws Exception {

        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());

        Solve s = new Solve();

        System.out.println(s.solve(3));
        //System.out.println(s.solve2());
    }

}

class Solve {

    Stack<Integer> stack1;
    Stack<Integer> stack2;
    Stack<Integer> stack3;
    int count;
    int n;

    int solve(int n) {

        stack1 = new Stack<>();
        stack2 = new Stack<>();
        stack3 = new Stack<>();
        count = 0;
        this.n = n;

        for (int i = n; i > 0; i--) {
            stack1.push(i);
        }

        hanoi(n, stack1, stack2, stack3);

        return count;
    }

    int solve2() {

        Hanoi(3, 1, 2, 3);

        return 7;
    }

    void hanoi(int n, Stack<Integer> start, Stack<Integer> mid, Stack<Integer> end) {


        if (n == 1) {
            end.push(start.pop());
            count++;
            print();
            return;
        }

        hanoi(n - 1, start, end, mid);

        end.push(start.pop());
        count++;
        print();

        hanoi(n - 1, mid, start, end);
    }

    void Hanoi(int N, int start, int mid, int to) {
		// 이동할 원반의 수가 1개라면?
		if (N == 1) {
            System.out.println(N + " " + start + " " + to + "\n");
			return;
		}
 
		// A -> C로 옮긴다고 가정할 떄,
		// STEP 1 : N-1개를 A에서 B로 이동 (= start 지점의 N-1개의 원판을 mid 지점으로 옮긴다.)
		Hanoi(N - 1, start, to, mid);
    
		// STEP 2 : 1개를 A에서 C로 이동 (= start 지점의 N번째 원판을 to지점으로 옮긴다.)
		System.out.println(N + " " + start + " " + to + "\n");
    
		// STEP 3 : N-1개를 B에서 C로 이동 (= mid 지점의 N-1개의 원판을 to 지점으로 옮긴다.)
		Hanoi(N - 1, mid, start, to);
 
	}

    void print()
    {
        Object[][] stacks = new Object[][]{ stack1.toArray(), stack2.toArray(), stack3.toArray() };

        for (int i = n ; i >= 1 ; i--)
        {
            System.out.print("|");
            for (int j = 0; j < stacks.length ; j++)
            {
                int cursor = i - stacks[j].length ;
                System.out.print(cursor <= 0 ? stacks[j][stacks[j].length + cursor - 1] : " ");
                System.out.print("|");
            }
            System.out.println();
        }
        System.out.println("========");
    }

}

 */