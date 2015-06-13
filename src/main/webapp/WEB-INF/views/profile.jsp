<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Super Panda</title>
	
    <meta name="keywords" content="keyword1,keyword2,keyword3">
    <meta name="description" content="this is my page">
    <meta name="content-type" content="text/html; charset=UTF-8">
    
    <link rel="stylesheet" type="text/css" href="../../res/css/style.css">
	<link rel="stylesheet" type="text/css" href="../../res/css/profile.css">
	
  </head>
  
  <body>
	<!-- 顶部导航条
	===================================== -->
	
	<div class="navbar navbar-fixed-top">
    	<div class="navbar-inner">
    		<div class="container">
    			<a class="brand" href="#"><span class="sp-logo">Super Panda</span></a>
    			
	    		<ul class="nav">
	    			<li class="active"><a href="#"><i class="icon-home"></i> 首页</a></li>
	    			<li><a href="#">BigPanda</a></li>
	    			<li class="dropdown">
	    				<a id="more" class="dropdown-toggle" data-toggle="dropdown" href="#">More<b class="caret"></b></a>
	    				<ul class="dropdown-menu" aria-labelledby="more">
	    					<li><a href="#">TeaEgg</a></li>
			    			<li><a href="#">DirtyHeadKang</a></li>
			    			<li><a href="#">Bumblebee</a></li>
			    			<li><a href="#">BigMonkey</a></li>
			    			<li><a href="#">HaveMaoMao</a></li>
	    				</ul>
	    			</li>
	    			
	    		</ul>
	    		
	    		<form action="#" method="post" class="navbar-search offset3">
		    		<input type="text" class="search-query span2" placeholder="回车搜索"/>
    			</form>
    			
    			<ul class="nav pull-right">
    				<li class="dropdown">
	    				<a id="account" class="dropdown-toggle" data-toggle="dropdown" href="#">
	    					<i class="icon-user"></i> 大熊猫<b class="caret"></b>
	    				</a>
	    				<ul class="dropdown-menu" aria-labelledby="account">
	    					<li><a href="#"><i class="icon-cog"></i> 账户设置</a></li>
	    					<li class="divider"></li>
	    					<li><a href="#"><i class="icon-off"></i> 注销</a></li>
	    				</ul>
	    			</li>
    			</ul>
    		</div>
    	</div>
    </div>
    
    <!-- 主体内容
    ===================================== -->
    <div class="sp-profileHeader sp-shadow">
    	<div class="container">
    		<div class="row-fluid">
    			<div class="span3">
    				<img alt="user-header" src="../../res/image/header.jpg" class="sp-header sp-headerCorner">
    			</div>
    			<div class="span9">
    				<div class="row-fluid">
    					<div class="span2">
    						<h2 style="color: #fff; margin-top: 250px;">大熊猫</h2>
    					</div>
    					<div class="span10">
    						<a href="#" class="btn btn-warning pull-right" style="margin-top: 40px;">
    							<i class="icon-plus icon-white"></i> <strong>添加一张封面</strong>
    						</a>
    					</div>
    				</div>
    			</div>
    		</div>
    	</div>
    </div>
    <div class="container">
    	<div class="row-fluid" style="height: 80px;"><br/>
    		<ul class="nav nav-pills" style="margin-left: 240px;margin-top: 4px;">
    			<li class="active"><a href="#">个人资料</a></li>
    			<li><a href="#">相册</a></li>
    			<li><a href="#">事件</a></li>
    			<li><a href="#">更多</a></li>
    			<li><a href="#">更多</a></li>
    			<li><a href="#">更多</a></li>
    			<li><a href="#">更多</a></li>
    			<li><a href="#">更多</a></li>
    			<li><a href="#">更多</a></li>
    			<li><a href="#">更多</a></li>
    			<li><a href="#">更多</a></li>
    		</ul>
    	</div>
    	<div class="row-fluid">
    		<div class="span8">
    			<div class="sp-content sp-shadow sp-corner">
    				
    			</div>
    		</div>
    		<div class="span4">
    			<div class="sp-content sp-shadow sp-corner">
    				
    			</div>
    		</div>
    	</div>
    </div>
	    
    
	
	<!-- 引入jquery、bootstrap的js文件
	===================================== -->
	<script type="text/javascript" src="../../res/plugin/jquery/js/jquery-1.10.2.js"></script>
	<script type="text/javascript" src="../../res/plugin/bootstrap/js/bootstrap.js"></script>
	
  </body>
</html>



