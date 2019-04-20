import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class Canvas extends JPanel{
    private Model model;

    Canvas(Model model){
        this.model = model;
        setBackground(Color.lightGray);

    }

    public void paint(Graphics pen){
        super.paint(pen);
        pen.setColor(Color.black);
        pen.drawString("Sokoban",model.x, model.y);
        pen.setColor(Color.black);
        pen.drawRect(model.x1, model.y1, 50, 50);
    }

}
