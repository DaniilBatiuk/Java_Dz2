package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static class Person {
        private String fullName;
        private String dateOfBirth;
        private String phoneNumber;
        private String city;
        private String country;
        private String homeAddress;

        public Person(String fullName, String dateOfBirth, String phoneNumber,
                      String city, String country, String homeAddress) {
            this.fullName = fullName;
            this.dateOfBirth = dateOfBirth;
            this.phoneNumber = phoneNumber;
            this.city = city;
            this.country = country;
            this.homeAddress = homeAddress;
        }

        public Person() {
            this("", "", "", "", "", "");
        }

        public void input() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть ПІБ: ");
            fullName = scanner.nextLine();

            System.out.print("Введіть дату народження: ");
            dateOfBirth = scanner.nextLine();

            System.out.print("Введіть контактний телефон: ");
            phoneNumber = scanner.nextLine();

            System.out.print("Введіть місто: ");
            city = scanner.nextLine();

            System.out.print("Введіть країну: ");
            country = scanner.nextLine();

            System.out.print("Введіть домашню адресу: ");
            homeAddress = scanner.nextLine();
        }

        public void show() {
            System.out.println("ПІБ: " + fullName);
            System.out.println("Дата народження: " + dateOfBirth);
            System.out.println("Контактний телефон: " + phoneNumber);
            System.out.println("Місто: " + city);
            System.out.println("Країна: " + country);
            System.out.println("Домашня адреса: " + homeAddress);
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getHomeAddress() {
            return homeAddress;
        }

        public void setHomeAddress(String homeAddress) {
            this.homeAddress = homeAddress;
        }

    }

    public static class City {
        private String city;
        private String region;
        private String country;
        private int population;
        private String postalCode;
        private String phoneCode;

        public City(String cityName, String regionName, String countryName,
                    int population, String postalCode, String phoneCode) {
            this.city = cityName;
            this.region = regionName;
            this.country = countryName;
            this.population = population;
            this.postalCode = postalCode;
            this.phoneCode = phoneCode;
        }

        public City() {
            this("", "", "", 0, "", "");
        }

        public void input() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть назву міста: ");
            city = scanner.nextLine();

            System.out.print("Введіть назву регіону: ");
            region = scanner.nextLine();

            System.out.print("Введіть назву країни: ");
            country = scanner.nextLine();

            System.out.print("Введіть кількість жителів: ");
            population = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Введіть поштовий індекс: ");
            postalCode = scanner.nextLine();

            System.out.print("Введіть телефонний код: ");
            phoneCode = scanner.nextLine();
        }

        public void show() {
            System.out.println("Назва міста: " + city);
            System.out.println("Назва регіону: " + region);
            System.out.println("Назва країни: " + country);
            System.out.println("Кількість жителів: " + population);
            System.out.println("Поштовий індекс: " + postalCode);
            System.out.println("Телефонний код: " + phoneCode);
        }


        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public String getPostalCode() {
            return postalCode;
        }

        public void setPostalCode(String postalCode) {
            this.postalCode = postalCode;
        }

        public String getPhoneCode() {
            return phoneCode;
        }

        public void setPhoneCode(String phoneCode) {
            this.phoneCode = phoneCode;
        }
    }

    public static class Country {
        private String countryName;
        private String continentName;
        private int population;
        private String phoneCode;
        private String capitalName;
        private List<String> cities;

        public Country(String countryName, String continentName, int population,
                       String phoneCode, String capitalName, List<String> cities) {
            this.countryName = countryName;
            this.continentName = continentName;
            this.population = population;
            this.phoneCode = phoneCode;
            this.capitalName = capitalName;
            this.cities = cities;
        }

        public Country() {
            this("", "", 0, "", "", new ArrayList<>());
        }

        public void input() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть назву країни: ");
            countryName = scanner.nextLine();

            System.out.print("Введіть назву континенту: ");
            continentName = scanner.nextLine();

            System.out.print("Введіть кількість жителів: ");
            population = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера

            System.out.print("Введіть телефонний код країни: ");
            phoneCode = scanner.nextLine();

            System.out.print("Введіть назву столиці: ");
            capitalName = scanner.nextLine();

            cities = new ArrayList<>();
            System.out.print("Введіть кількість міст країни: ");
            int numCities = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < numCities; i++) {
                System.out.print("Введіть назву міста " + (i + 1) + ": ");
                cities.add(scanner.nextLine());
            }
        }

        public void display() {
            System.out.println("Назва країни: " + countryName);
            System.out.println("Назва континенту: " + continentName);
            System.out.println("Кількість жителів: " + population);
            System.out.println("Телефонний код країни: " + phoneCode);
            System.out.println("Столиця: " + capitalName);
            System.out.println("Міста країни:");
            for (String city : cities) {
                System.out.println("- " + city);
            }
        }

        public String getCountryName() {
            return countryName;
        }

        public void setCountryName(String countryName) {
            this.countryName = countryName;
        }

        public String getContinentName() {
            return continentName;
        }

        public void setContinentName(String continentName) {
            this.continentName = continentName;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public String getPhoneCode() {
            return phoneCode;
        }

        public void setPhoneCode(String phoneCode) {
            this.phoneCode = phoneCode;
        }

        public String getCapitalName() {
            return capitalName;
        }

        public void setCapitalName(String capitalName) {
            this.capitalName = capitalName;
        }

        public List<String> getCities() {
            return cities;
        }

        public void setCities(List<String> cities) {
            this.cities = cities;
        }
    }

    public static class Fraction {
        private int numerator;
        private int denominator;

        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            if (denominator != 0) {
                this.denominator = denominator;
            } else {
                throw new IllegalArgumentException("Знаменник не може дорівнювати нулю.");
            }
        }

        public Fraction() {
            this(0, 1);
        }

        public void input() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть чисельник: ");
            numerator = scanner.nextInt();

            System.out.print("Введіть знаменник (не може дорівнювати нулю): ");
            int tempDenominator = scanner.nextInt();
            if (tempDenominator != 0) {
                denominator = tempDenominator;
            } else {
                System.out.println("Помилка: Знаменник не може дорівнювати нулю.");
            }
        }

        public void show() {
            System.out.println(numerator + "/" + denominator);
        }

        public int getNumerator() {
            return numerator;
        }

        public void setNumerator(int numerator) {
            this.numerator = numerator;
        }

        public int getDenominator() {
            return denominator;
        }

        public void setDenominator(int denominator) {
            if (denominator != 0) {
                this.denominator = denominator;
            } else {
                throw new IllegalArgumentException("Знаменник не може дорівнювати нулю.");
            }
        }

        private int findGCD(int a, int b) {
            if (b == 0) {
                return a;
            }
            return findGCD(b, a % b);
        }

        public void simplify() {
            int gcd = findGCD(numerator, denominator);
            numerator /= gcd;
            denominator /= gcd;
        }

        public Fraction add(Fraction other) {
            int newNumerator = numerator * other.denominator + other.numerator * denominator;
            int newDenominator = denominator * other.denominator;
            Fraction result = new Fraction(newNumerator, newDenominator);
            result.simplify();
            return result;
        }

        public Fraction subtract(Fraction other) {
            int newNumerator = numerator * other.denominator - other.numerator * denominator;
            int newDenominator = denominator * other.denominator;
            Fraction result = new Fraction(newNumerator, newDenominator);
            result.simplify();
            return result;
        }

        public Fraction multiply(Fraction other) {
            int newNumerator = numerator * other.numerator;
            int newDenominator = denominator * other.denominator;
            Fraction result = new Fraction(newNumerator, newDenominator);
            result.simplify();
            return result;
        }

        public Fraction divide(Fraction other) {
            if (other.numerator != 0) {
                int newNumerator = numerator * other.denominator;
                int newDenominator = denominator * other.numerator;
                Fraction result = new Fraction(newNumerator, newDenominator);
                result.simplify();
                return result;
            } else {
                throw new IllegalArgumentException("Ділення на нуль не допускається.");
            }
        }
    }
    public static class Book {
    private String title;
    private String authorName;
    private int year;
    private String publisher;
    private String genre;
    private int pageCount;

    public Book(String title, String authorName, int year, String publisher, String genre, int pageCount) {
        this.title = title;
        this.authorName = authorName;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
        this.pageCount = pageCount;
    }

    public Book() {
        this("", "", 0, "", "", 0);
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть назву книги: ");
        title = scanner.nextLine();

        System.out.print("Введіть ПІБ автора: ");
        authorName = scanner.nextLine();

        System.out.print("Введіть рік випуску: ");
        year = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введіть назву видавництва: ");
        publisher = scanner.nextLine();

        System.out.print("Введіть жанр книги: ");
        genre = scanner.nextLine();

        System.out.print("Введіть кількість сторінок: ");
        pageCount = scanner.nextInt();
        scanner.nextLine();
    }

    public void show() {
        System.out.println("Назва книги: " + title);
        System.out.println("ПІБ автора: " + authorName);
        System.out.println("Рік випуску: " + year);
        System.out.println("Назва видавництва: " + publisher);
        System.out.println("Жанр книги: " + genre);
        System.out.println("Кількість сторінок: " + pageCount);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

}

    public static void main(String[] args) {
        //Task1
        System.out.println("\nPerson");

        Person person1 = new Person();
        person1.input();
        System.out.println("\nВведені дані про людину:");
        person1.show();

        Person person2 = new Person("Іванов Іван Іванович", "01-01-1990", "+1234567890",
                "Кременчуг", "Україна", "Шевченко 50");
        System.out.println("\nДані про іншу людину:");
        person2.show();

        //Task2
        System.out.println("\nCity");

        City city1 = new City();
        city1.input();
        System.out.println("\nВведені дані про місто:");
        city1.show();

        City city2 = new City("Кременчуг", "Полтавська область", "Україна",
                2800000, "02000", "+380");
        System.out.println("\nДані про інше місто:");
        city2.show();

        //Task3
        System.out.println("\nCountry");

        Country country1 = new Country();
        country1.input();
        System.out.println("\nВведені дані про країну:");
        country1.display();

        List<String> cities = new ArrayList<>();
        cities.add("Київ");
        cities.add("Львів");
        cities.add("Кременчуг");
        Country country2 = new Country("Україна", "Європа", 44000000,
                "+380", "Київ", cities);
        System.out.println("\nДані про іншу країну:");
        country2.display();


        //Task4
        System.out.println("\nFraction");

        Fraction fraction1 = new Fraction();
        fraction1.input();
        System.out.println("\nВведений дріб:");
        fraction1.show();

        Fraction fraction2 = new Fraction(3, 4);
        System.out.println("\nДріб за замовчуванням:");
        fraction2.show();

        Fraction sum = fraction1.add(fraction2);
        System.out.println("\nСума двох дробів:");
        sum.show();

        Fraction difference = fraction1.subtract(fraction2);
        System.out.println("\nРізниця двох дробів:");
        difference.show();

        Fraction product = fraction1.multiply(fraction2);
        System.out.println("\nДобуток двох дробів:");
        product.show();

        try {
            Fraction quotient = fraction1.divide(fraction2);
            System.out.println("\nЧастка двох дробів:");
            quotient.show();
        } catch (Error e) {
            System.out.println("\nПомилка: " + e.getMessage());
        }


        //Task5
        System.out.println("\nBook");

        Book book1 = new Book();
        book1.input();
        System.out.println("\nВведені дані про книгу:");
        book1.show();

        Book book2 = new Book("My book", "Daniil", 2023, "Publisher", "Programming", 400);
        System.out.println("\nДані про іншу книгу:");
        book2.show();

    }
}