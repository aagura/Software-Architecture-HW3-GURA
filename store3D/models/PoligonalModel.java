package HW_1.store3D.models;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Texture> Textures;
    public List<Poligon> Poligons;

    public List<Texture> getTextures() {
        return Textures;
    }

    public List<Poligon> getPoligons() {
        return Poligons;
    }

    public PoligonalModel(List<Poligon> poligons) {
        Poligons = poligons;
    }

    public PoligonalModel(List<Texture> textures, List<Poligon> poligons) {
        Textures = textures;
        Poligons = poligons;
    }
}
