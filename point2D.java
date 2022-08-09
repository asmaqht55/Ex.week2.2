public class point2D {
private float x=0.0f;
private float y=0.0f;

    public point2D(){

    }
public point2D(float x,float y){
    this.x=x;
    this.y=y;
}


    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY(){
    float array[]={this.getX(),this.getY()};
    return array;
    }
public void setXY(float x,float y){
    this.setX(x);
    this.setY(y);
}

    @Override
    public String toString() {
        return "("+this.getX()+","+this.getY()+")";
    }
}
