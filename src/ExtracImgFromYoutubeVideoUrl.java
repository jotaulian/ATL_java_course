import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExtracImgFromYoutubeVideoUrl {

    static void GenerateUrlVideoImage(String url, String idVideo, String Quality){
        final Map<String, Object> quality = new HashMap<>();
        quality.put("alta", "/maxresdefault.jpg");
        quality.put("baja", "/hqdefault.jpg");

        System.out.println("This is the url with the image for that video: "+url + idVideo + quality.get(Quality));
    }

    public static void main(String[] args) {

        String BASE_URL = "https://i3.ytimg.com/vi/";

        //Ask user for video url:
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insert youtube URL:");
        String url = keyboard.nextLine();

        // Ask user for image quality:
        System.out.println("Pick quality of the image:");
        System.out.println("1) Alta");
        System.out.println("2) Baja");
        String quality;
        if(keyboard.nextInt() == 1){
            quality = "alta";
        }else{
            quality = "baja";
        }

        //Get video ID from video url:
        int cutFromHere = url.indexOf("=");
        String idVideo = url.substring(cutFromHere+1);

        //Generate Image URL for the video:
        GenerateUrlVideoImage(BASE_URL,idVideo, quality);

    }
}
