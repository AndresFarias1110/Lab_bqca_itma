package com.itma.ibqlab.entity;

import com.itma.ibqlab.entity.Alumno;
import com.itma.ibqlab.entity.AlumnosProfesoresPK;
import com.itma.ibqlab.entity.Profesor;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-17T18:08:51")
@StaticMetamodel(AlumnosProfesores.class)
public class AlumnosProfesores_ { 

    public static volatile SingularAttribute<AlumnosProfesores, AlumnosProfesoresPK> alumnosProfesoresPK;
    public static volatile SingularAttribute<AlumnosProfesores, Alumno> alumno;
    public static volatile SingularAttribute<AlumnosProfesores, Profesor> profesor;
    public static volatile SingularAttribute<AlumnosProfesores, String> nombre;

}