package anton.aliaksansandrau.state;

public class PictureStarted extends PictureState {

    public PictureStarted(PictureForState painting){
        super(painting);
    }

    @Override
    public void pushButton() {
        System.out.println(getStateDescription());
        picture.setNewState(new PictureInProgress(picture));

    }

    @Override
    public String getStateDescription() {
        return "Started to paint.";
    }
}
