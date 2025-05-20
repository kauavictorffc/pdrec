public class VehicleStorageAdapter implements IVehicleStorage {
    private OldVehicleStorage oldStorage;

    public VehicleStorageAdapter(OldVehicleStorage oldStorage) {
        this.oldStorage = oldStorage;
    }

    @Override
    public void saveVehicleData(Vehicle vehicle) {
        String formattedData = formatVehicleData(vehicle);
        oldStorage.storeVehicleData(formattedData);
    }

    private String formatVehicleData(Vehicle vehicle) {
        return "ID: " + vehicle.getId() +
               ", Modelo: " + vehicle.getModel() +
               ", Ano: " + vehicle.getYear();
    }
}
