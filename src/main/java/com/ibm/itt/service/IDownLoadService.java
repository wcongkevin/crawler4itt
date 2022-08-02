package com.ibm.itt.service;

import com.ibm.itt.entity.Page;

/**
 * page downloader interface
 * @author kevin
 * Created by 7/31/2022
 */
public interface IDownLoadService {
    public Page download(String url);
}
