package entities

interface VehicleManager {

    fun addVehicle(v: Vehicle)
    fun getBrands() : Set<String>
}
