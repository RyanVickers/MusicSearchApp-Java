package Utilities;

import Models.AlbumData;
import Models.SearchResult;
import Models.TrackData;
import Models.TrackResult;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class JSONUtility {

    public static ArrayList<AlbumData> getAlbumList(String jsonFileName) {
        ArrayList<AlbumData> albums = new ArrayList<>();
        Gson albumGson = new Gson();
        try (FileReader fileReader = new FileReader(jsonFileName);
             JsonReader jsonReader = new JsonReader(fileReader);
        ) {
            SearchResult searchResult = albumGson.fromJson(jsonReader, SearchResult.class);
            albums.addAll(Arrays.asList(searchResult.getAlbums()));
        } catch (Exception e) {
            System.out.println("No artist in api.");

        }
        return albums;
    }

    public static ArrayList<TrackData> getTrackList(String jsonFileName) {
        ArrayList<TrackData> tracks = new ArrayList<>();
        Gson trackGson = new Gson();
        try (FileReader fileReader = new FileReader(jsonFileName);
             JsonReader jsonReader = new JsonReader(fileReader);
        ) {
            TrackResult trackResult = trackGson.fromJson(jsonReader, TrackResult.class);
            tracks.addAll(Arrays.asList(trackResult.getTracks()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tracks;
    }
}
