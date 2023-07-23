package anton.aliaksansandrau.decorator;

public abstract class PictureDecorator implements Picture {

    protected Picture customPicture;

    public PictureDecorator(Picture customPicture){
        this.customPicture = customPicture;
    }

    @Override
    public String use() {
        return customPicture.use();
    }
}
