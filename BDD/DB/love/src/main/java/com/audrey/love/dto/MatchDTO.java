package com.audrey.love.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;

@Getter
@Setter
public class MatchDTO implements Serializable {

    private Integer id;

    private Integer id_lover1;

    private Integer id_lover2;

    private String percentage;

    private String result;

    private Boolean bestMatch;

    public MatchDTO(Integer id, Integer id_lover1, Integer id_lover2, String percentage, String result, Boolean bestMatch ) {
        id = id;
        id_lover1 = id_lover1;
        id_lover2 = id_lover2;
        percentage = percentage;
        result = result;
        bestMatch = bestMatch;
    }

    public Integer id() {

        return id;
    }

    public void setId(Integer id) {

        id = id;
    }

    public Integer getId_Lover1() {

        return id_lover1;
    }

    public void setId_Lover1(Integer id_lover1) {

        id_lover1 = id_lover1;
    }

    public Integer getId_Lover2() {

        return id_lover2;
    }

    public void setId_Lover2(Integer id_lover2) {

        id_lover2 = id_lover2;
    }

    public String percentage() {

        return percentage;
    }

    public void setPercentage(String percentage) {

        this.percentage = percentage;
    }

    public String result() {

        return result;
    }

    public void setResult(String result) {

        this.result = result;
    }

    public Boolean bestMatch() {

        return bestMatch;
    }

    public void setbestMatch(Boolean bestMatch) {

        this.bestMatch = bestMatch;
    }
}
