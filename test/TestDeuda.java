
import ec.gob.sigap.entidades.Cliente;
import ec.gob.sigap.entidades.Deuda;
import ec.gob.sigap.entidades.Factura;
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
public class TestDeuda {
    
    @Test
    public void test() {
        
       ImpDeuda imp = new ImpDeuda();
        
        Deuda deuda = new Deuda();
        
        deuda.setCodigo(100);
        deuda.setMesesPen(10);
        deuda.setValor(10);
        
        //INSERTAR 
        int insert = 0;
         try {
             insert=imp.insertar(deuda);
             if(insert>0){
                System.out.println("INSERTADO: "+deuda.toString());                
            }                      
        } catch (Exception e) {
            System.err.println("¡ERROR! ERROR AL INSERTAR: " + e.getMessage());
        }        
        assertTrue(insert>0);
        
        //ACTUALIZAR
        int update = 0;
         try {
             deuda.setMesesPen(20);
             update=imp.actualizar(deuda);
             if(update>0){
                System.out.println("ACTUALIZADO: "+deuda.toString());                
            }                      
        } catch (Exception e) {
            System.err.println("¡ERROR! ERROR AL ACTUALIZAR: " + e.getMessage());
        }        
         assertTrue(update>0);
        
          //LISTAR POR CODIGO
         Deuda deuda2 = null;
        try {
            deuda2 = imp.obtenerCodigo(100);
            System.out.println("BUSCADO POR CODIGO: " + deuda2.toString());
        } catch (Exception e) {
            System.err.println("ERROR! ERROR AL BUSCAR: " + e.getMessage());
        }
        assertTrue(deuda2 != null);       
        
        //LISTAR TODOS
        List<Deuda> lista = new ArrayList<>();
        try {
            lista = imp.obtenerTodos();
            System.out.println("TODOS LAS DEUDAS");
            for (Deuda deu : lista) {
                System.out.println("\t" + deu.toString());
            }
        } catch (Exception e) {
            System.err.println("¡ERROR! NINGUN CLIENTE ENCONTRADO: " +e);
        }
        assertTrue(lista.size() >0);
        
        
        //ELIMINAR
        int delete = 0;
        try {
            delete = imp.eliminar(deuda.getCodigo());
            if (delete!=0) {
                System.out.println("ELIMINADO: " + deuda.toString());
            }
        } catch (Exception e) {
            System.err.println("¡ERROR! NO SE PUDO ELIMINAR: "+ e);
        }
        assertTrue(delete >= 0);

        
    }
    
}
