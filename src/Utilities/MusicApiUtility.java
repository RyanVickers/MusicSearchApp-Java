package Utilities;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MusicApiUtility {
    /**
     * Method fetches list of albums from api
     *
     * @param search
     * @throws IOException
     * @throws InterruptedException
     */
    public static void getAlbums(String search) throws IOException, InterruptedException {
        String searchURL = "https://www.theaudiodb.com/api/v1/json/1/searchalbum.php?s=" + search;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(searchURL)).build();

        HttpResponse<Path> response =
                client.send(request, HttpResponse.BodyHandlers.ofFile(
                        Paths.get("src/JSONData/albumSearch.json")));
    }

    /**
     * Method gets album details based album id
     *
     * @param albumId
     * @throws IOException
     * @throws InterruptedException
     */
    public static void getAlbum(String albumId) throws IOException, InterruptedException {
        String searchURL = "https://theaudiodb.com/api/v1/json/1/album.php?m=" + albumId;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(searchURL)).build();

        HttpResponse<Path> response =
                client.send(request, HttpResponse.BodyHandlers.ofFile(
                        Paths.get("src/JSONData/albumInfo.json")));
    }

    /**
     * Method fetches list of tracks from api
     *
     * @param albumId
     * @throws IOException
     * @throws InterruptedException
     */
    public static void getTracks(String albumId) throws IOException, InterruptedException {
        String searchURL = "https://theaudiodb.com/api/v1/json/1/track.php?m=" + albumId;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(searchURL)).build();

        HttpResponse<Path> response =
                client.send(request, HttpResponse.BodyHandlers.ofFile(
                        Paths.get("src/JSONData/trackInfo.json")));
    }

}
