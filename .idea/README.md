```bash
```
jar --create --file calculator.jar ../target
```bash
```
jar cfm calculator.jar MANIFEST.MF Calculator.class Main.class
```bash
```
java -jar calculator.jar