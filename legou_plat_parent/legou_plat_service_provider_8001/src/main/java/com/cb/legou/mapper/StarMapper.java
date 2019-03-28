package com.cb.legou.mapper;

import com.cb.legou.domain.Star;
import org.springframework.stereotype.Component;

@Component(value = "starMapper")
public interface StarMapper {
    Star findByName(Star star);
}
