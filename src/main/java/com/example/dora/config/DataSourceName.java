package com.example.dora.config;

/**
 * @author: zhoupb
 * @Description: DataSourceName
 * @since: version 1.0
 */
public enum  DataSourceName {

    ZHOUPB("zhoupb"),

    JIANG("zpb");

    private String value;

    DataSourceName(String value){this.value=value;}

    public String getValue() {
        return value;
    }
}
