package com.xuecheng.api.cms;

import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.domain.cms.request.QueryPageRequest;

public interface CmsPageControllerApi {
    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest);
}
