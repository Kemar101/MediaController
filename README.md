# MediaController
# Introduction:
The functions, the major purpose of the component is to control media Typically contains the buttons like "Play/Pause", "Rewind", "Fast Forward" and a progress slider. It also can have "next" and "previous". Thw media controller will create a floating window above ur application with a default set of controls. The media controller will show depending if the setPrevNextListeners() is called and is hidden if the setPrevNextListeners() is called with null.
# History:
The Media Controller was introduce in API level 1, and is still used in the latest api which is 28. over the year there was a few changes made to the media controller with different api version. for example api level 4 added a play back state public MediaControlPlaybackState GetPlaybackState() that allow you to FastForwarding, MovingToNext, MovingToPrevious and rewind. Another feature added is the GetPlaylists that Returns the all playlists public IEnumerable<MediaControlPlaylist> GetPlaylists() that was added in api level 5. another feature that was added was in api version was GetPlaylistOfCurrentPlayingMedia this returns the playlist name of current playing media. api level 5 was the last update for media Controller  
# Major methods/attributes:
 Some of the major attributes is the android:clickable from class android.view.View that defines whether this view reacts to click events.This is needed so that you can click the pause/play or any other button. A major attribute is the android:id Supply an identifier name for this view, to later retrieve it with View.findViewById() or Activity.findViewById(). That require the class android.view.View. A mojor Method is the onTrackballEvent(MotionEvent ev) this implement a method to handle trackball motion so that you can move to specific point in the media.
  
# Example project:
# Code:
# Reference:
  
