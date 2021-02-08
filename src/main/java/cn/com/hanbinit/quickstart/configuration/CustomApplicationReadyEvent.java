package cn.com.hanbinit.quickstart.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 监听ApplicationReadyEvent  这个会在PrintSomethingBean之后打印
 * @author han_bin@outlook.com
 * @Description TODO
 */
@Slf4j
@Component
public class CustomApplicationReadyEvent implements ApplicationListener<ApplicationReadyEvent> {
    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        log.info("CustomApplicationReadyEvent Run...");
    }
}
