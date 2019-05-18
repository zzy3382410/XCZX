package com.xczx.cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @program: XcEduCode
 * @description:
 * @author: zzy
 * @create: 2019-05-17 22:57
 **/
public interface CmsPageRepository extends MongoRepository<CmsPage,String> {
}
