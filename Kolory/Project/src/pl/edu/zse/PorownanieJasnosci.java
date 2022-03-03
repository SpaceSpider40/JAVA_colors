package pl.edu.zse;

public class PorownanieJasnosci {
    PorownanieJasnosci(KolorRGB color1, KolorRGB color2){
        //LIGHTNESS
        double l1 = calcLightness(color1);
        double l2 = calcLightness(color2);

        if(l1>l2){
            System.out.printf("\nPierwszy kolor jest jaśniejszy o: %f", l1-l2);
        }else {
            System.out.printf("\nDrugi kolor jest jaśniejszy o: %f", l2-l1);
        }
        System.out.print("\n");

        //DOMINATING COLOR
            //COLOR1
        System.out.print("\nDla pierwszego koloru dominującą barwą jest ");
        calcDominatingHue(color1);
            //COLOR2
        System.out.print("\nDla drugiego koloru dominującą barwą jest ");
        calcDominatingHue(color2);
    }

    PorownanieJasnosci(KolorCMYK color1, KolorCMYK color2){
        int l1 = calcLightness(color1);
        int l2 = calcLightness(color2);

        if (l1<l2){
            System.out.printf("\nPierwszy kolor jest jaśniejszy o: %d",l2-l1);
        }
        else {
            System.out.printf("\nDrugi kolor jaśniejszy o: %d",l1-l2);
        }
        System.out.print("\n");

        System.out.print("\nDla pierwszego koloru dominującą barwą jest ");
        calcDominatingHue(color1);
        System.out.print("\nDla drugiego koloru dominującą barwą jest ");
        calcDominatingHue(color2);
    }
    private double calcLightness(KolorRGB color){
        return Math.sqrt( Math.pow(0.299*color.getR(), 2) + Math.pow(0.587*color.getG(),2) + Math.pow(0.114*color.getB(), 2));
    }
    private int calcLightness(KolorCMYK color){
        return color.getY()+color.getM()+color.getC();
    }

    private void calcDominatingHue(KolorRGB color){

        double l = calcLightness(color);

        if (color.getR()==color.getB()&&color.getR()==color.getG()&&color.getG()==color.getB()&&(l>0&&l<170)){
            System.out.print("szary");
        } else if (l==0){
            System.out.print("czarny");
        } else if (color.getR()==color.getB()&&color.getR()==color.getG()&&color.getG()==color.getB()&&l>=170){
            System.out.print("biały");
        } else if (color.getR()+color.getB()>color.getG()&&l>0){
            System.out.print("fioletowy");
        } else if (color.getR()+color.getG()>color.getB()&&l>0){
            System.out.print("żółty");
        } else if (color.getR()>color.getB()+color.getG()&&l>0){
            System.out.print("czerwony");
        } else if (color.getG()>color.getR()+color.getB()&&l>0){
            System.out.print("zielony");
        } else if (color.getB()>color.getR()+color.getG()&&l>0){
            System.out.print("niebieski");
        }
    }
    private void calcDominatingHue(KolorCMYK color) {
        if ((color.getC() == 100 && color.getM() == 100 && color.getY() == 100) || color.getK() == 100) {
            System.out.print("czarny");
        } else if ((color.getY() > color.getM() && color.getY() > color.getC()) && color.getK() < 100) {
            System.out.print("żółty");
        } else if ((color.getC() == 0 && color.getY() == 100) && color.getM() > 0 && color.getK() > 30) {
            System.out.print("fioletowy");
        } else if ((color.getC() > color.getY() && color.getM() > color.getY()) && color.getK() < 0) {
            System.out.print("niebieski");
        } else if ((color.getM() > color.getC() && color.getY() > color.getC()) && color.getK() < 0) {
            System.out.print("czerwony");
        } else if ((color.getC() > color.getM() && color.getY() > color.getM()) && color.getK() < 0) {
            System.out.print("zielony");
        } else if (color.getK() == 0 && color.getM() == 0 && color.getY() == 0 && color.getC() == 0) {
            System.out.print("biały");
        } else if ((color.getC() == color.getY() && color.getC() == color.getM()) && (color.getK() < color.getM() || color.getK() < color.getC() || color.getK() < color.getY())) {
            System.out.print("szary");
        } else if (color.getC() > color.getM() && color.getC() > color.getY() && color.getC() > color.getK()) {
            System.out.print("cyan");
        } else if (color.getM() > color.getK() && color.getM() > color.getY() && color.getM() > color.getC()) {
            System.out.print("magenta");
        } else if ((color.getY() == 0 && color.getM() == 0 && color.getC() == 0) && color.getK() < 100){
            System.out.print("szary");
        }
    }
}
