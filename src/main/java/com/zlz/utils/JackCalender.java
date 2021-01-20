package com.zlz.utils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by hzk on 2017/8/15.
 */
public class JackCalender extends JsonDeserializer<Calendar> {

    @Override
    public Calendar deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String date = jsonParser.getText();
        return  this.getCalendar(date);
    }

    private Calendar getCalendar(String strDate) {
        if (strDate == null || strDate.trim().length() == 0) {
            return null;
        }
        try
        {
            strDate = strDate.replaceAll("-", "/");
            SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
            if(strDate.length()>10) {
                if(strDate.length()==16){
                    f = new SimpleDateFormat("yyyy/MM/dd HH:mm");
                }else {
                    f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                }
            }
            Date date =  f.parse(strDate);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar;
        }
        catch (Exception ex)

        {
            ex.printStackTrace();
            return null;
        }
    }
}
