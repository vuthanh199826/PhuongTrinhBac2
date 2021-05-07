import java.util.Scanner;

public class PTB2 {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("ax^2 + bx + c = 0");
        PTB2 obj1 = new PTB2();
        obj1.getter();
        if (obj1.a!=0) {
            double delta = obj1.getDelta();
            if (delta > 0) {
                System.out.println("phuong trinh co 2 nghiem la x1 = " + obj1.getRoot1() + " x2 = " + obj1.getRoot2());
            } else if (delta == 0) {
                System.out.println("phuong trinh co nghiem kep x = " + obj1.getRoot());
            } else if (delta < 0) {
                System.out.println("phuong trinh vo nghiem");
            }
        }else {
            System.out.println("phuong trinh co nghiem la " + -obj1.c/ obj1.b);
        }
    }

    double a, b, c;

    private PTB2() {
       this.a = 1;
       this.b = 1;
       this.c = 1;
    }
    void getter(){
        System.out.println("nhap a");
       this.a = sc.nextDouble();
        System.out.println("nhap b");
       this.b = sc.nextDouble();
        System.out.println("nhap c");
       this.c = sc.nextDouble();
    }
    double getDelta(){
        double delta = b*b - 4*a*c;
        return  delta;
    }
    double getRoot1(){
        double r1 = (-b + Math.sqrt(getDelta()))/2*a;
        return r1;
    }
    double getRoot2(){
        double r2 = (-b - Math.sqrt(getDelta()))/2*a;
        return r2;
    }
    double getRoot(){
        double r = -b/2*a;
        return r;
    }
}
