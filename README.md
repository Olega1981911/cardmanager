# bank-card-management-system/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── taco/
│   │   │           └── cardmanager/
│   │   │               ├── BankCardManagerApplication.java         # Главный класс приложения
│   │   │               ├── config/                                 
│   │   │               │   ├── SecurityConfig.java                # Конфиг Spring Security
│   │   │               │   └── SwaggerConfig.java                 # Конфиг OpenAPI
│   │   │               ├── controller/                            
│   │   │               │   ├── BankCardController.java            
│   │   │               │   ├── TransactionController.java         
│   │   │               │   └── AuthController.java                # Контроллер аутентификации
│   │   │               ├── dto/                                   
│   │   │               │   ├── request/                           # DTO для входящих запросов
│   │   │               │   │   ├── BankCardRequestDTO.java        
│   │   │               │   │   ├── TransactionCardRequestDTO.java 
│   │   │               │   │   └── UserRequestDTO.java            
│   │   │               │   └── response/                          # DTO для исходящих ответов
│   │   │               │       ├── BankCardResponseDTO.java       
│   │   │               │       ├── TransactionCardResponseDTO.java
│   │   │               │       └── UserResponseDTO.java           
│   │   │               ├── entity/                                # Сущности JPA
│   │   │               │   ├── BankCard.java                      
│   │   │               │   ├── TransactionCard.java               
│   │   │               │   └── User.java                          
│   │   │               ├── enums/                                 # Перечисления
│   │   │               │   ├── AmountType.java                   # DEBIT/CREDIT
│   │   │               │   ├── CardStatus.java                   # ACTIVE/BLOCKED/EXPIRED
│   │   │               │   └── UserRole.java                     # ADMIN/USER
│   │   │               ├── exception/                             # Обработка ошибок
│   │   │               │   ├── ApiError.java                     # Обертка для ошибок
│   │   │               │   ├── GlobalExceptionHandler.java       # @ControllerAdvice
│   │   │               │   └── ResourceNotFoundException.java    
│   │   │               ├── mapper/                               # MapStruct мапперы
│   │   │               │   ├── BankCardMapper.java               
│   │   │               │   ├── TransactionCardMapper.java        
│   │   │               │   └── UserMapper.java                   
│   │   │               ├── repository/                           # JPA репозитории
│   │   │               │   ├── BankCardRepository.java           
│   │   │               │   ├── TransactionRepository.java        
│   │   │               │   └── UserRepository.java               
│   │   │               ├── security/                             # Безопасность
│   │   │               │   ├── JwtAuthenticationFilter.java      
│   │   │               │   ├── JwtTokenProvider.java             
│   │   │               │   └── CustomUserDetails.java            # UserDetails реализация
│   │   │               └── service/                              # Бизнес-логика
│   │   │                   ├── BankCardService.java              
│   │   │                   ├── TransactionService.java           
│   │   │                   └── UserService.java                  
│   │   └── resources/
│   │       ├── application.yml                                   # Настройки приложения
│   │       ├── db/                                               
│   │       │   └── changelog/                                    # Миграции Liquibase
│   │       │       └── db.changelog-master.yaml                  
│   │       └── static/
│   │           └── swagger-ui/                                   # Документация API
│   └── test/                                                     # Тесты
│       └── java/
│           └── com/
│               └── taco/
│                   └── cardmanager/
│                       ├── service/                              
│                       │   ├── BankCardServiceTest.java          
│                       │   └── UserServiceTest.java              
├── build.gradle                                                  # Конфигурация сборки
└── README.md                                                     # Описание проекта

### Именование сущностей и DTO

1. **Сущности (entity)**
    - `BankCard` - представляет банковскую карту.
    - `TransactionCard` - представляет транзакцию, связанную с картой.
    - `User ` - представляет пользователя системы.

2. **DTO (Data Transfer Object)**
    - `BankCardDTO` - для передачи данных о банковской карте.
    - `TransactionCardDTO` - для передачи данных о транзакции.
    - `User DTO` - для передачи данных о пользователе.

### Enum классы

1. **CardStatus**
    - ACTIVE
    - BLOCKED
    - EXPIRED

2. **User Role**
    - ADMIN
    - USER




