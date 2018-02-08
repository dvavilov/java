package klassid;


public class Pall {
    protected double x;
    protected double y;
    //lisage pallile raadius
    //Lisage kask kontrollimaks, kas kaks palli puutuvad kokku
    
    public Pall(double x, double y){
        this.x=x;
        this.y=y;
    
    }
    public double kaugustNullist(){
        return Math.sqrt(x*x+y*y);//kaivitage 
    }
    public double getX(){return x;}
    public double getY(){return y;}
    public double kaugustPallist(Pall teine){
        double dx=getX()-teine.getX();
        double dy=getY()-teine.getY();
        return Math.sqrt(dx*dx+dy+dy);
    }
    public double R(){
    return Math.sqrt(x)
    }
    @Override
    public String toString(){
        return "Pall kohal ("+x+","+y+")";
    }
}
