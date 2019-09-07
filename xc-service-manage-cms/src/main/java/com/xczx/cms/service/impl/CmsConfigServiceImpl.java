package com.xczx.cms.service.impl;

import com.xczx.cms.dao.CmsConfigRepository;
import com.xczx.cms.service.CmsConfigService;
import com.xuecheng.framework.domain.cms.CmsConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @program: XcEduCode
 * @description:
 * @author: zzy
 * @create: 2019-08-17 14:20
 **/
@Service("cmsConfigService")
public class CmsConfigServiceImpl implements CmsConfigService {

    @Autowired
    CmsConfigRepository cmsConfigRepository;

    @Override
    public CmsConfig getConfigById(String id) {
        Optional<CmsConfig> optional = cmsConfigRepository.findById(id);
        if (optional.isPresent()){
            CmsConfig cmsConfig = optional.get();
            return cmsConfig;
        }
        return null;
    }
}
