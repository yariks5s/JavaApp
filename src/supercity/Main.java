package supercity; 

import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {
        Government gov = new Government("Іван Шевченко", 1_000_000);
        City city = new City("СуперМісто", gov);
        District downtown = new District("центр", DistrictType.BUSINESS);
        District suburb = new District("житлово-Паркова зона", DistrictType.RESIDENTIAL);
        city.addDistrict(downtown);
        city.addDistrict(suburb);



        Bus cityBus = new Bus("СуперБус", 1.50, false);
        cityBus.addRoute("дорога1 - Від житлової до центру");
        cityBus.addRoute("дорога2 - Від житлової до аеропорта");
        city.addTransport(cityBus); /// громадський АВтобус
        Metro metroLine = new Metro("СуперМетро", 2.00, 8);
        metroLine.addRoute("Центр - Схід");
        metroLine.addRoute("Схід - Захід");
        city.addTransport(metroLine); /// метро
        Tram greenTram = new Tram("СуперТрам", 1.75, "Житловий");
        greenTram.addRoute("Центр - університет");
        greenTram.addRoute("Університет - старе Місто");
        city.addTransport(greenTram); /// трамвай


        Building b1 = new Building(1, "1 Мейн стріт", BuildingType.RESIDENTIAL);
        Building b2 = new Building(2, "2 Бізнес стріт", BuildingType.OFFICE);
        Building b3 = new Building(3, "3 Торговий бульвар", BuildingType.COMMERCIAL);
        city.addBuilding(b1);
        city.addBuilding(b2);
        city.addBuilding(b3);
        suburb.addBuilding(b1);
        downtown.addBuilding(b2);
        downtown.addBuilding(b3);

        Resident r1 = new Resident("Аліса Петрова", 30, "+1-555-1234");
        Resident r2 = new Resident("Володимир С.", 45, "+1-555-5678");
        city.addResident(r1);
        city.addResident(r2);
        b1.addOwner(r1);
        b1.addOccupant(r1);
        b2.addOccupant(r2); /// дасть повідомлення про помилку, бо ми добавляємо жителя в нежитлову будівлю


        PublicService waterService = new PublicService("СуперВодоКанал", "Забезпечення водопроводу", 200_000);
        PublicService energyService = new PublicService("СуперЕнерго", "Забезпечення електрикою", 300_000);
        city.addService(waterService);
        city.addService(energyService);
        Event concert = new Event
        (
            "СуперКонцерт",
            "Музичний фестиваль просто неба в центрі міста в парку",
            LocalDate.of(2025, 5, 20),
            50_000,
            downtown
        );
        city.addEvent(concert);



        BudgetReport report = gov.createBudgetReport(100_000, 120_000);
        System.out.println("\n\n\nСтоврено новий бюджетний звіт: " + report);


        {
            city.printSummary();

            System.out.println("\nІнформація про квартали:");
            for (District d : city.getDistricts())
                System.out.println("  " + d);
            System.out.println("\nБудввлі:");
            for (Building b : city.getBuildings())
                System.out.println("   " + b);
            // Вивід інформації про всі громадські послуги
            System.out.println("\nПослуги:");
            for (PublicService s : city.getServices())
                System.out.println("    " + s);
            System.out.println("\nтранспорт:");
            for (Transport t : city.getTransports())
                System.out.println("     " + t);
            System.out.println("\nподії :");
            for (Event e : city.getEvents())
                System.out.println("     " + e);
        }
    }
}
