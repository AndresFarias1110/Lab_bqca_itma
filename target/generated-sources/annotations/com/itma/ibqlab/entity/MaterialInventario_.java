package com.itma.ibqlab.entity;

import com.itma.ibqlab.entity.Inventario;
import com.itma.ibqlab.entity.Material;
import com.itma.ibqlab.entity.MaterialInventarioPK;
import com.itma.ibqlab.entity.UnidadMedida;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-17T18:08:51")
@StaticMetamodel(MaterialInventario.class)
public class MaterialInventario_ { 

    public static volatile SingularAttribute<MaterialInventario, MaterialInventarioPK> materialInventarioPK;
    public static volatile SingularAttribute<MaterialInventario, Material> material;
    public static volatile SingularAttribute<MaterialInventario, UnidadMedida> unidadMedida;
    public static volatile SingularAttribute<MaterialInventario, String> observaciones;
    public static volatile SingularAttribute<MaterialInventario, Integer> cantidad;
    public static volatile SingularAttribute<MaterialInventario, Inventario> inventario;

}