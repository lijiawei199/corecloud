import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;


public class CodeGenerator {
    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(System.getProperty("user.dir") + "/generator/src/main/java");
        //文件覆盖
        gc.setFileOverride(true);
        gc.setAuthor("李佳伟");
        gc.setOpen(false);
        gc.setActiveRecord(true);
        // 是否在xml中添加二级缓存配置
        gc.setEnableCache(false);
        // 是否在xml中添加resultMap
        gc.setBaseResultMap(true);
        // 是否在xml中添加通用查询结果列
        gc.setBaseColumnList(true);
        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://mysql57.rdsm8bk9j76spdy.rds.bj.baidubce.com:3306/corecloud?useUnicode=true&useSSL=true");
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("rdsroot");
        dsc.setPassword("l7634427");
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.bananalab.corecloud");
        packageConfig.setEntity("mybatis.model");
        packageConfig.setMapper("mybatis.mapper");
        packageConfig.setXml("mybatisxml");
        mpg.setPackageInfo(packageConfig);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        // 需要生成的表
        ArrayList<String> tableList = new ArrayList();


        tableList.add("cleaner");
        tableList.add("equip");
        tableList.add("guard");
        tableList.add("potential_cust");
        tableList.add("store");
        tableList.add("store_data");
        tableList.add("subscriber");
        tableList.add("tenant");
        tableList.add("pic");
        tableList.add("market_format");
        tableList.add("market_data");


        String[] tableArray = tableList.toArray(new String[tableList.size()]);
        strategy.setInclude(tableArray);
        mpg.setStrategy(strategy);

        mpg.execute();
    }
}

