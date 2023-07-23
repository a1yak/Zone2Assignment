package anton.aliaksansandrau.state;


public abstract class PictureState {

    public abstract void pushButton();
    public abstract String getStateDescription();
    protected final PictureForState picture;

    public PictureState(PictureForState picture){
        this.picture = picture;
    }
}
