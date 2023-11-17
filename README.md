<p align="center">
    <img src=http://120.79.155.15:9000/mediafiles/e9gria4h-logo.gif width=188/>
</p>
<h1 align="center">API 接口开放平台</h1>
<p align="center"><strong>API 接口开放平台是一个为用户和开发者提供全面API接口调用服务的平台 🛠</strong></p>
<div align="center">
</div>

## 项目介绍 🙋



**😀 作为用户您可以通过注册登录账户，获取接口调用权限，并根据自己的需求浏览和选择适合的接口。您可以在线进行接口调试，快速验证接口的功能和效果。**

**💻 作为开发者 我们提供了[客户端SDK: API-SDK](http://github.com/LYC1360572433/api-sdk-master)， 通过[开发者凭证](http://120.79.155.15:80/account/center)即可将轻松集成接口到您的项目中，实现更高效的开发和调用。**

**🤝 您可以将自己的接口接入到API 接口开放平台平台上，并发布给其他用户使用。 您可以管理和各个接口，以便更好地分析和优化接口性能。**

**👌 我们还提供了[开发者在线文档](http://120.79.155.15:81/)和技术支持，帮助您快速接入和发布接口。**

**🏁 无论您是用户还是开发者，API 接口开放平台都致力于提供稳定、安全、高效的接口调用服务，帮助您实现更快速、便捷的开发和调用体验。**

## 网站导航 🧭

- [**API 后端 🏘️**](http://github.com/LYC1360572433/api)
- [**API 前端 🏘**️](http://github.com/LYC1360572433/api-frontend-master)

-  **[API-SDK](http://github.com/LYC1360572433/api-sdk-master)** 🛠

-  **[API 接口开放平台 🔗](http://120.79.155.15:80/account/center)**

-  **[API-DOC 开发者文档 📖](http://120.79.155.15:81/)**
-  **[API-SDK-demo ✔️](http://github.com/LYC1360572433/api-sdk-demo-master)**


## 目录结构 📑


| 目录                                                                                                                                 | 描述            |
|------------------------------------------------------------------------------------------------------------------------------------| --------------- |
| **🏘️ [api-backend](./api-backend)**                                                                                               | API后端服务模块 |
| **🏘️ [api-common](./api-common)**                                                                                                 | 公共服务模块    |
| **🕸️ [api-gateway](./api-gateway)**                                                                                               | 网关模块        |
| **🔗 [api-interface](./api-interface)**                                                                                            | 接口模块        |
| **🛠 [api-sdk](http://github.com/LYC1360572433/api-sdk-master)**                                                                           | 开发者调用sdk   |
| **📘 [api-doc](http://120.79.155.15:81/)**                                                                                           | 接口在线文档    |
| **✔️ [API-SDK-Demo](http://github.com/LYC1360572433/master/api-sdk-demo-master)** | sdk调用Demo |


## 快速启动 🚀

### 前端

环境要求：Node.js >= 16

安装依赖：

```bash
yarn or  npm install
```

启动：

```bash
yarn run dev or npm run start:dev
```

部署：

```bash
yarn build or npm run build
```

### 后端

执行sql目录下ddl.sql



## 网站导航 🧭

-  **[API-SDK](https://github.com/LYC1360572433/api-sdk-master)** 🛠

- **[API 接口开放平台 🔗](http://120.79.155.15:80/)**

- **[API-DOC 开发者文档 📖](http://120.79.155.15:81/)**
- **[API-SDK-demo ✔️](https://github.com/LYC1360572433/api-sdk-demo-master)**



## 项目选型 🎯

### **后端**

- Spring Boot 2.7.0
- Spring MVC
- MySQL 数据库
- 腾讯云COS存储
- Dubbo 分布式（RPC、Nacos）
- Spring Cloud Gateway 微服务网关
- API 签名认证（Http 调用）
- IJPay-AliPay  支付宝支付
- WeiXin-Java-Pay  微信支付
- Swagger + Knife4j 接口文档
- Spring Boot Starter（SDK 开发）
- Jakarta.Mail 邮箱通知、验证码
- Spring Session Redis 分布式登录
- Apache Commons Lang3 工具类
- MyBatis-Plus 及 MyBatis X 自动生成
- Hutool、Apache Common Utils、Gson 等工具库

### 前端

- React 18

- Ant Design Pro 5.x 脚手架

- Ant Design & Procomponents 组件库

- Umi 4 前端框架

- OpenAPI 前端代码生成



## 功能介绍 📋

`坤币`即积分，用于平台接口调用。

| **功能**                                                                         | 游客 | **普通用户** | **管理员** |
|--------------------------------------------------------------------------------|--------------|-----|-----|
| [**API-SDK**](https://github.com/LYC1360572433/api-sdk-master)使用 | ✅ | ✅ |     ✅      |
| **[开发者API在线文档](http://120.79.155.15:81/)**                                     | ✅ | ✅ |     ✅      |
| 邀请好友注册得坤币                                                                      | ❌ | ✅ |     ✅      |
| 切换主题、深色、暗色                                                                     | ✅ | ✅ | ✅ |
| 微信支付宝付款                                                                        | ❌ | ✅ | ✅ |
| 在线调试接口                                                                         | ❌ | ✅ | ✅ |
| 每日签到得坤币                                                                        | ❌ | ✅ | ✅ |
| 接口大厅搜索接口、浏览接口                                                                  | ✅ | ❌ | ✅ |
| 邮箱验证码登录注册                                                                      | ✅ | ✅ | ✅ |
| 钱包充值                                                                           | ❌ | ❌ | ✅ |
| 支付成功邮箱通知(需要绑定邮箱)                                                               | ❌ | ✅ | ✅ |
| 更新头像                                                                           | ❌ | ✅ | ✅ |
| 绑定、换绑、解绑邮箱                                                                     | ❌ | ✅ | ✅ |
| 取消订单、删除订单                                                                      | ❌ | ✅ | ✅ |
| 商品管理、上线、下架                                                                     | ❌ | ❌ |✅|
| 用户管理、封号解封等                                                                     | ❌ | ❌ | ✅ |
| 接口管理、接口发布审核、下架                                                                 | ❌ | ❌ | ✅ |
| 退款                                                                             | ❌ | ❌| ❌ |

## 功能展示 ✨

### 首页

![index](http://120.79.155.15:9000/mediafiles/1699968819171.png)

### 接口广场

![interfaceSquare](http://120.79.155.15:9000/mediafiles/1699968919306.png)

### 开发者在线文档

![api](http://120.79.155.15:9000/mediafiles/1699969662367.png)

![api2](http://120.79.155.15:9000/mediafiles/1699969677433.png)

### 接口描述

#### **在线API**

![interfaceinfo-api](http://120.79.155.15:9000/mediafiles/1699968962057.png)
![interfaceinfo-api](http://120.79.155.15:9000/mediafiles/1699968968833.png)

#### 在线调试工具![interfaceinfo-tools](http://120.79.155.15:9000/mediafiles/1699968985034.png)

![interfaceinfo-tools](http://120.79.155.15:9000/mediafiles/1699968968833.png)

#### **错误码参考**![interfaceinfo-errorcode](http://120.79.155.15:9000/mediafiles/1699969753641.png)

#### **接口调用代码示例**![interfaceinfo-sampleCode](http://120.79.155.15:9000/mediafiles/1699969764344.png)

### 管理页

#### 用户管理

![admin-userManagement](http://120.79.155.15:9000/mediafiles/1699969050361.png)

#### 商品管理![admin-productManagement](http://120.79.155.15:9000/mediafiles/1699969043464.png)

#### 接口管理![admin-interfaceManagement](http://120.79.155.15:9000/mediafiles/1699969036641.png)

#### 订单管理![admin-orderManagement](http://120.79.155.15:9000/mediafiles/1699969056601.png)

### 积分商城

![pointPurchase](http://120.79.155.15:9000/mediafiles/1699969006778.png)
![pointPurchase](http://120.79.155.15:9000/mediafiles/1699969014985.png)

### 订单支付![pay](http://120.79.155.15:9000/mediafiles/1699969026048.png)

### 个人信息

#### 信息展示

![userinfo](http://120.79.155.15:9000/mediafiles/1699969069849.png)

#### 每日签到

##### 签到成功![successfullySignedIn](http://120.79.155.15:9000/mediafiles/1699969140744.png)

##### 签到失败![errorfullySignedIn](http://120.79.155.15:9000/mediafiles/1699969078168.png)

### 好友邀请

#### **发送邀请**![Invitefriends](http://120.79.155.15:9000/mediafiles/1699969087617.png)

#### **接收邀请**![registerThroughInvitationCode](http://120.79.155.15:9000/mediafiles/1699969102474.png)

### 登录/注册![login](http://120.79.155.15:9000/mediafiles/1699968778285.png)
![login](http://120.79.155.15:9000/mediafiles/1699968768194.png)

![register](http://120.79.155.15:9000/mediafiles/1699968788812.png)
![register](http://120.79.155.15:9000/mediafiles/1699968796411.png)
### 我的订单

- **我的订单**![orderinfo](http://120.79.155.15:9000/mediafiles/1699969835888.png)

- **详细订单**![orderDetails](http://120.79.155.15:9000/mediafiles/1699969842952.png)
### 主题切换

#### 深色主题![darkTheme](http://120.79.155.15:9000/mediafiles/1699968828066.png)

#### 浅色主题![index](http://120.79.155.15:9000/mediafiles/1699968819171.png)
