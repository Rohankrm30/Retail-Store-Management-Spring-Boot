# Retail-Store-Management-Spring-Boot

A Spring Boot REST API for managing products, orders, and users with session-based authentication.

---

## Project Overview

This is a comprehensive e-commerce backend system built with Spring Boot that provides complete functionality for managing an online retail store. The application handles product catalogs, shopping carts, order processing, and user authentication for both customers and sellers.

It follows RESTful API principles and uses MySQL for data persistence, with Spring Data JPA managing all database operations. The system includes robust validation, custom exception handling, and interactive API documentation through Swagger UI.

---

## Core Functionality

The platform serves three primary user groups with distinct capabilities.

- **Customers** can create accounts, browse products across multiple categories, add items to shopping carts, place orders, and track their purchase history.
- **Sellers** manage their product inventory by adding new items, updating prices and quantities, changing product availability, and monitoring their catalog.
- The **system administrator** oversees the entire platform with access to all products, orders, and user management features.

Authentication is handled through a session-based token system. When users log in, they receive a unique session token that must be included in the header of subsequent requests. This token validates their identity and maintains their session state across different operations.

The system manages separate authentication flows for customers and sellers, each with dedicated registration, login, and logout endpoints.

---

## API Endpoints

- **Authentication endpoints** handle customer and seller registration, login, and logout.
- **Product endpoints** support adding, retrieving, updating, and deleting products with filtering by category, seller, or status.
- **Cart endpoints** manage adding items, viewing cart, and removing items.
- **Order endpoints** handle placing orders, viewing order details, updating status, and cancellation.
- **Customer endpoints** provide profile management including updating credentials, passwords, addresses, and payment cards.

All protected endpoints require the session token in request headers. The API returns JSON responses with proper HTTP status codes and structured error messages for validation failures or exceptions.
