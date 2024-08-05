package HW_1.store3D.models;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    public int ID;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> Cameras ;

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.ID = id;
        this.Models = models;
        this.Cameras = cameras;
        this.Flashes =flashes;
    }

    public Flash getFirstFlash(List<Flash> flashes) {
        if (flashes == null || flashes.isEmpty()) {
            return null;
        }
        return flashes.get(0);
    }


    public Scene createScene(List<PoligonalModel> models, List<Camera> cameras) throws Exception {

        int newId = this.ID + 1;
        return new Scene(newId, models, this.Flashes, cameras);
    }

}
