package pl.edu.zse;

public class KolorRGB {
    private final int R,G,B;

    KolorRGB(int R, int G, int B){
        if (R>255) this.R = 255;
        else if (R<0) this.R = 0;
        else this.R=R;

        if (G>255) this.G = 255;
        else if (G<0) this.G = 0;
        else this.G=G;

        if (B>255) this.B = 255;
        else if (B<0) this.B = 0;
        else this.B=B;
    }

    public int getB() {
        return B;
    }

    public int getG() {
        return G;
    }

    public int getR() {
        return R;
    }
}
