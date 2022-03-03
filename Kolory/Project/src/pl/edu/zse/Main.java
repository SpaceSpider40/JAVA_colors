package pl.edu.zse;

public class Main {
    public static void main(String[] args) {
        System.out.print("\n---RGB---");
        KolorRGB color1 = new KolorRGB(255, 50, 78);
        KolorRGB color2 = new KolorRGB(10, 0, 10);

        PorownanieJasnosci porownanie1 = new PorownanieJasnosci(color1, color2);
        System.out.print("\n");
        KolorPrzeciwny kolorPrzeciwny = new KolorPrzeciwny(color2);

        System.out.print("\n\n---CMYK---");
        KolorCMYK color3 = new KolorCMYK(100,20,13,51);
        KolorCMYK color4 = new KolorCMYK(0,50,0,60);

        PorownanieJasnosci porownanie2 = new PorownanieJasnosci(color3,color4);
        System.out.print("\n");
        KolorPrzeciwny kolorPrzeciwny2 = new KolorPrzeciwny(color3);

        System.out.print("\n\n---Porównanie kolorów---");
        PorownanieKolorow porownanieKolorow = new PorownanieKolorow(color1,color4);

        System.out.print("\n");
    }
}
