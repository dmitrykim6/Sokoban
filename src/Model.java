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
//        System.out.println(direction);
        x = x + 10;
        y1 = y1 + 10;
        viewer.update();
    };
}
