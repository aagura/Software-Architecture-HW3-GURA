package HW_1.HW_3;


import java.awt.*;

public class Harvester extends Car implements Fueling, Wiping {


    private Refueling refueling;

    public Harvester(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(6);
    }

    public void setRefuelingStation(Refueling refuelingStation) {
        this.refueling = refuelingStation;
    }

    /**
     * Заправить автомобиль
     */
    @Override
    public void fuel(FuelType fuelType) {
        if (refueling != null){
            refueling.fuel(fuelType);
        }
    }

    @Override
    public void movement() {
        System.out.println("Подметальная машина двигается по улице.");
    }

    @Override
    public void maintenance() {
        System.out.println("Обслуживание подметальной машины...");
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

    public void sweeping() {
        System.out.println("Подметальная машина метет улицу.");
    }



    @Override
    public void wipMirrors() {
        System.out.println("Протираем зеркала подметальной машины...");
    }

    @Override
    public void wipWindshield() {
        System.out.println("Протираем лобовое стекло подметальной машины...");
    }

    @Override
    public void wipHeadlights() {
        System.out.println("Протираем фары подметальной машины...");
    }


}
