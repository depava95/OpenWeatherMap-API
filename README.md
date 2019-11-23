
# About
Getting weather data from https://openweathermap.org/api

# Stack
- Java
- Maven
- Spring-boot
- MySQL

# Execute application
Insert database information, api-key into an application.properties <br />
Run OpenWeatherApplication
```
localhost:9090/
```
# How to use

(http://http:localhost:9090)

| Method | Url | Decription |
| ------ | --- | ---------- |
| GET    |/api/v1/weather?city={city}&lang={lang}  | Get weather by city |
| GET    |/api/v1/weather/cities/all?page={N} | Get all available cities with pagination |
| GET    |/api/v1/weather/cities?country={country}&page={N}  | Get all the cities of a certain country  |


# Example

- getting data on the city of Dnipro, language - Ukranian
```
/api/v1/weather?city=Dnipro&lang=ua
```

```
{
    "weather": [
        {
            "id": 800,
            "main": "Clear",
            "description": "чисте небо",
            "icon": "01n"
        }
    ],
    "main": {
        "temp": -4.0,
        "pressure": 1030.0,
        "humidity": 41.0,
        "temp_min": -4.0,
        "temp_max": -4.0
    },
    "wind": {
        "speed": 9.0,
        "deg": 90.0
    }
}
```

