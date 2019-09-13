public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
    }


    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return (this.b * this.b) - (4 * this.a * this.c);
    }

    public double getRoot1() {
        return (-this.b + Math.sqrt(getDiscriminant())) / (this.a * 2);

    }

    public double getRoot2() {
        return (-this.b - Math.sqrt(getDiscriminant())) / (this.a * 2);
    }

    public  void check(){
        if (getDiscriminant()==0){
            System.out.println("Phuong trinh co nghiem kep x1 = x2 = : " + getRoot1() );
        }else if (getDiscriminant()<0){
            System.out.println(" Phuong trinh vo nghiem ");
        }else {
            System.out.println("Phuong trinh co 2 nghiem : x1 = : "+ getRoot1() + " x2 : " +getRoot2());

        }
    }
}
