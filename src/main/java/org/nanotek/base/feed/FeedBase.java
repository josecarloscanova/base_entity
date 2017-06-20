package org.nanotek.base.feed;

import org.nanotek.Base;
import org.nanotek.base.Link;
import org.nanotek.base.LongBase;
import org.nanotek.base.Title;

@SuppressWarnings("serial")
public class FeedBase<T extends Base<?>>  extends LongBase{

	private FeedGroupType feedGroupType; 
	private Title<T> title; 
	private Base<?> description; 
	private Link<T> link; 
	
	public FeedBase(){}
	
	public FeedGroupType getFeedGroupType() {
		return feedGroupType;
	}

	public void setFeedGroupType(FeedGroupType feedGroupType) {
		this.feedGroupType = feedGroupType;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public Base<?> getDescription() {
		return description;
	}

	public void setDescription(Base<?> description) {
		this.description = description;
	}

	public Link getLink() {
		return link;
	}

	public void setLink(Link link) {
		this.link = link;
	}

}
