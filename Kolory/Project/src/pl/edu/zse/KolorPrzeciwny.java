package pl.edu.zse;

public class KolorPrzeciwny {
    KolorPrzeciwny(KolorRGB color){
        KolorRGB invertedColor = invertRGBColor(color);
        System.out.printf("\nDla koloru: R:%d, G:%d, B:%d przeciwny jest R:%d, G:%d, B:%d",color.getR(),color.getG(),color.getB(),invertedColor.getR(),invertedColor.getG(),invertedColor.getB());
    }

    KolorPrzeciwny(KolorCMYK color){
        KolorCMYK invertedColor = invertedCMYKColor(color);
        System.out.printf("\nDla koloru: C:%d, M:%d, Y:%d, K:%d przeciwny jest C:%d, M:%d, Y:%d, K:%d",color.getC(),color.getM(),color.getY(),color.getK(),invertedColor.getC(),invertedColor.getM(),invertedColor.getY(),invertedColor.getK());
    }

    private KolorRGB invertRGBColor(KolorRGB color){
        int negR, negG, negB;
        negR = 255-color.getR();
        negG = 255-color.getG();
        negB = 255-color.getB();

        return new KolorRGB(negR,negG,negB);
    }
    private KolorCMYK invertedCMYKColor(KolorCMYK color){
        int negC,negM,negY,negK;
        negC=100-color.getC();
        negM=100-color.getM();
        negY=100-color.getY();
        negK=100-color.getK();

        return new KolorCMYK(negC,negM,negY,negK);
    }
}
