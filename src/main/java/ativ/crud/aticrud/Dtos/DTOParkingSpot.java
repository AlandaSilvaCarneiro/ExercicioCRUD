package ativ.crud.aticrud.Dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;



@AllArgsConstructor
@Data
public class DTOParkingSpot {
    @NotBlank
    private String parkingSpotNumber;

    @NotBlank
    @Size(max = 7)
    private String lincensePlateCar;

    @NotBlank
    private String brandCar;

    @NotBlank
    private String colorCar;

    @NotBlank
    private String modelCar;

    @NotBlank
    private String apartment;


    @NotBlank
    private String block;    
}
