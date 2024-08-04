package HW_1.store3D;

import HW_1.store3D.inmemory.ModelStore;
import HW_1.store3D.inmemory.Observer1;
import HW_1.store3D.models.Poligon;
import HW_1.store3D.models.PoligonalModel;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Observer1 observer1 = new Observer1();
        ModelStore store = new ModelStore();
        store.RegisterModelChanger(observer1);
        Poligon p1 = new Poligon();
        List<Poligon> poligons = new ArrayList<>();
        poligons.add(p1);
        PoligonalModel poligonalModel = new PoligonalModel(poligons);
        store.add (poligonalModel);


    }
}
