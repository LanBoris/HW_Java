/*
 * Дана строка sql-запроса "select * from students where ". 
 * Сформируйте часть WHERE этого запроса, используя StringBuilder. 
 * Данные для фильтрации приведены ниже в виде json-строки.
 * Если значение null, то параметр не должен попадать в запрос.
 * Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 */
public class task01 {
    public static void main(String[] args) throws  Exception{
        String data = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";
        StringBuilder result = new StringBuilder();
        result = LineInList(data);
        System.out.println("Парметры для фильтрации: " + data);
        System.out.println("Запрос: " + result);
    }

    private static StringBuilder LineInList(String inputData) {
        String inputData1 = inputData.replace("{", "");
        String inputData2 = inputData1.replace("}", "");
        String inputData3 = inputData2.replaceAll("\'", "");
        StringBuilder result = new StringBuilder("select * from students where ");
        String [] dataString = inputData3.split(", ");
        for (int i =0; i < dataString.length; i++) {
            String[] dataStrings = dataString[i].split(":");
            if(dataStrings[1].equals("null") == false) {
                if (i != 0) {
                    result.append(", ");
                    result.append(dataStrings[0]);
                    result.append(" = ");
                    result.append(dataStrings[1]);
                } else {
                    result.append(dataStrings[0]);
                    result.append(" = ");
                    result.append(dataStrings[1]);
                }
            }
            
        }
        return result;
    }
}
