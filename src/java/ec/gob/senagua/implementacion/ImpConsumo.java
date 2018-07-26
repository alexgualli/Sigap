/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.senagua.implementacion;

import ec.gob.senagua.accesodatos.Coneccion;
import ec.gob.senagua.accesodatos.Parametro;
import ec.gob.senagua.dao.contrato.IntConsumo;
import ec.gob.senagua.entidades.Consumo;
import ec.gob.senagua.entidades.Medidor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ImpConsumo implements IntConsumo {

    Coneccion con = new Coneccion();

    @Override
    public int insertar(Consumo consumo) throws Exception {
        int insert = 0;
        
        return insert;
    }

    @Override
    public Consumo obtenerCodigo(int id) throws Exception {
        Consumo consumo = null;
        
        return consumo;
    }

    @Override
    public List<Consumo> obtenerTodos() throws Exception {
        List<Consumo> lista = new ArrayList<>();
     

        return lista;
    }

    @Override
    public int actualizar(Consumo consumo) throws Exception {
        int update = 0;
        
        return update;
    }

    @Override
    public int eliminar(int id) throws Exception {
        int delete = 0;
        String sql = "DELETE FROM public.consumo\n"
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
