package org.example.presenter;
import org.example.model.ToyShop;
import org.example.ui.View;
import org.example.model.Toy;
import org.example.model.ToysForLottery;
import org.example.model.Lottery;


public class Presenter {

    private View view;
    private final ToyShop toyShop;

    public Presenter(View view, ToyShop toyShop) {
        this.view = view;
        this.toyShop = toyShop;
        view.setPresenter(this);
    }

    public String print(){
        return toyShop.toString();
    }

    public void addToy(Toy newToy){
        toyShop.add(newToy);
    }
    public void Frequency(int id, int frequency) {
        toyShop.changeFrequency(id, frequency);
    }

    public void runLottery(int number){
        ToysForLottery toysForLottery = new ToysForLottery(toyShop);
        Lottery toysWin = new Lottery(number, toysForLottery);
        toysWin.winToysList("src/main/java/org/example/winnerList.txt");


    }
}