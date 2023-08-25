public class array_o2_program {
    public static void main(String[] args) {
        float[] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float num = 45.7f;
        boolean isInArray = false;
        for(float element:marks){
            if(num==element){
                isInArray = true;
                break;
            }
        
        
        }
        if(isInArray){
            System.out.println("The value is present on the array");

        }
        else{
            System.out.println("The value is not present on the array");
        }
    }
    
}
