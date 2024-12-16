I developed a Pagination App that fetches data from a remote API and uses local caching with Room Database. The app is designed using Paging 3, Jetpack Compose, and follows the principles of Clean Architecture. It offers a seamless user experience with smooth pagination, both online and offline.


Features
Offline Support:

When the user is offline, cached data from the local Room Database is displayed.
This ensures uninterrupted access to previously fetched items.
Online Mode:

When the user is online, data is fetched from a fake demo API using Retrofit.
The app seamlessly integrates online and cached data for a smooth experience.
Modern Architecture:

The app is built using ViewModel, Clean Architecture, and the latest Jetpack libraries.
Business logic is separated into layers to ensure scalability and testability.
Smooth Pagination:

Leveraging Paging 3, the app loads data incrementally, improving performance and minimizing network usage.
How It Works
1. Data Flow
API Integration:
Data is fetched from the API using Retrofit with PagingSource.
Local Caching:
The fetched data is stored in a Room Database, enabling offline support.
UI Rendering:
The app uses LazyColumn in Compose to display items dynamically with smooth scrolling and pagination.
2. Architecture Layers
Data Layer:
Handles data sources (remote and local) and manages caching using Room.
Domain Layer:
Contains business logic, including the use of a Repository pattern to abstract data sources.
Presentation Layer:
Uses ViewModel to manage UI state and exposes paginated data streams to the Compose UI.
3. Key Components
Paging 3: Manages the pagination logic for both online and offline data.
Room Database: Stores the data locally for offline access.
Retrofit: Fetches data from the remote API.
Jetpack Compose: Provides a modern, declarative UI with LazyColumn for smooth rendering.
ViewModel: Handles state and interacts with the repository.
