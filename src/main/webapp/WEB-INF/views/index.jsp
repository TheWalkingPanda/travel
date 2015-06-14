<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.travel.domain.User"%>
<%
	User loginUser = (User)session.getAttribute("loginUser");
%>
<!DOCTYPE html>
<html>
  <head>
    <title>Super Panda</title>
	
    <meta name="keywords" content="keyword1,keyword2,keyword3">
    <meta name="description" content="this is my page">
    <meta name="content-type" content="text/html; charset=UTF-8">
    
    <link rel="stylesheet" type="text/css" href="../../res/css/style.css">
	<link rel="stylesheet" type="text/css" href="../../res/css/index.css">
	
  </head>
  
  <body>
	<!-- 顶部导航条
	===================================== -->
	
	<div class="navbar navbar-fixed-top">
    	<div class="navbar-inner">
    		<div class="container">
    			<a class="brand" href="#"><span class="sp-logo">Super Panda</span></a>
    			
	    		<ul class="nav">
	    			<li class="active"><a href="toPage?page=index"><i class="icon-home"></i> 首页</a></li>
	    			<li><a href="#">新闻</a></li>
	    			<li><a href="#">牛人游记</a></li>
	    			<li><a href="#">Blog</a></li>
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
	    		
	    		<form action="#" method="post" class="navbar-search">
		    		<input type="text" class="search-query span2" placeholder="回车搜索"/>
    			</form>
    			
    			<ul class="nav pull-right">
    				<li class="dropdown">
	    				<a id="account" class="dropdown-toggle" data-toggle="dropdown" href="#">
	    					<i class="icon-user"></i> <%=loginUser.getUsername() %><b class="caret"></b>
	    				</a>
	    				<ul class="dropdown-menu" aria-labelledby="account">
	    					<li><a href="toPage?page=profile"><i class="icon-cog"></i> 账户设置</a></li>
	    					<li class="divider"></li>
	    					<li><a href="logout"><i class="icon-off"></i> 注销</a></li>
	    				</ul>
	    			</li>
    			</ul>
    		</div>
    	</div>
    </div>
    
    <!-- 主体内容
    ===================================== -->
    <div class="container">
    	<div class="row-fluid">
    		<div class="span3">
    			<div class="sp-userInfo sp-shadow sp-corner">
    				<div class="sp-headerTop sp-topCorner">
    					<img alt="user-header" src="../../res/image/header.jpg" class="sp-header sp-corner">
    				</div>
    				<a href="toPage?page=profile"><b><span style="color: #000;margin-left: 110px;"><%=loginUser.getUsername() %></span></b></a>
    				<div class="sp-userData">
    					<div class="row-fluid" style="text-align: center;">
    						<div class="span4">
    							<a href="#"><h4>102<label>关注</label></h4></a>
    						</div>
    						<div class="span4">
    							<a href="#"><h4>135<label>粉丝</label></h4></a>
    						</div>
    						<div class="span4">
    							<a href="#"><h4>841<label>事件</label></h4></a>
    						</div>
    					</div>
    				</div>
    			</div>
    			
    			<div class="sp-shadow sp-corner">
    				<ul class="nav nav-list sp-sidenav">
	    				<li><a href="#"><i class="icon-chevron-right"></i>BigPanda</a></li>
	    				<li class="active"><a href="#"><i class="icon-chevron-right"></i>Yeson</a></li>
	    				<li><a href="#"><i class="icon-chevron-right"></i>BabyQ</a></li>
	    				<li><a href="#"><i class="icon-chevron-right"></i>TeaEgg</a></li>
	    				<li><a href="#"><i class="icon-chevron-right"></i>Saodison</a></li>
	    			</ul>
    			</div>
    			
    			
    			
    		</div>
    		<div class="span6">
    			<div class="sp-content sp-shadow sp-corner">
    				
    			</div>
    		</div>
    		<div class="span3">
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


