package fga.jp.section202.vehiclesystem;

//Required imports.
import java.time.LocalDate;

public interface Engine
{
   //Declare method definitions.
   public void setEngineCylinders(int engineCylinders);
   public void setEngineManufacturedDate(LocalDate date);
   public void setEngineManufacturer(String manufacturer);
   public void setEngineMake(String engineMake);
   public void setEngineModel(String engineModel);
   public void setDriveTrain(String driveTrain);
   public void setEngineType(String fuel);
}//end interface Engine

