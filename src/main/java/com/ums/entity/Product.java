package com.ums.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Product")
public class Product extends Base {
    @NotEmpty(message = "Product name is required")
    private String productName;

    @NotEmpty(message = "Product type is required")
    private String productType;

    @NotNull(message = "Product  Id is required")
    private Number productId;

    private Boolean isDelete = false;
}
