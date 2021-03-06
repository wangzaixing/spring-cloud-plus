package org.gourd.hu.cloud.config;

import org.gourd.hu.ribbon.GlobalRibbonRuleConfig;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

/**
 * Ribbon负载均衡全局粒度配置(所有服务都按照这个配置)
 *
 * @author gourd.hu
 */
@RibbonClients(defaultConfiguration = GlobalRibbonRuleConfig.class)
public class RibbonConfig {
}