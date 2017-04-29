package com.itma.ibqlab.entity;

import com.itma.ibqlab.entity.AlumnosProfesores;
import com.itma.ibqlab.entity.Carrera;
import com.itma.ibqlab.entity.Prestamo;
import com.itma.ibqlab.entity.SesionLog;
import com.itma.ibqlab.entity.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-17T18:08:51")
@StaticMetamodel(Alumno.class)
public class Alumno_ { 

    public static volatile ListAttribute<Alumno, AlumnosProfesores> alumnosProfesoresList;
    public static volatile SingularAttribute<Alumno, String> apellidoPaterno;
    public static volatile SingularAttribute<Alumno, Date> createdAt;
    public static volatile ListAttribute<Alumno, Prestamo> prestamoList;
    public static volatile ListAttribute<Alumno, SesionLog> sesionLogList;
    public static volatile SingularAttribute<Alumno, String> noControl;
    public static volatile SingularAttribute<Alumno, Usuario> usuario;
    public static volatile SingularAttribute<Alumno, String> nombre;
    public static volatile SingularAttribute<Alumno, Carrera> carreraId;
    public static volatile SingularAttribute<Alumno, String> apellidoMaterno;
    public static volatile SingularAttribute<Alumno, Date> updatedAt;

}