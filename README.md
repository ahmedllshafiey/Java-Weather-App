# Weather App

This is a simple Java Swing-based GUI application that displays weather information for a specified location. It fetches weather data from the Open-Meteo API and displays it in a user-friendly format.

## Features

- Search for weather information by entering a city name.
- Display current temperature, weather condition, humidity, and wind speed.
- Update weather information based on the search input.

## Requirements

- Java Development Kit (JDK) 8 or higher
- Internet connection (for fetching weather data from the API)

## Installation

Clone the repository to your local machine:

```bash
git clone https://github.com/your-username/weather-app.git
```

Navigate to the project directory:

```bash
cd weather-app
```

Compile the Java files:

```bash
javac -cp .:json-simple-1.1.1.jar GUI.java
```

Run the application:

```bash
java -cp .:json-simple-1.1.1.jar GUI
```

## Usage

1. Launch the application by running the command above.
2. Enter the name of the city you want to search for in the text field.
3. Click the search button (magnifying glass icon) to fetch and display the weather information.
4. The application will display the current temperature, weather condition, humidity, and wind speed for the specified location.

## Project Structure

- `GUI.java`: Main class that defines the GUI layout and handles user interactions.
- `WeatherData.java`: Utility class that fetches weather data from the Open-Meteo API.
- `src/assets`: Directory containing image assets used in the GUI.

## Dependencies

- `json-simple-1.1.1.jar`: A simple library for JSON parsing in Java. Make sure this JAR file is included in your classpath when compiling and running the application.

## API

The application uses the following APIs:

1. **Open-Meteo API**: Fetches weather data based on latitude and longitude.
2. **Open-Meteo Geocoding API**: Converts city names to geographical coordinates (latitude and longitude).

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- Icons used in the application are sourced from the Open-Meteo API documentation.

## Contact

If you have any questions or suggestions, feel free to open an issue or contact me at [ahmedll.shafiey@gmail.com](ahmedll.shafiey@gmail.com).