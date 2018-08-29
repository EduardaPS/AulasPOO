package POO;

public class Triangulo {

    /**
     *
     * @param a lado do triangulo
     * @param b lado do triangulo
     * @param c lado do triangulo
     * @return se é um triangulo mostra se é escaleno, equilatero ou isoceles
     */
    public String tipoDoTriangulo(int a,int b,int c){
        if (a+b > c && c+b >a && a+c >b){
            if (a == b && a == c){
                return "é um triangulo equilatero";
            }
            if (a == b || a == c || b == c){
                return "é um triangulo isosceles";
            }
            return "é um triangulo escaleno";
        }
        return "não é um triangulo";
    }
}
