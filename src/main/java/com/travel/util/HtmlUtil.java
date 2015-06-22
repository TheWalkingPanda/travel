package com.travel.util;

import us.codecraft.webmagic.selector.Selectable;

public class HtmlUtil {
	
	/**
	 * 获取html节点的文本内容
	 * @param html 使用webmagic获得的html节点，如<div class="article-time">2015-06-20 13:05:23</div>
	 */
	public static String getText(Selectable html){
		return html.replace("<[^>]+>", "").toString().trim();
	}
	
	public static String completeImgSrc(Selectable html, String domain, String oldSrc){
		return html.replace(oldSrc, domain+oldSrc).toString();
	}
}
