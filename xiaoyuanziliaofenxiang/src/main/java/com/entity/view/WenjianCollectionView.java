package com.entity.view;

import com.entity.WenjianCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 文件收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("wenjian_collection")
public class WenjianCollectionView extends WenjianCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 收藏类型的值
		*/
		private String wenjianCollectionValue;



		//级联表 wenjian
			/**
			* 文件名称
			*/
			private String wenjianName;
			/**
			* 文件类型
			*/
			private Integer wenjianTypes;
				/**
				* 文件类型的值
				*/
				private String wenjianValue;
			/**
			* 文件图片
			*/
			private String wenjianPhoto;
			/**
			* 文件
			*/
			private String wenjianFile;
			/**
			* 下载积分
			*/
			private Integer wenjianJifenNumber;
			/**
			* 赞
			*/
			private Integer zanNumber;
			/**
			* 踩
			*/
			private Integer caiNumber;
			/**
			* 文件信息 的 用户
			*/
			private Integer wenjianYonghuId;
			/**
			* 文件状态
			*/
			private Integer wenjianStatusTypes;
				/**
				* 文件状态的值
				*/
				private String wenjianStatusValue;
			/**
			* 文件标识
			*/
			private Integer biaoshiStatusTypes;
				/**
				* 文件标识的值
				*/
				private String biaoshiStatusValue;
			/**
			* 文件详情
			*/
			private String wenjianContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 积分
			*/
			private Integer yonghuJifenNumber;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public WenjianCollectionView() {

	}

	public WenjianCollectionView(WenjianCollectionEntity wenjianCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, wenjianCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 收藏类型的值
			*/
			public String getWenjianCollectionValue() {
				return wenjianCollectionValue;
			}
			/**
			* 设置： 收藏类型的值
			*/
			public void setWenjianCollectionValue(String wenjianCollectionValue) {
				this.wenjianCollectionValue = wenjianCollectionValue;
			}
















				//级联表的get和set wenjian

					/**
					* 获取： 文件名称
					*/
					public String getWenjianName() {
						return wenjianName;
					}
					/**
					* 设置： 文件名称
					*/
					public void setWenjianName(String wenjianName) {
						this.wenjianName = wenjianName;
					}

					/**
					* 获取： 文件类型
					*/
					public Integer getWenjianTypes() {
						return wenjianTypes;
					}
					/**
					* 设置： 文件类型
					*/
					public void setWenjianTypes(Integer wenjianTypes) {
						this.wenjianTypes = wenjianTypes;
					}


						/**
						* 获取： 文件类型的值
						*/
						public String getWenjianValue() {
							return wenjianValue;
						}
						/**
						* 设置： 文件类型的值
						*/
						public void setWenjianValue(String wenjianValue) {
							this.wenjianValue = wenjianValue;
						}

					/**
					* 获取： 文件图片
					*/
					public String getWenjianPhoto() {
						return wenjianPhoto;
					}
					/**
					* 设置： 文件图片
					*/
					public void setWenjianPhoto(String wenjianPhoto) {
						this.wenjianPhoto = wenjianPhoto;
					}

					/**
					* 获取： 文件
					*/
					public String getWenjianFile() {
						return wenjianFile;
					}
					/**
					* 设置： 文件
					*/
					public void setWenjianFile(String wenjianFile) {
						this.wenjianFile = wenjianFile;
					}

					/**
					* 获取： 下载积分
					*/
					public Integer getWenjianJifenNumber() {
						return wenjianJifenNumber;
					}
					/**
					* 设置： 下载积分
					*/
					public void setWenjianJifenNumber(Integer wenjianJifenNumber) {
						this.wenjianJifenNumber = wenjianJifenNumber;
					}

					/**
					* 获取： 赞
					*/
					public Integer getZanNumber() {
						return zanNumber;
					}
					/**
					* 设置： 赞
					*/
					public void setZanNumber(Integer zanNumber) {
						this.zanNumber = zanNumber;
					}

					/**
					* 获取： 踩
					*/
					public Integer getCaiNumber() {
						return caiNumber;
					}
					/**
					* 设置： 踩
					*/
					public void setCaiNumber(Integer caiNumber) {
						this.caiNumber = caiNumber;
					}

					/**
					* 获取：文件信息 的 用户
					*/
					public Integer getWenjianYonghuId() {
						return wenjianYonghuId;
					}
					/**
					* 设置：文件信息 的 用户
					*/
					public void setWenjianYonghuId(Integer wenjianYonghuId) {
						this.wenjianYonghuId = wenjianYonghuId;
					}


					/**
					* 获取： 文件状态
					*/
					public Integer getWenjianStatusTypes() {
						return wenjianStatusTypes;
					}
					/**
					* 设置： 文件状态
					*/
					public void setWenjianStatusTypes(Integer wenjianStatusTypes) {
						this.wenjianStatusTypes = wenjianStatusTypes;
					}


						/**
						* 获取： 文件状态的值
						*/
						public String getWenjianStatusValue() {
							return wenjianStatusValue;
						}
						/**
						* 设置： 文件状态的值
						*/
						public void setWenjianStatusValue(String wenjianStatusValue) {
							this.wenjianStatusValue = wenjianStatusValue;
						}

					/**
					* 获取： 文件标识
					*/
					public Integer getBiaoshiStatusTypes() {
						return biaoshiStatusTypes;
					}
					/**
					* 设置： 文件标识
					*/
					public void setBiaoshiStatusTypes(Integer biaoshiStatusTypes) {
						this.biaoshiStatusTypes = biaoshiStatusTypes;
					}


						/**
						* 获取： 文件标识的值
						*/
						public String getBiaoshiStatusValue() {
							return biaoshiStatusValue;
						}
						/**
						* 设置： 文件标识的值
						*/
						public void setBiaoshiStatusValue(String biaoshiStatusValue) {
							this.biaoshiStatusValue = biaoshiStatusValue;
						}

					/**
					* 获取： 文件详情
					*/
					public String getWenjianContent() {
						return wenjianContent;
					}
					/**
					* 设置： 文件详情
					*/
					public void setWenjianContent(String wenjianContent) {
						this.wenjianContent = wenjianContent;
					}







				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 积分
					*/
					public Integer getYonghuJifenNumber() {
						return yonghuJifenNumber;
					}
					/**
					* 设置： 积分
					*/
					public void setYonghuJifenNumber(Integer yonghuJifenNumber) {
						this.yonghuJifenNumber = yonghuJifenNumber;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
