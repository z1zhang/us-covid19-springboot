package com.demo.domain.entity;

/**
 * @author zhangz1
 * @since 2022/5/15 14:36
 */
public class DatesVariation {
    private String date;
    private Integer cases;
    private Integer deaths;
    private Integer casesVariation;
    private Integer deathsVariation;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getCases() {
        return cases;
    }

    public void setCases(Integer cases) {
        this.cases = cases;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    public Integer getCasesVariation() {
        return casesVariation;
    }

    public void setCasesVariation(Integer casesVariation) {
        this.casesVariation = casesVariation;
    }

    public Integer getDeathsVariation() {
        return deathsVariation;
    }

    public void setDeathsVariation(Integer deathsVariation) {
        this.deathsVariation = deathsVariation;
    }
}