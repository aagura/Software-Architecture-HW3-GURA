package HW_1.store3D.inmemory;

//Интерфейс смены модели
public interface IModelChanger {
    public void NotifyChange();

    void RegisterModelChanger(IModelChangedObserver o);
    void RemoveModelChanger(IModelChangedObserver o);
}