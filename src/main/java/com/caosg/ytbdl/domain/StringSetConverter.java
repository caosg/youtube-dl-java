package com.caosg.ytbdl.domain;

import javax.persistence.AttributeConverter;
import javax.persistence.Convert;
import java.util.*;

/**
 * Created by shuguangcao on 2017/7/10.
 */
@Convert
public class StringSetConverter implements AttributeConverter<Set<String>, String> {

    @Override
    public String convertToDatabaseColumn(Set<String> set) {
        return String.join(",", set);

    }

    @Override
    public Set<String> convertToEntityAttribute(String joined) {
        Set<String> set = new HashSet<>(Arrays.asList(joined.split(","))) ;
        return set;
    }

}
