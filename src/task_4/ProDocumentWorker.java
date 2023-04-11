package task_4;
//Створіть похідний клас ProDocumentWorker. Перевизначте відповідні методи, при перевизначенні методів виводьте
// наступні рядки: "Документ відредаговано", "Документ збережено у старому форматі,
// збереження в інших форматах доступне у версії Експерт". С
public class ProDocumentWorker extends DocumentWorker {
    @Override
    void editDocument(){
        System.out.println("Документ відредаговано");
    }
    @Override
    void saveDocument(){
        System.out.println("Документ збережено у старому форматі, " +
                "збереження в інших форматах доступне у версії Експерт");
    }
}
