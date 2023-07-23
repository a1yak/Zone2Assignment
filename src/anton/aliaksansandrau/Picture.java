package anton.aliaksansandrau;

public class Picture {

    private final String paperType;
    private final String color_type;
    private final String artist;

    public Picture(final String paperType, final String color_type, final String artist) {
        this.paperType = paperType;
        this.color_type = color_type;
        this.artist = artist;
    }

    public String getPaperType() {
        return paperType;
    }

    public String getColor_type() {
        return color_type;
    }

    public String getArtist() {
        return artist;
    }
}
