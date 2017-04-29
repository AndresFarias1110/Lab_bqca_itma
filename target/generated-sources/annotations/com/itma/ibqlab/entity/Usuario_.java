package com.itma.ibqlab.entity;

import com.itma.ibqlab.entity.Alumno;
import com.itma.ibqlab.entity.GrupoUsuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-17T18:08:51")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, Date> createdAt;
    public static volatile SingularAttribute<Usuario, String> password;
    public static volatile ListAttribute<Usuario, GrupoUsuario> grupoUsuarioList;
    public static volatile SingularAttribute<Usuario, String> alumnoNoControl;
    public static volatile SingularAttribute<Usuario, Alumno> alumno;
    public static volatile SingularAttribute<Usuario, Date> updatedAt;

}