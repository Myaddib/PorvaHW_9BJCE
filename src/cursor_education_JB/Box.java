package cursor_education_JB;

import java.util.Arrays;
import java.util.List;

public class Box {
    public static int count = 0;
    private List<Thing> things;

    public Box() {
        this.things = null;
    }

    public Box(List<Thing> things) {
        this.things = things;
    }

    public List<Thing> getThings() {
        return things;
    }

    public void setThings(List<Thing> things) {
        this.things = things;
    }

    public Thing getThing() {
        if (count > getThings().size()) {
            count = 0;
        }
        List<Thing> thingList = getThings();
        Thing thing = thingList.get(count);
        count++;

        return thing;
    }

    @Override
    public String toString() {
        return "Box{" +
                ", things=" + Arrays.toString(new List[]{things}) +
                '}';
    }
}
