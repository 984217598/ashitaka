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
            position: relative;
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
</head>

<body>
<div id="main">
    <div>
        <img src="./images/1页.jpg">
        <img src="./images/2页.jpg">
        <img src="./images/3页.jpg">
        <img src="./images/4页.jpg">
        <img src="./images/5页.jpg">
        <img src="./images/6页.jpg">
    </div>

    <div id="btn">
        <a
                href="https://mp.weixin.qq.com/mp/profile_ext?action=home&__biz=MzI2MDU2NjgxNQ==&scene=126&bizpsid=0#wechat_redirect">
            <img src="./images/follow.png" alt="">
        </a>
        <a href="javascript:;" id="liveBtn">
            <img src="http://blackph.oss-cn-hangzhou.aliyuncs.com/%E7%9B%B4%E6%92%AD%E6%8C%89%E9%92%AE.png" alt="">
        </a>
        <a href="http://www.xingdijiu.com/">
            <img src="./images/website.png" alt="">
        </a>
    </div>

    <div id="scan" class="hide">
        <img src="http://blackph.oss-cn-hangzhou.aliyuncs.com/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20190501200115.png" alt="">
    </div>
</div>
</body>
<script>
    window.onload = function () {
        const liveBtn = document.querySelector('#liveBtn')
        const scan = document.querySelector('#scan')
        liveBtn.onclick = function liveBtnClick() {
            if (scan.classList.contains('hide')) {
                scan.classList.remove('hide')
            } else {
                scan.classList.add('hide')
            }

            const str = '我拍的快手短视频都很有趣，一起来看看？http://anqiu.s.gifshow.com/s/4pYCgZ5v 复制此链接，打开【快手】直接观看！'
            copyToClipboard(str)
        }

        scan.onclick = function scanClick() {
            if (scan.classList.contains('hide')) {
                scan.classList.remove('hide')
            } else {
                scan.classList.add('hide')
            }
        }

        function copyToClipboard (text) {
            if(text.indexOf('-') !== -1) {
                let arr = text.split('-');
                text = arr[0] + arr[1];
            }
            var textArea = document.createElement("textarea");
            textArea.style.position = 'fixed';
            textArea.style.top = '0';
            textArea.style.left = '0';
            textArea.style.width = '2em';
            textArea.style.height = '2em';
            textArea.style.padding = '0';
            textArea.style.border = 'none';
            textArea.style.outline = 'none';
            textArea.style.boxShadow = 'none';
            textArea.style.background = 'transparent';
            textArea.value = text;
            document.body.appendChild(textArea);
            textArea.select();

            try {
                var successful = document.execCommand('copy');
            } catch (err) {
                alert('该浏览器不支持点击复制到剪贴板');
            }

            document.body.removeChild(textArea);
        }
    }
</script>
</html>