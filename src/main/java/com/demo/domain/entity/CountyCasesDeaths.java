package com.demo.domain.entity;

/**
 * @author zhangz1
 * @since 2022/5/19 16:00
 */
public class CountyCasesDeaths {
    private String state;
    private String county;
    private String cases;
    private String deaths;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCases() {
        return cases;
    }

    public void setCases(String cases) {
        this.cases = cases;
    }

    public String getDeaths() {
        return deaths;
    }

    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }
}
