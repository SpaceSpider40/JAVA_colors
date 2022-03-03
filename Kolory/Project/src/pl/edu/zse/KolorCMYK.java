package pl.edu.zse;

public class KolorCMYK {
    private final int C,M,Y,K;

    public KolorCMYK(int c, int m, int y, int k) {
        if (c > 100) this.C=100;
        else if (c < 0) this.C=0;
        else this.C = c;

        if (m > 100) this.M=100;
        else if (m < 0) this.M=0;
        else this.M = m;

        if (y > 100) this.Y=100;
        else if (y < 0) this.Y=0;
        else this.Y = y;

        if (k > 100) this.K=100;
        else if (k < 0) this.K=0;
        else this.K = k;
    }

    public int getC() {
        return C;
    }

    public int getK() {
        return K;
    }

    public int getM() {
        return M;
    }

    public int getY() {
        return Y;
    }
}
