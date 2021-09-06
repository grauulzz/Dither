
public class Main {
	public static void main(String[] args) {

		UtilityMethods util = new UtilityMethods();
		ImageProcessing obj = new ImageProcessing();

		int[][] imageData = util.imgToTwoD("C://pics//suckinDownChilliDawgs.jpg");
		util.viewImageData(imageData);	
		util.twoDToImage(imageData, "./1orignal.jpeg");

		
		int[][] trimmed = obj.trimBorders(imageData, 300);
		util.twoDToImage(trimmed, "./2trimmed.jpg");
		
		int[][] negitive = obj.negativeColor(imageData);
		util.twoDToImage(negitive, "./3negitive.jpg");
		
		// converts the negitive image to be inverted (collects imageData from filepath the negitive img is saved to)
		int[][] invertNegitive = obj.invertImage(util.imgToTwoD("C://Java//Dither//3negitive.jpg"));
		util.twoDToImage(invertNegitive, "./4invertNegitive.jpg");


		
	}

}