package application;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String albumName;
    private List<Song> songlist;
    private String artistName;

    public Album(String albumName,String artistName){
        this.albumName=albumName;
        this.artistName=artistName;
        this.songlist=new ArrayList<>();
    }

    public Album(String albumName, List<Song> songlist, String artistName) {
        this.albumName = albumName;
        this.songlist = songlist;
        this.artistName = artistName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public List<Song> getSonglist() {
        return songlist;
    }

    public void setSonglist(List<Song> songlist) {
        this.songlist = songlist;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public boolean findSong(String title)
    {
        for(Song song:songlist)
        {
            if(song.getName().equals(title)) {
                return true;
            }


        }
        return false;
    }
    public String addNewSongToAlbum(String title,double duration){
        if(findSong(title))
        {
            return "Song is already present in it";
        }
        else
        {
            Song newSong=new Song(title,duration);
            songlist.add(newSong);
            return "new Song with title"+title+"has been added to the songlist";
        }
    }
    public String addSongToPlayList(int songNo,List<Song> playList)
    {
        int index=songNo-1;
        if(index>=0 && index<songlist.size())
        {
            Song song=songlist.get(songNo);
            playList.add(song);
            return "song is added to the playlist";
        }
        else {
            return "Song is out of range";
        }
    }
    public String addSongToPlaylist(String title,List<Song> playlist)
    {
        for(Song song:songlist)
        {
            if(song.getName().equals(title))
            {
                playlist.add(song);
                return "song added to the playlist";
            }
        }
        return "Song could not be found on the album";
    }
}
