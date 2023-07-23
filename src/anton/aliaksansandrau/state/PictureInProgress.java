package anton.aliaksansandrau.state;


public class PictureInProgress extends PictureState {


    public PictureInProgress(PictureForState painting) {
        super(painting);
    }

    @Override
    public void pushButton() {
        System.out.println(getStateDescription());
        picture.setNewState(new PictureFinished(picture));

    }

    @Override
    public String getStateDescription() {
        return "Painting in progress. ";
    }
}
