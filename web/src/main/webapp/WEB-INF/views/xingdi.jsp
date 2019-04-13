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
        <img src="https://blackph.oss-cn-hangzhou.aliyuncs.com/1%E9%A1%B5.jpg?Expires=1555180969&OSSAccessKeyId=TMP.AQF__tyXoU2fbkIEfjO4bsTCpqxuz1RcpJFP452znt2Sqc1j6jiCmgokf-iGAAAwLAIUQ831zBxnzEgtHngAJ4hUOPkQgLoCFCeZ-hAJO_DShFT6oqmAKUi2GfbR&Signature=NBcid0aI0YiU4yY5H3KOUleKis4%3D">
        <img src="https://blackph.oss-cn-hangzhou.aliyuncs.com/2%E9%A1%B5.jpg?Expires=1555181112&OSSAccessKeyId=TMP.AQF__tyXoU2fbkIEfjO4bsTCpqxuz1RcpJFP452znt2Sqc1j6jiCmgokf-iGAAAwLAIUQ831zBxnzEgtHngAJ4hUOPkQgLoCFCeZ-hAJO_DShFT6oqmAKUi2GfbR&Signature=i6rE2dzpDUjNdAbZugLVEHOEnWg%3D">
        <img src="https://blackph.oss-cn-hangzhou.aliyuncs.com/3%E9%A1%B5.jpg?Expires=1555181138&OSSAccessKeyId=TMP.AQF__tyXoU2fbkIEfjO4bsTCpqxuz1RcpJFP452znt2Sqc1j6jiCmgokf-iGAAAwLAIUQ831zBxnzEgtHngAJ4hUOPkQgLoCFCeZ-hAJO_DShFT6oqmAKUi2GfbR&Signature=tDTCohKdwwOe8uBgz9D%2FQWPBBss%3D">
        <img src="https://blackph.oss-cn-hangzhou.aliyuncs.com/4%E9%A1%B5.jpg?Expires=1555181155&OSSAccessKeyId=TMP.AQF__tyXoU2fbkIEfjO4bsTCpqxuz1RcpJFP452znt2Sqc1j6jiCmgokf-iGAAAwLAIUQ831zBxnzEgtHngAJ4hUOPkQgLoCFCeZ-hAJO_DShFT6oqmAKUi2GfbR&Signature=vJt6GDq3MZa9JgvFaE3gXNoOUqU%3D">
        <img src="https://blackph.oss-cn-hangzhou.aliyuncs.com/5%E9%A1%B5.jpg?Expires=1555181169&OSSAccessKeyId=TMP.AQF__tyXoU2fbkIEfjO4bsTCpqxuz1RcpJFP452znt2Sqc1j6jiCmgokf-iGAAAwLAIUQ831zBxnzEgtHngAJ4hUOPkQgLoCFCeZ-hAJO_DShFT6oqmAKUi2GfbR&Signature=SW30Ttba17KlKN3oimEkBH%2BodFs%3D">
        <img src="https://blackph.oss-cn-hangzhou.aliyuncs.com/6%E9%A1%B5.jpg?Expires=1555181182&OSSAccessKeyId=TMP.AQF__tyXoU2fbkIEfjO4bsTCpqxuz1RcpJFP452znt2Sqc1j6jiCmgokf-iGAAAwLAIUQ831zBxnzEgtHngAJ4hUOPkQgLoCFCeZ-hAJO_DShFT6oqmAKUi2GfbR&Signature=FCtqYEdSxxisbxHrCWvfVMafFxc%3D">
    </div>

    <div id="btn">
        <a href="https://mp.weixin.qq.com/mp/profile_ext?action=home&__biz=MzI2MDU2NjgxNQ==&scene=126&bizpsid=0&subscene=0#wechat_redirect">
            <img src="https://blackph.oss-cn-hangzhou.aliyuncs.com/follow.png?Expires=1555181210&OSSAccessKeyId=TMP.AQF__tyXoU2fbkIEfjO4bsTCpqxuz1RcpJFP452znt2Sqc1j6jiCmgokf-iGAAAwLAIUQ831zBxnzEgtHngAJ4hUOPkQgLoCFCeZ-hAJO_DShFT6oqmAKUi2GfbR&Signature=f0czgt46KuDxoJnAE4gJ1hsEZmc%3D" alt="">
        </a>
        <a href="http://www.xingdijiu.com/">
            <img src="https://blackph.oss-cn-hangzhou.aliyuncs.com/website.png?Expires=1555181250&OSSAccessKeyId=TMP.AQF__tyXoU2fbkIEfjO4bsTCpqxuz1RcpJFP452znt2Sqc1j6jiCmgokf-iGAAAwLAIUQ831zBxnzEgtHngAJ4hUOPkQgLoCFCeZ-hAJO_DShFT6oqmAKUi2GfbR&Signature=oHli6MdVQYaH%2BI4pX2QJL6z0zJM%3D" alt="">
        </a>
    </div>
</div>
</body>

</html>