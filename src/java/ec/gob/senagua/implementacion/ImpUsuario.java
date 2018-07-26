/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.gob.senagua.implementacion;

import ec.gob.senagua.accesodatos.Parametro;
import ec.gob.senagua.entidades.Usuario;
import ec.gob.senagua.accesodatos.Coneccion;
import ec.gob.senagua.dao.contrato.IntUsuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NuevoUsuario
 */
public class ImpUsuario implements IntUsuario {

    Coneccion con = new Coneccion();

    @Override
    public int insertar(Usuario usuario) throws Exception {
        int insert = 0;

        return insert;
    }

    @Override
    public Usuario obtenerCodigo(int id) throws Exception {
        Usuario usuario = null;

        return usuario;
    }

    @Override
    public Usuario obtenerLogin(String nombre, String clave) throws Exception {
        Usuario usuario = null;
        return usuario;
    }

    @Override
    public List<Usuario> obtenerTodos() throws Exception {
        List<Usuario> usuarios = new ArrayList<>();
        
        return usuarios;
    }

    @Override
    public int actualizar(Usuario usuario) throws Exception {
        int update = 0;
        
        return update;
    }

    @Override
    public int eliminar(int id) throws Exception {
        int delete = 0;
        String sql = "DELETE FROM public.usuarios "
                + "WHERE codigo = ?;";
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
