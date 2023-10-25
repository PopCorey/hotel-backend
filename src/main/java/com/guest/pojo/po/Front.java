package com.guest.pojo.po;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 前台管理员表
 * </p>
 *
 * @author Corey.Cao
 * @since 2022-03-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Front对象", description="前台管理员表")
public class Front implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "前台管理员用户名")
    @TableId("front_id")
    private String frontId;

    @ApiModelProperty(value = "前台管理员姓名")
    private String name;

    @ApiModelProperty(value = "前台管理员密码")
    private String password;

    @ApiModelProperty(value = "前台管理员手机号")
    private String phone;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;


}
