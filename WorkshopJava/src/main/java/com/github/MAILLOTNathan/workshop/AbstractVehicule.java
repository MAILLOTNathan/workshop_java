package com.github.MAILLOTNathan.workshop;

public abstract class AbstractVehicule {
    private final String name;
    public abstract void move();
    public abstract double getSpeed();

    protected AbstractVehicule(String name) {
        this.name = name;
    }
    public String toString() {
        return String.format("AbstractVehicule: {name: %s,speed: %f", name, getSpeed());
    }
    public enum VehiculeType {
        CAR("car"),
        PLANE("plane"),
        BOAT("boat");
        private final String type;

        public String getType() {
            return type;
        }
        VehiculeType(String str) {
            this.type = str;
        }
    }
}
