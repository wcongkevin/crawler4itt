package com.ibm.itt.start;

import com.ibm.itt.entity.Page;
import com.ibm.itt.impl.GiteeProcessService;
import com.ibm.itt.impl.HttpClientDownloadService;
import com.ibm.itt.service.IDownLoadService;
import com.ibm.itt.service.IProcessService;

public class StartGitee {
    /**
     * 爬虫执行类入口
     * @auther kevin
     * Created by 7/31/2022
     *
     */

    private IDownLoadService downLoadService ;
    private IProcessService processService;

    public static void main(String[] args) {

        StartGitee gitee = new StartGitee();
        gitee.setDownLoadService(new HttpClientDownloadService());
        gitee.setProcessService(new GiteeProcessService());
//        String url = "https://blog.csdn.net/qq_34771124/article/details/122697578?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522165941029616781647521954%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=165941029616781647521954&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~sobaiduend~default-1-122697578-null-null.pc_rank_34&utm_term=%E8%8E%B7%E5%8F%96xpath&spm=1018.2226.3001.4187";
        String url = "https://www.liaoxuefeng.com/wiki/1252599548343744";
        Page page = gitee.downloadPage(url);
        gitee.processPage(page);
//        System.out.println(page.getContent());
    }
    //下载页面
    public Page downloadPage(String url){
        return  this.downLoadService.download(url);
    }

    /**
     * 页面解析
     * @param page
     */
    public void processPage(Page page){
        this.processService.process(page);
    }

    public IDownLoadService getDownLoadService() {
        return downLoadService;
    }

    public void setDownLoadService(IDownLoadService downLoadService) {
        this.downLoadService = downLoadService;
    }

    public IProcessService getProcessService() {
        return processService;
    }

    public void setProcessService(IProcessService processService) {
        this.processService = processService;
    }

    @Override
    public String toString() {
        return "StartGitee{" +
                "downLoadService=" + downLoadService +
                ", processService=" + processService +
                '}';
    }
}
