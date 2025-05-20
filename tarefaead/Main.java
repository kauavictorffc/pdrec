public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("123ABC", "Caminhão Volvo", 2020);

        OldVehicleStorage oldStorage = new OldVehicleStorage();

        IVehicleStorage storageAdapter = new VehicleStorageAdapter(oldStorage);

        storageAdapter.saveVehicleData(vehicle);
    }
}
