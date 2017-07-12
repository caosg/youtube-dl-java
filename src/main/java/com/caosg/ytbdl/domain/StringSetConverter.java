package com.caosg.ytbdl.domain;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.util.StringUtils;

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
        if(CollectionUtils.isEmpty(set))
            return "";
        return String.join(",", set);

    }

    @Override
    public Set<String> convertToEntityAttribute(String joined) {
        if(StringUtils.isEmpty(joined))
            return null;
        Set<String> set = new HashSet<>(Arrays.asList(joined.split(","))) ;
        return set;
    }

}
