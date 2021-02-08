package cn.com.hanbinit.quickstart.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 启动完成后打印  参考：https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-command-line-runner
 * @author han_bin@outlook.com
 * @Description TODO
 */
@Slf4j
@Component
public class PrintSomethingBean implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.info("PrintSomethingBean Run...");
    }
}
