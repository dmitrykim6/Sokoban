public class Viewer {

    Viewer(){
        Controller controller = new Controller(this);
        Canvas canvas = new Canvas(controller.model);
    }

    public void update(){

    }
}
