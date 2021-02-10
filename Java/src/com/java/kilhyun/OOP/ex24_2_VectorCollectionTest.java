package com.java.kilhyun.OOP;

import java.util.List;
import java.util.Vector;

public class ex24_2_VectorCollectionTest {

    public static void main(String[] args)
    {
        List<Board> vector = new Vector<Board>();

        vector.add(new Board("제목1", "내용1", "글쓴이1"));
        vector.add(new Board("제목2", "내용2", "글쓴이2"));
        vector.add(new Board("제목3", "내용3", "글쓴이3"));
        vector.add(new Board("제목4", "내용4", "글쓴이4"));
        vector.add(new Board("제목5", "내용5", "글쓴이5"));

        vector.remove(2); // 제목3 삭제 , 2 이후 인덱스 값 - 1
        vector.remove(3); // 제목5 삭제

        for(int i = 0; i < vector.size(); i++)
        {
            Board board = vector.get(i);
            System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
        }

    }

}
