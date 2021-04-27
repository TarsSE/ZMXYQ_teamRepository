package com.team.backend.model;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author yangyu
 * @since 2021-04-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "PostEyeOn对象", description = "")
public class PostEyeOn implements Serializable {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "ID")
  @TableId(value = "id", type = IdType.AUTO)
  private Long id;

  @ApiModelProperty(value = "创建时间")
  @TableField(fill = FieldFill.INSERT)
  private Date gmtCreate;

  @ApiModelProperty(value = "最近一次修改时间")
  @TableField(fill = FieldFill.INSERT_UPDATE)
  private Date gmtModified;

  @ApiModelProperty(value = "逻辑删除")
  @TableLogic
  private Integer deleted;

  @ApiModelProperty(value = "帖子ID，外键")
  private Long postId;

  @ApiModelProperty(value = "关注用户ID，外键")
  private Long idFrom;


}
