package HW_1.store3D.models;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    public int ID;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> Cameras = new ArrayList<Camera>();

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.ID = id;
        if (models.size() > 0) {
            this.Models = models;
        } else {
            throw new Exception("Должна быть одна модель");
        }

        if (cameras.size() > 0) {
            this.Cameras = cameras;
        } else {
            throw new Exception("Должна быть одна модель");
        }
    }

    public <Fla> Fla method1(Fla Flash) {
        return Flash;
    }

    public <Mod, Sce> Mod method2(Mod Model, Sce Scene) {
        return Model;
    }

}
