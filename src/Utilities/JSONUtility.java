package Utilities;

import Models.AlbumData;
import Models.SearchResult;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class JSONUtility {

    public static ArrayList<AlbumData> getAlbumList(String jsonFileName)
    {
        ArrayList<AlbumData> albums = new ArrayList<>();
        Gson gson = new Gson();
        try(FileReader fileReader = new FileReader(jsonFileName);
            JsonReader jsonReader = new JsonReader(fileReader);
        )
        {
            SearchResult searchResult = gson.fromJson(jsonReader,SearchResult.class);
            albums.addAll(Arrays.asList(searchResult.getAlbums()));
        }catch (Exception e)
        {
           e.printStackTrace();
        }
        return albums;
    }
}
