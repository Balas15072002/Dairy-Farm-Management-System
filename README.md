# Lumen – Dairy Farm Management System

## Project Type  
**B2B (Business-to-Business)**

## Target Audience  
- Farm Owners (Admin)  
- Dairy Employees / Staff  
- Distributors / Wholesalers  
- Local Customers  

## Timeline  
1 Month  

## Budget  
₹10,00,000 (10 Lakhs)  

## Team Size  
1 Member  

---

## Key Features

- The admin can register and log in using a secure username and password.
- The admin can **add, update, search, filter, or remove animals** (e.g., cow, buffalo, goat) with details such as:
  - Breed  
  - Age  
  - Health status  
  - Daily productivity  
- **Daily milk production** is recorded for each animal and aggregated for tracking.
- **Milk stock** (in liters) is automatically updated based on production and daily sales.
- The admin can **add, view, search, and remove staff members** with their details.
- The system enables **placing milk orders** by:
  - Registered customers  
  - Distributors / Wholesalers  
  - Temporary customers (with basic info stored)  
- The admin can **set or update prices** for different milk product types:
  - Cow Milk  
  - Buffalo Milk  
  - Goat Milk  
- A **revenue dashboard** calculates income:
  - Per Day  
  - Per Week  
  - Per Month  
- The admin can **view, edit, and manage customer and distributor information**.
- A **feedback and complaints module** stores and displays customer inputs for review and action.
- The admin can **add, update, view, search, filter, or remove food inventory** for animals.
- *(Optional)* A **notification system** alerts staff or admin about:
  - Low milk stock  
  - Pending orders  
  - Animal health issues  
  - Inventory shortages  

---
## 🔹 Model Classes

### 🔹 Admin

* `String adminId`
* `String name`
* `String username`
* `String password`
* `String email`
* `String contactNumber`

### 🔹 Animal

* `String animalId`
* `String type` (Cow, Buffalo, Goat)
* `String breed`
* `int age`
* `String healthStatus`
* `double dailyProductivityInLiters`

### 🔹 MilkProduction

* `String productionId`
* `String animalId`
* `LocalDate date`
* `double litersProduced`

### 🔹 MilkStock

* `String stockId`
* `String milkType` (Cow, Buffalo, Goat)
* `double availableLiters`

### 🔹 Staff

* `String staffId`
* `String name`
* `String role`
* `String contactNumber`
* `String email`
* `String joiningDate`

### 🔹 Customer

* `String customerId`
* `String name`
* `String contactNumber`
* `String email`
* `String address`
* `boolean isDistributor`

### 🔹 Order

* `String orderId`
* `String customerId`
* `String milkType`
* `double quantityInLiters`
* `double pricePerLiter`
* `double totalAmount`
* `LocalDate orderDate`
* `boolean isDelivered`

### 🔹 MilkPrice

* `String priceId`
* `String milkType`
* `double pricePerLiter`
* `String lastUpdated`

### 🔹 RevenueRecord

* `String recordId`
* `LocalDate date`
* `double dailyIncome`

### 🔹 Feedback

* `String feedbackId`
* `String customerId`
* `String message`
* `String status`

### 🔹 FoodInventory

* `String itemId`
* `String foodName`
* `int quantityInKg`
* `String supplier`
* `String expiryDate`

### 🔹 Notification

* `String notificationId`
* `String message`
* `String alertType`
* `String dateTime`

---
