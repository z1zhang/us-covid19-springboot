package com.demo.mapper;

import com.demo.domain.entity.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhangz1
 * @since 2022/5/10 17:49
 */
@Repository
public interface ChartMapper {

    /**
     * 每日累计确诊人数和死亡人数
     *
     * @return DayTotal
     */
    List<DatesCasesDeaths> dayCasesDeaths();

    /**
     * 每日新增确诊人数
     *
     * @return DayAddCases
     */
    List<DatesVariation> dayAddCases();

    /**
     * 每日新增死亡人数
     *
     * @return DayAddDeaths
     */
    List<DatesVariation> dayAddDeaths();

    /**
     * 美国每个州的累计确诊人数和死亡人数
     *
     * @return StateTotal
     */
    List<StatesCasesDeaths> stateCasesDeaths();

    /**
     * 确诊人数最多的十个州
     *
     * @return Top10Cases
     */
    List<StatesCasesDeaths> top10Cases();

    /**
     * 死亡人数最多的十个州
     *
     * @return Top10Deaths
     */
    List<StatesCasesDeaths> top10Deaths();

    /**
     * 确诊人数最少的十个州
     *
     * @return Top10LeastCases
     */
    List<StatesCasesDeaths> top10LeastCases();

    /**
     * 死亡人数最少的十个州
     *
     * @return Top10LeastDeaths
     */
    List<StatesCasesDeaths> top10LeastDeaths();

    /**
     * 前10 病死率
     *
     * @return DeathRate
     */
    List<DeathRate> top10DeathRate();

    /**
     * 全美和各州的病死率
     *
     * @return DeathRate
     */
    List<DeathRate> deathRate();

    /**
     * 查询县级市确诊死亡人数
     *
     * @param county 县
     * @return ConfirmRate
     */
    List<CountyCasesDeaths> countyCasesDeaths(String county);
}
