package taunang.scriptsweet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tbl_kategori")
@Data
public class Kategori {

    @Id
    private Long id;
    private String kodekategori;
    private String namakategori;

}
