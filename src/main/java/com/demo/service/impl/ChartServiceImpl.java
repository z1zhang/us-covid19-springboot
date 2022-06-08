package com.demo.service.impl;

import com.demo.domain.entity.*;
import com.demo.mapper.ChartMapper;
import com.demo.service.ChartService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangz1
 * @since 2022/5/10 18:49
 */
@Service
public class ChartServiceImpl implements ChartService, ChartMapper {
    private final ChartMapper chartMapper;

    public ChartServiceImpl(ChartMapper chartMapper) {
        this.chartMapper = chartMapper;
    }

    @Override
    public List<DatesCasesDeaths> dayCasesDeaths() {
        return chartMapper.dayCasesDeaths();
    }

    @Override
    public List<StatesCasesDeaths> stateCasesDeaths() {
        return chartMapper.stateCasesDeaths();
    }

    @Override
    public List<StatesCasesDeaths> top10Cases() {
        return chartMapper.top10Cases();
    }

    @Override
    public List<StatesCasesDeaths> top10Deaths() {
        return chartMapper.top10Deaths();
    }

    @Override
    public List<StatesCasesDeaths> top10LeastCases() {
        return chartMapper.top10LeastCases();
    }

    @Override
    public List<StatesCasesDeaths> top10LeastDeaths() {
        return chartMapper.top10LeastDeaths();
    }

    @Override
    public List<DeathRate> top10DeathRate() {
        return chartMapper.top10DeathRate();
    }

    @Override
    public List<DeathRate> deathRate() {
        return chartMapper.deathRate();
    }


    @Override
    public List<DatesVariation> dayAddCasesDeaths() {
        return chartMapper.dayAddCasesDeaths();
    }

    public List<CountyCasesDeaths> countyCasesDeaths(String state) {
        return chartMapper.countyCasesDeaths(state);
    }
}
