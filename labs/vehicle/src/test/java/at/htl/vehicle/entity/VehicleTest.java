package at.htl.vehicle.entity;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class VehicleTest {

    @Test
    void createVehicle() {
        Vehicle commodore = new Vehicle("Opel", "Commodore", 100.0);
        assertThat(commodore.getBrand()).isEqualTo("Opel");
    }
}
