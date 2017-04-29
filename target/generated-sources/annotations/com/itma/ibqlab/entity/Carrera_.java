package com.itma.ibqlab.entity;

import com.itma.ibqlab.entity.Alumno;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-17T18:08:51")
@StaticMetamodel(Carrera.class)
public class Carrera_ { 

    public static volatile SingularAttribute<Carrera, String> nombreCarrera;
    public static volatile ListAttribute<Carrera, Alumno> alumnoList;
    public static volatile SingularAttribute<Carrera, Integer> id;

}