package com.xczx.cms.service;

import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;

/**
 * @program: XcEduCode
 * @description:
 * @author: zzy
 * @create: 2019-05-18 15:44
 **/
public interface PageService {
    QueryResponseResult findList(int page, int size , QueryPageRequest queryPageRequest);
}
