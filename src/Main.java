void main() {
    // while ციკლის გამოყენებით გამოიტანეთ ეკრანზე
    // 3 -ზე გამრავლების ტაბულა (1 - 10 ჩათვლით). "3*7=21" ასეთი სახით.
    {
        int i = 0;
        while (i <= 10) {
            int j = 3 * i;
            System.out.println("3 * " + i + " = " + j);
            i++;
        }
    }

    // შექმენით ცვლადი და გადაეცით თქვენთვის სასურველი ნებისმიერი
    // წინადადება და შეამოწმეთ, თუ ამ წინადადების სიგრძე იქნება ლუწი
    // რიცხვი, დაბეჭდეთ :"ლუწი", თუ კენტი მაშინ: "კენტი"
    {
        String text = " პირველი დავალება";
        if (text.length() % 2 == 0) {
            System.out.println("ლუწი");
        } else {
            System.out.println("კენტი");
        }
    }

    // for -ით დაბეჭდეთ მასივში არსებულ ყოველი ელემენტი, გარდა მეხუთე
    // პოზიციაზე მდგომისა
    int[] numbers = {12, 0, -3, 12, 5, 23, 16, 22};
    for (int i = 0; i < numbers.length; i++) {
        if (i == 4) continue;
        System.out.println(numbers[i]);
    }

    {
        //შემოიტანე ნებისმიერი სტრინგი და for -ით დათვალე ამ სტრინგში
        //რამდენი ხმოვანი არის
        String sentence = "დავბეჭდოთ ხმოვანი";
        char[] vowels = {'ა', 'ე', 'ი', 'ო', 'უ'};
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (sentence.charAt(i) == vowels[j] ) {
                    count++;
                    break;
                }
            }
        }
        System.out.println("ხმოვნების რაოდენობა = " + count);
    }

    {
        //შემოიტანე ნებისმიერი სტრინგი და while -ით დათვალე ამ სტრინგში
        //რამდენი თანხმოვანი არის
        String sentence = "დავალება";
        char[] vowels = {'ა', 'ე', 'ი', 'ო', 'უ'};
        int i = 0;
        int count = 0;
        while (i < sentence.length()) {
            int j= 0;
          while (j < vowels.length) {
              if (sentence.charAt(i) == vowels[j]) {
                  break;

              }

              j++;

          }
          if (j == vowels.length){
              count++;
          }
           i++;
        }
        System.out.println("თანხმოვნების რაოდენობაა= " + count );



    }
}
