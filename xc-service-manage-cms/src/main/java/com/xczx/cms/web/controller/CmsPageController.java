package com.xczx.cms.web.controller;

import com.xczx.cms.service.PageService;
import com.xuecheng.api.cms.CmsPageControllerApi;
import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.CommonCode;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.QueryResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cms/page")
public class CmsPageController implements CmsPageControllerApi {

    @Autowired
    private PageService pageService;

    /**
    * @Description:
    * @Param: [page, size, queryPageRequest]
    * @return: com.xuecheng.framework.model.response.QueryResponseResult
    * @Author: zzy
    * @Date: 2019/5/17
    */
    @Override
    @RequestMapping("/list/{page}/{size}")
    public QueryResponseResult findList(@PathVariable int page,@PathVariable int size, QueryPageRequest queryPageRequest) {
//        QueryResult<Object> queryResult = new QueryResult<>();
//        queryResult.setTotal(2);
//        //静态数据列表
//        List list = new ArrayList();
//        CmsPage cmsPage = new CmsPage();
//        cmsPage.setPageName("测试页面");
//        list.add(cmsPage);
//        queryResult.setList(list);
//        QueryResponseResult queryResponseResult = new QueryResponseResult(CommonCode.SUCCESS, queryResult);
        return pageService.findList(page,size,queryPageRequest);
    }
}
