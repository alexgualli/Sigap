
import ec.gob.sigap.entidades.Usuario;
import ec.gob.sigap.implementacion.ImpUsuario;
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
 * @author Usuario
 */
public class TestUsuario {

    @Test
    public void test() {
        
        ImpUsuario user = new ImpUsuario();
        
        Usuario usuario = new Usuario();
        
        usuario.setApellido("gualli");
        usuario.setCedula("0698532147");
        usuario.setClave("alex");
        usuario.setCodigo(100);
        usuario.setCorreo("gualli@hotmail.com");
        usuario.setDireccion("");
        usuario.setGenero("masculino");
        usuario.setNivel(1);
        usuario.setNombre("alex");
        usuario.setTipo("administrador");
        usuario.setNombreUsu("gualli");
        

        //INSERTAR
        int insert = 0;
        try {
            insert = user.insertar(usuario);
            if (insert != 0) {
                System.out.println("Insertado: " + usuario.toString());
            }
        } catch (Exception e) {
            System.err.println("Error al insertar: " + e.getMessage());
        }
        assertTrue(insert > 0);

        //ACTUALIZAR 
        int update = 0;
        try {
            usuario.setTipo("YO MERO");
            update = user.actualizar(usuario);
            if (update > 0) {
                System.out.println("ACTUALIZADO : " + usuario.toString());
            }
        } catch (Exception e) {
            System.err.println("¡ERROR! NO SE PUDO ACTUALIZAR" + e);
        }
        assertTrue(update > 0);

        //LISTAR POR CODIGO
        Usuario usuario1 = null;
        try {
            usuario1 = user.obtenerCodigo(100);
            System.out.println("Buscado por Codigo: " + usuario1.toString());
        } catch (Exception e) {
            System.err.println("ERROR! al buscar " + e.getMessage());
        }
        assertTrue(usuario1 != null);

        //LISTAR POR LOGIN
        Usuario usuario2 = null;
        try {
            usuario2 = user.obtenerLogin(usuario.getNombreUsu(), usuario.getClave());
            System.out.println("Buscado por Login: " + usuario2.toString());
        } catch (Exception e) {
            System.err.println("ERROR! al buscar " + e.getMessage());
        }
        assertTrue(usuario2 != null);

        //LISTAR TODOS
        List<Usuario> lista = new ArrayList<>();
        try {
            lista = user.obtenerTodos();
            System.out.println("\n TODOS LOS USUARIOS");
            for (Usuario tmp : lista) {
                System.out.println("\t" + tmp.toString());
            }
        } catch (Exception e) {
            System.err.println("¡ERROR! NINGUN USUARIO ENCONTRADO");
        }
        assertTrue(lista.size() > 0);

        //BUSCAR POR USUARIO O CORREO
        Usuario usuario3 = null;
        String dato = "alex";
        try {
            usuario3 = user.obtenerCorreoUsuario(dato);
            System.out.println("Buscado por correo o usuario: " + usuario3.toString());
        } catch (Exception e) {
            System.err.println("ERROR! al buscar " + e.getMessage());
        }
        assertTrue(usuario3 != null);
        
        //ACTUALIZAR CLAVE
        
        update = 0;
        try {
            usuario.setClave("unach");
            update = user.actualizarClave(usuario);
            if (update > 0) {
                System.out.println("ACTUALIZADO CLAVE: " + usuario.toString());
            }
        } catch (Exception e) {
            System.err.println("¡ERROR! NO SE PUDO ACTUALIZAR" + e);
        }
        assertTrue(update > 0);
        //ELIMINAR
        int delete = 0;
        try {
            delete = user.eliminar(usuario.getCodigo());
            if (delete!=0) {
                System.out.println("ELIMINADO: " + usuario.toString());
            }
        } catch (Exception e) {
            System.err.println("¡ERROR! NO SE PUDO ELIMINAR: "+ e);
        }
        assertTrue(delete > 0);
        
        

    }

}
