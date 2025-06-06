<template>
	<view class="content">
		<form class="app-update-pv">
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#f06f4f","textAlign":"left"}' class="title">
					文件名称</view>
				<input disabled
					:style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#f06f4f","borderRadius":"16rpx","color":"#f06f4f","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
					:disabled="ro.wenjianName" type="text" v-model="ruleForm.wenjianName" placeholder="文件名称"></input>
			</view>
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#f06f4f","textAlign":"left"}' class="title">
					文件类型</view>
				<picker @change="wenjianTypesChange" :value="wenjianTypesIndex" :range="wenjianTypesOptions"
					range-key="indexName">
					<view
						:style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#f06f4f","borderRadius":"16rpx","color":"#f06f4f","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
						class="uni-input">{{ruleForm.wenjianTypes?ruleForm.wenjianValue:"请选择文件类型"}}</view>
				</picker>
			</view>
			<view
				:style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(218, 220, 219, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"108rpx"}'
				class="cu-form-group" @tap="wenjianPhotoTap">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#f06f4f","textAlign":"left"}' class="title">
					文件图片</view>
				<view class="right-input" style="padding:0;textAlign:left">
					<image
						:style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
						class="avator" v-if="ruleForm.wenjianPhoto" :src="ruleForm.wenjianPhoto" mode="aspectFill">
					</image>
					<image
						:style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
						class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
			<view
				:style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(218, 220, 219, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"108rpx"}'
				class="cu-form-group" @tap="wenjianFileTap">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#f06f4f","textAlign":"left"}' class="title">
					文件</view>
				<view class="right-input" style="padding:0;textAlign:left">
					<image
						:style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
						class="avator" v-if="ruleForm.wenjianFile" :src="ruleForm.wenjianFile" mode="aspectFill">
					</image>
					<image
						:style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
						class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#f06f4f","textAlign":"left"}' class="title">
					下载积分</view>
				<input disabled
					:style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#f06f4f","borderRadius":"16rpx","color":"#f06f4f","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
					:disabled="ro.wenjianJifenNumber" type="number" v-model="ruleForm.wenjianJifenNumber"
					placeholder="下载积分"></input>
			</view>
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#f06f4f","textAlign":"left"}' class="title">
					文件状态</view>
				<picker @change="wenjianStatusTypesChange" :value="wenjianStatusTypesIndex"
					:range="wenjianStatusTypesOptions" range-key="indexName">
					<view
						:style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#f06f4f","borderRadius":"16rpx","color":"#f06f4f","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
						class="uni-input">{{ruleForm.wenjianStatusTypes?ruleForm.wenjianStatusValue:"请选择文件状态"}}</view>
				</picker>
			</view>
			<!-- text后缀 -->
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"210rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#f06f4f","textAlign":"left"}' class="title">
					文件详情</view>
				<textarea
					:style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#f06f4f","borderRadius":"16rpx","color":"#f06f4f","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx","height":"200rpx"}'
					:disabled="ro.wenjianContent" v-model="ruleForm.wenjianContent" placeholder="文件详情" />
			</view>

			<view class="btn">
				<button
					:style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"#f06f4f","borderColor":"#409EFF","borderRadius":"8rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"0","width":"70%","fontSize":"32rpx","borderStyle":"solid","height":"80rpx"}'
					@tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

		<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="insertTimeConfirm"
			ref="insertTime" themeColor="#333333"></w-picker>
		<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="createTimeConfirm"
			ref="createTime" themeColor="#333333"></w-picker>


	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				cross: '',
				ro: {
					wenjianName: false,
					wenjianTypes: false,
					wenjianPhoto: false,
					wenjianFile: false,
					wenjianJifenNumber: false,
					zanNumber: false,
					caiNumber: false,
					yonghuId: false,
					wenjianStatusTypes: false,
					biaoshiStatusTypes: false,
					wenjianContent: false,
					insertTime: false,
					createTime: false,
				},
				ruleForm: {
					wenjianName: '',
					wenjianTypes: '', //数字
					wenjianValue: '', //数字对应的值
					wenjianPhoto: '',
					wenjianFile: '',
					wenjianJifenNumber: '',
					zanNumber: '0',
					caiNumber: '0',
					yonghuId: '',
					wenjianStatusTypes: '', //数字
					wenjianStatusValue: '', //数字对应的值
					biaoshiStatusTypes: '1', //数字
					biaoshiStatusValue: '', //数字对应的值
					wenjianContent: '',
					insertTime: '',
					createTime: '',
				},
				// 登陆用户信息
				user: {},
				wenjianTypesOptions: [],
				wenjianTypesIndex: 0,
				wenjianStatusTypesOptions: [],
				wenjianStatusTypesIndex: 0,
				biaoshiStatusTypesOptions: [],
				biaoshiStatusTypesIndex: 0,

			}
		},
		components: {
			wPicker
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},
		},
		async onLoad(options) {

			/*下拉框*/
			let wenjianTypesParams = {
				page: 1,
				limit: 100,
				dicCode: 'wenjian_types',
			}
			let wenjianTypes = await this.$api.page(`dictionary`, wenjianTypesParams);
			this.wenjianTypesOptions = wenjianTypes.data.list
			/*下拉框*/
			let wenjianStatusTypesParams = {
				page: 1,
				limit: 100,
				dicCode: 'wenjian_status_types',
			}
			let wenjianStatusTypes = await this.$api.page(`dictionary`, wenjianStatusTypesParams);
			this.wenjianStatusTypesOptions = wenjianStatusTypes.data.list
			/*下拉框*/
			let biaoshiStatusTypesParams = {
				page: 1,
				limit: 100,
				dicCode: 'biaoshi_status_types',
			}
			let biaoshiStatusTypes = await this.$api.page(`dictionary`, biaoshiStatusTypesParams);
			this.biaoshiStatusTypesOptions = biaoshiStatusTypes.data.list


			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				let res = await this.$api.info(`wenjian`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			if (options.wenjianId) {
				this.ruleForm.wenjianId = options.wenjianId;
			}
			// 跨表
			// this.styleChange()
		},
		methods: {
			// 下拉变化
			wenjianTypesChange(e) {
				this.wenjianTypesIndex = e.target.value
				this.ruleForm.wenjianValue = this.wenjianTypesOptions[this.wenjianTypesIndex].indexName
				this.ruleForm.wenjianTypes = this.wenjianTypesOptions[this.wenjianTypesIndex].codeIndex
			},
			wenjianStatusTypesChange(e) {
				this.wenjianStatusTypesIndex = e.target.value
				this.ruleForm.wenjianStatusValue = this.wenjianStatusTypesOptions[this.wenjianStatusTypesIndex].indexName
				this.ruleForm.wenjianStatusTypes = this.wenjianStatusTypesOptions[this.wenjianStatusTypesIndex].codeIndex
			},
			biaoshiStatusTypesChange(e) {
				this.biaoshiStatusTypesIndex = e.target.value
				this.ruleForm.biaoshiStatusValue = this.biaoshiStatusTypesOptions[this.biaoshiStatusTypesIndex].indexName
				this.ruleForm.biaoshiStatusTypes = this.biaoshiStatusTypesOptions[this.biaoshiStatusTypesIndex].codeIndex
			},


			// styleChange() {
			// 	this.$nextTick(() => {
			// 		// document.querySelectorAll('.app-update-pv .cu-form-group .uni-yaoxianStyle-yaoxianStyle').forEach(el=>{
			// 		//   el.style.backgroundColor = this.addUpdateForm.yaoxianStyle.content.backgroundColor
			// 		// })
			// 	})
			// },


			wenjianPhotoTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.wenjianPhoto = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(() => {
						// _this.styleChange()
					})
				});
			},
			wenjianFileTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.wenjianFile = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(() => {
						// _this.styleChange()
					})
				});
			},
			// 日期控件
			insertTimeConfirm(val) {
				console.log(val)
				this.ruleForm.insertTime = val.result;
				this.$forceUpdate();
			},
			// 日期控件
			createTimeConfirm(val) {
				console.log(val)
				this.ruleForm.createTime = val.result;
				this.$forceUpdate();
			},




			getUUID() {
				return new Date().getTime();
			},
			async onSubmitTap() {
				if ((!this.ruleForm.wenjianName)) {
					this.$utils.msg(`文件名称不能为空`);
					return
				}
				if ((!this.ruleForm.wenjianPhoto)) {
					this.$utils.msg(`文件图片不能为空`);
					return
				}
				if ((!this.ruleForm.wenjianJifenNumber) && (!this.$validate.isIntNumer(this.ruleForm
						.wenjianJifenNumber)) && this.ruleForm.wenjianJifenNumber > 0) {
					this.$utils.msg(`下载积分不能为空，不能小于0 格式为数字`);
					return
				}
				if ((!this.ruleForm.wenjianStatusTypes)) {
					this.$utils.msg(`文件状态不能为空`);
					return
				}
				if (this.ruleForm.id) {
					await this.$api.update(`wenjian`, this.ruleForm);
				} else {
					await this.$api.save(`wenjian`, this.ruleForm);
				}
				uni.setStorageSync('pingluenStateState', true);
				this.$utils.msgBack('提交成功');
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}

	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
		background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}

	.cu-form-group.active {
		justify-content: space-between;
	}

	.btn {
		display: flex;
		align-items: center;
		justify-content: center;
		flex-wrap: wrap;
		padding: 20upx 0;
	}

	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}

	.cu-form-group+.cu-form-group {
		border: 0;
	}

	.cu-form-group uni-input {
		padding: 0 30upx;
	}

	.uni-input {
		padding: 0 30upx;
	}

	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}

	.cu-form-group uni-picker::after {
		line-height: 68rpx;
	}

	.select .uni-input {
		line-height: 68rpx;
	}

	.input .right-input {
		line-height: 68rpx;
	}
</style>
