package com.ancyxing.designpatterns.builderpatterns.baseimpl;

import java.math.BigDecimal;
import java.util.*;

/**
 * 需求：
 * 需要将同一份数据以txt或xml格式导出
 * 分析：
 * 输出文件大致可以分为以下四步
 * 1、拼接文件头
 * 2、拼接文件体
 * 3、拼接文件尾
 * 4、将拼接好的内容进行最终组装，形成最后的导出结果
 * @author yangxing
 * @date 2019/7/17
 */
public class Client {
    public static void main(String[] args) {
        ExportHeaderModel header = new ExportHeaderModel();
        header.setDepId("depId1");
        header.setExportDate(new Date());

        Map<String, List<ExportDataModel>> mainData = new HashMap<>(2);

        List<ExportDataModel> dataList = new ArrayList<>();

        ExportDataModel data1 = new ExportDataModel();
        data1.setProductId("product1");
        data1.setPrice(new BigDecimal("1"));
        data1.setAmount(1L);

        ExportDataModel data2 = new ExportDataModel();
        data2.setProductId("product2");
        data2.setPrice(new BigDecimal("2"));
        data2.setAmount(2L);

        dataList.add(data1);
        dataList.add(data2);

        mainData.put("销售记录表",dataList);

        ExportFooterModel footer = new ExportFooterModel();
        footer.setExportUserName("admin");

        // 将数据输出成txt格式
        ExportToTxt exportToTxt = new ExportToTxt();
        exportToTxt.export(header, mainData, footer);

        // 将数据输出成xml格式
        ExportToXml exportToXml = new ExportToXml();
        exportToXml.export(header, mainData, footer);

    }
}
