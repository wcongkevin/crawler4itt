package com.ibm.itt.impl;

import com.ibm.itt.entity.Page;
import com.ibm.itt.service.IDownLoadService;
import com.ibm.itt.util.PageDownLoadUtil;

/**
 * HttpClient page downloader implement
 * @author kevin
 * Created by 7/31/2022
 */

public class HttpClientDownloadService implements IDownLoadService {
    @Override
    public Page download(String url) {
        Page page = new Page();
        page.setContent(PageDownLoadUtil.getPageContent(url));
        return page;
    }
}
