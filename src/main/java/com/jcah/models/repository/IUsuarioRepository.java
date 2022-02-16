package com.jcah.models.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jcah.models.entity.Usuario;

import java.util.List;

public interface IUsuarioRepository extends CrudRepository<Usuario, Long> {

    //  @Query("SELECT p FROM Producto  p WHERE p.nombre LIKE %?1% " + "OR p.marca LIKE %?1%" + "OR p.hechoEn LIKE %?1%")
    @Query("SELECT u FROM Usuario u WHERE" + " CONCAT(u.id_usuario,u.nombre,u.apellido_paterno,u.apellido_materno,u.correo,u.area.nombre_area)" + " LIKE %?1%")
    public List<Usuario> findAll(String palabraClave);


}
