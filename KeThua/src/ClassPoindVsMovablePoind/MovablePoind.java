package ClassPoindVsMovablePoind;

import java.util.Arrays;

public class MovablePoind extends Poind {
    private float xspeed=0.0f;
    private float yspeed=0.0f;

    public MovablePoind(){

    }
    public MovablePoind(float xspeed,float yspeed){
        this.yspeed=yspeed;
        this.xspeed=xspeed;
    }
    public MovablePoind(float x,float y,float xspeed,float yspeed){
        this.xspeed=xspeed;
        this.yspeed=yspeed;
        setX(x);
        setY(y);

    }
//set
    public void setXspeed(float xspeed) {
        this.xspeed = xspeed;
    }

    public void setYspeed(float yspeed) {
        this.yspeed = yspeed;
    }
    public void setSpeed(float xspeed,float yspeed){
        this.xspeed=xspeed;
        this.yspeed=yspeed;
    }
//get
    public float[] getspeed(){
        float[]arr=new float[2];
        arr[0]=getXspeed();
        arr[1]=getYspeed();
        return arr;
    }

    public float getXspeed() {
        return xspeed;
    }

    public float getYspeed() {
        return yspeed;
    }

    public float[] move(){
        float x = 0;
        float y=0;
        float[]arr1=new float[2];
        x=xspeed+getX();
        y=yspeed+getY();
        arr1[0]=x;
        arr1[1]=y;
        return arr1;
    }

    @Override
    public String toString() {
        return "MovablePoind{" +
                "xspeed=" + xspeed +
                ", yspeed=" + yspeed +
                ",speed="+ Arrays.toString(getspeed()) +
                ",move="+ Arrays.toString(move()) +
                '}';
    }
}
