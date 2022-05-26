package com.demo.domain.entity;

/**
 * @author zhangz1
 * @since 2022/5/15 14:53
 */
public class DeathRate {
    private String state;
    private String cases;
    private String deaths;
    private String rate;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}
