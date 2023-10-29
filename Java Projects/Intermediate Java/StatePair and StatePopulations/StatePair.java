public class StatePair <Type1 extends Comparable<Type1>, Type2 extends Comparable<Type2>> {
   private Type1 value1;
   private Type2 value2;
   
   // TODO: Define a constructor, mutators, and accessors 
   //       for StatePair
   public StatePair(Type1 value1, Type2 value2){
      this.value1 = value1;
      this.value2 = value2;
   }
   
   public void setValue1(Type1 V1){ //sets value 1
      value1 = V1;
   }
   
   public Type1 getValue1(){ //gets value 1
    return value1;  
   }
   
    public void setValue2(Type2 V2){ //sets value 2
      value2 = V2;
   }
   
   public Type2 getValue2(){ //gets value 2
    return value2;  
   }
   
   // TODO: Define printInfo() method
   
   public void printInfo(){
      System.out.println(value1 + ": " + value2);
   }
}