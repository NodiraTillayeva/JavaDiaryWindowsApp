package application;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;


public class Controller {

	private int Id;
	private String Date;
	public Button SignUpOK, LogInOk;
	
	public Button signup;
	public Button login;
	public Button gotoyear;
	public Button yearlybtn;
	public Button PlanAdd,PlanDelete, CurrentPlanDelete, saveholiday, NoteAdd;
	public Button monthlybtn;
	public Button okalert;
	public Button[] arrayButtons;
	public Button Button1;
	public Button Button2;
	public Button Button3;
	public Button Button4;
	public Button Button5;
	public Button Button6;
	public Button Button7;
    public Button Button8;
    public Button Button9;
    public Button Button10;
    public Button Button11;
    public Button Button12;
    public Button Button13;
    public Button Button14;
    public Button Button15;
    public Button Button16;
    public Button Button17;
    public Button Button18;
    public Button Button19;
    public Button Button20;
    public Button Button21;
    public Button Button22;
    public Button Button23;
    public Button Button24;
    public Button Button25;
    public Button Button26;
    public Button Button27;
    public Button Button28;
    public Button Button29;
    public Button Button30;
    public Button Button31;
    public Button Button32;
    public Button Button33;
    public Button Button34;
    public Button Button35;
    public Button Button36;
	public Button Button37;
	public Button Button38;
	public Button Button39;
	public Button Button40;
	public Button Button41;
	public Button Button42;
	public Button DailyAdd;
    public Button gotodate;
    public CheckBox ChPlan1, ChPlan2, ChPlan3, ChPlan4, ChPlan5, ChPlan6, ChPlan7, ChPlan8;
    public CheckBox ChDaily1, ChDaily2, ChDaily3, ChDaily4;
    public TextArea NotesField;
	public Pane alert, loginpane, signuppane, monthly, yearly,  addplan,addnewplan, deleteplan;
	public String usernameS, nameS, passwordS;
	public TextArea txtUserName, txtName;
	public TextArea jan,feb,mar,apr,may,jun,jul,aug,sep,oct,nov,dec;
	public TextField yearlyyear, year, month,day;
	public TextField TFAddHoliday12, TFAddHoliday13, TFAddHoliday14, TFAddHoliday15, TFAddHoliday16, TFAddHoliday17, TFAddHoliday18;
	public TextField TFDate12, TFDate13, TFDate14, TFDate15, TFDate16, TFDate17, TFDate18;
	public TextField Plan1, Plan2, Plan3, Plan4, Plan5, Plan6, Plan7, Plan8;
	public PasswordField pswPassword;
	public TextArea txtLoginUserName;
	public Label MonthLabel, YearLabel;
	public PasswordField pswLoginPassword;

	public int m,d,y,ymod,february, yearchange, formula1, formula2, delay;
	public String filltxt;

	public void ArrayInit() 
	{ 
	
	arrayButtons = new Button[43];
    arrayButtons[1] = Button1;
    arrayButtons[2] = Button2;
    arrayButtons[3] = Button3;
    arrayButtons[4] = Button4;
    arrayButtons[5] = Button5;
    arrayButtons[6] = Button6;
    arrayButtons[7] = Button7;
    arrayButtons[8] = Button8;
    arrayButtons[9] = Button9;
    arrayButtons[10] = Button10;
    arrayButtons[11] = Button11;
    arrayButtons[12] = Button12;
    arrayButtons[13] = Button13;
    arrayButtons[14] = Button14;
    arrayButtons[15] = Button15;
    arrayButtons[16] = Button16;
    arrayButtons[17] = Button17;
    arrayButtons[18] = Button18;
    arrayButtons[19] = Button19;
    arrayButtons[20] = Button20;
    arrayButtons[21] = Button21;
    arrayButtons[22] = Button22;
    arrayButtons[23] = Button23;
    arrayButtons[24] = Button24;
    arrayButtons[25] = Button25;
    arrayButtons[26] = Button26;
    arrayButtons[27] = Button27;
    arrayButtons[28] = Button28;
    arrayButtons[29] = Button29;
    arrayButtons[30] = Button30;
    arrayButtons[31] = Button31;
    arrayButtons[32] = Button32;
    arrayButtons[33] = Button33;
    arrayButtons[34] = Button34;
    arrayButtons[35] = Button35;
    arrayButtons[36] = Button36;
    arrayButtons[37] = Button37;
    arrayButtons[38] = Button38;
    arrayButtons[39] = Button39;
    arrayButtons[40] = Button40;
    arrayButtons[41] = Button41;
    arrayButtons[42] = Button42;
	}
//SUPPLEMENT FUNCTIONS	
// Taking all 3 entries of user and parsing them as parameters to addUser()



//Function to Validate Name (Allows Spaces)
	public static boolean NameValidation(String name){
	    Boolean valid = name.matches("^[a-zA-Z\\s]*$");
	    return valid;
	 }
//Function to calculate necessary variables using year value
	public void calendarformula(int y)
	{
	if((y%4==0) || (ymod==0) || (y%400==0))
	{	february=29;}
	else
	{	february=28;}
	if((y/100)%4==3)
	{	yearchange=0;}
	if((y/100)%4==0)
	{	yearchange=6;}
	 if((y/100)%4==1)
	{	yearchange=4;}
	 if((y/100)%4==2)
	{	yearchange=2;}

	formula1 = (yearchange + ymod + (ymod / 4)) % 7;
	formula2 = (1 + formula1) % 7;

	 if (february == 28)
	{	formula2 = formula2 + 1;}
//Finding which DAY of the WEEK 1st Day of the Month will be
	 if (formula2 == 0 || formula2 == 7)
	{	delay = 6;}
	 if (formula2 == 1)
	{	delay = 7;}
	 if (formula2 == 2)
	{	delay = 1;}
	if (formula2 == 3)
	{	delay = 2;}
	 if (formula2 == 4)
	{	delay = 3;}
	 if (formula2 == 5)
	{	delay = 4;}
	 if (formula2 == 6)
	{	delay = 5;}
	}
//Function to Validate Username(Allows  . - _)
	public static boolean UserNameValidation(String name){
	    boolean valid = name.matches("^[a-zA-Z0-9]([._-](?![._-])|[a-zA-Z0-9]){3,18}[a-zA-Z0-9]$");
	    System.out.println("Name: " + name + "\nValid: " + valid);
	    return valid;
	 }
//Function that calculates loops in the calendar according to the days in month and delay in the 1st day
	public void loopmonth(int delay, int february, int d)
	{
		if (delay == 0)
		{
			delay = 7;
		}

		for (int z = 0; z < february; z++)
		{
			if((z+1)==d)
			{
				arrayButtons[z+(delay)].setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
			}

			arrayButtons[z+delay].setText(""+(z+1));
		}
	}
//Function that calculates loops in the calendar according to the days in month and delay in the 1st day
	public void yearloop(int delay,int february, String txt)
	{
	filltxt=filltxt+"-------------------------------------------\n";
		if (delay == 0)
		{
			delay = 7;
		}
		for (int i = 1; i < delay; i++)
			filltxt=filltxt+"\t";
		for (int i = 1; i <= february; i++)
		{

			filltxt=filltxt+i+"\t";
			if ((delay + i) % 7 == 1)
				filltxt=filltxt+"\n";
		}
	}
//Function to Set all the button Texts to NULL
	public void setDefault()
	{
		for(int x=1; x<=42;x++)
		{
			arrayButtons[x].setText(null);
		}
	}
	//Function to Set all the button COLORS to Default
	public void setColorDefault()
	{
		for(int x=1; x<=42;x++)
		{
			arrayButtons[x].setStyle("-fx-background-color: #FADFDF;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;  -fx-text-fill: #494949;");
		}
	}

	//BUTTONS
//Function that is activated by "OK" button in "Sign Up" Screen
	public void SignUpOkHandle() {
	//Getting Values entered by user	
		usernameS = txtUserName.getText();
		nameS = txtName.getText();
		passwordS = pswPassword.getText();
//Checking their validness
		if((!UserNameValidation(usernameS)) || (!NameValidation(nameS)))
		{
//Activate alert screen if values are not VALID		
			alert.setVisible(true);
		}
//Proceed to the Main Screen if values are VALID
		else
		{
// Using Base.addUser() function to add user to the database
			BaseQueries base = new BaseQueries();
			base.addUser(usernameS,nameS,passwordS);
			Id = base.getUserId(usernameS);
			monthly.setVisible(true);
			signuppane.setVisible(false);
			ArrayInit(); 
//Fill Calendar with Dates for the given Month
			MonthLabel.setText("January");
			YearLabel.setText("2020");
			for(int i=1; i<32;i++)
			{
				arrayButtons[i+4].setText(""+i);
			}
		}
		for(int i=1; i<32;i++)
		{
			if(i==7)
			{
				arrayButtons[i+4].setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
			}
			MonthLabel.setText("January");
			YearLabel.setText("2020");
			arrayButtons[i+4].setText(""+i);
		}
	    }
//Function that is activated by "OK" button in "Log In" Screen
	public void LogInOkHandle()
	{
		BaseQueries base = new BaseQueries();
		String loginName = txtLoginUserName.getText();
		String loginPassword = pswLoginPassword.getText();
		if (base.isInBase(loginName,loginPassword))
		{
			Id = base.getUserId(loginName);
			monthly.setVisible(true);
			loginpane.setVisible(false);
			ArrayInit();
			MonthLabel.setText("January");
			YearLabel.setText("2020");
			for(int i=1; i<32;i++)
			{
				arrayButtons[i+4].setText(Integer.toString(i));
			}
		}
		else
		{
			alert.setVisible(true);
		}
	}
	public void NoteAddClicked()
	{
		NotesQueries notesQueries = new NotesQueries();
		notesQueries.addNote(Id,Date,NotesField.getText());
	}
	public void DailyAddClicked()
	{
		int chdaily1,chdaily2,chdaily3,chdaily4;
		DailyQueries dailyQueries = new DailyQueries();
		if(ChDaily1.isSelected())
		{
			chdaily1 = 1;
		}
		else
		{
			chdaily1 = 0;
		}
		if (ChDaily2.isSelected())
		{
			chdaily2 = 1;
		}
		else
		{
			chdaily2 = 0;
		}
		if (ChDaily3.isSelected())
		{
			chdaily3 = 1;
		}
		else
		{
			chdaily3 = 0;
		}
		if (ChDaily4.isSelected())
		{
			chdaily4 = 1;
		}
		else
		{
			chdaily4 = 0;
		}
		dailyQueries.addChecked(Id,Date,chdaily1,chdaily2,chdaily3,chdaily4);
	}
	public void PlanAddClicked()
	{
		PlansQueries plansQueries = new PlansQueries();
		plansQueries.addPlan(Id,Date, Plan1.getText(),Plan2.getText(),Plan3.getText(),Plan4.getText(),Plan5.getText(),
				Plan6.getText(),Plan7.getText(),Plan8.getText());
	}
	public void PlanSetter(String PDay)
	{
		PlansQueries plansQueries = new PlansQueries();
		Plan1.setText(plansQueries.getPlan(Id,PDay,"Plan1"));
		Plan2.setText(plansQueries.getPlan(Id,PDay,"Plan2"));
		Plan3.setText(plansQueries.getPlan(Id,PDay,"Plan3"));
		Plan4.setText(plansQueries.getPlan(Id,PDay,"Plan4"));
		Plan5.setText(plansQueries.getPlan(Id,PDay,"Plan5"));
		Plan6.setText(plansQueries.getPlan(Id,PDay,"Plan6"));
		Plan7.setText(plansQueries.getPlan(Id,PDay,"Plan7"));
		Plan8.setText(plansQueries.getPlan(Id,PDay,"Plan8"));
	}
	//Function that is activated by "LOG IN" button in "SIGN UP" Screen
	public void loginpressed()
	{
		loginpane.setVisible(true);
		signuppane.setVisible(false);
		login.setText("Stop");
	}
//Function that is activated by "OK" button in "ALERT" Screen
	public void alertpressed()
	{
		alert.setVisible(false);
	}
//Function that is activated by "SIGN UP" button in "LOG IN" Screen
	public void signuppressed()
	{
		loginpane.setVisible(false);
		signuppane.setVisible(true);
	}
//Function that is activated by "YEARLY" button in "MAIN" Screen
	public void yearlyclicked()
	{
		yearly.setVisible(true);
		monthly.setVisible(false);
	}

//Function that is activated by "MONTHLY" button in "YEARLY" Screen
	public void monthlyclicked()
	{
		monthly.setVisible(true);
		yearly.setVisible(false);
		loginpane.setVisible(false);
		signuppane.setVisible(false);
	}
//Function that is activated by ENTERING PARTICULAR DATE IN THE "MONTHLY" Screen
	public void monthgoclicked()
	{
		ChDaily1.setSelected(false);
		ChDaily2.setSelected(false);
		ChDaily3.setSelected(false);
		ChDaily4.setSelected(false);
		setColorDefault();
		y=Integer.parseInt(year.getText());
		m=Integer.parseInt(month.getText());  
		d=Integer.parseInt(day.getText()); 
		ymod=y%100;
		calendarformula(y);
//January LOOP
		if (m == 1)
		{
			setDefault();
			MonthLabel.setText("January");
			loopmonth(delay, 31, d);
		}
//identifying day of the week of the following month
		delay = (delay + 31) % 7;
//February LOOP
		if (m == 2)
		{
			setDefault();
			MonthLabel.setText("February");
			loopmonth(delay, february, d);
		}
		delay = (delay + february) % 7;
//March LOOP
		if (m == 3)
		{
			setDefault();
			MonthLabel.setText("March");
			loopmonth(delay, 31, d);
		}
		delay = (delay + 31) % 7;
//April LOOP
		if (m == 4)
		{
			setDefault();
			MonthLabel.setText("April");
			loopmonth(delay, 30, d);
		}
		delay = (delay + 30) % 7;
//May LOOP
		if (m == 5)
		{
			setDefault();
			MonthLabel.setText("May");
			loopmonth(delay, 31, d);
		}
		delay = (delay + 31) % 7;
//June LOOP
		if (m == 6)
		{
			setDefault();
			MonthLabel.setText("June");
			loopmonth(delay, 31, d);
		}
		delay = (delay + 30) % 7;
//July LOOP
		if (m == 7)
		{
			setDefault();
			MonthLabel.setText("July");
			loopmonth(delay, 31, d);
		}
		delay = (delay + 31) % 7;
//August LOOP
		if (m == 8)
		{
			setDefault();
			MonthLabel.setText("August");
			loopmonth(delay, 31, d);
		}
		delay = (delay + 31) % 7;
//September LOOP
		if (m == 9)
		{
			setDefault();
			MonthLabel.setText("September");
			loopmonth(delay, 30, d);
		}
		delay = (delay + 30) % 7;
//October LOOP
		if (m == 10)
		{
			setDefault();
			MonthLabel.setText("October");
			loopmonth(delay, 31, d);
		}
		delay = (delay + 31) % 7;
//November LOOP
		if (m == 11)
		{
			setDefault();
			MonthLabel.setText("November");
			loopmonth(delay, 30, d);
		}
		delay = (delay + 30) % 7;
//December LOOP
		if (m == 12)
		{
			setDefault();
			MonthLabel.setText("December");
			loopmonth(delay, 31, d);
		}
		YearLabel.setText(Integer.toString(y));
	}
//Function that is activated by ENTERING PARTICULAR YEAR IN THE "YEARLY" Screen
public void yearsearchclicked()
	{
		y=Integer.parseInt(yearlyyear.getText()); 
		ymod=y%100;
		calendarformula(y);
//JANUARY
		filltxt="January\n";
		yearloop(delay, 31 ,filltxt);
		jan.setText(filltxt);	
		delay = (delay + 31) % 7;//identifying day of the week of the following month
//FEBRUARY
		filltxt="February\n";
		yearloop(delay, february,filltxt);
		feb.setText(filltxt);
		delay = (delay + february) % 7;
//MARCH
		filltxt="March\n";
		yearloop(delay, 31,filltxt);
		mar.setText(filltxt);
		delay = (delay + 31) % 7;
//APRIL
		filltxt="April\n";
		yearloop(delay,30,filltxt);
		apr.setText(filltxt);
		delay = (delay + 30) % 7;
//MAY
		filltxt="May\n";
		yearloop(delay,31,filltxt);
		may.setText(filltxt);
		delay = (delay + 31) % 7;
//JUNE	
		filltxt="June\n";
		yearloop(delay, 30,filltxt);
		jun.setText(filltxt);
		delay = (delay + 30) % 7;
//JULY		
		filltxt="July\n";
		yearloop(delay, 31,filltxt);
		jul.setText(filltxt);
		delay = (delay + 31) % 7;
//AUGUST		
		filltxt="August\n";
		yearloop(delay,31,filltxt);
		aug.setText(filltxt);
		delay = (delay + 31) % 7;
//SEPTEMBER		
		filltxt="September\n";
		yearloop(delay, 30,filltxt);
		sep.setText(filltxt);
		delay = (delay + 30) % 7;
//OCTOBER
		filltxt="October\n";
		yearloop(delay, 31,filltxt);
		oct.setText(filltxt);
		delay = (delay + 31) % 7;
//NOVEMBER		
		filltxt="November\n";
		yearloop(delay, 30,filltxt);
		nov.setText(filltxt);
		delay = (delay + 30) % 7;
//DECEMBER		
		filltxt="December\n";
		yearloop(delay, 31,filltxt);
		dec.setText(filltxt);
		YearLabel.setText(Integer.toString(y));
		}
//Function that is activated by saving ADDING PLANS in the "MONTHLY"Screen
public void SaveHolidayClicked()
{

}
public void DailyQueriesSetter(String PDay)
{
	DailyQueries dailyQueries = new DailyQueries();
	if(dailyQueries.getChecked(Id,PDay,"ChBox1") == 1)
	{
		ChDaily1.setSelected(true);
	}
	else
	{
		ChDaily1.setSelected(false);
	}

	if (dailyQueries.getChecked(Id,PDay,"ChBox2") == 1)
	{
		ChDaily2.setSelected(true);
	}
	else
	{
		ChDaily2.setSelected(false);
	}

	if (dailyQueries.getChecked(Id,PDay,"ChBox3") == 1)
	{
		ChDaily3.setSelected(true);
	}
	else
	{
		ChDaily3.setSelected(false);
	}

	if (dailyQueries.getChecked(Id,PDay,"ChBox4") == 1)
	{
		ChDaily4.setSelected(true);
	}
	else
	{
		ChDaily4.setSelected(false);
	}
}
public void HandleButton1()
{
	setColorDefault();
	Button1.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + "0" + Button1.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton2()
{
	setColorDefault();
	Button2.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + "0" + Button2.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton3() 
{
	setColorDefault();
	Button3.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + "0" + Button3.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton4()
{
	setColorDefault();
	Button4.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + "0" + Button4.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id, PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton5()
{
	setColorDefault();
	Button5.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + "0" + Button5.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton6()
{
	setColorDefault();
	Button6.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + "0" + Button6.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton7()
{
	setColorDefault();
	Button7.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + "0" + Button7.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton8()
{
	setColorDefault();
	Button8.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + "0" + Button8.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton9()
{
	setColorDefault();
	Button9.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + "0" + Button9.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton10()
{
	setColorDefault();
	Button10.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay;
	if (Button10.getText().length() == 1) {
		PDay = year.getText() + month.getText() + "0" + Button10.getText();

	} else {
		PDay = year.getText() + month.getText() + Button10.getText();
	}
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id, PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton11()
{
	setColorDefault();
	Button11.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay;
	if(Button11.getText().length() == 1)
	{
		PDay = year.getText() + month.getText() + "0" + Button11.getText();

	}
	else
	{
		PDay = year.getText() + month.getText() + Button11.getText();
	}
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton12()
{
	setColorDefault();
	Button12.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay;
	if(Button12.getText().length() == 1)
	{
		PDay = year.getText() + month.getText() + "0" + Button12.getText();

	}
	else
	{
		PDay = year.getText() + month.getText() + Button12.getText();
	}
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton13()
{
	setColorDefault();
	Button13.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay;
	if(Button13.getText().length() == 1)
	{
		PDay = year.getText() + month.getText() + "0" + Button13.getText();

	}
	else
	{
		PDay = year.getText() + month.getText() + Button13.getText();
	}
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton14()
{
	setColorDefault();
	Button14.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay;
	if(Button14.getText().length() == 1)
	{
		PDay = year.getText() + month.getText() + "0" + Button14.getText();

	}
	else
	{
		PDay = year.getText() + month.getText() + Button14.getText();
	}
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton15()
{
	setColorDefault();
	Button15.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay;
	if(Button15.getText().length() == 1)
	{
		PDay = year.getText() + month.getText() + "0" + Button15.getText();

	}
	else
	{
		PDay = year.getText() + month.getText() + Button15.getText();
	}
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton16()
{
	setColorDefault();
	Button16.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay;
	if(Button16.getText().length() == 1)
	{
		PDay = year.getText() + month.getText() + "0" + Button16.getText();

	}
	else
	{
		PDay = year.getText() + month.getText() + Button16.getText();
	}
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton17()
{
	setColorDefault();
	Button17.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay;
	if(Button17.getText().length() == 1)
	{
		PDay = year.getText() + month.getText() + "0" + Button17.getText();

	}
	else
	{
		PDay = year.getText() + month.getText() + Button17.getText();
	}
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton18()
{
	setColorDefault();
	Button18.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + Button18.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton19()
{
	setColorDefault();
	Button19.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + Button19.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton20()
{
	setColorDefault();
	Button20.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + Button20.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton21()
{
	setColorDefault();
	Button21.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + Button21.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton22()
{
	setColorDefault();
	Button22.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + Button22.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton23()
{
	setColorDefault();
	Button23.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + Button23.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton24()
{
	setColorDefault();
	Button24.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + Button24.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);

}
public void HandleButton25()
{
	setColorDefault();
	Button25.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + Button25.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton26()
{
	setColorDefault();
	Button26.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + Button26.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton27()
{
	setColorDefault();
	Button27.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + Button27.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton28()
{
	setColorDefault();
	Button28.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + Button28.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton29()
{
	setColorDefault();
	Button29.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + Button29.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton30()
{
	setColorDefault();
	Button30.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + Button30.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton31()
{
	setColorDefault();
	Button31.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + Button31.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton32()
{
	setColorDefault();
	Button32.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + Button32.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton33()
{
	setColorDefault();
	Button33.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + Button33.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton34()
{
	setColorDefault();
	Button34.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + Button34.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton35()
{
	setColorDefault();
	Button35.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + Button35.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton36()
{
	setColorDefault();
	Button36.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + Button36.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton37()
{
	setColorDefault();
	Button37.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + Button37.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton38()
{
	setColorDefault();
	Button38.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + Button38.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton39()
{
	setColorDefault();
	Button39.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + Button39.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton40()
{
	setColorDefault();
	Button40.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + Button40.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton41()
{
	setColorDefault();
	Button41.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + Button41.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
public void HandleButton42()
{
	setColorDefault();
	Button42.setStyle("-fx-background-color: #FFB35A;-fx-font-family: 'Montserrat'; -fx-font-weight: bold ; -fx-font-size:40;");
	String PDay = year.getText() + month.getText() + Button42.getText();
	Date = PDay;
	NotesQueries notesQueries = new NotesQueries();
	NotesField.setText(notesQueries.getNote(Id,PDay));
	DailyQueriesSetter(PDay);
	PlanSetter(PDay);
}
//Function that is activated by saving ADDING NOTE in the "MONTHLY"Screen

public void addnewplanclicked()
{

}
public void PlanDeleteClicked()
{

}
public void CurrentPLanDeleteClicked()
{
	
}

}
	
	


	 

