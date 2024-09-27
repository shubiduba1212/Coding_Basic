class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        String regex = "x";
        String[] myArray = myString.split(regex);
    
        int count = 0;
        for (String str : myArray) {
            if (!str.isEmpty()) {
                count++;
            }
        }

        answer = new String[count];
        int index = 0;
        for (String str : myArray) {
            if (!str.isEmpty()) {
                answer[index++] = str;
            }
        }

        for (int i = 0; i < answer.length - 1; i++) {
            for (int j = 0; j < answer.length - 1 - i; j++) {
                if (answer[j].compareTo(answer[j + 1]) > 0) {
                    String temp = answer[j];
                    answer[j] = answer[j + 1];
                    answer[j + 1] = temp;
                }
            }
        }

        return answer;
    }
}