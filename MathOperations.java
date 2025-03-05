public interface MathOperations {
    int a=30;
    int b=50;
    int add(int a, int b);
    int subtract(int a, int b);
    int multiply(int a, int b);
}

 class calculator implements MathOperations {
    public int add(int a, int b) {
        return a+b;
    }
    public int subtract(int a, int b) {
        return a-b;
    }
    public int multiply(int a, int b) {
        return a*b;
    }
    }


