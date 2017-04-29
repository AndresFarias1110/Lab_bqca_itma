package com.itma.ibqlab.entity;

import com.itma.ibqlab.entity.Alumno;
import com.itma.ibqlab.entity.MaterialPrestamo;
import com.itma.ibqlab.entity.Profesor;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-17T18:08:51")
@StaticMetamodel(Prestamo.class)
public class Prestamo_ { 

    public static volatile SingularAttribute<Prestamo, Date> fechaDevolucionReal;
    public static volatile SingularAttribute<Prestamo, Date> fechaDevolucion;
    public static volatile SingularAttribute<Prestamo, Date> fechaPrestamo;
    public static volatile ListAttribute<Prestamo, MaterialPrestamo> materialPrestamoList;
    public static volatile SingularAttribute<Prestamo, String> observacionesDevolucion;
    public static volatile SingularAttribute<Prestamo, Alumno> alumnoNoControl;
    public static volatile SingularAttribute<Prestamo, Integer> id;
    public static volatile SingularAttribute<Prestamo, String> observacionesPrestamo;
    public static volatile SingularAttribute<Prestamo, Profesor> profesorId;

}