package test.linchen.face;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lin.chen
 * @date 2021/7/13
 */

/**
 * 启动器
 */
@SpringBootApplication
//@MapperScan//接口扫描路径
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
