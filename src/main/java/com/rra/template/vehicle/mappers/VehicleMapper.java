package com.rra.template.vehicle.mappers;

import com.rra.template.vehicle.Vehicle;
import com.rra.template.vehicle.dto.RegisterVehicleRequestDTO;
import com.rra.template.vehicle.dto.VehicleResponseDTO;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface VehicleMapper {

    @Mapping(source = "currentOwner.id", target = "currentOwnerId")
    @Mapping(source = "plateNumber.id", target = "plateNumber")
    VehicleResponseDTO toResponse(Vehicle vehicle);

    @Mapping(target = "currentOwner", ignore = true)
    @Mapping(target = "plateNumber", ignore = true)
    Vehicle toEntity(RegisterVehicleRequestDTO dto);

}
