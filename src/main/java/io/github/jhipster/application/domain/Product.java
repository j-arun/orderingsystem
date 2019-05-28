package io.github.jhipster.application.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A Product.
 */
@Entity
@Table(name = "product")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name")
    private String productName;

    @NotNull
    @Column(name = "product_id", nullable = false)
    private String productId;

    @Column(name = "jhi_label")
    private String label;

    @Column(name = "is_in_stock")
    private String isInStock;

    @ManyToOne
    @JsonIgnoreProperties("products")
    private OrderItems orderItems;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public Product productName(String productName) {
        this.productName = productName;
        return this;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public Product productId(String productId) {
        this.productId = productId;
        return this;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getLabel() {
        return label;
    }

    public Product label(String label) {
        this.label = label;
        return this;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getIsInStock() {
        return isInStock;
    }

    public Product isInStock(String isInStock) {
        this.isInStock = isInStock;
        return this;
    }

    public void setIsInStock(String isInStock) {
        this.isInStock = isInStock;
    }

    public OrderItems getOrderItems() {
        return orderItems;
    }

    public Product orderItems(OrderItems orderItems) {
        this.orderItems = orderItems;
        return this;
    }

    public void setOrderItems(OrderItems orderItems) {
        this.orderItems = orderItems;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Product)) {
            return false;
        }
        return id != null && id.equals(((Product) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Product{" +
            "id=" + getId() +
            ", productName='" + getProductName() + "'" +
            ", productId='" + getProductId() + "'" +
            ", label='" + getLabel() + "'" +
            ", isInStock='" + getIsInStock() + "'" +
            "}";
    }
}
