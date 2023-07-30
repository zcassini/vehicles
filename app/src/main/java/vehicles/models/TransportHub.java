package vehicles.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import vehicles.Bicycle;
import vehicles.Car;
import vehicles.CargoCapable;
import vehicles.Ship;
import vehicles.Submarine;
import vehicles.Vehicle;

public class TransportHub {
    private int id;

    Map<Integer, Vehicle> vehicles; // store everything in one place
    // vs
    // Map<Integer, LandVehicle> landVehicles; // store all land vehicles in 1 place
    // Map<Integer, WaterVehicle> waterVehicles; // store all water vehicles in 1
    // place
    // vs
    Map<Integer, Car> cars; // all cars
    Map<Integer, Bicycle> bicycles; // all bikes
    Map<Integer, Ship> ships; // all ships
    Map<Integer, Submarine> submarines; // all subs


    // return a collection of bicycles as a Collection<Bicycle> using stream
        Collection<Bicycle> getAllBicycles() {
            return vehicles
            .values()
            .stream()
            .map(Bicycle.class::cast)
            .collect(Collectors.toList());
    }

    void printAllBicycles() {
        getAllBicycles().forEach(System.out::println);
    }

    public TransportHub() {
        this.id = 1;
    }

    public void addCar(Car car) {
        cars.put(id, car);
        id += 1;
    }

    public void addShip(Ship ship) {
        ships.put(id, ship);
        id += 1;
    }

    public void removeCar(int id) {
        cars.remove(id);
    }

    public void removeShip(int id) {
        ships.remove(id);
    }



    // public void addVehicle(Vehicle vehicle) {
    //     vehicles.put(id, vehicle);
    //     id += 1;
    // }

    // public void removeVehicle(int id) {
    //     vehicles.remove(id);
    // }

    public void dumpAllCargo() {
        for (var ship : ships.values()) {
            ship.dumpCargo();
        }

        // for (var freighter : freighters.values() )
        //     freighter.dumpCargo();
    }

    public void startAllEngines() {
        for (var car : cars.values()) car.startEngine();
        for (var ship : ships.values()) ship.startEngine();
        for (var submarine : submarines.values()) submarine.startEngine();
    }

    // public void dumpAllCargo() {
    //     // var - hey java you figure it out
    //     for (Vehicle vehicle : vehicles.values())
    //         // for (var vehicle : vehicles.values()) { // loop over all vehicles
    //         if (vehicle instanceof CargoCapable) {
    //             // vehicle.dumpCargo(); // vehicle doesnt know about dumping cargo
    //             // cast the the vehicle to CargoCapable
    //             ((CargoCapable) vehicle).dumpCargo();
    //             // int x = (int) 42.2
    //         }
    // }

    // public Collection<Vehicle> getAllVehicles() {
    //     return vehicles.values();
    // }

    // public Collection<Car> getAllCars() {
    //     Collection<Car> cars = new ArrayList<>();
    //     for (var vehicle : vehicles.values()) {
    //         if (vehicle instanceof Car) {
    //             cars.add((Car) vehicle);
    //         }
    //     }
    //     return cars;
    // }
}
