package HW_1.store3D.inmemory;

public class Observer1 implements IModelChangedObserver{
    @Override
    public void ApplyUpdateModel() {
        System.out.println("Была добавлена новая полигональная модель - наблюдатель1");
    }
}
