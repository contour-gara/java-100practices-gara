package q042;

/**
 * Studentクラス。
 */
public class Student {
    private final String name;
    private final Integer age;

    /**
     * コンストラクタ。
     *
     * @param name 氏名
     * @param age  年齢
     */
    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Student student)) return false;
        return student.getAge() == this.getAge()
                && student.getName().equals(this.getName());
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
