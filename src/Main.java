public class Main {

    private static int a = 4;
    private static int b = 7;

    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
    }

    private static void swap() {
        System.out.printf("a = %d\tb = %d\n", a, b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.printf("a = %d\tb = %d\n", a, b);
    }

    private static void swapXOR() {
        System.out.printf("a = %d\tb = %d\n", a, b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.printf("a = %d\tb = %d\n", a, b);
    }

    private static boolean chipsParty(int packs, boolean weekend) {
        return (packs >= 15) && ((packs <= 20) || weekend);
    }

    private static boolean greater6(int a, int b) {
        return (a == 6) || (b == 6) || ((a + b) == 6) || ((a - b) == 6);
    }

    private static int teenSum(int a, int b) {
        int sum = a + b;
        if ((sum >= 13) && (sum <= 19)) {
            return 19;
        }
        return sum;
    }

    private static boolean has77(int... arr) {
        int key = 7;
        int keyCount = 0;
        int separatorCount = 0;
        for (int i : arr) {
            if (i == key) {
                keyCount++;
                if (keyCount == 2) {
                    return true;
                }
            } else if ((keyCount == 1)) {
                separatorCount++;
            }
            if (separatorCount > 1) {
                keyCount = 0;
                separatorCount = 0;
            }
        }
        return false;
    }

    private static void task1() {
        swap();
        swapXOR();
    }

    private static void task2() {
        System.out.println("chipsParty(3, false) -> " + chipsParty(3, false));
        System.out.println("chipsParty(15, false) -> " + chipsParty(15, false));
        System.out.println("chipsParty(70, true) -> " + chipsParty(70, true));
    }

    private static void task3() {
        System.out.println("greater6(6, 4) -> " + greater6(6, 4));
        System.out.println("greater6(4, 5) -> " + greater6(4, 5));
        System.out.println("greater6(1, 5) -> " + greater6(1, 5));
    }

    private static void task4() {
        System.out.println("teenSum(3, 4) -> " + teenSum(3, 4));
        System.out.println("teenSum(10, 13) -> " + teenSum(10, 13));
        System.out.println("teenSum(13, 2) -> " + teenSum(13, 2));
    }

    private static void task5() {
        System.out.println("has77(1, 7, 7) -> " + has77(1, 7, 7));
        System.out.println("has77(1, 7, 1, 7) -> " + has77(1, 7, 1, 7));
        System.out.println("has77(1, 7, 1, 1, 7) -> " + has77(1, 7, 1, 1, 7));
    }


}