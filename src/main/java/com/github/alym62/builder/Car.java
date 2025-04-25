package com.github.alym62.builder;

public class Car {
    private String engine;
    private String wheels;
    private String color;
    private int doorQuantity;

    private Car(Builder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.color = builder.color;
        this.doorQuantity = builder.doorQuantity;
    }

    public static class Builder {
        private String engine;
        private String wheels;
        private String color;
        private int doorQuantity;

        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder setWheels(String wheels) {
            this.wheels = wheels;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setDoorQuantity(int doorQuantity) {
            this.doorQuantity = doorQuantity;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", wheels='" + wheels + '\'' +
                ", color='" + color + '\'' +
                ", doorQuantity=" + doorQuantity +
                '}';
    }
}
