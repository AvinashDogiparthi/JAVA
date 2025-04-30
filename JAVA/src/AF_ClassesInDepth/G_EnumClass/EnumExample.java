package AF_ClassesInDepth.G_EnumClass;

public enum EnumExample {

    DEFAULT(1,"Default"),
    FIRST(2,"First"),
    SECOND(3,"Second");

    private int id;
    private String name;

    // default constructor is private in enum
    EnumExample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static EnumExample getEnumSampleById(int id) {
        for (EnumExample sample : EnumExample.values()) {
            if (sample.getId() == id) {
                return sample;
            }
        }
        return null; // or throw an exception
    }
}
