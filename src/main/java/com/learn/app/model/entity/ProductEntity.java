package com.learn.app.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table("product")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {

    @PrimaryKey
    private UUID id;

    @Column("item_name")
    private String itemName;
    @Column("available_quantity")
    private Integer availableQuantity;
    @Column("product_category")
    private String productCategory;
    @Column("price_per_unit")
    private Float pricePerUnit;
}
