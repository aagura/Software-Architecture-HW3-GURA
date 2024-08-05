package HW_1.store3D.inmemory;

import java.util.ArrayList;
import java.util.List;


import HW_1.store3D.models.*;

//Хранилище модели
public class ModelStore implements IModelChanger {
    private List<IModelChangedObserver> ChangeObservers= new ArrayList<>();
    private List<PoligonalModel> Models  = new ArrayList<>();
    private List<Flash> Flashes= new ArrayList<>();
    private List<Scene> Scenes = new ArrayList<>();
    private List<Camera> Cameras = new ArrayList<>();



    public void add (PoligonalModel model){
        Models.add (model);
        NotifyChange();
    }

    //Регистрация изменений модели
    @Override
    public void NotifyChange() {
        for (IModelChangedObserver observer: ChangeObservers) {
            observer.ApplyUpdateModel();
        }

    }

    @Override
    public void RegisterModelChanger(IModelChangedObserver o) {
        ChangeObservers.add(o);
    }

    @Override
    public void RemoveModelChanger(IModelChangedObserver o) {
        ChangeObservers.add(o);
    }

    public Scene GetScena(int id) {
        for (Scene scene : Scenes) {
            if (scene.ID == id) {
                return scene;
            }
        }
        return null;
    }

}
