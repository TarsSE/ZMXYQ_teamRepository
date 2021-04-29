package com.team.backend.service;

import com.team.backend.model.PostLike;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author yangyu
 * @since 2021-04-28
 */
public interface PostLikeService extends IService<PostLike> {

  /**
   * 点赞评论
   *
   * Service方法
   *
   * @param postLike 需保证成员变量postId,idFrom有值
   */
  boolean likePost(PostLike postLike);

}
