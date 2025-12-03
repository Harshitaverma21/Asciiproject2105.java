import java.util.*;

public class Asciiproject {
    String s1[][] = {
            { " XXX  XXXX   XXX  XXXX  XXXXX XXXXX  XXX  X   X XXXXX XXXXX X   X X     X   X X   X  XXX  XXXX   XX   XXXX   XXX  XXXXX X   X X   X X   X X   X X   X XXXXX " },
            { "X   X X   X X   X X   X X     X     X   X X   X   X      X  X  X  X     XX XX XX  X X   X X   X X  X  X   X X   X   X   X   X X   X X   X  X X   X X      X " },
            { "XXXXX XXXX  X     X   X XXXX  XXXX  X     XXXXX   X   X  X  XXX   X     X X X X X X X   X XXXX  XX X  XXXX  XXXX    X   X   X X   X X X X   X     X     X   " },
            { "X   X X   X X   X X   X X     X     X  XX X   X   X   X  X  X  X  X     X   X X  XX X   X X     X XX  X  X  X   X   X   X   X  X X  XX XX  X X   X    X     " },
            { "X   X XXXX   XXX  XXXX  XXXXX X      XXX  X   X XXXXX  XX   X   X XXXXX X   X X   X  XXX  X     XXX X X   X  XXX    X    XXX    X   X   X X   X X     XXXXX " }
    };
    String s2[][] = {
            { " XXX    X    XXX  XXXXX X   X XXXXX XXXXX XXXXX  XXX  XXXXX " },
            { "X   X X X   X   X     X X   X X     X         X X   X X   X " },
            { "X   X   X      X  XXXXX XXXXX XXXXX XXXXX    X  XXXXX XXXXX " },
            { "X   X   X    X        X     X     X X   X   X   X   X     X " },
            { " XXX  XXXXX XXXXX XXXXX     X XXXXX XXXXX  X     XXX  XXXXX " }
    };
    
    int i, j, k, cnt, p;
    char c[];

    void position() {
        System.out.print("\n\t\tEnter a string -- ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        for (k = 0; k < s.length(); k++) {
            p = Character.toUpperCase(s.charAt(k)) - 64;
            System.out.print("\t" + p + " ");
        }
    }

    void single() {
        System.out.print("\n\t\tEnter any character to print the pattern of it -- ");
        Scanner in = new Scanner(System.in);
        String s = in.next();
        p = Character.toUpperCase(s.charAt(0)) - 64;
        cnt = 6 * (p - 1);
        for (i = 0; i < 5; i++) {
            c = String.valueOf(s1[i][0]).toCharArray();
            for (j = cnt; j < cnt + 6; j++) {
                System.out.print(c[j]);
            }
            System.out.println();
        }
    }

    void stringpattern() {
        System.out.print("\n\t\tEnter String to print -- ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        for (i = 0; i < 5; i++) {
            for (k = 0; k < s.length(); k++) {
                p = Character.toUpperCase(s.charAt(k)) - 64;
                cnt = 6 * (p - 1);
                c = String.valueOf(s1[i][0]).toCharArray();
                for (j = cnt; j < cnt + 6; j++) {
                    System.out.print(c[j]);
                }
            }
            System.out.println();
        }
    }

    void range() {
        System.out.print("\n\t\tEnter first letter of range  -- ");
        Scanner in = new Scanner(System.in);
        String st = in.next();
        System.out.print("\n\t\tEnter last letter of range  -- ");
        Scanner in2 = new Scanner(System.in);
        String en = in.next();
        int start = Character.toUpperCase(st.charAt(0)) - 64;
        int end = Character.toUpperCase(en.charAt(0)) - 64;
        for (i = 0; i < 5; i++) {
            c = String.valueOf(s1[i][0]).toCharArray();
            for (j = (6 * (start - 1)); j < (6 * (end - 1) + 6); j++) {
                System.out.print(c[j]);
            }
            System.out.println();
        }
    }

    void numposition() {
        System.out.print("\n\t\tEnter a number(0 - 9) -- ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        for (k = 0; k < s.length(); k++) {
            p = Character.toUpperCase(s.charAt(k)) - 47;
            System.out.print("\t" + p + " ");
        }
    }

    void numpattern() {
        System.out.print("\n\t\tEnter to print -- ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        for (i = 0; i < 5; i++) {
            for (k = 0; k < s.length(); k++) {
                p = Character.toUpperCase(s.charAt(k)) - 47;
                cnt = 6 * (p - 1);
                c = String.valueOf(s2[i][0]).toCharArray();
                for (j = cnt; j < cnt + 6; j++) {
                    System.out.print(c[j]);
                }
            }
            System.out.println();
        }
    }
    

    static void MainModule() {
        System.out.println("\n\n\t\t\tString Pattern Project\n\n");
        System.out.println("\n\t\t1. Find the position of characters ");
        System.out.println("\n\t\t2. Character Pattern ");
        System.out.println("\n\t\t3. String by pattern ");
        System.out.println("\n\t\t4. Range pattern  ");
        String c;
        System.out.print("\n\t\tChoose any one of them -- ");
        Scanner in = new Scanner(System.in);
        c = in.nextLine();
        Asciiproject p = new Asciiproject();
        if (c.equals("1")) {
            p.position();
        } else if (c.equals("2")) {
            p.single();
        } else if (c.equals("3")) {
            p.stringpattern();
        } else if (c.equals("4")) {
            p.range();
        } else if (c.equals("5")) {
            p.numposition();
        } else if (c.equals("6")) {
            p.numpattern();
        }
         
        else {
            System.out.println("\t\tWrong choice ");
        }
        System.out.println("\n\n\t\tDo you want to continue.. Press 1 else any key");
        Scanner input = new Scanner(System.in);
        c = input.next();
        if (c.equals("1")) {
            MainModule();
        }
    }

    public static void main(String[] args) {
        MainModule();
    }

}
