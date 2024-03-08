package com.solid.L.principles;

public abstract class SocialMedia {

	// Support whatsApp, Facebook, Instagram
	public abstract void chatWithFriend();

	// Support facebook, Instagram
	public abstract void publishPost(Object post);

	// Support whatsApp, Facebook, Instagram
	public abstract void sendPhotosAndVideos();

	// support WhatsApp, Facebook
	public abstract void groupVideoCall(String... users);
}
