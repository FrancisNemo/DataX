package com.alibaba.datax.plugin.unstructuredstorage.reader;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;

public class ColumnEntry {
<<<<<<< HEAD
    private Integer width;
=======
>>>>>>> origin/master
    private Integer index;
    private String type;
    private String value;
    private String format;
    private DateFormat dateParse;

<<<<<<< HEAD
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

=======
>>>>>>> origin/master
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
        if (StringUtils.isNotBlank(this.format)) {
            this.dateParse = new SimpleDateFormat(this.format);
        }
    }

    public DateFormat getDateFormat() {
        return this.dateParse;
    }

    public String toJSONString() {
        return ColumnEntry.toJSONString(this);
    }

    public static String toJSONString(ColumnEntry columnEntry) {
        return JSON.toJSONString(columnEntry);
    }
}
