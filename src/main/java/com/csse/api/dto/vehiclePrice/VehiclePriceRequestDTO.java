package com.csse.api.dto.vehiclePrice;

import com.csse.api.enums.VehicleType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VehiclePriceRequestDTO {
    private VehicleType vehicleType; // Type of vehicle
    private double price; // Price for the vehicle type
    private long garbageCollectorId; // ID of the garbage collector managing this price
}
