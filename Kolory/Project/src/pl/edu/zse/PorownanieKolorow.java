package pl.edu.zse;

public class PorownanieKolorow {
    PorownanieKolorow(KolorRGB colorrgb, KolorCMYK colorcmyk){
        if(isSameColor(colorrgb,colorcmyk)){
            System.out.print("\nKolory są identyczne\n");
        }else System.out.print("\nKolory są różne\n");

        System.out.print("\nNasycenia barw dla pierwszego koloru");
        System.out.printf("\nR: %d G:%d B:%d",colorrgb.getR(),colorrgb.getG(),colorrgb.getB());
        KolorCMYK cmykColorBuffer = colorConverter(colorrgb);
        System.out.printf("\nC: %d M:%d Y:%d K:%d", cmykColorBuffer.getC(), cmykColorBuffer.getM(), cmykColorBuffer.getY(), cmykColorBuffer.getK());
        System.out.print("\nNasycenia barw dla drugiego koloru");
        KolorRGB rgbColorBuffer = colorConverter(colorcmyk);
        System.out.printf("\nR: %d G:%d B:%d",rgbColorBuffer.getR(),rgbColorBuffer.getG(),rgbColorBuffer.getB());
        System.out.printf("\nC: %d M:%d Y:%d K:%d", colorcmyk.getC(), colorcmyk.getM(), colorcmyk.getY(), colorcmyk.getK());
    }

    private KolorCMYK colorConverter(KolorRGB color){
        float r = (float) color.getR()/255;
        float g = (float) color.getG()/255;
        float b = (float) color.getB()/255;

        float c,m,y,k;

        k = 1-Math.max(r,Math.max(g,b));

        if (k==1){
            c=m=y=0;
        }else {
            c = (1-r-k)/(1-k);
            m = (1-g-k)/(1-k);
            y = (1-b-k)/(1-k);
        }

        c*=100;
        m*=100;
        y*=100;
        k*=100;

        return new KolorCMYK((int)c,(int)m,(int)y,(int)k);
    }

    private KolorRGB colorConverter(KolorCMYK color){
        int R = 255*(100-color.getC())*(100-color.getK())/10000;
        int G = 255*(100-color.getM())*(100-color.getK())/10000;
        int B = 255*(100-color.getY())*(100-color.getK())/10000;

        return new KolorRGB(R,G,B);
    }

    private boolean isSameColor(KolorRGB rgb, KolorCMYK cmyk){
        KolorRGB colorBuffer = colorConverter(cmyk);

        return rgb.getR()==colorBuffer.getR()&&rgb.getG()==colorBuffer.getG()&&rgb.getB()==colorBuffer.getB();
    }
}
