package com.md.pay.unionpay.listener;

import com.md.pay.unionpay.sdk.SDKConfig;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;


/**
 * 监听器，启动加载properties文件内容
 * @author cheng
 */
public class PropertiesListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        try {
            SDKConfig.getConfig().loadPropertiesFromSrc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



