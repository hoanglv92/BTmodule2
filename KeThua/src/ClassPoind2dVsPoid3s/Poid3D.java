package ClassPoind2dVsPoid3s;

public class Poid3D extends Poid2D {
    private float z = 0.0f;

    public Poid3D() {
    }

    public Poid3D(float z,float x,float y) {
        this.z = z;
        setX(x);
        setY(y);
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float z,float x, float y){
        this.z=z;
        setX(x);
        setY(y);
    }
    public float[] getXYZ(){
        float [] arr=new float[3];
        arr[0]=getX();
        arr[1]=getY();
        arr[2]=getZ();
        return arr;
    }

    @Override
    public String toString() {
        return "Poid3D{" +
                "z=" + z +
                "x=" +getX()+
                "y=" +getY()+
                '}';
    }
}