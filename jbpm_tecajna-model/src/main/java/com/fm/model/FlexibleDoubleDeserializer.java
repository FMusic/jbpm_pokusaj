package com.fm.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;

public class FlexibleDoubleDeserializer extends JsonDeserializer<Double> {

    @Override
    public Double deserialize(JsonParser parser, DeserializationContext context) throws IOException {
        // https://stackoverflow.com/questions/43973796/convert-a-string-to-float-in-java
        return deserialize(parser.getText());
    }

    public Double deserialize(String value) {
        NumberFormat myNumForm = NumberFormat.getInstance(Constants.HR_LOCALE);
        Double parsedNumber = 0d;
        try {
            parsedNumber = (Double) myNumForm.parse(value);
        } catch (ParseException e) {
        }

        return parsedNumber;
    }
}