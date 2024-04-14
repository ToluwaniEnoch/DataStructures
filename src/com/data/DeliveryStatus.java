package com.data;

import java.util.Optional;

public enum DeliveryStatus {

    PENDING("PENDING"), ACCEPTED("ACCEPTED"), CONFIRMED("CONFIRMED"),
    CANCELLED("CANCELLED"), REJECTED("REJECTED"), PICKED("SHIPPED");

    final String dfsOrderStatus;

    public String getDfsOrderStatus() {
        return dfsOrderStatus;
    }

    DeliveryStatus(String dfsOrderStatus) {
        this.dfsOrderStatus = dfsOrderStatus;
    }

    public static Optional<DeliveryStatus> resolveForPickupStatus(String pickUpStatus) {
        for (DeliveryStatus value : DeliveryStatus.values()) {
            if (pickUpStatus.equals(value.getDfsOrderStatus())) {
                return Optional.of(value);
            }
        }
        return Optional.empty();
    }

}
