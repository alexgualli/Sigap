/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.sigap.implementacion;

import ec.gob.sigap.accesodatos.Coneccion;
import ec.gob.sigap.accesodatos.Parametro;
import ec.gob.sigap.dao.contrato.IntFactura;
import ec.gob.sigap.entidades.Factura;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paul
 */
public class ImpFactura implements IntFactura {

    Coneccion con = new Coneccion();

    @Override
    public int insertar(Factura factura) throws Exception {
        int insert = 0;
        

        return insert;
    }

    @Override
    public Factura obtenerCodigo(int id) throws Exception {

        

        Factura factura = null;
        
        return factura;
    }

    @Override
    public List<Factura> obtenerTodos() throws Exception {

        

        List<Factura> lista = new ArrayList<>();
        

        return lista;
    }

    @Override
    public int actualizar(Factura factura) throws Exception {
        int update = 0;
        

        return update;
    }

    @Override
    public int eliminar(int id) throws Exception {
        int delete = 0;
        String sql = "DELETE FROM factura "
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

    @Override
    public List<Factura> obtenerMedidor(String dato) throws Exception {
      
        List<Factura> lista = new ArrayList<>();
        

        return lista;
    }

}
