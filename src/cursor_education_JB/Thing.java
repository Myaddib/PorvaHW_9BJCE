package cursor_education_JB;

public class Thing {
    private String name;
    private boolean isFragile;

    public Thing(String name) {
        this.name = name;
        this.isFragile = false;
    }

    public Thing(String name, boolean isFragile) {
        this.name = name;
        this.isFragile = isFragile;
    }

    public boolean addExtraPacking() {
        if (!isFragile()) return false;
        Protector.call(getName());
        return true;
    }

    public boolean isFragile() {
        return isFragile;
    }

    public void setFragile(boolean fragile) {
        isFragile = fragile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "name='" + name + '\'' +
                ", isFragile=" + isFragile +
                '}';
    }
}
