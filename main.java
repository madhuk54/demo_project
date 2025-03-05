interface Demo {
    void work();
}

class Demo1 implements Demo {
    public void work() {
        System.out.println("Working");
    }
}

public class main{  
    public static void main(String[] args) {
        Demo1 de = new Demo1();  
        de.work();  
    }
}
