package com.itma.ibqlab.entity;

import com.itma.ibqlab.entity.Material;
import com.itma.ibqlab.entity.UnidadMedida;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-17T18:08:51")
@StaticMetamodel(TipoMaterial.class)
public class TipoMaterial_ { 

    public static volatile SingularAttribute<TipoMaterial, String> nombreMateria;
    public static volatile ListAttribute<TipoMaterial, UnidadMedida> unidadMedidaList;
    public static volatile ListAttribute<TipoMaterial, Material> materialList;
    public static volatile SingularAttribute<TipoMaterial, Integer> id;

}