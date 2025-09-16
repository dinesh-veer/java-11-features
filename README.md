

# ☕ Java 11 Features

This repository contains practical examples showcasing new features introduced in **Java 11**. It is designed for learners and developers who want to quickly understand and experiment with Java 11 updates.

---

## 🗂️ Project Structure

```

src/
├── CollectionToArray.java
├── FilesReadStringWriteString.java
├── HttpClientExample.java
├── IsBlankDemo.java
├── LambdaVarDemo.java
├── NotPredicateDemo.java
├── OptionalIsEmptyDemo.java
├── PredicateNotDemo.java
├── RepeatStringDemo.java
├── StringLinesDemo.java
├── StringStripDemo.java
├── ToArrayMethodDemo.java
├── module-info.java

````

---

## 🔍 Features Covered

| Feature | File | Description |
|--------|------|-------------|
| `HttpClient` API | `HttpClientExample.java` | Demonstrates HTTP GET using the standard Java 11 client. |
| String enhancements | `IsBlankDemo.java`, `RepeatStringDemo.java`, `StringLinesDemo.java`, `StringStripDemo.java` | Covers new string methods like `isBlank()`, `lines()`, `repeat()`, `strip()`. |
| Lambda with `var` | `LambdaVarDemo.java` | Shows use of `var` in lambda expressions. |
| `Optional.isEmpty()` | `OptionalIsEmptyDemo.java` | Uses the new `isEmpty()` method for cleaner checks. |
| `Predicate.not()` | `NotPredicateDemo.java`, `PredicateNotDemo.java` | Demonstrates the new `Predicate.not()` static method. |
| Collection to Array | `CollectionToArray.java`, `ToArrayMethodDemo.java` | New `toArray(IntFunction generator)` method. |
| File read/write | `FilesReadStringWriteString.java` | Simplified file I/O with `Files.readString()` and `writeString()`. |

---

## 🧩 Java Modules (module-info.java)

This project includes a `module-info.java` file to demonstrate **Java Platform Module System (JPMS)**, introduced in Java 9 and applicable in Java 11.

```java
module java11features {
    requires java.net.http; // For HttpClient
}
````

* Defines the module name: `java11features`
* Declares required modules like `java.net.http` for the HTTP client
* Helps with strong encapsulation, dependency management, and faster startup

To compile with modules:

```bash
javac -d out --module-source-path src $(find src -name "*.java")
```

To run:

```bash
java --module-path out -m java11features/com.example.MainClass
```

> Replace `com.example.MainClass` with the actual class you want to run.

---

## 🚀 Getting Started

### ✅ Prerequisites

* JDK 11 or higher
* Maven (optional)

### ▶️ Running Examples

To compile and run a specific example manually:

```bash
javac src/StringLinesDemo.java
java -cp src StringLinesDemo
```

Or run with Maven (if `pom.xml` is used):

```bash
mvn compile exec:java -Dexec.mainClass=your.class.Name
```

---

## 📄 Sample Files

* `text.txt` & `text2.txt`: Used by string and file examples.
* `input.txt`: Used in file read/write examples.

---

## 🧾 License

This project is licensed under the [MIT License](LICENSE).

---

## 🙌 Contributing

Feel free to fork the repo, add new Java 11 features or examples, and submit pull requests.

---

## 🔗 Repository

[github.com/dinesh-veer/java11-features](https://github.com/dinesh-veer/java11-features)

---

