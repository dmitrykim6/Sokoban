public class Model {
    private Viewer viewer;

    int x, y, width, height;
    int xBigRect, yBigRect, widthBigRect, heightBigRect;

    Model(Viewer viewer){
        this.viewer = viewer;
        width = 50;
        height = 50;
        x = 150;
        y = 150;
        xBigRect = 300;
        yBigRect = 200;
        widthBigRect = 200;
        heightBigRect = 150;
    }

    public void move(String direction){
        if (direction.equals("left")){
            moveLeft();
        }else if(direction.equals("right")){
            moveRight();
        }else if(direction.equals("up")){
            moveUp();
        }else if(direction.equals("down")){
            moveDown();
        }
        check();
        viewer.update();
    }

    private void check() {
        if (x >= xBigRect && (x + width) <= (xBigRect + widthBigRect) && y >= yBigRect && (y + height) <= (yBigRect + heightBigRect)) {
            System.out.print("OK ");
        }
    }

    private void moveLeft(){
        x = x - 20;
    }
    private void moveRight(){
        x = x + 20;
    }
    private void moveUp(){
        y = y - 20;
    }
    private void moveDown(){
        y = y + 20;
    }
}
