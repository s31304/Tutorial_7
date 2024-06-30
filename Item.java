public class Item {
    private String name;
    private String code;

    public Item(String code, String name) {
        setName(name);
        setCode(code);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void show() {
        System.out.println("Name: " + name);
    }

    public void showCodeAndName() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
    }
}
