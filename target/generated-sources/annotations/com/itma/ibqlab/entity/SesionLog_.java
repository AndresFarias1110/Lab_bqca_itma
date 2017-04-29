package com.itma.ibqlab.entity;

import com.itma.ibqlab.entity.Alumno;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-17T18:08:51")
@StaticMetamodel(SesionLog.class)
public class SesionLog_ { 

    public static volatile SingularAttribute<SesionLog, Date> entrada;
    public static volatile SingularAttribute<SesionLog, Alumno> alumnosNoControl;
    public static volatile SingularAttribute<SesionLog, Integer> id;
    public static volatile SingularAttribute<SesionLog, Date> salida;

}