import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;


public class CodeGeneratorAdmin {
    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(System.getProperty("user.dir") + "/generator/src/main/java");
        gc.setFileOverride(true);
        gc.setAuthor("李文龙");
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
        dsc.setUrl("jdbc:mysql://rm-m5e35dojyj9er51h43o.mysql.rds.aliyuncs.com:3306/bieji_admin?useUnicode=true&useSSL=false");
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("bananalab");
        dsc.setPassword("P0o9i8u7");
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.meishi");
        packageConfig.setEntity("mybatis.model");
        packageConfig.setMapper("mybatis.mapperadmin");
        packageConfig.setXml("mybatisxmladmin");
        mpg.setPackageInfo(packageConfig);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        // 需要生成的表
        ArrayList<String> tableList = new ArrayList();
        tableList.add("dzwindconfig");

//        tableList.add("pk_user");
//        tableList.add("helpcontent");
//        tableList.add("pk_punch");
//        tableList.add("pk_punch_cycle");
//        tableList.add("pk_punch_signup");
        String[] tableArray = tableList.toArray(new String[tableList.size()]);
        strategy.setInclude(tableArray);
        mpg.setStrategy(strategy);

        mpg.execute();
    }
}

