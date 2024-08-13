package HW_1.HW_3;


import java.awt.*;

public class SportCar extends Car implements Wiping {
    public SportCar(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(4);
    }

    @Override
    public void movement() {
        System.out.println("Спортивный автомобиль в движении!");
    }

    @Override
    public void maintenance() {
        System.out.println("Обслуживание спортивного автомобиля...");
    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadlights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }

    @Override
    public void wipMirrors() {
        System.out.println("Протираем зеркала спортивного автомобиля...");
    }

    @Override
    public void wipWindshield() {
        System.out.println("Протираем лобовое стекло спортивного автомобиля...");
    }

    @Override
    public void wipHeadlights() {
        System.out.println("Протираем фары спортивного автомобиля...");
    }
}
