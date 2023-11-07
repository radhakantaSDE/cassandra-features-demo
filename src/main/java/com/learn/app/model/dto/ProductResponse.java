package com.learn.app.model.dto;

import com.learn.app.model.entity.ProductEntity;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
public class ProductResponse implements Serializable {

    private List<ProductEntity> orderEntities;
}
