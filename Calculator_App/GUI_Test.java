class GUI_Test{  
    public static void main(String args[]){  
     GUI GUI1 = new GUI(320, 500);
     GUI1.setUpGUI();

     String buttonText = null;

     while(true){
        buttonText = GUI1.getKeyPress();
        GUI1.setScreen(buttonText);
     }



    }  
}  