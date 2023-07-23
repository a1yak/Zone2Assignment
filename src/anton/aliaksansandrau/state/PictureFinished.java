package anton.aliaksansandrau.state;

public class PictureFinished extends PictureState {

    public PictureFinished(PictureForState picture){
        super(picture);
    }

    @Override
    public void pushButton() {
        System.out.println(getStateDescription());
        picture.setNewState(new PictureStarted(picture));

    }

    @Override
    public String getStateDescription() {
        return "Finished painting.";
    }
}
