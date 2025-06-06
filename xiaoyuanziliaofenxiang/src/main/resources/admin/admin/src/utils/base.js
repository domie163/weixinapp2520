const base = {
    get() {
        return {
            url : "http://localhost:8080/xiaoyuanziliaofenxiang/",
            name: "xiaoyuanziliaofenxiang",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xiaoyuanziliaofenxiang/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "校园资料分享微信小程序"
        } 
    }
}
export default base
