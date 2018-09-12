package POO;

import org.junit.Assert;
import org.junit.Test;

public class Teste {
    @Test
    public void testaEmail(){
        Email teste = new Email();
        Assert.assertTrue("Este e-mail era valido", teste.add("Pessoal" ,"email_valido@hotmail.com"));
        Assert.assertFalse("Este e-mail é invalido",teste.add("Trabalho","email/invalido@hotmail.com"));
        Assert.assertFalse("Este e-mail é invalido",teste.add("Pessoal","email.invalido@hotmail.com"));
        Assert.assertFalse("Este e-mail é invalido",teste.add("Pessoal2","email.invalido@.com"));
    }
    @Test
    public void testaTelefone(){
        Telefone telefone = new Telefone();
        Assert.assertTrue("Este telefone é valido",telefone.add("Pessoal","30345243"));
        Assert.assertFalse("Este telefone é invalido",telefone.add("Pessoal","991919911"));
        Assert.assertFalse("Este telefone é invalido",telefone.add("trabalho","0123"));
    }
}
