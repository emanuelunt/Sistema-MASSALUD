
import accesoADatos.AfiliadoData;
import accesoADatos.EspecialidadData;
import accesoADatos.OrdenData;
import accesoADatos.PrestadorData;
import entidades.Afiliado;
import entidades.Especialidad;
import entidades.Orden;
import entidades.Prestador;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

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
        
       PrestadorData presData = new PrestadorData();

        // System.out.println(presData.guardarPrestador(prestador).toString());
        // presData.eliminarPrestador(1);
        //presData.modificarPrestador(prestador);
        
       /* for (Prestador items : presData.listarPrestador()) {
            System.out.println(items.toString());
        } */
       
        System.out.println("------- Lista de prestadores X Especialidad -------");
        for (Prestador item : presData.listarPrestadorXespecialidad("Cardiología")) {
            System.out.println(item.toString());
        }
        
        //System.out.println(presData.buscarPrestadorPorDni("00365401"));
        //System.out.println((presData.buscarPrestadorPorDni("00365400")).toString());
        
        EspecialidadData espe = new EspecialidadData();
        //System.out.println(espe.guardarEspecialidad(especialidad).toString());
        
        //espe.eliminarEspecialidad(2);
        
        //espe.modificarEspecialidad(especialidad);
        System.out.println("------- Lista de  Especialidad -------");
        for (Especialidad items : espe.listarEspecialidad()) {
            System.out.println(items.toString());
        }
        System.out.println("------------------- Buscar ----------------------------");
        System.out.println((espe.buscarEspecialidadPorTipo("Geriatria")).toString());
        
               
        Orden consulta = new Orden(1,"P0002",_afiliado,prestador, LocalDate.now(), "Credito", 10250.3,true);
        OrdenData pedirOrden = new OrdenData();
        
       // pedirOrden.guardarOrden(consulta);        
       //pedirOrden.eliminarOrden(1);
       
       //pedirOrden.modificarOrden(consulta);
       
        System.out.println("-------  Listar Ordenes -----------");
        OrdenData _ordenes = new OrdenData();
        for (Orden item : _ordenes.listarOrdenes()) {
            System.out.println(item.toString());
        }
        
        System.out.println("-------  Listar Ordenes x Fecha -----------");
        for (Orden item : _ordenes.listarOrdenesXfecha(LocalDate.of(2023, 8, 17)) ) {
            System.out.println(item.toString());
        }
        
        System.out.println("-------  Listar Ordenes x id Afiliado -----------");
        for (Orden item : _ordenes.listarOrdenesXidAfiliado(2) ) {
            System.out.println(item.toString());
        }
        
        System.out.println("-------  Listar Ordenes x id Prestador -----------");
        for (Orden item : _ordenes.listarOrdenesXidPrestador(2) ) {
            System.out.println(item.toString());
        }
        
        System.out.println("------- Busqueda por apellido (parte del apellido) -----------");
        for (Afiliado item : afiliado.buscarAfiliadoPorApellido("ri") ) {
            System.out.println(item.toString());
        }
        
    }    
}
