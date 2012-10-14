public class Power {

    public int power(int x, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= x;
        }
        return result;
    }

    public int recursivePower(int x, int n) {
        if (n == 1) return x;
        if (n % 2 == 0) {
            return recursivePower(x, n / 2) * recursivePower(x, n / 2);
        }
        return recursivePower(x, (n - 1) / 2) * recursivePower(x, (n - 1) / 2) * x;
    }

    public static void main(String[] args) {
        Power power = new Power();
        System.out.println(power.power(13, 11));
        System.out.println(power.recursivePower(13,11));
    }

}
