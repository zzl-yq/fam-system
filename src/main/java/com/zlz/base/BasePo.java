package com.zlz.base;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.zlz.utils.JackCalender;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Calendar;

/**
 * Created by zzl on 2021-01-06.
 */
public class BasePo implements Serializable {
    private static final long serialVersionUID = 130589161336124144L;

    private Calendar createDate;//创建时间
    private Calendar lastUpDate;//最后更新人

//    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    public Calendar getCreateDate() {
        return createDate;
    }
//    @JsonDeserialize(using= JackCalender.class)
    public void setCreateDate(Calendar createDate) {
        this.createDate = createDate;
    }
//    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    public Calendar getLastUpDate() {
        return lastUpDate;
    }
//    @JsonDeserialize(using= JackCalender.class)
    public void setLastUpDate(Calendar lastUpDate) {
        this.lastUpDate = lastUpDate;
    }
}
