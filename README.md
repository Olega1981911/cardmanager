bank-card-management-system/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── bankcard/
│   │   │               ├── BankCardManagementApplication.java
│   │   │               ├── config/
│   │   │               │   ├── SecurityConfig.java
│   │   │               │   └── SwaggerConfig.java
│   │   │               ├── controller/
│   │   │               │   ├── BankCardController.java
│   │   │               │   └── TransactionController.java
|   |   |               ├── mapper/
|   |   |               |   ├── BankCardMapper.java
|   |   |               |   ├── TransactionCardMapper.java
|   |   |               |   └── UserMapper.java  
│   │   │               ├── dto/
│   │   │               │   ├── BankCardDTO.java
│   │   │               │   ├── TransactionCardDTO.java
|   |   |               |   ├── UserResponseDTO.java
│   │   │               │   └── UserRequestDTO.java
│   │   │               ├── entity/
|   |   |               |   ├── TransactionCard.java  
│   │   │               │   ├── CardStatus.java
│   │   │               │   └── UserRole.java
│   │   │               │   
│   │   │               ├── enum/
|   |   |               |   ├── AmountType.java    
│   │   │               │   ├── CardStatus.java
│   │   │               │   └── UserRole.java
│   │   │               ├── exception/
│   │   │               │   ├── ResourceNotFoundException.java
│   │   │               │   └── ApiExceptionHandler.java
│   │   │               ├── repository/
│   │   │               │   ├── BankCardRepository.java
│   │   │               │   ├── TransactionRepository.java
│   │   │               │   └── UserRepository.java
│   │   │               ├── security/
│   │   │               │   ├── JwtAuthenticationFilter.java
│   │   │               │   └── JwtUtil.java
│   │   │               └── service/
│   │   │                   ├── BankCardService.java
│   │   │                   ├── TransactionService.java
│   │   │                   └── UserService.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── db/
│   │       │   └── changelog/
│   │       │       └── db.changelog-master.yaml
│   │       └── static/
│   │           └── swagger-ui/
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── bankcard/
│                       ├── BankCardServiceTest.java
│                       └── UserServiceTest.java
├── build.gradle
└── README.md


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




