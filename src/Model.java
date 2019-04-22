public class Model {
    private Viewer viewer;
    int x, y;
    int x1, y1;
    Model(Viewer viewer){
        this.viewer = viewer;
        x = 150;
        y = 150;
        x1 = 300;
        y1 = 300;
    }

    public void move(String direction){
        if (direction.equals("left") && x1 > 0){
            x = x - 10;
            x1 = x1 - 10;
        }else if(direction.equals("right") && x1 < 750){
            x = x + 10;
            x1 = x1 + 10;
        }else if(direction.equals("up") && y1 > 0){
            y = y - 10;
            y1 = y1 - 10;
        }else if(direction.equals("down") && y1 < 725){
            y = y + 10;
            y1 = y1 + 10;
        }
        viewer.update();
    }
}
