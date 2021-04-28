public class Computer extends Calculator{
    @Override
    double areaCircle(double r) {
        System.out.println("execute of areaCircle of Computer");
        return Math.PI * r * r;

    }

}
