package ClassPoind2dVsPoid3s;

import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) {
        Poid2D poid2D=new Poid2D(2,5);
        Poid3D poid3D=new Poid3D(3,poid2D.getX(),poid2D.getY());
        System.out.println(poid2D.toString());
        System.out.println(poid3D.toString());
        System.out.println(Arrays.toString(poid2D.getXY()));
        System.out.println(Arrays.toString(poid3D.getXYZ()));
    }
}
