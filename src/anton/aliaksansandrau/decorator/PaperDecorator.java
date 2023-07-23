package anton.aliaksansandrau.decorator;

public class PaperDecorator extends PictureDecorator {

    public PaperDecorator(Picture customPicture) {
        super(customPicture);
    }

    @Override
    public String use(){
        return customPicture.use() + addPaperColor();
    }

    private String addPaperColor() {
        return "in azure color";
    }
}
