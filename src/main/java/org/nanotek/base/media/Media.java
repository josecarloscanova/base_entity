package org.nanotek.base.media;

import org.nanotek.base.LongBase;

/**
 * Java Class derived from YouTube Class 
 * 
 * Refer: https://developers.google.com/youtube/2.0/reference#youtube_data_api_tag_media:content
 * @author josecanova
 *
 */
@SuppressWarnings("serial")
public class Media extends LongBase{
	
   private String url; 
   private String type;
   private Boolean isDefault;
   private String expression;
   private Integer duration;
//  private YouTubeFormat youTubeFormat; maybe a class for youtube format. TODO: check a class for youtube format.
   
}
