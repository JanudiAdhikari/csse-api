package com.csse.api.repository;

import com.csse.api.model.VehiclePrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiclePriceRepository extends JpaRepository<VehiclePrice, Long> {
}
