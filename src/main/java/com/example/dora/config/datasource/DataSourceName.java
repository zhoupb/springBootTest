package com.example.dora.config.datasource;

/**
 * @author: zhoupb
 * @Description: DataSourceName
 * @since: version 1.0
 */
public enum  DataSourceName {

    ZHOUPB("zhoupb"),

    SYJ("db_dora_syj");

    private String value;

    DataSourceName(String value){this.value=value;}

    public String getValue() {
        return value;
    }
}
