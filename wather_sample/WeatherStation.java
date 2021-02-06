public class WeatherStation {
  public static void main(String [] args) {
    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

    // StatisticDisplay statisticsDisplay = new StatisticDisplay(weatherData);

    ForecastDisplay forcastDisplay = new ForecastDisplay(weatherData);

    weatherData.setMeasurements(27, 65, 30.4f);
    weatherData.setMeasurements(28, 70, 29.2f);
    weatherData.setMeasurements(26, 90, 29.2f);
    
  }
}