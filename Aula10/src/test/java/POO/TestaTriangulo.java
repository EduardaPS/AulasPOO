package POO;

import org.junit.Assert;
import org.junit.Test;

public class TestaTriangulo {

    @Test
   public void TestarTriangulo(){

        Triangulo triangulo = new Triangulo();

        public void testaEscaleno(){
            Assert.assertEquals("10X1X2 não é um triangulo", "não é um triangulo", triangulo.tipoDoTriangulo(10,1,2));
            Assert.assertEquals("1X10X2 não é um triangulo", "não é um triangulo", triangulo.tipoDoTriangulo(1,10,2));
            Assert.assertEquals("2X1X20 não é um triangulo", "não é um triangulo", triangulo.tipoDoTriangulo(2,1,20));
            Assert.assertEquals("0X1X2 não é um triangulo", "não é um triangulo", triangulo.tipoDoTriangulo(0,1,2));
            Assert.assertEquals("1X0X2 não é um triangulo", "não é um triangulo", triangulo.tipoDoTriangulo(1,0,2));
            Assert.assertEquals("1X2X0 não é um triangulo", "não é um triangulo", triangulo.tipoDoTriangulo(1,2,0));
            Assert.assertEquals("1X2X-1 não é um triangulo", "não é um triangulo", triangulo.tipoDoTriangulo(1,2,-1));
            Assert.assertEquals("1X-2X1 não é um triangulo", "não é um triangulo", triangulo.tipoDoTriangulo(1,-2,1));
            Assert.assertEquals("-1X2X1 não é um triangulo", "não é um triangulo", triangulo.tipoDoTriangulo(-1,2,1));
            Assert.assertEquals("3x4x5 é um triangulo escaleno", "é um triangulo escaleno",triangulo.tipoDoTriangulo(3,4,5));
        }
        public void testaIsosceles(){
            Assert.assertEquals("1X0X0 não é um triangulo", "não é um triangulo", triangulo.tipoDoTriangulo(1,0,0));
            Assert.assertEquals("0X0X1 não é um triangulo", "não é um triangulo", triangulo.tipoDoTriangulo(0,0,1));
            Assert.assertEquals("0X2X0 não é um triangulo", "não é um triangulo", triangulo.tipoDoTriangulo(0,2,0));
            Assert.assertEquals("4X4X6 é um triangulo isosceles", "é um triangulo isosceles",triangulo.tipoDoTriangulo(4,4,6));
            Assert.assertEquals("6X4X6 é um triangulo isosceles", "é um triangulo isosceles",triangulo.tipoDoTriangulo(6,4,6));
            Assert.assertEquals("4X6X6 é um triangulo isosceles", "é um triangulo isosceles",triangulo.tipoDoTriangulo(4,6,6));
        }
        public void testaEquilatero(){
            Assert.assertEquals("0x0x0 não é um triangulo", "não é um triangulo", triangulo.tipoDoTriangulo(0,0,0));
            Assert.assertEquals("4x4x4 é um triangulo equilatero", "é um triangulo equilatero", triangulo.tipoDoTriangulo(4,4,4));

        }



        Assert.assertEquals("-1X-2X-1 não é um triangulo", "não é um triangulo", triangulo.tipoDoTriangulo(-1,-2,-1));
        Assert.assertEquals("1X-2X-1 não é um triangulo", "não é um triangulo", triangulo.tipoDoTriangulo(1,-2,-1));
        Assert.assertEquals("-1X-2X1 não é um triangulo", "não é um triangulo", triangulo.tipoDoTriangulo(-1,-2,1));
        Assert.assertEquals("-1X2X-1 não é um triangulo", "não é um triangulo", triangulo.tipoDoTriangulo(-1,2,-1));

    }
}
