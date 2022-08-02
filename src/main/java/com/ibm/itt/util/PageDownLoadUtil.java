package com.ibm.itt.util;

import com.ibm.itt.entity.Page;
import com.ibm.itt.impl.HttpClientDownloadService;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/***
 * page downloader tool
 * @author kevin
 * created by 07/31/2022
 */
public class PageDownLoadUtil {
    public static String getPageContent(String url){
        HttpClientBuilder builder = HttpClients.custom();
        CloseableHttpClient client = builder.build();

        HttpGet request = new HttpGet(url);
        String content = null;
        try {
            CloseableHttpResponse response = client.execute(request);
            HttpEntity entity = response.getEntity();
            content = EntityUtils.toString(entity);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return content;
    }

    public static void main(String[] args) {
        String url = "https://gitee.com/l-weiwei/spiderman#https://gitee.com/l-weiwei/Spiderman2";
//        String content = PageDownLoadUtil.getPageContent(url);
        HttpClientDownloadService service = new HttpClientDownloadService();
        Page page = service.download(url);
        System.out.println(page.getContent());
    }
}
