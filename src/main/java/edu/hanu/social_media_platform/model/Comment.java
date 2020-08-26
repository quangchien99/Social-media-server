package edu.hanu.social_media_platform.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Comment {
	
	private long id;
	private String comment;
	private String created;
	private Status status;
	private Profile profile;
	private List<Link> links = new ArrayList<>();
	
	public Comment(long id, String message, String author) {
		super();
		this.id = id;
		this.comment = message;
		}

	public Comment() {
		super();
	}
	
	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}

	/**
	 * @return the profile
	 */
	public Profile getProfile() {
		return profile;
	}

	/**
	 * @param profile the profile to set
	 */
	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the message
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param message the message to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return the created
	 */
	public String getCreated() {
		return created;
	}

	/**
	 * @param created the created to set
	 */
	public void setCreated(String created) {
		this.created = created;
	}

	
	/**
	 * @return the links
	 */
	public List<Link> getLinks() {
		return links;
	}

	/**
	 * @param links the links to set
	 */
	public void setLinks(List<Link> links) {
		this.links = links;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", message=" + comment + ", created=" + created + ", status=" + status
				+ ", profile=" + profile + ", links=" + links + "]";
	}

	public void addLink(String uri, String rel) {
		Link link = new Link();
		link.setUri(uri);
		link.setRel(rel);
		links.add(link);
	}
	
}
