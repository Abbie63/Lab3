package Enum;

public enum Location {

    CARRIAGE ("вагон"),
    CROWD ("толпа"),
    CITY ("город"),
    HOUSE_ANGLE ("угол дома");


    private String title;

    Location(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
return title;    }
}
