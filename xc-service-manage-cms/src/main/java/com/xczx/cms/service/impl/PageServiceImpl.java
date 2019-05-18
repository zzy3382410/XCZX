package com.xczx.cms.service.impl;

import com.xczx.cms.dao.CmsPageRepository;
import com.xczx.cms.service.PageService;
import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.CommonCode;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.QueryResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: XcEduCode
 * @description:
 * @author: zzy
 * @create: 2019-05-18 15:45
 **/
@Service("pageService")
public class PageServiceImpl implements PageService {
    @Autowired
    private CmsPageRepository cmsPageRepository;

    @Override
    /**
    * @Description:  页面列表分页查询
    * @Param: [page, size, queryPageRequest]
    * @return: com.xuecheng.framework.model.response.QueryResponseResult
    * @Author: zzy
    * @Date: 2019/5/18
    */
    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest) {
        if (queryPageRequest == null){
            queryPageRequest = new QueryPageRequest();
        }
        if (page<=0){
            page = 1;
        }
        if (size<=0){
            size = 20;
        }
        //分页对象
        Pageable pageable = new PageRequest(page,size);
        //分页查询
        Page<CmsPage> all = cmsPageRepository.findAll(pageable);
        QueryResult<CmsPage> cmsPageQueryResult = new QueryResult<CmsPage>();
        cmsPageQueryResult.setList(all.getContent());
        cmsPageQueryResult.setTotal(all.getTotalElements());
        //返回结果
        return new QueryResponseResult(CommonCode.SUCCESS,cmsPageQueryResult);
    }
}
