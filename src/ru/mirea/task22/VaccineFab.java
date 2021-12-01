package ru.mirea.task22;


//С помощью фабрики будут создаваться прививки в дальнейшем доступные для выбора пользователю
class Vaccine{
    public void orderVac() {
        // заказываем вакцину
    }
    public void doVac() {
        // ставим прививку
    }
    public void giveCertif() {
        // выдаем справку
    }
}
enum VaccineType {
    FLU,
    COVID19,
    TUBERCULES,
    MEASLES
}
class VacFactory {

    public Vaccine createVac(VaccineType type) {
        Vaccine vaccine = null;

        switch (type) {
            case FLU:
                vaccine = new flu();
                break;
            case COVID19:
                vaccine = new covid19();
                break;
            case TUBERCULES:
                vaccine = new tubercules();
                break;
            case MEASLES:
                vaccine = new measles();
                break;
        }
    }
}
public class VaccineFab {
    private final VacFactory vacFactory;

    public VaccineFab(VacFactory vacFactory) {
        this.vacFactory = vacFactory;
    }

    public Vaccine orderCoffee(VaccineType type) {
        Vaccine vaccine = vacFactory.createVac(type);

        vaccine.orderVac();
        vaccine.doVac();
        vaccine.giveCertif();

        System.out.println("Прививка сделана. Следите за своим самочувствием близжайшую неделю\nПри необходимости обратитесь к врачу");
        return vaccine;
    }
}
