package com.cb.legou.service.impl;

import com.cb.legou.domain.Star;
import com.cb.legou.mapper.StarMapper;
import com.cb.legou.service.IStarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StarServiceImpl implements IStarService {
    @Autowired
    StarMapper starMapper;
    @Override
    public Star findByName(Star star) {
        return starMapper.findByName(star);
    }
}
