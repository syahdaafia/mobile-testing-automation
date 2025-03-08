# 📱 Appium Mobile Automation - Diet Meal App  

Repositori ini berisi pengujian otomatisasi aplikasi mobile **Diet Meal App** menggunakan **Appium** dan **Cucumber**.  

## 📌 Deskripsi Proyek  

Proyek ini bertujuan untuk mengotomatiskan pengujian UI aplikasi **Diet Meal App** dengan **Appium** dan **Cucumber** sebagai kerangka kerja BDD. Pengujian yang dilakukan mencakup:  

- **Registrasi pengguna** dengan berbagai kombinasi input.  
- **Memilih tingkat aktivitas** pada halaman registrasi.  

## 📂 Struktur Proyek  

Proyek ini memiliki beberapa folder utama:  

```
📂 src  
│   ├── 📂 main  
│   │   ├── 📂 java  
│   │   │   ├── 📂 pages  # Page Object Model (POM)  
│   │   │   │   ├── 📄 RegisterPage1.java  # Representasi halaman pertama registrasi  
│   │   │   │   ├── 📄 RegisterPage2.java  # Representasi halaman kedua registrasi  
│   ├── 📂 test  
│   │   ├── 📂 java  
│   │   │   ├── 📂 drivers  # Setup Appium driver untuk pengujian  
│   │   │   │   ├── 📄 DriverManager.java  # Konfigurasi Appium driver dengan desired capabilities  
│   │   │   ├── 📂 hooks  # Setup dan teardown driver sebelum/sesudah pengujian  
│   │   │   │   ├── 📄 Hooks.java  # Inisialisasi dan penghancuran driver sebelum/sesudah setiap scenario  
│   │   │   ├── 📂 runners  # Menjalankan pengujian menggunakan Cucumber  
│   │   │   │   ├── 📄 TestRunner.java  # Konfigurasi test runner untuk menjalankan fitur Cucumber  
│   │   │   ├── 📂 stepdefinitions  # Implementasi langkah-langkah dari file .feature  
│   │   │   │   ├── 📄 RegisterSteps.java  # Langkah-langkah pengujian untuk registrasi  
│   │   │   │   ├── 📄 ActivitySteps.java  # Langkah-langkah pengujian untuk aktivitas  
│   │   ├── 📂 resources  
│   │   │   ├── 📂 features  # File skenario pengujian dalam format Gherkin  
│   │   │   │   ├── 📄 register.feature  # Skenario pengujian untuk registrasi  
│   │   │   │   ├── 📄 activity.feature  # Skenario pengujian untuk aktivitas  
│   │   │   ├── 📂 app  # Folder untuk menyimpan APK aplikasi yang akan diuji  
│   │   │   │   ├── 📄 Diet_meal.apk  # File APK aplikasi Diet Meal  
└── 📄 pom.xml  # Konfigurasi Maven untuk dependensi Appium, Cucumber, JUnit, dll.  

```

## 🚀 Cara Menjalankan Pengujian  

### 1️⃣ Persiapan  
Pastikan sudah menginstal:  
- **Java 8+**  
- **Maven**  
- **Appium Server**  
- **Android Emulator / Real Device**  
- **Android SDK & ADB**  

### 2️⃣ Clone Repositori  
Clone repositori ke sistem lokal:  
```sh
git clone https://github.com/username/dietmeal-app-automation.git
cd dietmeal-app-automation
```

### 3️⃣ Konfigurasi Appium  
Pastikan **Appium Server** sudah berjalan dengan perintah:  
```sh
appium
```
Atau jika menggunakan **Appium Desktop**, pastikan sudah **Start Server**.

### 4️⃣ Jalankan Pengujian  
Jalankan perintah berikut untuk mengeksekusi pengujian dengan Maven:  
```sh
mvn clean test
```
Perintah ini akan menjalankan semua skenario pengujian dan menampilkan hasilnya di terminal.

## 📊 Laporan Hasil Pengujian  
Setelah pengujian selesai, laporan hasilnya akan tersedia dalam bentuk HTML di folder:  
```
target/cucumber-reports/index.html
```

## 📌 Catatan Tambahan  
- Pastikan emulator atau perangkat sudah terhubung sebelum menjalankan pengujian.  
- Jika ingin mengganti **Appium Server URL**, ubah di `DriverManager.java` pada method `getAppiumServerUrl()`.  
- File APK aplikasi dapat disimpan di **src/test/resources/app/** dan diatur pada `appium:app` di `DriverManager.java`.  
