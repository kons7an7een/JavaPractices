package Practice2_8;

public class stringArray {

    private String[] a = new String[100];
    private int N = 0;

    stringArray(String[] a) {
        this.a = a;
        N = a.length;
    }

    public String[] getA() {
        return a;
    }

    public void reverse() {
        String k;
        for (int i = 0; i < N/2; i++) {
            k = a[i];
            a[i] = a[N-i-1];
            a[N-i-1] = k;
        }
    }

}
