package com.linjie.bean;

public class Person {
    private String lastname;
    private Integer age;
    private String gender;
    private String email;

    public Person(String lastname, Integer age, String gender, String email) {
        super();
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
        this.email = email;
        System.out.println("调用有参构造器");
    }

    public Person() {
        super();
//        System.out.println("执行了无参构造方法");
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastname='" + lastname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
