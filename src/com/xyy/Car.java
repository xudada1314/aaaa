package com.xyy;

/**
 * @Author xudada
 * @email 1522499290@qq.com
 * @DATE 2020/8/18 14:50
 **/

public class Car {
    private Integer id;
    private String name;

    public Car() {
    }

    public Car(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
