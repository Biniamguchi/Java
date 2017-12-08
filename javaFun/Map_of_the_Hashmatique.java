import java.util.HashMap;

public class Hashmatique{
    static HashMap<String,String> trackList = new HashMap<>();

    public static void getTracks(){
        for(HashMap.Entry<String,String>e:trackList.entrySet()){
            System.out.println("Track: "+e.getKey()+" Lyrics: "+e.getValue());
        }
    }

    public static void main(String[] args){
        trackList.put("Song1","Shape of you.");
        trackList.put("Song2","Despasito.");
        trackList.put("Song3","Attention");
        trackList.put("Song4"," Broccoli.");

        System.out.println(trackList.get("Song1"));

        getTracks();
    }
}
// import java.util.HashMap;

// public class HashMatique {
//     public static void main(String[] args) {
//         HashMap<String, String> trackList = new HashMap<>();

//         trackList.put("Song1", "LYRICS");
//         trackList.put("Song2", "LYRICS");
//         trackList.put("Song3", "LYRICS");
//         trackList.put("Song4", "LYRICS");

//         String track = trackList.get("Song1");
//         System.out.println(track);

//         for(String key : trackList.keySet()) {
//             System.out.println(key + " : " + trackList.get(key));
//         }
//     }
// }