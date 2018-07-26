/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.senagua.implementacion;

import ec.gob.senagua.accesodatos.Coneccion;
import ec.gob.senagua.accesodatos.Parametro;
import ec.gob.senagua.dao.contrato.IntCliente;
import ec.gob.senagua.entidades.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paul
 */
public class ImpCliente implements IntCliente {

    Coneccion con = new Coneccion();

    @Override
    public int insertar(Cliente cliente) throws Exception {
        int insert = 0;
        

        return insert;
    }

    @Override
    public Cliente obtenerCodigo(int id) throws Exception {
        Cliente cliente = null;
        
        return cliente;
    }

    @Override
    public List<Cliente> obtenerTodos() throws Exception {
        List<Cliente> lista = new ArrayList<>();
        
        return lista;
    }

    @Override
    public int actualizar(Cliente cliente) throws Exception {
        int update = 0;
       
        return update;
    }

    @Override
    public int eliminar(int id) throws Exception {
        int delete = 0;
        String sql = "DELETE FROM public.clientes\n"
                + " WHERE codigo = ?;";
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
    public List<Cliente> obtenerDato(String dato) throws Exception {
        List<Cliente> lista = new ArrayList<>();

        return lista;
    }

}
