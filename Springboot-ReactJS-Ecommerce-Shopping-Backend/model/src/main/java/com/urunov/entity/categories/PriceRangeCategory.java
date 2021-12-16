package com.urunov.entity.categories;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.urunov.entity.info.ProductInfo;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * User: hamdamboy
 * Project: model
 * Github: @urunov
 */

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class PriceRangeCategory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String type;


    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "priceRangeCategory")
    @JsonIgnore
    private List<ProductInfo> productInfos;


    public PriceRangeCategory(int id, String type) {

        this.id = id;
        this.type = type;
    }
}
