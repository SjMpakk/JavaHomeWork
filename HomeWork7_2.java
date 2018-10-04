import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Java homework lesson 7
 *
 * @author Alexey Denisov
 * @version 3 dated Oct 04, 2018
 */

public class HomeWork7_2 {
    public static void main(String[] args) {

        MyWindow myWindow = new MyWindow();
        myWindow.setVisible(true);

    }
}

class MyWindow extends JFrame {
    private JButton button = new JButton("feed the cats");


    MyWindow() {
        super("Cats");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 300, 100);
        setLayout(new BorderLayout());

        add(button);
        add(button, BorderLayout.CENTER);
        button.addActionListener(new ButtonEventListener());
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String message = "";
            message += "Cats:\n";
            Cat[] x = {new Cat("MyrMyr", 4), new Cat("Myay", 12), new Cat("KisKis", 1)};
            Plate plate = new Plate(10);
            for (Cat c : x) {
                message += (c) + "\n";
            }
            message += (plate) + "\n";
            message += "_________________________________" + "\n";
            plate.addFood(20);
            message += "added food: 20" + "\n";
            message += (plate) + "\n";
            message += "_________________________________" + "\n";
            message += "Cats take food:" + "\n";
            for (Cat c : x) {
                c.eat(plate);
                message += (c) + "\n";
                message += (plate) + "\n";
            }
            JOptionPane.showMessageDialog(null, message, "result", JOptionPane.PLAIN_MESSAGE);
        }
    }
}

class Cat {
    protected String name;
    protected int appetite;
    protected boolean isHungry;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isHungry = true;
    }

    @Override
    public String toString() {
        return "Cat: " + name + "|| Appetite: " + appetite + "|| Hungry? " + isHungry;
    }

    void eat(Plate plate) {
        if (plate.getFood() > appetite) {
            plate.dicreaseFood(appetite);
            isHungry = false;
        } else isHungry = true;
    }

}

class Plate {
    protected int food;

    Plate(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Food: " + food;
    }

    void dicreaseFood(int appetite) {
        if (food >= appetite)
            this.food -= appetite;
    }

    int getFood() {
        return food;
    }

    void addFood(int addFood) {
        food += addFood;
    }
}
