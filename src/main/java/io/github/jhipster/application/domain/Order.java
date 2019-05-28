package io.github.jhipster.application.domain;


import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

/**
 * A Order.
 */
@Entity
@Table(name = "jhi_order")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "order_id", nullable = false)
    private String orderId;

    @Column(name = "order_date")
    private Instant orderDate;

    @Column(name = "bill_value")
    private Long billValue;

    @OneToOne
    @JoinColumn(unique = true)
    private OrderItems orderItems;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public Order orderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Instant getOrderDate() {
        return orderDate;
    }

    public Order orderDate(Instant orderDate) {
        this.orderDate = orderDate;
        return this;
    }

    public void setOrderDate(Instant orderDate) {
        this.orderDate = orderDate;
    }

    public Long getBillValue() {
        return billValue;
    }

    public Order billValue(Long billValue) {
        this.billValue = billValue;
        return this;
    }

    public void setBillValue(Long billValue) {
        this.billValue = billValue;
    }

    public OrderItems getOrderItems() {
        return orderItems;
    }

    public Order orderItems(OrderItems orderItems) {
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
        if (!(o instanceof Order)) {
            return false;
        }
        return id != null && id.equals(((Order) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Order{" +
            "id=" + getId() +
            ", orderId='" + getOrderId() + "'" +
            ", orderDate='" + getOrderDate() + "'" +
            ", billValue=" + getBillValue() +
            "}";
    }
}
