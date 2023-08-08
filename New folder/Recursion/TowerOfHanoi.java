package Recursion;

public class TowerOfHanoi {
    public static void towerOfHanoiPattern(int n, String src, String hlp, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }

        towerOfHanoiPattern(n - 1, src, dest, hlp);
        System.out.println("transfer disk" + n + "from" + src + "to" + dest);
        towerOfHanoiPattern(n - 1, hlp, src, dest);
    }

    public static void main(String[] args) {
        int n = 1;
        towerOfHanoiPattern(n, "S", "H", "D");
    }
}
