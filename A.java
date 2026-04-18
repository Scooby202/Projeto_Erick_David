public class A {

    private int A1;
    private float A2;

    public A() {

        A1 = 0;
        A2 = 0;

    }

    public int getA1() {

        return A1;

    }

    public float getA2() {

        return A2;

    }

    public void setA1(int mudarValor) {

        A1 = mudarValor;

    }

    public void setA2(float mudarValor) {

        A2 = mudarValor;

    }

    public void MA1() {

        System.out.println("Método: MA1");

    }

    public void MA2() {

        System.out.println("Método: MA2");

    }

    public void MA3() {

        System.out.println("Alteração a classe A partir do clone");

    }

    public int getsoma(int A, int B) {
        return A + B;
    }
}
