
### 🔑 String Methods in Java with Examples

```java
String name = "Harsh";
String name2 = "   Java   ";
String str1 = "Hello";
String str2 = "World";
```

---

### 📌 Case Conversion

```java
name.toLowerCase();    // "HARSH" -> "harsh"
name.toUpperCase();    // "harsh" -> "HARSH"
```

---

### 📌 Length & Characters

```java
name.length();         // "Harsh" -> 5
name.charAt(0);        // "Harsh" -> 'H'
name.charAt(4);        // "Harsh" -> 'h'
```

---

### 📌 Substrings

```java
name.substring(1);     // "Harsh" -> "arsh"
name.substring(1, 4);  // "Harsh" -> "ars"
```

---

### 📌 Search & Index

```java
name.indexOf("a");     // "Harsh" -> 1
name.indexOf("z");     // "Harsh" -> -1 (not found)
name.lastIndexOf("h"); // "Harsh" -> 4
name.contains("rs");   // "Harsh" -> true
name.startsWith("Ha"); // "Harsh" -> true
name.endsWith("sh");   // "Harsh" -> true
```

---

### 📌 Comparison

```java
name.equals("Harsh");        // "Harsh" vs "Harsh" -> true
name.equals("harsh");        // "Harsh" vs "harsh" -> false
name.equalsIgnoreCase("harsh"); // "Harsh" vs "harsh" -> true
name.compareTo("Hello");     // "Harsh" vs "Hello" -> negative (lexical order)
name.compareToIgnoreCase("hello"); // "Harsh" vs "hello" -> negative
```

---

### 📌 Replace

```java
name.replace('H', 'M');      // "Harsh" -> "Marsh"
name.replace("Har", "Car");  // "Harsh" -> "Carsh"
```

---

### 📌 Trim & Remove Spaces

```java
name2.trim();          // "   Java   " -> "Java"
```

---

### 📌 Split & Join

```java
"apple,banana,orange".split(","); 
// -> ["apple", "banana", "orange"]

String.join("-", "2025", "09", "03"); 
// -> "2025-09-03"
```

---

### 📌 Value Conversion

```java
String.valueOf(100);   // int 100 -> "100"
String.valueOf(true);  // boolean -> "true"
```

---

### 📌 Repeat

```java
"Hi".repeat(3);        // -> "HiHiHi"
```

---

### 📌 isEmpty / isBlank

```java
"".isEmpty();          // -> true
"   ".isEmpty();       // -> false
"   ".isBlank();       // -> true
```

---

### 📌 Format

```java
String.format("My name is %s and age is %d", "Harsh", 19);
// -> "My name is Harsh and age is 19"
```

---

👉 These are **most used** methods. Java `String` class has **50+ methods** in total, but many are overloads of these.
