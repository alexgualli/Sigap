/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.sigap.implementacion;

import ec.gob.sigap.accesodatos.Coneccion;
import ec.gob.sigap.accesodatos.Parametro;
import ec.gob.sigap.dao.contrato.IntMedidor;
import ec.gob.sigap.entidades.Cliente;
import ec.gob.sigap.entidades.Medidor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ImpMedidor implements IntMedidor {

    Coneccion con = new Coneccion();

    @Override
    public int insertar(Medidor medidor) throws Exception {
        int insert = 0;
       
        return insert;
    }

    @Override
    public Medidor obtenerCodigo(String id) throws Exception {
        Medidor medidor = null;
        
        return medidor;
    }

    @Override
    public List<Medidor> obtenerTodos() throws Exception {
        List<Medidor> lista = new ArrayList<>();
        
        return lista;
    }

    @Override
    public int actualizar(Medidor medidor) throws Exception {
        int update = 0;
        
        return update;
    }

    @Override
    public int eliminar(String id) throws Exception {
        int delete = 0;
        String sql = "DELETE FROM public.medidor\n"
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
