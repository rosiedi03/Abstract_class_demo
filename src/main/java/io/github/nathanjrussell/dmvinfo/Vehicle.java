package io.github.nathanjrussell.dmvinfo;

public abstract class Vehicle {
    private final String vin;
    private final int manufacturerYear;
    private final VehicleTypes vehicleType;

    public Vehicle(String vin, int manufacturerYear, VehicleTypes vehicleType) {
        this.vin = vin;
        this.manufacturerYear = manufacturerYear;
        this.vehicleType = vehicleType;
    }

    public String getVin() {
        return vin;
    }

    public int getManufacturerYear() {
        return manufacturerYear;
    }

    public VehicleTypes getVehicleType() {
        return vehicleType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehicle Information:\n");
        sb.append("\tVIN: ").append(vin).append("\n");
        sb.append("\tManufacture Year: ").append(manufacturerYear).append("\n");
        sb.append("\tVehicle Type: ").append(vehicleType).append("\n");
        return sb.toString();
    }
}
