const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  devServer: {
    proxy: {
        '/':{
            "target":'http://localhost:8081', // Spring boot의 주소 및 포트
            "pathRewrite":{'^/':''},
            "changeOrigin":true,
            ws:false,
        }
    }
}
})
