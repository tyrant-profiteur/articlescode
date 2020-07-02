package com.tyrant.equalshashcode;

import java.util.Objects;

/**
 * @author:profiteur
 * @create 2020-06-04 14:14
 **/
public class UserOverride implements Cloneable{
    private String name;
    private String age;

    public UserOverride() {}

    public UserOverride(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserOverride userOverride = (UserOverride) o;
        return Objects.equals(name, userOverride.name) &&
                Objects.equals(age, userOverride.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
