public class PrintAssemblyVolatile {

    private volatile int i = 0;

    public static void main(String[] args) {
        PrintAssemblyVolatile example = new PrintAssemblyVolatile();
        example.i++;
        System.out.println(example.i);
    }

}
