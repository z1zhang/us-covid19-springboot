package com.demo.domain.entity;

/**
 * @author zhangz1
 * @since 2022/5/10 17:44
 */
public class DatesCasesDeaths {
    private String date;
    private String cases;
    private String deaths;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public DatesCasesDeaths() {
    }

    public DatesCasesDeaths(String date, String cases, String deaths) {
        this.date = date;
        this.cases = cases;
        this.deaths = deaths;
    }

    @Override
    public String toString() {
        return "/{" +
                "date='" + date +
                ", cases=" + cases +
                ", deaths=" + deaths +
                '}';
    }
}
