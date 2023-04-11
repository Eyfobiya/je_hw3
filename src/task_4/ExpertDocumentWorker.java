package task_4;

import java.util.Scanner;

//Створіть похідний клас ExpertDocumentWorker від базового класу ProDocumentWorker.
// Перевизначте відповідний метод. При викликі даного методу необхідно виводити
// на екран документ збережений в новому форматі.
// У тілі методу main() реалізуйте можливість прийому від користувача номер ключа доступу pro і exp.
// Якщо користувач не вводить ключ, він може користуватися тільки безкоштовною версією
// (створюється екземпляр базового класу), якщо користувач ввів номери ключа доступу pro і exp,
// то повинен створити екземпляр відповідної версії класу, наведений до базового – DocumentWorker.
public class ExpertDocumentWorker extends ProDocumentWorker {
    @Override
    void saveDocument(){
        System.out.println("Документ збережений в новому форматі");
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть номер ключа доступу: pro чи exp");
        String key = in.next();
        if(key.equals("pro")) {
            ProDocumentWorker proDoc = new ProDocumentWorker();
            DocumentWorker proDoc1 = proDoc;
            proDoc1.editDocument();
            proDoc1.saveDocument();
        } else if (key.equals("exp")) {
            ExpertDocumentWorker expDoc = new ExpertDocumentWorker();
            DocumentWorker expDoc1 = expDoc;
            expDoc1.saveDocument();
        } else if (!(key.equals("pro")) && !(key.equals("exp"))){
            DocumentWorker freeVersion = new DocumentWorker();
            freeVersion.openDocument();
            freeVersion.editDocument();
            freeVersion.saveDocument();
        }
    }
}
