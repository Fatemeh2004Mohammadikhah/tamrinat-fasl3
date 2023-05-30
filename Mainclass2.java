public class Mainclass {
    public static void main(String[] args) {
        hazine p=new hazine();
        p.setRahn1(67000);
        p.setRahn2(62000);
        p.setRahn3(75000);
        p.setEnergy1(2300);
        p.setEnergy2(2500);
        p.setEnergy3(1850);
        p.setMaliat1(0.025);
        p.setMaliat2(0.025);
        p.setMaliat3(0.02);
        System.out.println("hazine khone 1:"+p.home1()+"hazine khone 2:"+p.home2()+"hazine khone 3:"+p.home3());

    }
}
