package com.java.kilhyun.OOP;

import java.io.IOException;

public class ex18_8_Interface_Quiz1 {

    /*
    문제. 아래와 같이 여러 정렬 구현 알고리즘이 입력에 따라 실행 될 수 있도록 구현하시오.
    (정렬 알고리즘은 실제 구현이 아닌 메세지가 출력되도록 설정함)

   Sort (Interface)
    ㄴ QuickSort (Class)
    ㄴ HeapSort (Class)
    ㄴ BubbleSort (Class)

    <출력 결과>
    정렬방식을 선택하세요.
    B: BubbleSort
    H: HeapSort
    Q: QuickSort
    Q (입력)

    QuickSort ascending
    QuickSort descending
    숫자를 정렬하는 알고리즘입니다.
    QuickSort 입니다.

     */

    public static void main(String[] args) throws IOException
    {

        int[] arr = {1, 2, 3};

        System.out.println("정렬방식을 선택하세요");
        System.out.println("B: BubbleSort");
        System.out.println("H: HeapSort");
        System.out.println("Q: QuickSort");

        int inputLetter = System.in.read();

        // 정렬 방식 설정
        if(inputLetter == 'B' || inputLetter == 'b')
        {
            // Bubble Sort
            Sort sort = new BubbleSort();
            sort.ascending(arr);
            sort.descending(arr);
            sort.description();
        }
        else if (inputLetter == 'H' || inputLetter == 'h')
        {
            // Heap Sort
            Sort sort = new HeapSort();
            sort.ascending(arr);
            sort.descending(arr);
            sort.description();

        }
        else if (inputLetter == 'Q' || inputLetter == 'q')
        {
            // Quick Sort
            Sort sort = new QuickSort();
            sort.ascending(arr);
            sort.descending(arr);
            sort.description();
        }
        else
        {
            System.out.println("잘못된 문자입니다.");
            System.out.println("확인 후 다시 실행하세요");
        }


    }

}
