package ClassPoindVsMovablePoind;

public class Poind {
    private float x=0.0f;
    private float y=0.0f;

    public Poind() {
    }

    public Poind(float x, float y) {
        this.x = x;
        this.y = y;
    }
//get
    public  float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
    public float[] getXYZ(){
        float[]arr=new float[2];
        arr[0]=getX();
        arr[1]=getY();
        return arr;
    }

//set
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "Poind{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
