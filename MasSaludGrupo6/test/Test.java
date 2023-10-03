
import accesoADatos.AfiliadoData;
import entidades.Afiliado;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Monitor_Plano
 */
public class Test {
    
       
    public static void main(String[] args){
        
        AfiliadoData afiliado = new AfiliadoData();
        //Afiliado _afiliado = new Afiliado("Rios","Carmen","45236789", "Su casa 365","1234567889", true);
                       
       // System.out.println((afiliado.guardarAfiliado(_afiliado)).toString());
        
       // afiliado.eliminarAfiliado(2);
       
     // Afiliado _afiliado = new Afiliado(2,"Rios","Carmen","0011111000", "Su casa 365","1234567889", true);
       
     //  afiliado.modificarAfiliado(_afiliado);
       
        for (Afiliado item: afiliado.listarAfiliado()) {
            System.out.println(item.toString());
        }
        
        System.out.println((afiliado.buscarAfiliadoPorDni(" 45236874")).toString());
        System.out.println((afiliado.buscarAfiliadoPorDni("45206874")));
        
        
    }      
}
