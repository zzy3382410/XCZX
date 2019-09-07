package com.xczx.cms.dao;

import com.xuecheng.framework.domain.cms.CmsConfig;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @program: XcEduCode
 * @description:
 * @author: zzy
 * @create: 2019-05-17 22:57
 **/
public interface CmsConfigRepository extends MongoRepository<CmsConfig,String> {

}
