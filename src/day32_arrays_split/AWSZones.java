package day32_arrays_split;
import java.util.Arrays;
public class AWSZones {
    public static void main(String[] args) {
        String app= "etsy";
        //index/slpit     0         1         2
        String zones ="us-east-1,us-west-2,us-west-1";
        String zonesArray []=zones.split(",");
        System.out.println(Arrays.toString(zonesArray));///breakdown of zones
        System.out.println("-----starting deployment of etsy app to AWS zones------");

        for (String each:zonesArray) {

            System.out.println("Deploying [" + app + "] to " + each);//print each zone one at a time
            System.out.println("deployment completed for " + each);

        }
        //get zone counts also zone array length
        System.out.println(zonesArray.length);
    }
}
