package org.nanotek.base.music.playlist.youtube;

import java.util.Set;

import javax.persistence.Entity;

import org.nanotek.base.StringBase;
import org.nanotek.base.music.playlist.PlayList;
import org.nanotek.base.music.record.youtube.YouTubeMusicalRecord;

@Entity
@SuppressWarnings("serial")
public class YouTubePlayList extends PlayList{

	protected StringBase playListName;
	
	protected String youTubePlayListUri;
	
	public YouTubePlayList()
	{
	}
	
	protected Set<YouTubeMusicalRecord> musicalRecords;

	public String getYouTubePlayListUri() {
		return youTubePlayListUri;
	}

	public void setYouTubePlayListUri(String youTubePlayListUri) {
		this.youTubePlayListUri = youTubePlayListUri;
	}
	
	
	
}
