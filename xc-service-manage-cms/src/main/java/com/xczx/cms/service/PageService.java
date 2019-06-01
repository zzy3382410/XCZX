package com.xczx.cms.service;

import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.domain.cms.response.CmsPageResult;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.ResponseResult;

/**
 * @program: XcEduCode
 * @description:
 * @author: zzy
 * @create: 2019-05-18 15:44
 **/
public interface PageService {
    QueryResponseResult findList(int page, int size , QueryPageRequest queryPageRequest);

    CmsPageResult add(CmsPage cmsPage);

    CmsPage findById(String id);

    CmsPageResult update(String id, CmsPage cmsPage);

    ResponseResult delete(String id);
}
