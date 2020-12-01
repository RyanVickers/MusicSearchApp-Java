package Utilities;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MusicApiUtility {
    public static void getAlbum(String search) throws IOException, InterruptedException {
        String searchURL = "http://ws.audioscrobbler.com/2.0/?method=album.search&album="+search+"&api_key=27964084c8813b1bee610cd1fa30adf3&format=json";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(searchURL)).build();

        HttpResponse<Path> response =
                client.send(request, HttpResponse.BodyHandlers.ofFile(
                        Paths.get("/JSONData/albumSearch.json")));
    }

}
