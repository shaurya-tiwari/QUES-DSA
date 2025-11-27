// 1 patterns 

public class starpattterns {

    public void print1(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* "); // it should not pprint in println
            }
            System.out.println();
        }
    }

    public void print2(int n) {
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public void print3(int n) {
        // 1
        // 12
        // 123
        // 1234
        // 12345
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void print4(int n) {
        // 0
        // 11
        // 222
        // 3333
        // 44444
        // 555555
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public void print5(int n) {
        // * * * * * *
        // * * * * *
        // * * * *
        // * * *
        // *
        for (int i = 0; i <= n; i++) {
            // formula (n-row+1)
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public void print6(int n) {
        // 012345
        // 01234
        // 0123
        // 012
        // 01
        // 0
        for (int i = 0; i <= n; i++) {

            for (int j = 0; j < n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public void print7(int n) {
        // *
        // ***
        // *****
        // *******
        // *********
        // here will 3 inner loop
        // the logic is = n-i-1 , n=tota number of row and column and i = current
        // itration
        // flow of print will = space star space
        for (int i = 0; i < n; i++) {
            // space_____________________
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // star________________________
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void print8(int n) {

        for (int i = 0; i < n; i++) {

            // *********
            // // *******
            // // *****
            // // ***
            // // *
            // space_____________________
            for (int j = 0; j < n + i; j++) {
                System.out.print(" ");
            }
            // star________________________fornnula - 2n-(2i+1)
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void print9(int n) {

        for (int i = 0; i < n; i++) {

        }
    }

    public static void main(String[] args) {
        starpattterns starpattterns = new starpattterns();
        starpattterns.print7(5);
        starpattterns.print8(5);
    }
}

