/*ABBCCCDDDDEEEEE*/
import java.util.*;
class AlphabetPattern {
    public static void main(String[] arg) {
        int line, row, col;
        char ch = 'A';
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        line = scanner.nextInt();
        for (row = 1; row <= line; row++) {
            for (col = 1; col <= row; col++) {
                System.out.print("" + ch);
            }
            System.out.println();
            ch++;
        }
    }
} /*101101010110101*/
class BinaryPattern {
    public static void main(String s[]) {
        int i, j;
        int count = 1;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.format("%d", count++ % 2);
                if (j == i && i != 5) System.out.println("");
            }
            if (i % 2 == 0) count = 1;
            else count = 0;
        }
    }
}
class ChristmasTree {
    public static final int segments = 4;
    public static final int height = 4;
    public static void main(String[] args) {
        makeTree();
    }
    public static void makeTree() {
        int maxStars = 2 * height + 2 * segments - 3;
        String maxStr = "";
        for (int l = 0; l < maxStars; l++) {
            maxStr += " ";
        }
        for (int i = 1; i <= segments; i++) {
            for (int line = 1; line <= height; line++) {
                String starStr = "";
                for (int j = 1; j <= 2 * line + 2 * i - 3; j++) {
                    starStr += "*";
                }
                for (int space = 0; space <= maxStars - (height + line + i); space++) {
                    starStr = " " + starStr;
                }
                System.out.println(starStr);
            }
        }
        for (int i = 0; i <= maxStars / 2; i++) {
            System.out.print(" ");
        }
        System.out.println(" " + "*" + " ");
        for (int i = 0; i <= maxStars / 2; i++) {
            System.out.print(" ");
        }
        System.out.println(" " + "*" + " ");
        for (int i = 0; i <= maxStars / 2 - 3; i++) {
            System.out.print(" ");
        }
        System.out.println(" " + "*******");
    }
}
class ChristmasTreePattern {
    public static void main(String[] arg) {
        drawChristmasTree(4);
    }
    private static void drawChristmasTree(int n) {
        for (int i = 0; i < n; i++) {
            triangle(i + 1, n);
        }
    }
    private static void triangle(int n, int max) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < max - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("X");
            }
            System.out.println("");
        }
    }
} /*Enter no of characters:7Enter String:PROGRAM       P      P R     P R O    P R O G   P R O G R  P R O G R A P R O G R A M  P R O G R A   P R O G R    P R O G     P R O      P R       P*/
import java.io.*;
class DiamondPattern {
    public static void main(String s[]) throws Exception {
        int i, j, k, n;
        String s1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no of characters:");
        n = Integer.parseInt(br.readLine());
        System.out.println("Enter String:");
        s1 = br.readLine();
        for (i = 0; i < n; i++) {
            for (j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (k = 0; k <= i; k++) {
                System.out.print(s1.charAt(k));
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        for (i = (n - 2); i >= 0; i--) {
            for (j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (k = 0; k <= i; k++) {
                System.out.print(s1.charAt(k));
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
import java.util.Scanner;
class FloydTriangle {
    public static void main(String args[]) {
        int n, num = 1, c, d;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows of floyd's triangle : ");
        n = in .nextInt();
        System.out.println("Floyd's triangle :-");
        for (c = 1; c <= n; c++) {
            for (d = 1; d <= c; d++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
} /*------------------112123123412345-------------------*/
class NumberPat1 {
    public static void main(String arg[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
import java.util.*;
class Pattern {
    public static void main(String[] args) {
        int i, j, k = 1, l, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of levels of pattern");
        n = sc.nextInt();
        System.out.println("\nPattern is : \n");
        for (i = 1; i <= n; i++) {
            l = i;
            for (j = 1; j <= k; j++) {
                if (j >= i + 1) {
                    System.out.print(--l);
                } else {
                    System.out.print(j);
                }
            }
            k = k + 2;
            System.out.println(" ");
        }
    }
} /*------------------543215432543545-------------------*/
class NumberPat2 {
    public static void main(String arg[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
} /*------------------123451234123121-------------------*/
class NumberPat3 {
    public static void main(String arg[]) {
        for (int i = 1, r = 5; i <= 5; i++, r--) {
            for (int j = 1; j <= r; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
} /*------------------1121231234123451234123121-------------------*/
class NumberPat4 {
    public static void main(String arg[]) {
        int ck = 0, c = 2;
        while (c > 0) {
            if (ck == 0) {
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j);
                    }
                    System.out.println();
                }
                ck++;
            } else {
                for (int i = 1, r = 5 - 1; i <= 5 - 1; i++, r--) {
                    for (int j = 1; j <= r; j++) {
                        System.out.print(j);
                    }
                    System.out.println();
                }
            }
            c--;
        }
    }
}
import java.io.*;
class Triangle {
    public static void main(String arg[]) {
        InputStreamReader istream = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(istream);
        System.out.println("Enter Triangle Size : ");
        int num = 0;
        try {
            num = Integer.parseInt(read.readLine());
        } catch (Exception Number) {
            System.out.println("Invalid Number!");
        }
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < num - (i - 1); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
                for (int k1 = 1; k1 < k; k1 += k) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
} /*------------------        *        **        ***        ****        *****        *****        ****        ***        **        *  -------------------*/
class StarPattern5 {
    public static void main(String arg[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
} /*---------------------------        **        ****        ******        ********        **********        ---------------------------*/
class StarPattern4 {
    public static void main(String arg[]) {
        int num = 12;
        int f = 2;
        int g = num - 1;
        for (int i = 1; i <= (num / 2); i++) {
            for (int j = 1; j <= num; j++) {
                if (j >= f && j <= g) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            f = f + 1;
            g = g - 1;
            System.out.println();
        }
    }
} /*----------------------------        *****        ****        ***        **        *        *        **        ***        ****        *****----------------------------*/
class StarPattern3 {
    public static void main(String arg[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
} /*--------------------------***************--------------------------*/
class StarPattern2 {
    public static void main(String arg[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*-------------------------
 **************-------------------------*/
class StarPattern1 {
    public static void main(String arg[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
} /*      1    2 2  3 34 4  3 3    2 2      1*/
class SquareKitePattern {
    public static void main(String args[]) {
        int i, j, k;
        for (i = 1; i <= 4; i++) {
            for (j = 4; j >= (i - 1) * 2 - 1; j--) {
                System.out.print(" ");
            }
            System.out.print(i);
            for (j = 2; j <= (i - 1) * 4; j++) {
                System.out.print(" ");
            }
            if (i > 1) System.out.print(i);
            System.out.print("\n");
        }
        for (i = 3; i >= 1; i--) {
            for (j = 4; j >= (i - 1) * 2 - 1; j--) {
                System.out.print(" ");
            }
            System.out.print(i);
            for (j = 2; j <= (i - 1) * 4; j++) {
                System.out.print(" ");
            }
            if (i > 1) System.out.print(i);
            System.out.print("\n");
        }
    }
} /*------------------12345123412312112123123412345-------------------*/
class NumberPat5 {
    public static void main(String arg[]) {
        int ck = 0, c = 2;
        while (c > 0) {
            if (ck == 0) {
                for (int i = 1, r = 5; i <= 5; i++, r--) {
                    for (int j = 1; j <= r; j++) {
                        System.out.print(j);
                    }
                    System.out.println();
                }
                ck++;
            } else {
                for (int i = 2; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j);
                    }
                    System.out.println();
                }
            }
            c--;
        }
    }
}
class NumberPat6 {
    public static void main(String arg[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
} /*123456789012345*/
class NumberPat7 {
    public static void main(String arg[]) {
        int t = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (t == 10) t = 0;
                System.out.print(t++);
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;
class Pattern {
    public static void main(String args[]) {
        int n, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = i; j <= n; j++) {
                if (i % 2 == 0) System.out.print("0");
                else System.out.print("1");
            }
            System.out.println();
        }
    }
}
class PrintPattern {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int j = n - i;
            while (j > 0) {
                System.out.print(" ");
                j--;
            }
            j = 1;
            while (j <= i) {
                System.out.print(" " + j);
                j++;
            }
            j = i - 1;
            while (j > 0) {
                System.out.print(" " + j);
                j--;
            }
            j = n - i;
            while (j > 0) {
                System.out.print(" ");
                j--;
            }
            System.out.println();
        }
    }
}
import java.util.*;
class Pascal {
    public static final int ROW = 12;
    private static int max = 0;
    public static void main(String[] args) {
        int[][] pascal = new int[ROW + 1][];
        pascal[1] = new int[1 + 2];
        pascal[1][1] = 1;
        for (int i = 2; i <= ROW; i++) {
            pascal[i] = new int[i + 2];
            for (int j = 1; j < pascal[i].length - 1; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                String str = Integer.toString(pascal[i][j]);
                int len = str.length();
                if (len > max) max = len;
            }
        }

        for (int i = 1; i <= ROW; i++) {
            for (int k = ROW; k > i; k--) {
                System.out.format("%-" + max + "s", " ");
            }
            for (int j = 1; j < pascal[i].length - 1; j++) {
                System.out.format("%-" + (max + max) + "s", pascal[i][j]);
            }
            System.out.println();
        }
    }
}
import java.io.*;
class NumberPayramid {
    public static void main(String[] args) throws Exception {
        int row;
        int i, j, k;
        int x = 1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of rows : ");
        row = Integer.parseInt(br.readLine());
        for (i = 1; i <= row; i++) {
            for (k = 1; k <= row - i; k++) {
                System.out.print(" ");
            }
            for (j = k + 1; j <= row; j++) {
                System.out.print(x);
            }
            for (int l = row; l > k - 1; l--) {
                System.out.print(x);
            }
            x++;
            System.out.println("");
        }
    }
}
import java.io.*;
class SpiralNumberPattern {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter no. for spiral pattern : ");
        int INPUT = Integer.parseInt(br.readLine());
        final int LEFT = 1;
        final int DOWN = 2;
        final int RIGHT = 3;
        final int UP = 4;
        int[][] patt = new int[INPUT][INPUT];
        //initial position         int x = 0;        int y = 0;
        //initial direction        int Direction = LEFT;
        //Master Loop        for (int i = 0; i < INPUT * INPUT; i++)        {
        int temp = i + 1;
        //Checking boundaries            if (y > INPUT - 1)            {                Direction = DOWN;                x++;                y--;                i--;                continue;            }            else if (x > INPUT - 1)            {                Direction = RIGHT;                x--;                y--;                i--;                continue;            }            else if (y < 0)            {                Direction = UP;                y++;                x--;                i--;                continue;            }            else if (x < 0)            {                Direction = LEFT;                y++;                x++;                i--;                continue;            }
        if (patt[x][y] == 0) {
            patt[x][y] = temp;
        } else {
            if (Direction == LEFT) {
                Direction = DOWN;
                y--;
            } else if (Direction == DOWN) {
                Direction = RIGHT;
                x--;
            } else if (Direction == RIGHT) {
                Direction = UP;
                y++;
            } else {
                Direction = LEFT;
                x++;
            }
            i--;
        }
        switch (Direction) {
            case LEFT:
                y++;
                break;
            case DOWN:
                x++;
                break;
            case RIGHT:
                y--;
                break;
            case UP:
                x--;
                break;
        }
    }
    // Print Grid Array  
          for (int i = 0; i < INPUT; i++)        {            for (int k = 0; k < INPUT; k++)            {                if (patt[i][k] <= 9)                    System.out.print(" " + patt[i][k] + " ");                else                    System.out.print(patt[i][k] + " ");            }            System.out.println();        }    }}