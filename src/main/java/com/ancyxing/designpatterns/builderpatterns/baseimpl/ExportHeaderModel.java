package com.ancyxing.designpatterns.builderpatterns.baseimpl;

import java.util.Date;

/**
 * 文件头内容
 * @author yangxing
 * @date 2019/7/17
 */
public class ExportHeaderModel {
    /**
     * 编号
     */
    private String depId;
    /**
     * 导出数据的日期
     */
    private Date exportDate;

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public Date getExportDate() {
        return exportDate;
    }

    public void setExportDate(Date exportDate) {
        this.exportDate = exportDate;
    }
}
