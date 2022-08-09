public class point3D extends point2D {
    private float z=00f;
    public point3D(){

    }
    public point3D(float x, float y, float z){

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x,float y,float z ){

    }
    public float[] getXYZ(){
      float arr[]={this.getX(),this.getY(),this.getZ()};
     return arr;
    }
    public String toString() {
        return "("+this.getX()+","+this.getY()+","+this.getZ()+")";
    }
}
