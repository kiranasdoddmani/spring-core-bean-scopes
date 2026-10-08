# Spring Core - Bean Scopes

A beginner-friendly Spring Core project focused on understanding **Bean Scopes** using XML-based Spring configuration.

## 📚 Topics Covered

* Spring Bean
* Bean Scope
* Singleton Scope
* Prototype Scope
* ApplicationContext
* getBean()
* XML-based Bean Configuration
* Object Comparison

## 🔹 Singleton Scope

Singleton is the **default scope** of a Spring Bean.

Spring creates **only one object** for a particular Bean and returns the same object whenever the Bean is requested from the Spring Container.

### Key Point

**Singleton → One Bean → One Object**

## 🔹 Prototype Scope

Prototype scope creates a **new object every time the Bean is requested from the Spring Container**.

### Key Point

**Prototype → One Bean → Multiple Objects**

## 🔄 Singleton vs Prototype

| Scope     | Object Creation             | Result            |
| --------- | --------------------------- | ----------------- |
| Singleton | One object                  | Same object       |
| Prototype | New object for each request | Different objects |

## 🎯 Purpose

The purpose of this project is to understand how Spring manages Bean object creation using different scopes.

## 🛠️ Technologies Used

* Java
* Spring Core
* Maven
* XML Configuration
* IntelliJ IDEA

## ⭐ Key Takeaway

**Singleton:** Same object is returned.

**Prototype:** A new object is created for every Bean request.

This project is part of my **Spring Core learning journey**.
