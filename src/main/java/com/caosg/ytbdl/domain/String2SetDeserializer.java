package com.caosg.ytbdl.domain;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import org.mapstruct.ap.internal.util.Collections;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.Set;

/**
 * Created by shuguangcao on 2017/7/10.
 */
public class String2SetDeserializer extends JsonDeserializer<Set<String>> {
    @Override
    public Set<String> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        String tagString = jsonParser.getValueAsString();
        if(StringUtils.isEmpty(tagString)) return null;
        Set<String> tags = Collections.asSet(tagString.split(",")) ;
        return tags;
    }
}
