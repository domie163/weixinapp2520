package com.entity.vo;

import com.entity.WenjianEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 文件信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("wenjian")
public class WenjianVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 文件名称
     */

    @TableField(value = "wenjian_name")
    private String wenjianName;


    /**
     * 文件类型
     */

    @TableField(value = "wenjian_types")
    private Integer wenjianTypes;


    /**
     * 文件图片
     */

    @TableField(value = "wenjian_photo")
    private String wenjianPhoto;


    /**
     * 文件
     */

    @TableField(value = "wenjian_file")
    private String wenjianFile;


    /**
     * 下载积分
     */

    @TableField(value = "wenjian_jifen_number")
    private Integer wenjianJifenNumber;


    /**
     * 赞
     */

    @TableField(value = "zan_number")
    private Integer zanNumber;


    /**
     * 踩
     */

    @TableField(value = "cai_number")
    private Integer caiNumber;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 文件状态
     */

    @TableField(value = "wenjian_status_types")
    private Integer wenjianStatusTypes;


    /**
     * 文件标识
     */

    @TableField(value = "biaoshi_status_types")
    private Integer biaoshiStatusTypes;


    /**
     * 文件详情
     */

    @TableField(value = "wenjian_content")
    private String wenjianContent;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：文件名称
	 */
    public String getWenjianName() {
        return wenjianName;
    }


    /**
	 * 获取：文件名称
	 */

    public void setWenjianName(String wenjianName) {
        this.wenjianName = wenjianName;
    }
    /**
	 * 设置：文件类型
	 */
    public Integer getWenjianTypes() {
        return wenjianTypes;
    }


    /**
	 * 获取：文件类型
	 */

    public void setWenjianTypes(Integer wenjianTypes) {
        this.wenjianTypes = wenjianTypes;
    }
    /**
	 * 设置：文件图片
	 */
    public String getWenjianPhoto() {
        return wenjianPhoto;
    }


    /**
	 * 获取：文件图片
	 */

    public void setWenjianPhoto(String wenjianPhoto) {
        this.wenjianPhoto = wenjianPhoto;
    }
    /**
	 * 设置：文件
	 */
    public String getWenjianFile() {
        return wenjianFile;
    }


    /**
	 * 获取：文件
	 */

    public void setWenjianFile(String wenjianFile) {
        this.wenjianFile = wenjianFile;
    }
    /**
	 * 设置：下载积分
	 */
    public Integer getWenjianJifenNumber() {
        return wenjianJifenNumber;
    }


    /**
	 * 获取：下载积分
	 */

    public void setWenjianJifenNumber(Integer wenjianJifenNumber) {
        this.wenjianJifenNumber = wenjianJifenNumber;
    }
    /**
	 * 设置：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 获取：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 设置：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 获取：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：文件状态
	 */
    public Integer getWenjianStatusTypes() {
        return wenjianStatusTypes;
    }


    /**
	 * 获取：文件状态
	 */

    public void setWenjianStatusTypes(Integer wenjianStatusTypes) {
        this.wenjianStatusTypes = wenjianStatusTypes;
    }
    /**
	 * 设置：文件标识
	 */
    public Integer getBiaoshiStatusTypes() {
        return biaoshiStatusTypes;
    }


    /**
	 * 获取：文件标识
	 */

    public void setBiaoshiStatusTypes(Integer biaoshiStatusTypes) {
        this.biaoshiStatusTypes = biaoshiStatusTypes;
    }
    /**
	 * 设置：文件详情
	 */
    public String getWenjianContent() {
        return wenjianContent;
    }


    /**
	 * 获取：文件详情
	 */

    public void setWenjianContent(String wenjianContent) {
        this.wenjianContent = wenjianContent;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
