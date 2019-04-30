<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>河北庆昇源酿酒有限公司</title>
    <style>
        * {
            margin: 0;
            padding: 0;
        }

        img {
            vertical-align: bottom;
        }

        #main {
            width: 100%;
        }

        #main img {
            width: 100%;
        }

        #btn {
            position: fixed;
            bottom: 17px;
            left: 0px;
            width: 100%;
            display: flex;
            justify-content: space-around;
        }

        #btn a {
            display: inline-block;
            width: 36%;
            border-radius: 5px;
            /* background-color: #fff; */
            box-shadow: 0px 3px 6px rgba(0, 0, 0, 0.36);
        }

        #btn a img {
            width: 100%;
        }
    </style>
</head>

<body>
<div id="main">
    <div>
        <img src="https://blackph.oss-cn-hangzhou.aliyuncs.com/1%E9%A1%B5.jpg">
        <img src="https://blackph.oss-cn-hangzhou.aliyuncs.com/2%E9%A1%B5.jpg">
        <img src="https://blackph.oss-cn-hangzhou.aliyuncs.com/3%E9%A1%B5.jpg">
        <img src="https://blackph.oss-cn-hangzhou.aliyuncs.com/4%E9%A1%B5.jpg">
        <img src="https://blackph.oss-cn-hangzhou.aliyuncs.com/5%E9%A1%B5.jpg">
        <img src="https://blackph.oss-cn-hangzhou.aliyuncs.com/6%E9%A1%B5.jpg">
    </div>

    <div id="btn">
        <a href="https://mp.weixin.qq.com/mp/profile_ext?action=home&__biz=MzI2MDU2NjgxNQ==&scene=126&bizpsid=0&subscene=0#wechat_redirect">
            <img src="https://blackph.oss-cn-hangzhou.aliyuncs.com/follow.png" alt="">
        </a>
        <a href="http://www.xingdijiu.com/">
            <img src="https://blackph.oss-cn-hangzhou.aliyuncs.com/website.png" alt="">
        </a>

        <a href="http://anshun.m.chenzhongtech.com/fw/photo/3xafna8t5csuxdq?fid=1338604017&cc=share_wxms&groupName=E_1_181030224046340_G_1&appType=1&docId=231&photoId=3xafna8t5csuxdq&shareId=15720079250&shareToken=X39jmcyYUgMC_6d1L6V4OhRE1ur&userId=3xb6yi5mp6ihwi6&shareType=1&et=1_i%2F1632238440846467077_f0&timestamp=1556623887365">
            <img src="https://blackph.oss-cn-hangzhou.aliyuncs.com/%E7%9B%B4%E6%92%AD%E6%8C%89%E9%92%AE.png" alt="">
        </a>
    </div>
</div>
</body>

</html>