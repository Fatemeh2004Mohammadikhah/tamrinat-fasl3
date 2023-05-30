import java.util.Random;

public class play {
   private int nan;
    Random rand=new Random();
    int r=rand.nextInt(10);
    public play(int n){
       nan=n;
    }
    public float amaliat (){
        return (r-nan+1)*nan;

    }
}
