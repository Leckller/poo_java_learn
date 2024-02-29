import java.awt.*;
public class Resolution {
    private final Toolkit tk = Toolkit.getDefaultToolkit();
    private final Dimension size = tk.getScreenSize();

    void getDimension() {
        System.out.println(this.size.width + "x" + this.size.height);
    }
}
