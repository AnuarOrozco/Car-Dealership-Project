# Car Dealership System 🚗

This project was developed as part of the Software Engineering and Networks program at Universidad del Valle de México (UVM). The main goal was to implement a car dealership system using a layered architecture, ensuring clear separation of responsibilities in the system. 🎯

## Layered Architecture 🏗️

The system was designed using a layered model, separating the Graphical User Interface (GUI), business logic, and data persistence. This separation improves maintainability, scalability, and keeps the code organized. 📊

## System Layers

1. **Graphical User Interface (GUI) Layer**: The `Principal` class is responsible for launching the graphical interface of the system. This layer handles user interaction, presenting options, and displaying the car data. 🖥️

    ```java
    Principal principalScreen = new Principal();
    principalScreen.setVisible(true);
    principalScreen.setLocationRelativeTo(null);
    principalScreen.setResizable(false);
    ```

2. **Business Logic Layer**: The business logic is managed by the `Controller` class, which handles creating, modifying, deleting, and retrieving cars. This layer defines the system’s behavior and interacts with the persistence layer. 🚀

    ```java
    public void agregarAuto(String modelo, String marca, String motor, String color, String placa, int cantidadPuertas) {
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPlaca(placa);
        auto.setCantidadPuertas(cantidadPuertas);
        persistenceControl.agregarAutomovil(auto);
    }
    ```

3. **Persistence Layer**: Data persistence is handled using JPA (Java Persistence API) to manage database operations. The `AutomovilJpaController` class is in charge of these operations, ensuring that the persistence logic is independent of the database, making data access and manipulation smooth. 💾

    ```java
    public void create(Automovil automovil) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(automovil);
        em.getTransaction().commit();
        em.close();
    }
    ```

## Key Features 🎉

The system allows the following operations for dealership cars:
- Add a car to the inventory. 🚗
- Modify the details of an existing car. 🛠️
- Delete a car from the inventory. ❌
- View all available cars in the dealership. 👀

## Conclusion 🏆

This car dealership project showcases how layered architecture can improve the structure of a system, giving each layer its own responsibility. The separation of layers simplifies scalability and maintainability, ensuring that future modifications can be easily implemented without headaches. 😄
