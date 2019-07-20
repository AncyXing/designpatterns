package com.ancyxing.designpatterns.builderpatterns.baseimpl;

import java.util.List;
import java.util.Map;

/**
 * 使用txt格式导出
 *
 * @author yangxing
 * @date 2019/7/17
 */
public class ExportToTxt {
    public void export(ExportHeaderModel header,
                       Map<String, List<ExportDataModel>> mainData,
                       ExportFooterModel footer) {
        // 记录最终输出的文件内容
        StringBuffer buffer = new StringBuffer();
        // 拼接文件头内容
        buffer.append(header.getDepId()).append(",").append(header.getExportDate().toString()).append("\n");
        // 拼接文件体内容
        for (String tbName : mainData.keySet()) {
            // 先拼接表名称
            buffer.append(tbName).append("\n");
            for (ExportDataModel column : mainData.get(tbName)) {
                buffer.append(column.getProductId())
                        .append(",")
                        .append(column.getPrice().toString())
                        .append(",")
                        .append(column.getAmount().toString())
                        .append("\n");
            }
        }
        // 拼接文件尾内容
        buffer.append(footer.getExportUserName());
        // 简单输出内容
        System.out.println(buffer);
    }
}
