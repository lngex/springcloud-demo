package cn.lngex.domain;

public class User {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public User() {
    }

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
