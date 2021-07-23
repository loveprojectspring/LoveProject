package com.audrey.love.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor

public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private Integer id_lover1;

    @Column
    private Integer id_lover2;

    @Column
    private String percentage;

    @Column
    private String result;

    @Column
    private boolean bestMatch;

    public Match(Integer id, Integer id_lover1, Integer id_lover2, String percentage, String result, boolean bestMatch) {
        id = id;
        id_lover1 = id_lover1;
        id_lover2 = id_lover1;
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
