package bunchbysoh;

public class Main {
  public static void main(String[] args){
    int healthycount = 0;
    int exchangecount = 0;
    int failedcount = 0;

    for(double capacity: capacities){
      double initialcapacity=100.0;
      double soh=(capacity/initialcapacity)*100.0;
      if(soh>80.0){
        healthycount++;
      }
      else if(soh>=63.0){
        exchangecount++;
      }
      else{
        failedcount++;
      }
 static CountsBySoH countBatteriesByHealth(int[] presentCapacities) {
    CountsBySoH counts = new CountsBySoH();
    return counts;
// int[] presentCapacities = {115, 118, 80, 95, 91, 72};
    double[] capacities={115,118,80,95,91,72};
    CountsBySoH counts = countBatteriesByHealth(presentCapacities);
   /* assert(counts.healthy == 2);
    assert(counts.exchange == 3);
    assert(counts.failed == 1);*/
   
    System.out.println("Counting batteries by SoH...\n");
    System.out.println("Number of Healthy Batteries:"+healthycount);
    System.out.println("Number of Exchange Batteries:"+exchangecount);
    System.out.println("Number of Failed Batteries:"+failedcount);
    System.out.println("Done counting :)\n");
  //public static void main(String[] args) {
  //testBucketingByHealth();

