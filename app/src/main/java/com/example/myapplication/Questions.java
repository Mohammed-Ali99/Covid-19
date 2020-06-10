package com.example.myapplication;

public class Questions {
    public static String[] qusetions = new String[]{
      "Do you suffer from a sense of taste and smell?",
      "Do you suffer from a high temperature?",
      "Do you feel short of breath?",
      "Do you suffer from persistent headaches?",
      "Do you suffer from diarrhea?",
      "Do you suffer from lethargy?",
      "Do you feel pain in the extremities?"
    };

    public static int[] images = new int[]{
         R.drawable.smell_img , R.drawable.temperature_img , R.drawable.breath ,
         R.drawable.headaches , R.drawable.diarrhea , R.drawable.fever ,
         R.drawable.pain
    };

    public static String[] result = new String[]{
        "you should see a doctor" ,
        "you a fine just follow the prevention instructions"
    };

    public static String[] instruction = new String[]{
            "Wash hands regularly",
            "Make sure to cover your mouth and nose with a tissue when you cough or sneeze",
            "Keep a distance of at least 1 meter (3 feet) between you and anyone",
            "Avoid touching your eyes and nose",
            "Stay at home for as long as possible"
    };

    public static int[] imageInstruction = new int[]{
            R.drawable.hand , R.drawable.cover ,
            R.drawable.distance , R.drawable.no_eyes ,
            R.drawable.stay_home
    };

}
