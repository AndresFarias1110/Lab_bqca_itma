package com.itma.ibqlab.entity;

import com.itma.ibqlab.entity.MaterialInventario;
import com.itma.ibqlab.entity.Periodo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-17T18:08:51")
@StaticMetamodel(Inventario.class)
public class Inventario_ { 

    public static volatile SingularAttribute<Inventario, Periodo> periodo;
    public static volatile SingularAttribute<Inventario, Date> fechaInventario;
    public static volatile SingularAttribute<Inventario, String> observaciones;
    public static volatile SingularAttribute<Inventario, Integer> id;
    public static volatile ListAttribute<Inventario, MaterialInventario> materialInventarioList;
    public static volatile SingularAttribute<Inventario, Date> anio;

}