package com.ibm.itt.impl;

import com.ibm.itt.entity.Page;
import com.ibm.itt.service.IProcessService;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.htmlcleaner.XPatherException;

public class GiteeProcessService implements IProcessService {
    private String allRead;
    /**
     * gitee 页面解析实现类
     * @param page
     */
    @Override
    public void process(Page page) {
        String content = page.getContent();
        HtmlCleaner htmlCleaner = new HtmlCleaner();
        System.out.println(content);
        TagNode rootNode = htmlCleaner.clean(content);
//        TagNode nodes = cleaner.clean(new File("c:/test.xml"));
//        Object[] objects = nodes.evaluateXPath("//div/a[text(.,'In')]");
        try {
//            Object[] evaluateXPath =  rootNode.evaluateXPath("/html/body/div[3]/div[1]/div[2]/div[2]/div/div/span[2]/a[1]");
//            Object[] evaluateXPath =  rootNode.evaluateXPath("//*[@id=\"_list_meta_\"]/div[2]/div[1]/span/span");
//            String xPath = "//*[@id=\"blogColumnPayAdvert\"]/div/div/div[2]/span[1]";
            String xPath = "//*[@id=\"x-content\"]/div[1]/span[2]";
            System.out.println(xPath);
            Object[] evaluateXPath =  rootNode.evaluateXPath(xPath);
            if(evaluateXPath.length>0){
                TagNode tagNode = (TagNode) evaluateXPath[0];
                String strNode = tagNode.getText().toString();
                System.out.println(strNode);
                //需要使用正则表达式对结果进行处理，得到我们想要的allRead


            }
        } catch (XPatherException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }
}
