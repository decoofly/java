package com.crawl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.crawl.proxy.ProxyHttpClient;
import com.crawl.zhihu.ZhiHuHttpClient;

/**
 * 爬虫入口
 */
public class Main {
    private static  Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String args []){
        ProxyHttpClient.getInstance().startCrawl();
        ZhiHuHttpClient.getInstance().startCrawl();
        
    }
}
