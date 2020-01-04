package ClassPoind2dVsPoid3s;

public class Poid2D {
    private float x=0.0f;
    private float y=0.0f;

    public Poid2D(){

    }
    public Poid2D(float x,float y){
        this.x=x;
        this.y=y;
    }
    //get
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
    public float[] getXY(){
       float []arr=new float[2];
       arr[0]=getX();
       arr[1]=getY();
       return arr;
    }


    //set
    public void setXY(float x,float y){
        this.setX(x);
        this.y=y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Poid2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
