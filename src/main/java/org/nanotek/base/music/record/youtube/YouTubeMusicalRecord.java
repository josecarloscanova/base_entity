package org.nanotek.base.music.record.youtube;

import javax.persistence.Entity;

import org.nanotek.base.music.record.MusicalRecord;

@Entity
@SuppressWarnings("serial")
public class YouTubeMusicalRecord extends MusicalRecord{

	protected String youtubeMusicalRecordUri;

	public String getYoutubeMusicalRecordUri() {
		return youtubeMusicalRecordUri;
	}

	public void setYoutubeMusicalRecordUri(String youtubeMusicalRecordUri) {
		this.youtubeMusicalRecordUri = youtubeMusicalRecordUri;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime
				* result
				+ ((youtubeMusicalRecordUri == null) ? 0
						: youtubeMusicalRecordUri.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		YouTubeMusicalRecord other = (YouTubeMusicalRecord) obj;
		if (youtubeMusicalRecordUri == null) {
			if (other.youtubeMusicalRecordUri != null)
				return false;
		} else if (!youtubeMusicalRecordUri
				.equals(other.youtubeMusicalRecordUri))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "YouTubeMusicalRecord [youtubeMusicalRecordUri="
				+ youtubeMusicalRecordUri + "]";
	}
}
