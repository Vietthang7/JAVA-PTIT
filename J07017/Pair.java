package J07017;

public class Pair<T1, T2> {

    private T1 first;
    private T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    private boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isPrime() {
        return isPrime((Integer) this.first) && isPrime((Integer) this.second);
    }

    public String toString() {
        return this.first + " " + this.second;
    }
}
