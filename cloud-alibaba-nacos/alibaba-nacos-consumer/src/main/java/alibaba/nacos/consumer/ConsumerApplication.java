package alibaba.nacos.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <!--    服务网格  第三代微服务 -->
 * <!--    函数级别 区块链技术 -->
 *
 */
/**
 * 配置中心 spring cloud  config
 */
@SpringBootApplication
// 开启注册中心
@EnableDiscoveryClient
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
