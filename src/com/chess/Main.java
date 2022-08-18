package com.chess;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        AbstractChessItem[] chess;
        Pawn pawn1 = new Pawn(2, 1, "White");
        Pawn pawn2 = new Pawn(2, 2, "White");
        Bishop bishop1 = new Bishop(1, 2, "White");
        Bishop bishop2 = new Bishop(1, 7, "White");
        Knight knight1 = new Knight(1, 3, "White");
        Knight knight2 = new Knight(1, 6, "White");
        Rook rook1 = new Rook(1, 1, "White");
        Rook rook2 = new Rook(1, 8, "White");
        Queen queen = new Queen(1, 5, "White");
        King king = new King(1, 4, "White");

        Pawn pawn3 = new Pawn(7, 1, "Black");
        Pawn pawn4 = new Pawn(7, 2, "Black");
        Bishop bishop3 = new Bishop(8, 2, "Black");
        Bishop bishop4 = new Bishop(8, 7, "Black");
        Knight knight3 = new Knight(8, 3, "Black");
        Knight knight4 = new Knight(8, 6, "Black");
        Rook rook3 = new Rook(8, 1, "Black");
        Rook rook4 = new Rook(8, 8, "Black");
        Queen queen1 = new Queen(8, 4, "Black");
        King king1 = new King(8, 5, "Black");
        chess = new AbstractChessItem[]{pawn1, pawn2, bishop1, bishop2, knight1, knight2, rook1, rook2, queen, king, pawn3, pawn4, bishop3, bishop4, knight3, knight4, rook3, rook4, queen1, king1};
        /*for (int i = 0; i < 10000000; i++) {
            i+=i;
        }*/
        long startTime = System.currentTimeMillis();
        method6(chess);
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime-startTime) + "ms");

        /*LocalTime a =  LocalTime.now();
        method6(chess);
        LocalTime b =  LocalTime.now();

            System.out.println(a+"\n"+b);*/

    }

    public static void method1(AbstractChessItem[] chess) {
        for (AbstractChessItem a : chess) {
            a.draw();
        }
    }

    public static void method2(AbstractChessItem[] chess) {
        for (AbstractChessItem a : chess) {
            if (a instanceof King) continue;
            a.draw();
        }
    }

    public static void method3(AbstractChessItem[] chess) {
        for (AbstractChessItem a : chess) {
            if (a.getX() == 2) a.draw();
        }
    }

    public static void method4(AbstractChessItem[] chess) {
        for (AbstractChessItem a : chess) {
            if (a instanceof Pawn) a.draw();
        }
    }

    public static void method5(AbstractChessItem[] chess) {
        for (AbstractChessItem a : chess) {
            System.out.println();
        }
    }

    public static void method6(AbstractChessItem[] chess) {
        for (int i = 1; i <= 6; i++) {
            for (int j=0; j<chess.length;j++) {
                switch (i) {
                    case 1 -> {
                        if (chess[j] instanceof Pawn) chess[j].draw();
                    }
                    case 2 -> {
                        if (chess[j] instanceof Bishop) chess[j].draw();
                    }
                    case 3 -> {
                        if (chess[j] instanceof Knight) chess[j].draw();
                    }
                    case 4 -> {
                        if (chess[j] instanceof Rook) chess[j].draw();
                    }
                    case 5 -> {
                        if (chess[j] instanceof Queen) chess[j].draw();
                    }
                    case 6 -> {
                        if (chess[j] instanceof King) chess[j].draw();
                    }
                }

            }
        }
    }
}
