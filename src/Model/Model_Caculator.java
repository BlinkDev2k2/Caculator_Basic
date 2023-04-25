package Model;

public class Model_Caculator {
    private float s1, s2;

    public Model_Caculator() {
    }

    public float getS1() {
        return s1;
    }

    public float getS2() {
        return s2;
    }

    public void setS1(float s1) {
        this.s1 = s1;
    }

    public void setS2(float s2) {
        this.s2 = s2;
    }

    public float Sum(){
        return this.s1 + this.s2;
    }

    public float Sub(){
        return this.s1 - this.s2;
    }

    public float Mul(){
        return this.s1 * this.s2;
    }

    public float Div(){
        return this.s1 / this.s2;
    }

    public float Mod(){
        return this.s1 % this.s2;
    }

    public double Pow(){
        return Math.pow(this.s1, this.s2);
    }
}
