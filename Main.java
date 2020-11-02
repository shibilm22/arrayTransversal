class Main {
  public static void main(String[] args) {
  String []  chips = {"Takis", "Doritos", "Lays", "Cheetos", "Funyuns", "Ruffles", "Pringles"};

  for (int i=0; i<6; i++){
    System.out.println(chips[i]);
  }

  chips[6] = "Fritos";

  System.out.print("\n Here is our updated list; \n");

  for (int i=0; i<chips.length; i++){
    System.out.println(chips[i]);
  }

    System.out.print("\n Here is our updated list; \n");

  for (int s=6; s>0; s--){
    System.out.println(chips[s]  )  ;
  }


  }
}