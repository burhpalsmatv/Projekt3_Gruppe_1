package dk.ek.projekt3_gruppe_1.repo;

import dk.ek.projekt3_gruppe_1.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepo {
    @Autowired
    private DataSource dataSource;


    public List<Car> getAllCars() {

        List<Car> listOfCars = new ArrayList<>();
        String sql = "SELECT * FROM car";

        try (Connection con = dataSource.getConnection();
             PreparedStatement statement = con.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {


            while (resultSet.next()) {
                Car car = new Car();
                car.setVehicleNo(resultSet.getInt("VehicleNo"));
                car.setVin(resultSet.getInt("vin"));
                car.setBrand(resultSet.getString("brand"));
                car.setModel(resultSet.getString("model"));
                car.setColor(resultSet.getString("color"));
                car.setSteelPrice(resultSet.getFloat("steelPrice"));
                car.setRegistryPrice(resultSet.getInt("registryFee"));
                car.setCo2Emission(resultSet.getInt("co2Emission"));
                car.setAvailable(resultSet.getBoolean("available"));

                listOfCars.add(car);

            }
        } catch (SQLException e) {
            throw new RuntimeException();
        }

        return listOfCars;
    }

    public void deleteCar(int vehicleNo) {
        String sql = "DELETE FROM car WHERE vehicleNo = ?";

        try (Connection con = dataSource.getConnection();
            PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, vehicleNo);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void saveCar(Car car) {
        String sql = "INSERT INTO car(vehicleNo, vin, brand, model, color, steelPrice, registryFee, co2Emission, available)"
                + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?";

        try(Connection con = dataSource.getConnection();
            PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, car.getVehicleNo());
            statement.setInt(2, car.getVin());
            statement.setString(3, car.getBrand());
            statement.setString(4, car.getModel());
            statement.setString(5, car.getColor());
            statement.setFloat(6, car.getSteelPrice());
            statement.setFloat(7, car.getRegistryPrice());
            statement.setFloat(8, car.getCo2Emission());
            statement.setBoolean(9, car.isAvailable());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public void updateCar(Car updatedCar) {
        String sql = "UPDATE car SET vehicleNo = ?, vin = ?, brand = ?, model = ?, color = ?, steelPrice = ?, registryFee = ?, co2Emission = ?, available = ?";

        try(Connection con = dataSource.getConnection();
            PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, updatedCar.getVehicleNo());
            statement.setInt(2, updatedCar.getVin());
            statement.setString(3, updatedCar.getBrand());
            statement.setString(4, updatedCar.getModel());
            statement.setString(5, updatedCar.getColor());
            statement.setFloat(6, updatedCar.getSteelPrice());
            statement.setFloat(7, updatedCar.getRegistryPrice());
            statement.setFloat(8, updatedCar.getCo2Emission());
            statement.setBoolean(9, updatedCar.isAvailable());
            statement.executeUpdate();

        } catch(SQLException e) {
            e.printStackTrace();
        }

    }



}
