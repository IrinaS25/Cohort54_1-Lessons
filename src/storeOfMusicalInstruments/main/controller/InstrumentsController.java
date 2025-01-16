package storeOfMusicalInstruments.main.controller;

import storeOfMusicalInstruments.main.model.CategoryMusicInstruments;
import storeOfMusicalInstruments.main.model.Instrument;
import storeOfMusicalInstruments.main.repository.InstrumentsRepository;
import storeOfMusicalInstruments.main.service.InstrumentsService;

import java.util.List;
import java.util.Scanner;

public class InstrumentsController {
    private InstrumentsRepository instrumentsRepository;
    private InstrumentsService instrumentsService;

    public InstrumentsController() {
       instrumentsRepository = new InstrumentsRepository();
       instrumentsService = new InstrumentsService(instrumentsRepository);

    }

    public void run() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите пункт меню:");
            System.out.println("1. Добавить музыкальные инструменты.");
            System.out.println("2. Просмотреть список музыкальных инструментов.");
            System.out.println("3. Получить информацию о музыкальном инструменте.");
            System.out.println("4. Удалить музыкальный инструмент.");
            System.out.println("5. Выход.");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Добавить музыкальные инструменты.");
                    addInstrument(scanner);
                    break;
                case 2:
                    System.out.println("Просмотреть список музыкальных инструментов.");
                    printAllInstruments();
                    break;
                case 3:
                    System.out.println("Получить информацию о музыкальном инструменте.");
                    break;
                case 4:
                    System.out.println("Удалить музыкальный инструмент.");
                    break;
                case 5:
                    System.out.println("Выход.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неправельный выбор. Попробуйте еще раз");

            }
        }
    }

            private void addInstrument(Scanner scanner) {
                System.out.println("Введите название музыкального инструмента:");
                String name = scanner.nextLine();

                System.out.println("Введите цену музыкального инструмента:");
                double price = scanner.nextDouble();
                scanner.nextLine();

                Instrument instrument = new Instrument(name, CategoryMusicInstruments.WIND, price);
                instrumentsService.addInstrument(instrument);
                System.out.println(instrument);

            }
            private void printAllInstruments() {
                List<Instrument> allInstruments = instrumentsService.getAllInstruments();
                if (!allInstruments.isEmpty()) {
                    for (Instrument instrument : allInstruments) {
                        System.out.println(instrument);
                    }
                } else {
                    System.out.println("No instruments found.");
                }
            }






        }


