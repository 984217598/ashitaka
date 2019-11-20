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

        body {
            width: 100%;
            height: 100%;
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
            bottom: 10px;
            left: 0px;
            width: 100%;
            display: flex;
            justify-content: space-around;
        }

        #btn a {
            display: inline-block;
            width: 30%;
            border-radius: 5px;
            /* background-color: #fff; */
            box-shadow: 0px 3px 6px rgba(0, 0, 0, 0.36);
        }

        #btn a img {
            width: 100%;
        }

        #scan {
            width: 100%;
            height: 100%;
            position: fixed;
            top: 0px;
            background-color: #ccc;
            z-index: 2;
        }

        .hide {
            display: none;
        }

        #scan img {
            position: absolute;
            top: 50%;
            left: 50%;
            width: 40%;
            transform: translate(-50%, -50%)
        }
    </style>
    <script  src="./js/clipboard.min.js"></script>
    <script>
        window.onload = function () {
            const liveBtn = document.querySelector('#liveBtn')
            const scan = document.querySelector('#scan')
            const scanImg = document.querySelector('#scanImg')

            var clipboard = new ClipboardJS('#liveBtn')
            clipboard.on('success', function(e) {
                var e = e || window.event;
            }).on('error', function(e) {})

            liveBtn.onclick = function liveBtnClick() {
                if (scan.classList.contains('hide')) {
                    scan.classList.remove('hide')
                } else {
                    scan.classList.add('hide')
                }

                // const str = '我拍的快手短视频都很有趣，一起来看看？http://anqiu.s.gifshow.com/s/4pYCgZ5v 复制此链接，打开【快手】直接观看！'
                // copyToClipboard(str)
            }
            scan.onclick = function scanClick() {
                if (scan.classList.contains('hide')) {
                    scan.classList.remove('hide')
                } else {
                    scan.classList.add('hide')
                }
            }

            scanImg.onclick = function scanImgClick(e) {
                console.log(123)
                e.stopPropagation();
                e.preventDefault();
            }
        }
    </script>
</head>

<body>
<div id="main">
    <div>
        <img src="https://blackph.oss-cn-hangzhou.aliyuncs.com/1.jpg">
        <img src="https://blackph.oss-cn-hangzhou.aliyuncs.com/2.jpg">
        <img src="https://blackph.oss-cn-hangzhou.aliyuncs.com/3.jpg">
        <img src="https://blackph.oss-cn-hangzhou.aliyuncs.com/4.jpg">
        <img src="https://blackph.oss-cn-hangzhou.aliyuncs.com/5.jpg">
        <img src="https://blackph.oss-cn-hangzhou.aliyuncs.com/6.jpg">
    </div>

    <div id="btn">
        <a
                href="https://mp.weixin.qq.com/mp/profile_ext?action=home&__biz=MzI2MDU2NjgxNQ==&scene=126&bizpsid=0#wechat_redirect">
            <img src="https://blackph.oss-cn-hangzhou.aliyuncs.com/follow.png" alt="">
        </a>
        <a href="javascript:;" id="liveBtn" data-clipboard-text="看了这么多快手，还是「庆昇源酒业」最好玩了！ http://kpfshanghai.m.chenzhongtech.com/s/1zmvJbr5 复制此链接，打开【快手】直接观看！">
            <img src="http://blackph.oss-cn-hangzhou.aliyuncs.com/%E7%9B%B4%E6%92%AD%E6%8C%89%E9%92%AE.png" alt="">
        </a>
        <a href="http://www.xingdijiu.com/">
            <img src="https://blackph.oss-cn-hangzhou.aliyuncs.com/website.png" alt="">
        </a>
    </div>
</div>
<div id="scan" class="hide">
    <img id="scanImg" src="https://blackph.oss-cn-hangzhou.aliyuncs.com/guanzhu.png" alt="">
</div>
</body>


</html>