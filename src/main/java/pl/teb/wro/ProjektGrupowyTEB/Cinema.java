package pl.teb.wro.ProjektGrupowyTEB;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cinema {
    @Id
    @GeneratedValue
    private long id;
}
