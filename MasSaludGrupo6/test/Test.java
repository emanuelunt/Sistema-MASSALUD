
import accesoADatos.AfiliadoData;
import accesoADatos.EspecialidadData;
import accesoADatos.OrdenData;
import accesoADatos.PrestadorData;
import entidades.Afiliado;
import entidades.Especialidad;
import entidades.Orden;
import entidades.Prestador;
import java.time.LocalDate;
import java.time.LocalTime;

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
    
    public static void main(String[] args) {
        
       AfiliadoData afiliado = new AfiliadoData();
       Afiliado _afiliado = new Afiliado(1,"Rios","Carmen","45236789", "Su casa 365","1234567889", true);

      // System.out.println((afiliado.guardarAfiliado(_afiliado)).toString());
        // afiliado.eliminarAfiliado(2);
        // Afiliado _afiliado = new Afiliado(2,"Rios","Carmen","0011111000", "Su casa 365","1234567889", true);
        //  afiliado.modificarAfiliado(_afiliado);
        /*   for (Afiliado item: afiliado.listarAfiliado()) {
            System.out.println(item.toString());
        }
        
        System.out.println((afiliado.buscarAfiliadoPorDni(" 45236874")).toString());
        System.out.println((afiliado.buscarAfiliadoPorDni("45206874")));
         */
        Especialidad especialidad = new Especialidad(3,"Pediatra",true);
       // especialidad.setIdCodigo(3);
       // especialidad.setTipo("Pediatra");
       // especialidad.setActivo(true);
        
       Prestador prestador = new Prestador(1, "Sampaoli", "Juan Carlos", "00365400", "Barrio los jardines", "11000011", especialidad, true);
        
       // PrestadorData presData = new PrestadorData();

        // System.out.println(presData.guardarPrestador(prestador).toString());
        // presData.eliminarPrestador(1);
        //presData.modificarPrestador(prestador);
        
       /* for (Prestador items : presData.listarPrestador()) {
            System.out.println(items.toString());
        } */
        
        //System.out.println(presData.buscarPrestadorPorDni("00365401"));
        //System.out.println((presData.buscarPrestadorPorDni("00365400")).toString());
        
        EspecialidadData espe = new EspecialidadData();
        //System.out.println(espe.guardarEspecialidad(especialidad).toString());
        
        //espe.eliminarEspecialidad(2);
        
        //espe.modificarEspecialidad(especialidad);
        
        for (Especialidad items : espe.listarEspecialidad()) {
            System.out.println(items.toString());
        }
        System.out.println("------------------- Buscar ----------------------------");
        System.out.println((espe.buscarEspecialidadPorTipo("Pediatra")).toString());
        
               
        Orden consulta = new Orden(1,"P0002",_afiliado,prestador, LocalDate.now(), "Credito", 10250.3,true);
        OrdenData pedirOrden = new OrdenData();
        
       // pedirOrden.guardarOrden(consulta);        
       //pedirOrden.eliminarOrden(1);
       
       pedirOrden.modificarOrden(consulta);
        
    }    
}
