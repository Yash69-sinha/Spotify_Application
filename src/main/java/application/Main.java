package application;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Listenify application");
        Album album1 = new Album("New Hindi Song","Arijit Singh");

        album1.addNewSongToAlbum("Tum hi ho",3.5);
        album1.addNewSongToAlbum("What jhumka",4.2);
        album1.addNewSongToAlbum("Kesariya",5.2);
        album1.addNewSongToAlbum("Shayad",6.0);


        Album album2 = new Album("Old Hindi Songs","Kishore Kumar");
        album2.addNewSongToAlbum("neele neele amber prr",5.6);
        album2.addNewSongToAlbum("Mere Mehboob Qayamat",3.4);
        album2.addNewSongToAlbum("ek chatur naar",6.2);
        album2.addNewSongToAlbum("Mere Sapnon Ki Rani",3.4);



        List<Song> songs=new ArrayList<>();
        songs.add(new Song("s1",1.4));
        songs.add(new Song("s2",4.2));

        List<Song> playlist=new ArrayList<>();

        album1.addSongToPlayList(2,playlist);
        album1.addSongToPlayList(3,playlist);
        album2.addSongToPlaylist("Mera Mehboob Qayamat",playlist);
        album2.addSongToPlaylist("neele neele amber par",playlist);

        printMenu();


        startSongs(playlist);



        }
        public static void startSongs(List<Song> playlist)
        {
            int index=0;
            System.out.println("Now Playing " +playlist.get(index).toString());
            Scanner sc=new Scanner(System.in);
            boolean continuePlaying=true;

            while (continuePlaying){
                System.out.println("Enter your choice");
                int choice=sc.nextInt();

                switch (choice)
                {
                    case 1:
                        if(index==playlist.size()-1)
                        {
                            index++;

                        }
                        else
                        {
                            index=0;
                        }
                        System.out.println("Now Playing "+playlist.get(index).toString());
                        break;
                    case 2:
                        if(index==0)
                        {
                            index=0;
                        }
                        else
                        {
                            index--;
                        }
                        System.out.println("Now Playing "+playlist.get(index).toString());
                        break;

                    case 3:
                        System.out.println("Now Playing "+playlist.get(index).toString());
                        break;


                    case 4 :
                        printPlaylist(playlist);
                        break;
                    case 5 :
                        printMenu();
                        break;
                    case 6 :
                        playlist.remove(index);
                        //It will goto the next Index
                        if(index==playlist.size()){
                            index = 0;
                        }
                        break;
                    case 7 :
                        Collections.shuffle(playlist);
                        break;
                    case 8 :
                        continuePlaying = false;
                        break;

                }
            }
        }

        public static void printPlaylist(List<Song> playlist){
            for(Song song: playlist)
            {
                System.out.println(song.toString());
            }
        }

        public static void printMenu(){
            System.out.println("There are few options that you can choose from");
            System.out.println("1. goto and play next song ");
            System.out.println("2. goto the previous song");
            System.out.println("3. Repeat the same song");
            System.out.println("4. Show all songs of the playlist");
            System.out.println("5. Print the menu");
            System.out.println("6. Delete the current song");
            System.out.println("7. Suffle the playlist");
            System.out.println("8. Exit the playlist");
    }

}
