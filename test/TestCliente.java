

import ec.gob.sigap.entidades.Cliente;
import ec.gob.sigap.entidades.Deuda;
import ec.gob.sigap.implementacion.ImpCliente;
import ec.gob.sigap.implementacion.ImpDeuda;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paul
 */
public class TestCliente {    
    
     @Test
    public void test() {
        
        ImpCliente imp = new ImpCliente();
        Cliente cliente = new Cliente();
        
        
        //cliente= new Cliente(100, "alex", "gualli", "UNACH", "0604405357", "alex.gualli.ga@gmail.com", "1997-10-10", 10);
             
        
        cliente.setCodigo(100);
        cliente.setNombre("Alex");
        cliente.setApellido("Gualli");
        cliente.setCedula("0604405360");
        cliente.setCodigoDis(10);
        cliente.setCorreo("sincuello@gmail.com");
        cliente.setDireccion("la dolo");
        cliente.setFechaNac("13-03-1997");
        cliente.setTelefono("0958995049");
        cliente.setEdad(20);
        
        
        
        
        //INSERTAR 
        int insert = 0;
         try {
             insert=imp.insertar(cliente);
             if(insert>0){
                System.out.println("INSERTADO: "+cliente.toString());                
            }                      
        } catch (Exception e) {
            System.err.println("¡ERROR! ERROR AL INSERTAR: " + e.getMessage());
        }        
        assertTrue(insert>0);
        
        //ACTUALIZAR
        int update = 0;
         try {
             cliente.setApellido("SIN");
             update=imp.actualizar(cliente);
             if(update>0){
                System.out.println("ACTUALIZADO: "+cliente.toString());                
            }                      
        } catch (Exception e) {
            System.err.println("¡ERROR! ERROR AL ACTUALIZAR: " + e.getMessage());
        }        
         assertTrue(update>0);
        
         //LISTAR POR CODIGO.
         Cliente cliente2 = null;
        try {
            cliente2 = imp.obtenerCodigo(100);
            System.out.println("BUSCADO POR CODIGO: " + cliente2.toString());
        } catch (Exception e) {
            System.err.println("ERROR! ERROR AL BUSCAR: " + e.getMessage());
        }
        assertTrue(cliente2 != null);       
        
        //LISTAR TODOS
        List<Cliente> lista = new ArrayList<>();
        try {
            lista = imp.obtenerTodos();
            System.out.println("TODOS LOS CLIENTES");
            for (Cliente cli : lista) {
                System.out.println("\t" + cli.toString());
            }
        } catch (Exception e) {
            System.err.println("¡ERROR! NINGUN CLIENTE ENCONTRADO: " +e);
        }
        assertTrue(lista.size() >0);     
        
        //OBTENER POR CEDULA O NOMBRE
        String dato ="06044053";
        List<Cliente> listaCedNom = new ArrayList<>();
        try {
            listaCedNom = imp.obtenerCedNom(dato);
            System.out.println("TODOS LOS CLIENTES "+dato);
            for (Cliente cli : listaCedNom) {
                System.out.println("\t" + cli.toString());
            }
        } catch (Exception e) {
            System.err.println("¡ERROR! NINGUN CLIENTE ENCONTRADO: " +e);
        }
        assertTrue(listaCedNom.size() >0); 
        
        //OBTENER POR CEDULA O NOMBRE
        dato ="0604405357";
        Cliente clie = null;
        try {
            clie = imp.obtenerCed(dato);
            System.out.println("TODOS LOS CLIENTES "+dato+"   "+clie.toString());            
        } catch (Exception e) {
            System.err.println("¡ERROR! NINGUN CLIENTE ENCONTRADO POR CEDULA: " +e);
        }
        assertTrue(clie != null);
        
        
        
        //OBTENER EL CODIGO POR CEDULA
        int cod=0;
        try {
            cod = imp.obtenerCodCed("0604405357");
            if(cod!=0){
                System.out.println("CODIGO: " + cod);
            }
        } catch (Exception e) {
            System.err.println("¡ERROR! NINGUN CLIENTE ENCONTRADO: " +e);
        }
        assertTrue(cod >0); 
        
        //ELIMINAR
        int delete = 0;
        try {
            delete = imp.eliminar(cliente.getCodigo());
            if (delete!=0) {
                System.out.println("ELIMINADO: " + cliente.toString());
            }
        } catch (Exception e) {
            System.err.println("¡ERROR! NO SE PUDO ELIMINAR: "+ e);
        }
        assertTrue(delete >0);
        
        

    }
  
        
        
        
    }

    
    

