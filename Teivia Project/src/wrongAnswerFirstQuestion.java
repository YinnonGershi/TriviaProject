import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class wrongAnswerFirstQuestion {

	@Test
	void wrongAnswerFirstQuestion1 () {

		// in this function i will clarify if 'Failed' is the result 
		// when wrong answers are marked at the FIRST question ONLY

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://svcollegetest.000webhostapp.com"); // open Trivia home page

		// starting the game
		WebElement StartButton= driver.findElement(By.id("startB"));
		StartButton.click();

		// writing question number 1
		WebElement TextBoxQuestion1 = driver.findElement(By.name("question"));
		TextBoxQuestion1.click();
		TextBoxQuestion1.sendKeys("What is the first element in periodic table?");

		// continue to the answers of question num1
		WebElement NextButton1 = driver.findElement(By.id("nextquest"));
		NextButton1.click();

		// writing the first answer
		WebElement FirstEnswer = driver.findElement(By.name("answer1"));
		FirstEnswer.click();
		FirstEnswer.sendKeys("Hydrogen.");

		// writing the second answer 
		WebElement SecoundEnswere = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
		SecoundEnswere.click();
		SecoundEnswere.sendKeys("Helium.");

		//writing the third answer
		WebElement ThirdEnswere = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
		ThirdEnswere.click();
		ThirdEnswere.sendKeys("Nitrogen.");

		//writing the forth answer
		WebElement ForthEnswere = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
		ForthEnswere.click();
		ForthEnswere.sendKeys("Chlorine.");

		// marking 'Hydrogen' as the right answer
		WebElement FirstRadioButton = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input"));
		FirstRadioButton.click();

		// continue to the second question 
		WebElement NextButton2 = driver.findElement(By.id("nextquest"));
		NextButton2.click();

		// writing question number 2
		WebElement TextBoxQuestion2 = driver.findElement(By.name("question"));
		TextBoxQuestion2.click();
		TextBoxQuestion2.sendKeys("Which country was the first to reach to the Moon?");

		// continue to the answers of question number 2
		WebElement NextButton3 = driver.findElement(By.id("nextquest"));
		NextButton3.click();

		// writing the first answer of question number 2
		WebElement FirstEnswer2 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input"));
		FirstEnswer2.click();
		FirstEnswer2.sendKeys("USA."); 

		// writing the second answer of question number 2
		WebElement SecondEnswer2 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
		SecondEnswer2.click();
		SecondEnswer2.sendKeys("Russia."); 	

		// writing the third answer of question number 2
		WebElement ThirdEnswer2 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
		ThirdEnswer2.click();
		ThirdEnswer2.sendKeys("Japan."); 		

		// writing the forth answer of question number 2
		WebElement ForthEnswer2 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
		ForthEnswer2.click();
		ForthEnswer2.sendKeys("Germany."); 		

		// marking 'Russia' as the right answer
		WebElement SecondRadioButton = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[1]/input"));
		SecondRadioButton.click();

		// continue to the third and last question 
		WebElement NextButton4 = driver.findElement(By.xpath("//*[@id=\"nextquest\"]"));
		NextButton4.click();

		// writing question number 3
		WebElement TextBoxQuestion3 = driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input"));
		TextBoxQuestion3.click();
		TextBoxQuestion3.sendKeys("What is the capital city of Austria?");

		// continue to the answers of question number 3
		WebElement NextButton5 = driver.findElement(By.xpath("//*[@id=\"nextquest\"]"));
		NextButton5.click();

		// writing the first answer of question number 3
		WebElement FirstEnswer3 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input"));
		FirstEnswer3.click();
		FirstEnswer3.sendKeys("Santiago."); 

		// writing the second answer of question number 3
		WebElement SecondEnswer3 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
		SecondEnswer3.click();
		SecondEnswer3.sendKeys("Helsinki."); 

		// writing the third answer of question number 3
		WebElement ThirdEnswer3 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
		ThirdEnswer3.click();
		ThirdEnswer3.sendKeys("Vienna."); 

		// writing the forth answer of question number 3
		WebElement ForthEnswer3 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
		ForthEnswer3.click();
		ForthEnswer3.sendKeys("Minsk."); 

		// marking 'Vienna' as the right answer
		WebElement ThirdRadioButton = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[1]/input"));
		ThirdRadioButton.click();

		// continue to the starting game home page
		WebElement NextButton6 = driver.findElement(By.xpath("//*[@id=\"nextquest\"]"));
		NextButton6.click();

		// pressing on 'Play' button
		WebElement PlayButton = driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]"));
		PlayButton.click();

		// finding a specific Word that is unique to each question
		// and marking the right answer and pressing on next button
		if (driver.getPageSource().contains("capital")) {

			driver.findElement(By.xpath("//*[@id=\"2\"]/input[1]")).click(); // MARKING THE FIRST ANSWER INSTED OF THE RIGHT ONE (THE THIRD)
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();
		}

		if (driver.getPageSource().contains("Moon")) {

			driver.findElement(By.xpath("//*[@id=\"1\"]/input[2]")).click();
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();
		} 									

		if (driver.getPageSource().contains("element")) {

			driver.findElement(By.xpath("//*[@id=\"0\"]/input[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();
		} 	

		if (driver.getPageSource().contains("Sucsses")) {
			fail("ERROR");
		}

	}


	//------------------------------------------------------------------------------------------------------
	// testing the second answer of the first question 

	@Test
	void wrongAnswerFirstQuestion2 () {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://svcollegetest.000webhostapp.com"); // open Trivia home page

		// starting the game
		WebElement StartButton= driver.findElement(By.id("startB"));
		StartButton.click();

		// writing question number 1
		WebElement TextBoxQuestion1 = driver.findElement(By.name("question"));
		TextBoxQuestion1.click();
		TextBoxQuestion1.sendKeys("What is the first element in periodic table?");

		// continue to the answers of question num1
		WebElement NextButton1 = driver.findElement(By.id("nextquest"));
		NextButton1.click();

		// writing the first answer
		WebElement FirstEnswer = driver.findElement(By.name("answer1"));
		FirstEnswer.click();
		FirstEnswer.sendKeys("Hydrogen.");

		// writing the second answer 
		WebElement SecoundEnswere = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
		SecoundEnswere.click();
		SecoundEnswere.sendKeys("Helium.");

		//writing the third answer
		WebElement ThirdEnswere = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
		ThirdEnswere.click();
		ThirdEnswere.sendKeys("Nitrogen.");

		//writing the forth answer
		WebElement ForthEnswere = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
		ForthEnswere.click();
		ForthEnswere.sendKeys("Chlorine.");

		// marking 'Hydrogen' as the right answer
		WebElement FirstRadioButton = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input"));
		FirstRadioButton.click();

		// continue to the second question 
		WebElement NextButton2 = driver.findElement(By.id("nextquest"));
		NextButton2.click();

		// writing question number 2
		WebElement TextBoxQuestion2 = driver.findElement(By.name("question"));
		TextBoxQuestion2.click();
		TextBoxQuestion2.sendKeys("Which country was the first to reach to the Moon?");

		// continue to the answers of question number 2
		WebElement NextButton3 = driver.findElement(By.id("nextquest"));
		NextButton3.click();

		// writing the first answer of question number 2
		WebElement FirstEnswer2 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input"));
		FirstEnswer2.click();
		FirstEnswer2.sendKeys("USA."); 

		// writing the second answer of question number 2
		WebElement SecondEnswer2 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
		SecondEnswer2.click();
		SecondEnswer2.sendKeys("Russia."); 	

		// writing the third answer of question number 2
		WebElement ThirdEnswer2 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
		ThirdEnswer2.click();
		ThirdEnswer2.sendKeys("Japan."); 		

		// writing the forth answer of question number 2
		WebElement ForthEnswer2 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
		ForthEnswer2.click();
		ForthEnswer2.sendKeys("Germany."); 		

		// marking 'Russia' as the right answer
		WebElement SecondRadioButton = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[1]/input"));
		SecondRadioButton.click();

		// continue to the third and last question 
		WebElement NextButton4 = driver.findElement(By.xpath("//*[@id=\"nextquest\"]"));
		NextButton4.click();

		// writing question number 3
		WebElement TextBoxQuestion3 = driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input"));
		TextBoxQuestion3.click();
		TextBoxQuestion3.sendKeys("What is the capital city of Austria?");

		// continue to the answers of question number 3
		WebElement NextButton5 = driver.findElement(By.xpath("//*[@id=\"nextquest\"]"));
		NextButton5.click();

		// writing the first answer of question number 3
		WebElement FirstEnswer3 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input"));
		FirstEnswer3.click();
		FirstEnswer3.sendKeys("Santiago."); 

		// writing the second answer of question number 3
		WebElement SecondEnswer3 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
		SecondEnswer3.click();
		SecondEnswer3.sendKeys("Helsinki."); 

		// writing the third answer of question number 3
		WebElement ThirdEnswer3 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
		ThirdEnswer3.click();
		ThirdEnswer3.sendKeys("Vienna."); 

		// writing the forth answer of question number 3
		WebElement ForthEnswer3 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
		ForthEnswer3.click();
		ForthEnswer3.sendKeys("Minsk."); 

		// marking 'Vienna' as the right answer
		WebElement ThirdRadioButton = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[1]/input"));
		ThirdRadioButton.click();

		// continue to the starting game home page
		WebElement NextButton6 = driver.findElement(By.xpath("//*[@id=\"nextquest\"]"));
		NextButton6.click();

		// pressing on 'Play' button
		WebElement PlayButton = driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]"));
		PlayButton.click();

		// finding a specific Word that is unique to each question
		// and marking the right answer and pressing on next button
		if (driver.getPageSource().contains("capital")) {

			driver.findElement(By.xpath("//*[@id=\"2\"]/input[2]")).click(); // MARKING THE SECOND ANSWER INSTED OF THE RIGHT ONE (THE THIRD)
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();
		}

		if (driver.getPageSource().contains("Moon")) {

			driver.findElement(By.xpath("//*[@id=\"1\"]/input[2]")).click();
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();
		} 									

		if (driver.getPageSource().contains("element")) {

			driver.findElement(By.xpath("//*[@id=\"0\"]/input[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();
		} 	

		if (driver.getPageSource().contains("Sucsses")) {
			fail("ERROR");
		}


	}


	//------------------------------------------------------------------------------------------------------
	// testing the forth answer of the first question 

	@Test
	void wrongAnswerFirstQuestion3 () {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://svcollegetest.000webhostapp.com"); // open Trivia home page

		// starting the game
		WebElement StartButton= driver.findElement(By.id("startB"));
		StartButton.click();

		// writing question number 1
		WebElement TextBoxQuestion1 = driver.findElement(By.name("question"));
		TextBoxQuestion1.click();
		TextBoxQuestion1.sendKeys("What is the first element in periodic table?");

		// continue to the answers of question num1
		WebElement NextButton1 = driver.findElement(By.id("nextquest"));
		NextButton1.click();

		// writing the first answer
		WebElement FirstEnswer = driver.findElement(By.name("answer1"));
		FirstEnswer.click();
		FirstEnswer.sendKeys("Hydrogen.");

		// writing the second answer 
		WebElement SecoundEnswere = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
		SecoundEnswere.click();
		SecoundEnswere.sendKeys("Helium.");

		//writing the third answer
		WebElement ThirdEnswere = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
		ThirdEnswere.click();
		ThirdEnswere.sendKeys("Nitrogen.");

		//writing the forth answer
		WebElement ForthEnswere = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
		ForthEnswere.click();
		ForthEnswere.sendKeys("Chlorine.");

		// marking 'Hydrogen' as the right answer
		WebElement FirstRadioButton = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[1]/input"));
		FirstRadioButton.click();

		// continue to the second question 
		WebElement NextButton2 = driver.findElement(By.id("nextquest"));
		NextButton2.click();

		// writing question number 2
		WebElement TextBoxQuestion2 = driver.findElement(By.name("question"));
		TextBoxQuestion2.click();
		TextBoxQuestion2.sendKeys("Which country was the first to reach to the Moon?");

		// continue to the answers of question number 2
		WebElement NextButton3 = driver.findElement(By.id("nextquest"));
		NextButton3.click();

		// writing the first answer of question number 2
		WebElement FirstEnswer2 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input"));
		FirstEnswer2.click();
		FirstEnswer2.sendKeys("USA."); 

		// writing the second answer of question number 2
		WebElement SecondEnswer2 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
		SecondEnswer2.click();
		SecondEnswer2.sendKeys("Russia."); 	

		// writing the third answer of question number 2
		WebElement ThirdEnswer2 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
		ThirdEnswer2.click();
		ThirdEnswer2.sendKeys("Japan."); 		

		// writing the forth answer of question number 2
		WebElement ForthEnswer2 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
		ForthEnswer2.click();
		ForthEnswer2.sendKeys("Germany."); 		

		// marking 'Russia' as the right answer
		WebElement SecondRadioButton = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[1]/input"));
		SecondRadioButton.click();

		// continue to the third and last question 
		WebElement NextButton4 = driver.findElement(By.xpath("//*[@id=\"nextquest\"]"));
		NextButton4.click();

		// writing question number 3
		WebElement TextBoxQuestion3 = driver.findElement(By.xpath("//*[@id=\"myform1\"]/div/div/div/input"));
		TextBoxQuestion3.click();
		TextBoxQuestion3.sendKeys("What is the capital city of Austria?");

		// continue to the answers of question number 3
		WebElement NextButton5 = driver.findElement(By.xpath("//*[@id=\"nextquest\"]"));
		NextButton5.click();

		// writing the first answer of question number 3
		WebElement FirstEnswer3 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[1]/div[2]/input"));
		FirstEnswer3.click();
		FirstEnswer3.sendKeys("Santiago."); 

		// writing the second answer of question number 3
		WebElement SecondEnswer3 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input"));
		SecondEnswer3.click();
		SecondEnswer3.sendKeys("Helsinki."); 

		// writing the third answer of question number 3
		WebElement ThirdEnswer3 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input"));
		ThirdEnswer3.click();
		ThirdEnswer3.sendKeys("Vienna."); 

		// writing the forth answer of question number 3
		WebElement ForthEnswer3 = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input"));
		ForthEnswer3.click();
		ForthEnswer3.sendKeys("Minsk."); 

		// marking 'Vienna' as the right answer
		WebElement ThirdRadioButton = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[1]/input"));
		ThirdRadioButton.click();

		// continue to the starting game home page
		WebElement NextButton6 = driver.findElement(By.xpath("//*[@id=\"nextquest\"]"));
		NextButton6.click();

		// pressing on 'Play' button
		WebElement PlayButton = driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]"));
		PlayButton.click();

		// finding a specific Word that is unique to each question
		// and marking the right answer and pressing on next button
		if (driver.getPageSource().contains("capital")) {

			driver.findElement(By.xpath("//*[@id=\"2\"]/input[4]")).click(); // MARKING THE FORTH ANSWER INSTED OF THE RIGHT ONE (THE THIRD)
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();
		}

		if (driver.getPageSource().contains("Moon")) {

			driver.findElement(By.xpath("//*[@id=\"1\"]/input[2]")).click();
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();
		} 									

		if (driver.getPageSource().contains("element")) {

			driver.findElement(By.xpath("//*[@id=\"0\"]/input[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();
		} 	

		if (driver.getPageSource().contains("Sucsses")) {
			fail("ERROR");
		}
		else {
			driver.close();
		}


	}




}
