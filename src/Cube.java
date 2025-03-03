import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;

public class Cube {
    static char[][] arr = {
            { 'o', 'o', 'o' },
            { 'o', 'o', 'o' },
            { 'o', 'o', 'o' },
            { 'w', 'w', 'w' },
            { 'w', 'w', 'w' },
            { 'w', 'w', 'w' },
            { 'b', 'b', 'b' },
            { 'b', 'b', 'b' },
            { 'b', 'b', 'b' },
            { 'g', 'g', 'g' },
            { 'g', 'g', 'g' },
            { 'g', 'g', 'g' },
            { 'y', 'y', 'y' },
            { 'y', 'y', 'y' },
            { 'y', 'y', 'y' },
            { 'r', 'r', 'r' },
            { 'r', 'r', 'r' },
            { 'r', 'r', 'r' },
    };

    static char[][] temp = new char[18][3];
    static String move = null;
    static Scanner scn = new Scanner(System.in);
    static ArrayList<String> moves = new ArrayList<String>();
    static boolean playing = true;
    static Random random = new Random();
    static boolean mode = true;

    public static String show() {
        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]);
            }
            if ((i + 1) % 3 == 0)
                System.out.println();
            System.out.println();
        }
        return null;
    }

    public static char rightFace(int num) {
        switch (num) {
            case 1:
                for (int i = 0; i < 18; i++) {
                    for (int j = 0; j < 3; j++) {
                        temp[i][j] = arr[i][j];
                    }
                }
                arr[0][0] = temp[2][0];
                arr[0][2] = temp[0][0];
                arr[2][2] = temp[0][2];
                arr[2][0] = temp[2][2];
                arr[0][1] = temp[1][0];
                arr[1][2] = temp[0][1];
                arr[2][1] = temp[1][2];
                arr[1][0] = temp[2][1];
                break;
            case 2:
                for (int i = 0; i < 18; i++) {
                    for (int j = 0; j < 3; j++) {
                        temp[i][j] = arr[i][j];
                    }
                }
                arr[3][0] = temp[5][0];
                arr[3][2] = temp[3][0];
                arr[5][2] = temp[3][2];
                arr[5][0] = temp[5][2];
                arr[3][1] = temp[4][0];
                arr[4][2] = temp[3][1];
                arr[5][1] = temp[4][2];
                arr[4][0] = temp[5][1];
                break;
            case 3:
                for (int i = 0; i < 18; i++) {
                    for (int j = 0; j < 3; j++) {
                        temp[i][j] = arr[i][j];
                    }
                }
                arr[6][0] = temp[8][0];
                arr[6][2] = temp[6][0];
                arr[8][2] = temp[6][2];
                arr[8][0] = temp[8][2];
                arr[6][1] = temp[7][0];
                arr[7][2] = temp[6][1];
                arr[8][1] = temp[7][2];
                arr[7][0] = temp[8][1];
                break;
            case 4:
                for (int i = 0; i < 18; i++) {
                    for (int j = 0; j < 3; j++) {
                        temp[i][j] = arr[i][j];
                    }
                }
                arr[9][0] = temp[11][0];
                arr[9][2] = temp[9][0];
                arr[11][2] = temp[9][2];
                arr[11][0] = temp[11][2];
                arr[9][1] = temp[10][0];
                arr[10][2] = temp[9][1];
                arr[11][1] = temp[10][2];
                arr[10][0] = temp[11][1];
                break;
            case 5:
                for (int i = 0; i < 18; i++) {
                    for (int j = 0; j < 3; j++) {
                        temp[i][j] = arr[i][j];
                    }
                }
                arr[12][0] = temp[14][0];
                arr[12][2] = temp[12][0];
                arr[14][2] = temp[12][2];
                arr[14][0] = temp[14][2];
                arr[12][1] = temp[13][0];
                arr[13][2] = temp[12][1];
                arr[14][1] = temp[13][2];
                arr[13][0] = temp[14][1];
                break;
            case 6:
                for (int i = 0; i < 18; i++) {
                    for (int j = 0; j < 3; j++) {
                        temp[i][j] = arr[i][j];
                    }
                }
                arr[15][0] = temp[17][0];
                arr[15][2] = temp[15][0];
                arr[17][2] = temp[15][2];
                arr[17][0] = temp[17][2];
                arr[15][1] = temp[16][0];
                arr[16][2] = temp[15][1];
                arr[17][1] = temp[16][2];
                arr[16][0] = temp[17][1];
                break;
        }
        return 'o';
    }

    public static char leftFace(int num) {
        switch (num) {
            case 1:
                for (int i = 0; i < 18; i++) {
                    for (int j = 0; j < 3; j++) {
                        temp[i][j] = arr[i][j];
                    }
                }
                arr[0][0] = temp[0][2];
                arr[0][2] = temp[2][2];
                arr[2][2] = temp[2][0];
                arr[2][0] = temp[0][0];
                arr[0][1] = temp[1][2];
                arr[1][2] = temp[2][1];
                arr[2][1] = temp[1][0];
                arr[1][0] = temp[0][1];
                break;
            case 2:
                for (int i = 0; i < 18; i++) {
                    for (int j = 0; j < 3; j++) {
                        temp[i][j] = arr[i][j];
                    }
                }
                arr[3][0] = temp[3][2];
                arr[3][2] = temp[5][2];
                arr[5][2] = temp[5][0];
                arr[5][0] = temp[3][0];
                arr[3][1] = temp[4][2];
                arr[4][2] = temp[5][1];
                arr[5][1] = temp[4][0];
                arr[4][0] = temp[3][1];
                break;
            case 3:
                for (int i = 0; i < 18; i++) {
                    for (int j = 0; j < 3; j++) {
                        temp[i][j] = arr[i][j];
                    }
                }
                arr[6][0] = temp[6][2];
                arr[6][2] = temp[8][2];
                arr[8][2] = temp[8][0];
                arr[8][0] = temp[6][0];
                arr[6][1] = temp[7][2];
                arr[7][2] = temp[8][1];
                arr[8][1] = temp[7][0];
                arr[7][0] = temp[6][1];
                break;
            case 4:
                for (int i = 0; i < 18; i++) {
                    for (int j = 0; j < 3; j++) {
                        temp[i][j] = arr[i][j];
                    }
                }
                arr[9][0] = temp[9][2];
                arr[9][2] = temp[11][2];
                arr[11][2] = temp[11][0];
                arr[11][0] = temp[9][0];
                arr[9][1] = temp[10][2];
                arr[10][2] = temp[11][1];
                arr[11][1] = temp[10][0];
                arr[10][0] = temp[9][1];
                break;
            case 5:
                for (int i = 0; i < 18; i++) {
                    for (int j = 0; j < 3; j++) {
                        temp[i][j] = arr[i][j];
                    }
                }
                arr[12][0] = temp[12][2];
                arr[12][2] = temp[14][2];
                arr[14][2] = temp[14][0];
                arr[14][0] = temp[12][0];
                arr[12][1] = temp[13][2];
                arr[13][2] = temp[14][1];
                arr[14][1] = temp[13][0];
                arr[13][0] = temp[12][1];
                break;
            case 6:
                for (int i = 0; i < 18; i++) {
                    for (int j = 0; j < 3; j++) {
                        temp[i][j] = arr[i][j];
                    }
                }
                arr[15][0] = temp[15][2];
                arr[15][2] = temp[17][2];
                arr[17][2] = temp[17][0];
                arr[17][0] = temp[15][0];
                arr[15][1] = temp[16][2];
                arr[16][2] = temp[17][1];
                arr[17][1] = temp[16][0];
                arr[16][0] = temp[15][1];
                break;
        }
        return 'o';
    }

    public static String turn(String turnmove) {
        switch (turnmove.toLowerCase()) {
            case "u":
                if (playing == true) {
                    moves.add(turnmove.toLowerCase());
                }
                rightFace(1);
                for (int i = 0; i < 18; i++) {
                    for (int j = 0; j < 3; j++) {
                        temp[i][j] = arr[i][j];
                    }
                }
                arr[3][0] = temp[6][0];
                arr[3][1] = temp[6][1];
                arr[3][2] = temp[6][2];
                arr[6][0] = temp[12][0];
                arr[6][1] = temp[12][1];
                arr[6][2] = temp[12][2];
                arr[12][0] = temp[9][0];
                arr[12][1] = temp[9][1];
                arr[12][2] = temp[9][2];
                arr[9][0] = temp[3][0];
                arr[9][1] = temp[3][1];
                arr[9][2] = temp[3][2];
                break;
            case "u'":
                if (playing == true) {
                    moves.add(turnmove.toLowerCase());
                }
                leftFace(1);
                for (int i = 0; i < 18; i++) {
                    for (int j = 0; j < 3; j++) {
                        temp[i][j] = arr[i][j];
                    }
                }
                arr[3][0] = temp[9][0];
                arr[3][1] = temp[9][1];
                arr[3][2] = temp[9][2];
                arr[6][0] = temp[3][0];
                arr[6][1] = temp[3][1];
                arr[6][2] = temp[3][2];
                arr[12][0] = temp[6][0];
                arr[12][1] = temp[6][1];
                arr[12][2] = temp[6][2];
                arr[9][0] = temp[12][0];
                arr[9][1] = temp[12][1];
                arr[9][2] = temp[12][2];
                break;
            case "d":
                if (playing == true) {
                    moves.add(turnmove.toLowerCase());
                }
                rightFace(6);
                for (int i = 0; i < 18; i++) {
                    for (int j = 0; j < 3; j++) {
                        temp[i][j] = arr[i][j];
                    }
                }
                arr[5][0] = temp[11][0];
                arr[5][1] = temp[11][1];
                arr[5][2] = temp[11][2];
                arr[11][0] = temp[14][0];
                arr[11][1] = temp[14][1];
                arr[11][2] = temp[14][2];
                arr[14][0] = temp[8][0];
                arr[14][1] = temp[8][1];
                arr[14][2] = temp[8][2];
                arr[8][0] = temp[5][0];
                arr[8][1] = temp[5][1];
                arr[8][2] = temp[5][2];
                break;
            case "d'":
                if (playing == true) {
                    moves.add(turnmove.toLowerCase());
                }
                leftFace(6);
                for (int i = 0; i < 18; i++) {
                    for (int j = 0; j < 3; j++) {
                        temp[i][j] = arr[i][j];
                    }
                }
                arr[11][0] = temp[5][0];
                arr[11][1] = temp[5][1];
                arr[11][2] = temp[5][2];
                arr[14][0] = temp[11][0];
                arr[14][1] = temp[11][1];
                arr[14][2] = temp[11][2];
                arr[8][0] = temp[14][0];
                arr[8][1] = temp[14][1];
                arr[8][2] = temp[14][2];
                arr[5][0] = temp[8][0];
                arr[5][1] = temp[8][1];
                arr[5][2] = temp[8][2];
                break;
            case "r":
                if (playing == true) {
                    moves.add(turnmove.toLowerCase());
                }
                leftFace(3);
                for (int i = 0; i < 18; i++) {
                    for (int j = 0; j < 3; j++) {
                        temp[i][j] = arr[i][j];
                    }
                }
                arr[2][2] = temp[12][0];
                arr[1][2] = temp[13][0];
                arr[0][2] = temp[14][0];
                arr[5][2] = temp[2][2];
                arr[4][2] = temp[1][2];
                arr[3][2] = temp[0][2];
                arr[17][2] = temp[5][2];
                arr[16][2] = temp[4][2];
                arr[15][2] = temp[3][2];
                arr[14][0] = temp[15][2];
                arr[13][0] = temp[16][2];
                arr[12][0] = temp[17][2];
                break;
            case "r'":
                if (playing == true) {
                    moves.add(turnmove.toLowerCase());
                }
                rightFace(3);
                for (int i = 0; i < 18; i++) {
                    for (int j = 0; j < 3; j++) {
                        temp[i][j] = arr[i][j];
                    }
                }
                arr[5][2] = temp[17][2];
                arr[4][2] = temp[16][2];
                arr[3][2] = temp[15][2];
                arr[17][2] = temp[12][0];
                arr[16][2] = temp[13][0];
                arr[15][2] = temp[14][0];
                arr[14][0] = temp[0][2];
                arr[13][0] = temp[1][2];
                arr[12][0] = temp[2][2];
                arr[2][2] = temp[5][2];
                arr[1][2] = temp[4][2];
                arr[0][2] = temp[3][2];
                break;
            case "l":
                if (playing == true) {
                    moves.add(turnmove.toLowerCase());
                }
                leftFace(4);
                for (int i = 0; i < 18; i++) {
                    for (int j = 0; j < 3; j++) {
                        temp[i][j] = arr[i][j];
                    }
                }
                arr[5][0] = temp[17][0];
                arr[4][0] = temp[16][0];
                arr[3][0] = temp[15][0];
                arr[17][0] = temp[12][2];
                arr[16][0] = temp[13][2];
                arr[15][0] = temp[14][2];
                arr[14][2] = temp[0][0];
                arr[13][2] = temp[1][0];
                arr[12][2] = temp[2][0];
                arr[2][0] = temp[5][0];
                arr[1][0] = temp[4][0];
                arr[0][0] = temp[3][0];
                break;
            case "l'":
                if (playing == true) {
                    moves.add(turnmove.toLowerCase());
                }
                rightFace(4);
                for (int i = 0; i < 18; i++) {
                    for (int j = 0; j < 3; j++) {
                        temp[i][j] = arr[i][j];
                    }
                }
                arr[2][0] = temp[12][2];
                arr[1][0] = temp[13][2];
                arr[0][0] = temp[14][2];
                arr[5][0] = temp[2][0];
                arr[4][0] = temp[1][0];
                arr[3][0] = temp[0][0];
                arr[17][0] = temp[5][0];
                arr[16][0] = temp[4][0];
                arr[15][0] = temp[3][0];
                arr[14][2] = temp[15][0];
                arr[13][2] = temp[16][0];
                arr[12][2] = temp[17][0];
                break;
            case "f":
                if (playing == true) {
                    moves.add(turnmove.toLowerCase());
                }
                leftFace(2);
                for (int i = 0; i < 18; i++) {
                    for (int j = 0; j < 3; j++) {
                        temp[i][j] = arr[i][j];
                    }
                }
                arr[2][0] = temp[6][0];
                arr[2][1] = temp[7][0];
                arr[2][2] = temp[8][0];
                arr[8][0] = temp[15][0];
                arr[7][0] = temp[15][1];
                arr[6][0] = temp[15][2];
                arr[15][0] = temp[9][2];
                arr[15][1] = temp[10][2];
                arr[15][2] = temp[11][2];
                arr[9][2] = temp[2][2];
                arr[10][2] = temp[2][1];
                arr[11][2] = temp[2][0];
                break;
            case "f'":
                if (playing == true) {
                    moves.add(turnmove.toLowerCase());
                }
                rightFace(2);
                for (int i = 0; i < 18; i++) {
                    for (int j = 0; j < 3; j++) {
                        temp[i][j] = arr[i][j];
                    }
                }
                arr[11][2] = temp[15][2];
                arr[10][2] = temp[15][1];
                arr[9][2] = temp[15][0];
                arr[2][0] = temp[11][2];
                arr[2][1] = temp[10][2];
                arr[2][2] = temp[9][2];
                arr[8][0] = temp[2][2];
                arr[7][0] = temp[2][1];
                arr[6][0] = temp[2][0];
                arr[15][2] = temp[6][0];
                arr[15][1] = temp[7][0];
                arr[15][0] = temp[8][0];
                break;
            case "b":
                if (playing == true) {
                    moves.add(turnmove.toLowerCase());
                }
                leftFace(5);
                for (int i = 0; i < 18; i++) {
                    for (int j = 0; j < 3; j++) {
                        temp[i][j] = arr[i][j];
                    }
                }
                arr[0][0] = temp[11][0];
                arr[0][1] = temp[10][0];
                arr[0][2] = temp[9][0];
                arr[6][2] = temp[0][0];
                arr[7][2] = temp[0][1];
                arr[8][2] = temp[0][2];
                arr[17][2] = temp[6][2];
                arr[17][1] = temp[7][2];
                arr[17][0] = temp[8][2];
                arr[11][0] = temp[17][2];
                arr[10][0] = temp[17][1];
                arr[9][0] = temp[17][0];
                break;
            case "b'":
                if (playing == true) {
                    moves.add(turnmove.toLowerCase());
                }
                rightFace(5);
                for (int i = 0; i < 18; i++) {
                    for (int j = 0; j < 3; j++) {
                        temp[i][j] = arr[i][j];
                    }
                }
                arr[6][2] = temp[17][2];
                arr[7][2] = temp[17][1];
                arr[8][2] = temp[17][0];
                arr[17][2] = temp[11][0];
                arr[17][1] = temp[10][0];
                arr[17][0] = temp[9][0];
                arr[11][0] = temp[0][0];
                arr[10][0] = temp[0][1];
                arr[9][0] = temp[0][2];
                arr[0][0] = temp[6][2];
                arr[0][1] = temp[7][2];
                arr[0][2] = temp[8][2];
                break;
            case "done":
                playing = false;
                break;
            case "mode":
                mode = !mode;
                break;
            case "test":
                turn("u");
                turn("d");
                turn("r");
                turn("l");
                turn("f");
                turn("b");
                break;
            default:
                System.out.println("That's not a move! Try again!");
                System.out.println();
                System.out.println("Which Move? Or done?");
                String turnmove2 = scn.next();
                turn(turnmove2);

        }
        return null;
    }

    public static String shorten() {
        for (int i = 0; i < (moves.size() - 3); i++) {
            switch (moves.get(i)) {
                case "u":
                    switch (moves.get(i + 1)) {
                        case "u":
                            switch (moves.get(i + 2)) {
                                case "u":
                                    switch (moves.get(i + 3)) {
                                        case "u":
                                            moves.remove(i);
                                            moves.remove(i);
                                            moves.remove(i);
                                            moves.remove(i);
                                            break;
                                    }
                            }
                    }
            }
        }
        for (int i = 0; i < (moves.size() - 3); i++) {
            switch (moves.get(i)) {
                case "u'":
                    switch (moves.get(i + 1)) {
                        case "u'":
                            switch (moves.get(i + 2)) {
                                case "u'":
                                    switch (moves.get(i + 3)) {
                                        case "u'":
                                            moves.remove(i);
                                            moves.remove(i);
                                            moves.remove(i);
                                            moves.remove(i);
                                            break;
                                    }
                            }
                    }
            }
        }
        for (int i = 0; i < (moves.size() - 3); i++) {
            switch (moves.get(i)) {
                case "d":
                    switch (moves.get(i + 1)) {
                        case "d":
                            switch (moves.get(i + 2)) {
                                case "d":
                                    switch (moves.get(i + 3)) {
                                        case "d":
                                            moves.remove(i);
                                            moves.remove(i);
                                            moves.remove(i);
                                            moves.remove(i);
                                            break;
                                    }
                            }
                    }
            }
        }
        for (int i = 0; i < (moves.size() - 3); i++) {
            switch (moves.get(i)) {
                case "d'":
                    switch (moves.get(i + 1)) {
                        case "d'":
                            switch (moves.get(i + 2)) {
                                case "d'":
                                    switch (moves.get(i + 3)) {
                                        case "d'":
                                            moves.remove(i);
                                            moves.remove(i);
                                            moves.remove(i);
                                            moves.remove(i);
                                            break;
                                    }
                            }
                    }
            }
        }
        for (int i = 0; i < (moves.size() - 3); i++) {
            switch (moves.get(i)) {
                case "r":
                    switch (moves.get(i + 1)) {
                        case "r":
                            switch (moves.get(i + 2)) {
                                case "r":
                                    switch (moves.get(i + 3)) {
                                        case "r":
                                            moves.remove(i);
                                            moves.remove(i);
                                            moves.remove(i);
                                            moves.remove(i);
                                            break;

                                    }
                            }
                    }
            }
        }
        for (int i = 0; i < (moves.size() - 3); i++) {
            switch (moves.get(i)) {
                case "r'":
                    switch (moves.get(i + 1)) {
                        case "r'":
                            switch (moves.get(i + 2)) {
                                case "r'":
                                    switch (moves.get(i + 3)) {
                                        case "r'":
                                            moves.remove(i);
                                            moves.remove(i);
                                            moves.remove(i);
                                            moves.remove(i);
                                            break;
                                    }
                            }
                    }
            }
        }
        for (int i = 0; i < (moves.size() - 3); i++) {
            switch (moves.get(i)) {
                case "l":
                    switch (moves.get(i + 1)) {
                        case "l":
                            switch (moves.get(i + 2)) {
                                case "l":
                                    switch (moves.get(i + 3)) {
                                        case "l":
                                            moves.remove(i);
                                            moves.remove(i);
                                            moves.remove(i);
                                            moves.remove(i);
                                            break;
                                    }
                            }
                    }
            }
        }
        for (int i = 0; i < (moves.size() - 3); i++) {
            switch (moves.get(i)) {
                case "l'":
                    switch (moves.get(i + 1)) {
                        case "l'":
                            switch (moves.get(i + 2)) {
                                case "l'":
                                    switch (moves.get(i + 3)) {
                                        case "l'":
                                            moves.remove(i);
                                            moves.remove(i);
                                            moves.remove(i);
                                            moves.remove(i);
                                            break;
                                    }
                            }
                    }
            }
        }
        for (int i = 0; i < (moves.size() - 3); i++) {
            switch (moves.get(i)) {
                case "f":
                    switch (moves.get(i + 1)) {
                        case "f":
                            switch (moves.get(i + 2)) {
                                case "f":
                                    switch (moves.get(i + 3)) {
                                        case "f":
                                            moves.remove(i);
                                            moves.remove(i);
                                            moves.remove(i);
                                            moves.remove(i);
                                            break;
                                    }
                            }
                    }
            }
        }
        for (int i = 0; i < (moves.size() - 3); i++) {
            switch (moves.get(i)) {
                case "f'":
                    switch (moves.get(i + 1)) {
                        case "f'":
                            switch (moves.get(i + 2)) {
                                case "f'":
                                    switch (moves.get(i + 3)) {
                                        case "f'":
                                            moves.remove(i);
                                            moves.remove(i);
                                            moves.remove(i);
                                            moves.remove(i);
                                            break;
                                    }
                            }
                    }
            }
        }
        for (int i = 0; i < (moves.size() - 3); i++) {
            switch (moves.get(i)) {
                case "b":
                    switch (moves.get(i + 1)) {
                        case "b":
                            switch (moves.get(i + 2)) {
                                case "b":
                                    switch (moves.get(i + 3)) {
                                        case "b":
                                            moves.remove(i);
                                            moves.remove(i);
                                            moves.remove(i);
                                            moves.remove(i);
                                            break;
                                    }
                            }
                    }
            }
        }
        for (int i = 0; i < (moves.size() - 3); i++) {
            switch (moves.get(i)) {
                case "b'":
                    switch (moves.get(i + 1)) {
                        case "b'":
                            switch (moves.get(i + 2)) {
                                case "b'":
                                    switch (moves.get(i + 3)) {
                                        case "b'":
                                            moves.remove(i);
                                            moves.remove(i);
                                            moves.remove(i);
                                            moves.remove(i);
                                            break;
                                    }
                            }
                    }
            }
        }
        return null;
    }

    public static String showMoves() {
        shorten();
        for (int i = 0; i < moves.size(); i++) {
            switch (moves.get(i)) {
                case "u":
                    moves.set(i, "u'");
                    break;
                case "u'":
                    moves.set(i, "u");
                    break;
                case "d":
                    moves.set(i, "d'");
                    break;
                case "d'":
                    moves.set(i, "d");
                    break;
                case "r":
                    moves.set(i, "r'");
                    break;
                case "r'":
                    moves.set(i, "r");
                    break;
                case "l":
                    moves.set(i, "l'");
                    break;
                case "l'":
                    moves.set(i, "l");
                    break;
                case "f":
                    moves.set(i, "f'");
                    break;
                case "f'":
                    moves.set(i, "f");
                    break;
                case "b":
                    moves.set(i, "b'");
                    break;
                case "b'":
                    moves.set(i, "b");
                    break;
            }
            System.out.println(moves.get(i));
        }
        System.out.println();
        solve();
        return null;
    }

    public static String scramble() {
        int randint = random.nextInt(10, 21);
        for (int i = 0; i < randint; i++) {
            int randint2 = random.nextInt(0, 12);
            switch (randint2) {
                case 0:
                    turn("u");
                    break;
                case 1:
                    turn("u'");
                    break;
                case 2:
                    turn("d");
                    break;
                case 3:
                    turn("d'");
                    break;
                case 4:
                    turn("r");
                    break;
                case 5:
                    turn("r'");
                    break;
                case 6:
                    turn("l");
                    break;
                case 7:
                    turn("l'");
                    break;
                case 8:
                    turn("f");
                    break;
                case 9:
                    turn("f'");
                    break;
                case 10:
                    turn("b");
                    break;
                case 11:
                    turn("b'");
                    break;
            }
        }

        return null;
    }

    public static String solve() {
        for (int i = moves.size() - 1; i >= 0; i--) {
            turn(moves.get(i));
        }
        show();
        return null;
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String move = null;
        while (playing) {
            if (mode) {
                show();
            }
            System.out.println("Which Move? Or Done? Or Scramble?");
            move = scn.next();
            move.toLowerCase();
            switch (move) {
                case "scramble":
                    scramble();
                    break;
                default:
                    turn(move);
            }
        }
        System.out.println("Could be solved with: ");
        showMoves();
    }
}
