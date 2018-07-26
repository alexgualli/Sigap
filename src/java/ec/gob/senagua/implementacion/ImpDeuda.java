/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.senagua.implementacion;

import ec.gob.senagua.accesodatos.Coneccion;
import ec.gob.senagua.accesodatos.Parametro;
import ec.gob.senagua.dao.contrato.IntDeuda;
import ec.gob.senagua.entidades.Deuda;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paul
 */
public class ImpDeuda implements IntDeuda {

    Coneccion con = new Coneccion();

    @Override
    public int insertar(Deuda deuda) throws Exception {
        int insert = 0;
       
        return insert;
    }

    @Override
    public Deuda obtenerCodigo(int id) throws Exception {

        Deuda deuda = null;
       
        return deuda;
    }

    @Override
    public List<Deuda> obtenerTodos() throws Exception {
        
        
        List<Deuda> lista = new ArrayList<>();
        
        return lista;
    }

    @Override
    public int actualizar(Deuda deuda) throws Exception {
        int update = 0;
        
        return update;
    }

    @Override
    public int eliminar(int id) throws Exception {
        int delete = 0;
        String sql = "DELETE FROM public.deudas \n"
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
