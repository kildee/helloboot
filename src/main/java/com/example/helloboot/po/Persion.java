package com.example.helloboot.po;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
   * Description  用户PO
   * author pjt  kilde@foxmail.com
   * @Date 2017/11/21 16:28
 */
@Entity
public class Persion {

    @Id
    @GeneratedValue
    public Integer id;

    public Integer age;

    public String name;

    public Persion() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
