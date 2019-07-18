package com.ancyxing.designpatterns.builderpatterns.baseimpl;

import java.util.List;
import java.util.Map;

/**
 * xml格式导出数据
 * @author yangxing
 * @date 2019/7/17
 */
public class ExportToXml {
    public void export(ExportHeaderModel header,
                       Map<String, List<ExportDataModel>> mainData,
                       ExportFooterModel footer) {
        // 记录最终输出的文件内容
        StringBuffer buffer = new StringBuffer();
        // 拼接文件头内容
        buffer.append("<?xml version='1.0' encoding='utf-8?>\n")
                .append("<report>\n")
                .append("  <header>\n")
                .append("     <depId>")
                .append(header.getDepId())
                .append("</depId>\n")
                .append("     <exportDate>")
                .append(header.getExportDate().toString())
                .append("</exportDate>")
                .append("\n")
                .append("  </header>\n");
        // 拼接文件体内容
        for (String tbName : mainData.keySet()) {
            // 先拼接表名称
            buffer.append("  <datas tableName=\"").append(tbName).append("\">").append("\n");
            for (ExportDataModel column : mainData.get(tbName)) {
                buffer.append("     <data>\n")
                        .append("       <productId>")
                        .append(column.getProductId())
                        .append("</productId>\n")
                        .append("       <price>")
                        .append(column.getPrice().toString())
                        .append("</price>\n")
                        .append("       <amount>")
                        .append(column.getAmount().toString())
                        .append("</amount>\n")
                        .append("     </data>\n");
            }
            buffer.append("  </datas>\n");
        }
        // 拼接文件尾内容
        buffer.append("  <footer>\n")
                .append("    <exportUserName>")
                .append(footer.getExportUserName())
                .append("</exportUserName>\n")
                .append("  </footer>\n")
                .append("</report>\n");
        // 简单输出内容
        System.out.println(buffer);
    }
}
