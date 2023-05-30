public class hazine {

    private int rahn1,rahn2,rahn3,energy1,energy2,energy3;
    private double maliat1,maliat2,maliat3;

    public int getEnergy1() {
        return energy1;
    }

    public void setEnergy1(int energy1) {
        this.energy1 = energy1;
    }

    public int getEnergy2() {
        return energy2;
    }

    public void setEnergy2(int energy2) {
        this.energy2 = energy2;
    }

    public int getEnergy3() {
        return energy3;
    }

    public void setEnergy3(int energy3) {
        this.energy3 = energy3;
    }

    public int getRahn1() {
        return rahn1;
    }

    public void setRahn1(int rahn1) {
        this.rahn1 = rahn1;
    }

    public int getRahn2() {
        return rahn2;
    }

    public void setRahn2(int rahn2) {
        this.rahn2 = rahn2;
    }

    public int getRahn3() {
        return rahn3;
    }

    public void setRahn3(int rahn3) {
        this.rahn3 = rahn3;
    }

    public double getMaliat1() {
        return maliat1;
    }

    public void setMaliat1(double maliat1) {
        this.maliat1 = maliat1;
    }

    public double getMaliat2() {
        return maliat2;
    }

    public void setMaliat2(double maliat2) {
        this.maliat2 = maliat2;
    }

    public double getMaliat3() {
        return maliat3;
    }

    public void setMaliat3(double maliat3) {
        this.maliat3 = maliat3;
    }
    public double home1()
    {
        double  maliatsalane1 = rahn1 * maliat1;
        double hazinekhone1 = rahn1+(5*energy1)+(5*maliatsalane1);
        return hazinekhone1;
    }
    public double home2(){
        double  maliatsalane2 = rahn2 * maliat2;
        double hazinekhone2 = rahn2+(5*energy2)+(5*maliatsalane2);
        return hazinekhone2;
    }
    public double home3()
    {
        double  maliatsalane3 = rahn3 * maliat3;
        double hazinekhone3 = rahn3+(5*energy3)+(5*maliatsalane3);
        return hazinekhone3;
    }
}
