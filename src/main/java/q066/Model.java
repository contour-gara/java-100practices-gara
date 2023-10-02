package q066;

public class Model {
    private final Integer id;
    private final String name;
    private final Type type;
    private final String memo;

    public Model(Integer id, String name, Type type, String memo) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.memo = memo;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public String getMemo() {
        return memo;
    }
}
