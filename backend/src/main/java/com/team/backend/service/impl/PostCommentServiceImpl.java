package com.team.backend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.team.backend.mapper.PostCommentMapper;
import com.team.backend.model.PostComment;
import com.team.backend.service.PostCommentService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author yangyu
 * @since 2021-04-26
 */
@Service
public class PostCommentServiceImpl extends ServiceImpl<PostCommentMapper, PostComment> implements
    PostCommentService {

}
