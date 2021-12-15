package ru.mirea.task28;

class Car {

    public static class Door {

        private final boolean automatic;
        private boolean opened = false;

        public Door(boolean automatic) {
            this.automatic = automatic;
        }

        public boolean isAutomatic() {
            return automatic;
        }

        public boolean isOpened() {
            return opened;
        }

        public void setOpened(boolean opened) {
            this.opened = opened;
        }
    }

    public static class Engine {

        private final int power;
        private boolean started;

        public Engine(int power) {
            this.power = power;
        }

        public int getPower() {
            return power;
        }

        public boolean isStarted() {
            return started;
        }

        public void setStarted(boolean started) {
            this.started = started;
        }
    }

    private final Engine engine;
    private final Door[] doors;

    public Car(Engine engine, Door[] doors) {
        this.engine = engine;
        this.doors = doors;
    }

    public void start() {
        engine.setStarted(true);
    }

    public void stop() {
        engine.setStarted(false);
    }

    public void openDoor(int n) {
        doors[n].setOpened(true);
    }

    public void closeDoor(int n) {
        doors[n].setOpened(false);
    }

    public String name() {
        return "Car";
    }

    public static Car ferrari() {
        return new Car(
                new Engine(420),
                new Door[] {
                        new Door(true),
                        new Door(true)
                }
        ) {

            @Override
            public String name() {
                return "Mercedes electo car";
            }
        };
    }

}
public class CarClases {
    public static void main(String[] args) {
        Car car1 = Car.ferrari();
        System.out.println(car1.name());
    }
}
