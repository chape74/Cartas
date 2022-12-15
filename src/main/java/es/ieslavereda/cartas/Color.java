package es.ieslavereda.cartas;
import com.diogonunes.jcolor.Attribute;

public enum Color {
    BLACK(Attribute.BLACK_TEXT()),
    RED(Attribute.RED_TEXT());

    private final Attribute color;

    Color(Attribute color) {
        this.color = color;
    }

    public Attribute getColor() {
        return color;
    }
}
