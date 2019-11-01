package com.example.dora.config.datasource;

import java.util.ArrayList;
import java.util.List;

public class DynamicDataSourceContextHolder {

    public static final String DEFAULT_DS = "zhoupb";

    private static final ThreadLocal<String> CONTEXTHOLDER = new ThreadLocal<>();

    /**
     * 判断数据源是否存在;
     */
    public static List<String> dataSourceIds = new ArrayList<>();

    /**
     * 使用setDataSourceType设置当前的
     * @param dataSourceType
     */
    public static void setDataSourceType(String dataSourceType) {
        CONTEXTHOLDER.set(dataSourceType);
    }

    public static String getDataSourceType() {
        return CONTEXTHOLDER.get();
    }

    /**
     * 清除上下文数据
     */
    public static void clearDataSourceType() {
        CONTEXTHOLDER.remove();
    }

    /**
     * 判断指定DataSrouce当前是否存在
     */
    public static boolean containsDataSource(String dataSourceId){
        return dataSourceIds.contains(dataSourceId);
    }

}
