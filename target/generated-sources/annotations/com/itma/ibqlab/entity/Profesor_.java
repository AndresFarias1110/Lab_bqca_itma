package com.itma.ibqlab.entity;

import com.itma.ibqlab.entity.AlumnosProfesores;
import com.itma.ibqlab.entity.Prestamo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-17T18:08:51")
@StaticMetamodel(Profesor.class)
public class Profesor_ { 

    public static volatile ListAttribute<Profesor, AlumnosProfesores> alumnosProfesoresList;
    public static volatile SingularAttribute<Profesor, String> apellidoPaterno;
    public static volatile ListAttribute<Profesor, Prestamo> prestamoList;
    public static volatile SingularAttribute<Profesor, Integer> id;
    public static volatile SingularAttribute<Profesor, String> nombre;
    public static volatile SingularAttribute<Profesor, String> apellidoMaterno;

}