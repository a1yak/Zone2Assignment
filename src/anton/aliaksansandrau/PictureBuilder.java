package anton.aliaksansandrau;

public class PictureBuilder {

    private String paperType;
    private String color_type;
    private String artist;

    private PictureBuilder(){

    }

    public static PictureBuilder aPainting(){
        return new PictureBuilder();
    }

    public PictureBuilder withPaperType(String paperType){
        this.paperType = paperType;
        return this;
    }
    public PictureBuilder withColorType(String color_type){
        this.color_type = color_type;
        return this;
    }
    public PictureBuilder withArtist(String artist){
        this.artist = artist;
        return this;
    }

    public Picture build(){
        return new Picture(paperType, color_type, artist);
    }
}
