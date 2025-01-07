public class Leetcode_832_FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {

        for(int i=0; i<image.length; i++){      //horizontal flip
            int start = 0;
            int last = image[i].length-1;

           while(start <= last){    
            int temp = 0;

            temp = image[i][start];
            image[i][start] = image[i][last];
            image[i][last] = temp;

            start++;
            last--;
           }
        }

        for(int i=0; i<image.length; i++){          //inverting
            for(int j=0; j<image[i].length; j++){
                if(image[i][j] == 0){
                    image[i][j] = 1;
                }else{
                    image[i][j] = 0;
                }
            }
        }

        return image;
    }
}
