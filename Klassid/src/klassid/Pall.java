package klassid;


public class Pall {
    protected double x;
    protected double y;
    public Pall(double x, double y){
        this.x=x;
        this.y=y;
    
    }
    public double kaugustNullist(){
        return Math.sqrt(x*x+y*y);//kaivitage 
    }
    @Override
    public String toString(){
        return "Pall kohal ("+x+","+y+")";
    }
}
