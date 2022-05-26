package com.demo.domain.entity;

/**
 * @author zhangz1
 * @since 2022/5/15 14:53
 */
public class StatesCasesDeaths {
    private String state;
    private Integer cases;
    private Integer deaths;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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
}
