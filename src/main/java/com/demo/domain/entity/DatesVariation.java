package com.demo.domain.entity;

/**
 * @author zhangz1
 * @since 2022/5/15 14:36
 */
public class DatesVariation {
    private String date;
    private Integer cases;
    private Integer deaths;
    private Integer variation;

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

    public Integer getVariation() {
        return variation;
    }

    public void setVariation(Integer variation) {
        this.variation = variation;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }
}