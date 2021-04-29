package com.team.backend.service.impl;

import com.team.backend.model.PostEyeOn;
import com.team.backend.mapper.PostEyeOnMapper;
import com.team.backend.service.PostEyeOnService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author yangyu
 * @since 2021-04-28
 */
@Service
public class PostEyeOnServiceImpl extends ServiceImpl<PostEyeOnMapper, PostEyeOn> implements
    PostEyeOnService {

  @Resource
  private PostEyeOnMapper eyeOnMapper;

  @Override
  public boolean collectPost(PostEyeOn postEyeOn) {
    boolean result = false;
    if (postEyeOn.getPostId() != null && postEyeOn.getIdFrom() != null) {
      if(eyeOnMapper.insert(postEyeOn) == 1) {
        result = true;
      }
    }
    return result;
  }
}
