package Practice7_4;

import static java.lang.Math.sqrt;

public class MathFunc implements MathCalculable {
    @Override
    public double pow(int a, int b) {
        double res = 1;
        if (b > 1) {
            for (int i = 0; i < b; i++) {
                res *= a;
            }
            return res;
        } else if (b < -1) {
            for (int i = 1; i < -b; i++) {
                res *= a;
            }
            return 1/res;
        } else if (b == 0) return 1;
        return 0;
    }

    @Override
    public double absC(int Re, int Im) {
        return sqrt(pow(Re, 2) + pow(Im, 2));
    }

    @Override
    public double findCircleLength(int r) {
        return 2 * PI * r;
    }

}
