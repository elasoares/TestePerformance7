public class Principal {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5, 10);
        double area = retangulo.retornarArea();

        System.out.println("Área: " + area);
  

        System.out.println(retangulo.toString());
    }
}
