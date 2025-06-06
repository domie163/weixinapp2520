package com.entity.view;

import com.entity.WenjianEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 文件信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("wenjian")
public class WenjianView extends WenjianEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 文件类型的值
		*/
		private String wenjianValue;
		/**
		* 文件状态的值
		*/
		private String wenjianStatusValue;
		/**
		* 文件标识的值
		*/
		private String biaoshiStatusValue;



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

	public WenjianView() {

	}

	public WenjianView(WenjianEntity wenjianEntity) {
		try {
			BeanUtils.copyProperties(this, wenjianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
