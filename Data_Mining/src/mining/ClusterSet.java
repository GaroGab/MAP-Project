package mining;
import data.*;

import mining.Cluster;

public class ClusterSet {
    private Cluster C[];
    private int i=0;

    ClusterSet(int k){
        C= new Cluster[k];
    }

    void add(Cluster c){

        C[i]=c;
        i++;
    }

    Cluster get(int i){
        return C[i];
    }

    void initializeCentroids(Data data) throws OutOfRangeSampleSize {
        int centroidIndexes[]=data.sampling(C.length);
        for(int i=0;i<centroidIndexes.length;i++)
        {
            Tuple centroidI=data.getItemSet(centroidIndexes[i]);
            add(new Cluster(centroidI));
        }
    }

    Cluster nearestCluster(Tuple tuple){
        double dist;
        double minDist=Double.MAX_VALUE;
        int nearCluster = 0;
        for (int i=0;i<C.length;i++){
            dist= tuple.getDistance(C[i].getCentroid());
            if(minDist>dist){
                minDist=dist;
                nearCluster=i;
            }
        }
        return C[nearCluster];
    }

    Cluster currentCluster(int id){
        for(int i=0;i< C.length;i++){
            if(C[i].contain(id)) return C[i];
        }
        return null;
    }

    void updateCentroids(Data data){
        for(int i=0;i< C.length;i++){
            C[i].computeCentroid(data);
        }
    }

    public String toString(){
        String Centroids="";
        for(int i=0;i< C.length;i++){
            Centroids += C[i].toString() + "\n";
        }
        return Centroids;
    }

    public String toString(Data data){
        String str="";
        for(int i=0;i< C.length;i++){
            if (C[i]!=null)
                str += i+": "+ C[i].toString(data) + "\n";
        }
        return str;
    }
}
