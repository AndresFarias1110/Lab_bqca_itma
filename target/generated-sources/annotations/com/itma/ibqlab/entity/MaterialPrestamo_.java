package com.itma.ibqlab.entity;

import com.itma.ibqlab.entity.Material;
import com.itma.ibqlab.entity.MaterialPrestamoPK;
import com.itma.ibqlab.entity.Prestamo;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-17T18:08:51")
@StaticMetamodel(MaterialPrestamo.class)
public class MaterialPrestamo_ { 

    public static volatile SingularAttribute<MaterialPrestamo, Prestamo> prestamo;
    public static volatile SingularAttribute<MaterialPrestamo, Material> material;
    public static volatile SingularAttribute<MaterialPrestamo, String> observacionesDevolucion;
    public static volatile SingularAttribute<MaterialPrestamo, Integer> cantidad;
    public static volatile SingularAttribute<MaterialPrestamo, String> observacionesPrestamo;
    public static volatile SingularAttribute<MaterialPrestamo, MaterialPrestamoPK> materialPrestamoPK;

}