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
        <img src="https://blackph.oss-cn-hangzhou.aliyuncs.com/1%E9%A1%B5.jpg?Expires=1555203720&OSSAccessKeyId=TMP.AQF__tyXoU2fbkIEfjO4bsTCpqxuz1RcpJFP452znt2Sqc1j6jiCmgokf-iGAAAwLAIUQ831zBxnzEgtHngAJ4hUOPkQgLoCFCeZ-hAJO_DShFT6oqmAKUi2GfbR&Signature=B3REXTF2tWzWvlsh6gyvpax%2BMrY%3D">
        <img src="https://blackph.oss-cn-hangzhou.aliyuncs.com/2%E9%A1%B5.jpg?Expires=1555203760&OSSAccessKeyId=TMP.AQF__tyXoU2fbkIEfjO4bsTCpqxuz1RcpJFP452znt2Sqc1j6jiCmgokf-iGAAAwLAIUQ831zBxnzEgtHngAJ4hUOPkQgLoCFCeZ-hAJO_DShFT6oqmAKUi2GfbR&Signature=SDpIpqp1QdSPRWT0prflYoNPwXM%3D">
        <img src="https://blackph.oss-cn-hangzhou.aliyuncs.com/3%E9%A1%B5.jpg?Expires=1555203781&OSSAccessKeyId=TMP.AQF__tyXoU2fbkIEfjO4bsTCpqxuz1RcpJFP452znt2Sqc1j6jiCmgokf-iGAAAwLAIUQ831zBxnzEgtHngAJ4hUOPkQgLoCFCeZ-hAJO_DShFT6oqmAKUi2GfbR&Signature=Y0hpmbVsE5ov4ZimlC1WqjhD6%2Bo%3D">
        <img src="https://blackph.oss-cn-hangzhou.aliyuncs.com/4%E9%A1%B5.jpg?Expires=1555203793&OSSAccessKeyId=TMP.AQF__tyXoU2fbkIEfjO4bsTCpqxuz1RcpJFP452znt2Sqc1j6jiCmgokf-iGAAAwLAIUQ831zBxnzEgtHngAJ4hUOPkQgLoCFCeZ-hAJO_DShFT6oqmAKUi2GfbR&Signature=gGuRH%2BwsmmVwgbaB%2FDdg4cOBHEg%3D">
        <img src="https://blackph.oss-cn-hangzhou.aliyuncs.com/5%E9%A1%B5.jpg?Expires=1555203811&OSSAccessKeyId=TMP.AQF__tyXoU2fbkIEfjO4bsTCpqxuz1RcpJFP452znt2Sqc1j6jiCmgokf-iGAAAwLAIUQ831zBxnzEgtHngAJ4hUOPkQgLoCFCeZ-hAJO_DShFT6oqmAKUi2GfbR&Signature=Z7en2wZOE04AO7hky4H2IaEaebU%3D">
        <img src="https://blackph.oss-cn-hangzhou.aliyuncs.com/6%E9%A1%B5.jpg?Expires=1555203825&OSSAccessKeyId=TMP.AQF__tyXoU2fbkIEfjO4bsTCpqxuz1RcpJFP452znt2Sqc1j6jiCmgokf-iGAAAwLAIUQ831zBxnzEgtHngAJ4hUOPkQgLoCFCeZ-hAJO_DShFT6oqmAKUi2GfbR&Signature=2eXIYXTHiWlRY2CStdK99OVMuWs%3D">
    </div>

    <div id="btn">
        <a href="https://mp.weixin.qq.com/mp/profile_ext?action=home&__biz=MzI2MDU2NjgxNQ==&scene=126&bizpsid=0&subscene=0#wechat_redirect">
            <img src="https://blackph.oss-cn-hangzhou.aliyuncs.com/follow.png?Expires=1555203839&OSSAccessKeyId=TMP.AQF__tyXoU2fbkIEfjO4bsTCpqxuz1RcpJFP452znt2Sqc1j6jiCmgokf-iGAAAwLAIUQ831zBxnzEgtHngAJ4hUOPkQgLoCFCeZ-hAJO_DShFT6oqmAKUi2GfbR&Signature=FFzvB%2Fev1qaPYV7mHOlTr8s7fZo%3D" alt="">
        </a>
        <a href="http://www.xingdijiu.com/">
            <img src="https://blackph.oss-cn-hangzhou.aliyuncs.com/website.png?Expires=1555203864&OSSAccessKeyId=TMP.AQF__tyXoU2fbkIEfjO4bsTCpqxuz1RcpJFP452znt2Sqc1j6jiCmgokf-iGAAAwLAIUQ831zBxnzEgtHngAJ4hUOPkQgLoCFCeZ-hAJO_DShFT6oqmAKUi2GfbR&Signature=PuW6kV1QVKUu8HLRTVce%2BCfrEZM%3D" alt="">
        </a>
    </div>
</div>
</body>

</html>