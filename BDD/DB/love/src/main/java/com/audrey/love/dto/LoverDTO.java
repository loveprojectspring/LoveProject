package com.audrey.love.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
public class LoverDTO implements Serializable {

    private Integer id;

    private String name;

    public LoverDTO(Integer id, String name) {

        id = id;
        this.name = name;
    }

    public Integer getId_Lover() {

        return id;
    }

    public void setId(Integer id) {

        id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}
