package com.example.patients_portal;


import lombok.extern.slf4j.Slf4j;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;


@Component
@Slf4j
public class PatientUtils {

    private DozerBeanMapper dozerBeanMapper;

    /**
     * This is a help to map a list of source to a list of destination
     * @param fromList
     * @param toClass
     * @return
     */
    public <F,T> List<T> mapList(List<F> fromList, final Class<T> toClass) {
        return fromList.stream()
                .map(from -> this.dozerBeanMapper.map(from, toClass))
                .collect(Collectors.toList());
    }

    /**
     * This is to help map a source to a destination
     * @param from
     * @param toClass
     * @return
     */
    public <T> T map(Object from, Class<T> toClass) {
        return this.dozerBeanMapper.map(from, toClass);
    }
}
