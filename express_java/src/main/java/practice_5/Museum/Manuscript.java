package practice_5.Museum;

public class Manuscript implements Exhibit {
    @Override
    public String describe(){
        return "Манускрипт: саим не знаем что это, но выбросить жалко";
    }

    @Override
    public void preserve(){
        System.out.println("Бумажку еще и тщательно оберегать надо");
    }

}
