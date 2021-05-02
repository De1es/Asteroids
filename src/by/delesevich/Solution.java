package by.delesevich;

import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt();
        int H = in.nextInt();
        int T1 = in.nextInt();
        int T2 = in.nextInt();
        int T3 = in.nextInt();
        char[][] sky1 = new char[W][H];
        char[][] sky2 = new char[W][H];
        char[][] skyAnswer = new char[W][H];
        for (int i = 0; i < H; i++) {
            String firstPictureRow = in.next();
            String secondPictureRow = in.next();
            for (int j = 0; j < W; j++) {
                sky1[i][j] = firstPictureRow.charAt(j);
                sky2[i][j] = secondPictureRow.charAt(j);
            }
        }
        for (int i = 0; i < W; i++) {
            for (int j = 0; j < H; j++) {
                skyAnswer[i][j] = '.';
            }

        }

        for (int i = 0; i < W; i++) {
            for (int j = 0; j < H; j++) {
                if (sky1[i][j] != '.') {
                    for (int k = 0; k < W; k++) {
                        for (int l = 0; l < H; l++) {
                            if (sky1[i][j] == sky2[k][l]) {
                                int answerX = (int) Math.floor((double)(T3 - T2) * (double)(k - i) / (double)(T2 - T1) + (double)k);
                                int answerY = (int) Math.floor((double)(T3 - T2) *(double) (l - j) / (double)(T2 - T1) + (double)l);
                                if (answerX < H && answerY < W && answerX >=0 && answerY >=0 ) {
                                    if (skyAnswer[answerX][answerY] == '.') {
                                        skyAnswer[answerX][answerY] = sky1[i][j];
                                    } else {
                                        if (skyAnswer[answerX][answerY] > sky1[i][j]) {
                                            skyAnswer[answerX][answerY] = sky1[i][j];
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < W; i++) {
            for (int j = 0; j < H; j++) {
                System.out.print(skyAnswer[i][j]);
            }
            System.out.println();
        }
    }

}