package com.itma.ibqlab.entity;

import com.itma.ibqlab.entity.Bloque;
import com.itma.ibqlab.entity.MaterialInventario;
import com.itma.ibqlab.entity.MaterialPrestamo;
import com.itma.ibqlab.entity.TipoMaterial;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-06-17T18:08:51")
@StaticMetamodel(Material.class)
public class Material_ { 

    public static volatile SingularAttribute<Material, String> descripcion;
    public static volatile SingularAttribute<Material, Integer> cantidadMinima;
    public static volatile SingularAttribute<Material, Date> createdAt;
    public static volatile SingularAttribute<Material, String> uriImagen;
    public static volatile SingularAttribute<Material, TipoMaterial> tiposMaterialesId;
    public static volatile ListAttribute<Material, MaterialPrestamo> materialPrestamoList;
    public static volatile SingularAttribute<Material, Bloque> bloqueId;
    public static volatile SingularAttribute<Material, Integer> id;
    public static volatile ListAttribute<Material, MaterialInventario> materialInventarioList;
    public static volatile SingularAttribute<Material, String> nombre;
    public static volatile SingularAttribute<Material, Integer> cantidadDisponible;
    public static volatile SingularAttribute<Material, Date> updatedAt;

}