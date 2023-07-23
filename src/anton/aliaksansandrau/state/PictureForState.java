package anton.aliaksansandrau.state;

public class PictureForState {

    private PictureState currentState;

    public PictureForState(){
        this.currentState = new PictureStarted(this);
    }
    public void setNewState(final PictureState pictureState){
        currentState = pictureState;
    }

    public String getStateDescription() {
        return currentState.getStateDescription();
    }
    public void pushTheButton() {
        currentState.pushButton();
    }
}
