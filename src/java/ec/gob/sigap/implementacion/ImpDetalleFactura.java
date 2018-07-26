/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.sigap.implementacion;

import ec.gob.sigap.accesodatos.Coneccion;
import ec.gob.sigap.accesodatos.Parametro;
import ec.gob.sigap.dao.contrato.IntDetalleFactura;
import ec.gob.sigap.entidades.DetalleFactura;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paul
 */
public class ImpDetalleFactura implements IntDetalleFactura {

    Coneccion con = new Coneccion();

    @Override
    public int insertar(DetalleFactura detalle) throws Exception {
        int insert = 0;
   
        return insert;
    }

    @Override
    public DetalleFactura obtenerCodigo(int id) throws Exception {
        
        
        DetalleFactura detalle = null;
        
        return detalle;
    }

    @Override
    public List<DetalleFactura> obtenerTodos() throws Exception {
        
        List<DetalleFactura> lista = new ArrayList<>();
       

        return lista;
    }

    @Override
    public int actualizar(DetalleFactura detalle) throws Exception {
        int update = 0;
     
        return update;
    }

    @Override
    public int eliminar(int id) throws Exception {
        int delete = 0;
        String sql = "DELETE FROM public.detalle_factura\n"
                + " WHERE codigo=?;";
        List<Parametro> prts = new ArrayList<>();
        prts.add(new Parametro(1, id));
        try {
            delete = con.querySet(sql, prts);
        } catch (Exception e) {
            throw e;
        }
        return delete;
    }

}
