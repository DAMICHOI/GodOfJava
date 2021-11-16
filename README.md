# GodOfJava

책 `자바의 신`으로 공부 중 입니다.

Chpater 별로

- '직접해 봅시다' 및 그 외 문제를 Exam 디렉토리에 풀면서 학습하려고 합니다.
- '정리해 봅시다' 문제를 README.md 파일에 풀고 정리해보려고 합니다.

---

## 정리해봅시다.

- [Chapter 01. 프로그래밍이란 무엇인가?](#chapter-01-프로그래밍이란-무엇인가)
- [Chapter 02. Hello God Of Java](#chapter-02-hello-god-of-java)
- [Chapter 03. 자바를 제대로 알려면 객체가 무엇인지를 알아야 해요.](#chapter-03-자바를-제대로-알려면-객체가-무엇인지를-알아야-해요)
- [Chapter 04. 정보를 어디에 넣고 싶은데](#chapter-04-정보를-어디에-넣고-싶은데)

---

### Chapter 01. 프로그래밍이란 무엇인가?

1. 클래스란 뭔가요?
    - 자바의 가장 작은 단위이다.
    - 클래스는 상태와 행동이 있어야만 한다.
    - 상태는 클래스의 특성을 결정짓는 것으로 변수를 뜻하며, 행동은 메소드를 뜻한다.


2. 메소드가 뭔가요?
    - 어떤 값을 주고 결과를 넘겨주는 것을 메소드라고 한다.


3. 메소드의 매개 변수는 어디에 적어주나요?
    - 메소드의 매개 변수는 메소드 이름의 우측에 적어준다.
    - ex: `public boolean checkPassword(int num1, int num2) {`


4. 메소드의 이름 앞에 꼭 적어줘야 하는 건 뭐죠?
    - return type 을 적어줘야 한다.


5. 클래스가 갖고 있어야 한다고 한 두 가지가 뭐죠?
    - 상태와 행동이 있어야 한다.


6. 메소드에서 결과를 돌려주려면 어떤 예약어를 사용해야 하나요?
    - return 예약어를 사용해야 한다.

### Chapter 02. Hello God Of Java

1. `main()` 메소드의 메소드 이름 앞에는 어떤 예약어들이 들어가나요?
    - 접근제어자 `public`과 `static` 예약어가 들어간다.


2. `main()` 메소드의 매개 변수에는 어떤 값이 들어가나요?
    - `String[] args`. String(문자열) 타입의 배열이 들어간다.


3. 만약 여러분들이 만든 클래스에 main() 메소드가 없다면, java 명령어로 그 클래스를 수행할 수 있나요?
    - main() 메소드가 없으면, java 파일을 실행할 수 없으며 오류가 발생한다.


4. `System.out.println()` 메소드는 어떤 용도로 사용하나요?
    - 문자열을 출력할 때 사용한다.


5. `System.out.print()` 메소드는 `System.out.println()` 메소드와 어떤 차이가 있나요?
    - `System.out.print()` 메소드는 문자열을 출력하고, 개행하지 않는다.
    - `System.out.print()` 메소드는 문자열을 출력한 후 개행한다.


6. `//`는 무엇을 하는 데 사용하는 기호인가요?
    - 주석을 달 때 사용하는 기호이다.


7. `/*`로 시작하고, `*/`로 끝나는 사이에 있는 소스들은 어떻게 되나요?
    - 블록 주석으로 이 사이에 있는 구문들은 생략된다.


8. 메소드를 선언할 때 반드시 꼭 있어야 하는 세 가지는 무엇인가요?
    - 리턴 타입, 메소드 이름, 메소드 내용은 반드시 있어야 한다.

### Chapter 03. 자바를 제대로 알려면 객체가 무엇인지를 알아야 해요.

1. 클래스와 객체의 차이점을 말해 주세요.
    - 클래스는 사물의 단위를 의미하지만, 객체는 각 사물을 의미한다.


2. 객체를 생성하기 위해서 꼭 사용해야 하는 예약어는 뭐라고 했죠?
    - `new` 예약어를 사용해야 한다.


3. 객체를 생성하기 위해서 사용하는 메소드 같이 생긴 클래스 이름에 소괄호가 있는 것을 뭐라고 하나요?
    - 생성자 라고 한다.


4. 객체의 메소드를 사용하려면 어떤 기호를 객체 이름과 메소드 이름 사이에 넣어주어야 하나요?
    - 콤마(.)를 써야한다.

### Chapter 04. 정보를 어디에 넣고 싶은데

1. 네 가지 종류의 변수는 어떻게 구분할 수 있나요?
    - 지역 변수(local variables), 매개 변수(parameters), 인스턴스 변수(instance variables), 클래스 변수(class variables)로 구분한다.
    - 지역 변수(local variables)
        - 중괄호 내에서 선언된 변수
        - 지역 변수를 선언한 중괄호 내에서만 유효하다.
    - 매개 변수(parameters)
        - 메소드에 넘겨주는 변수
        - 메소드가 호출될 때 생명이 시작되고, 메소드가 끝나면 소멸된다.
    - 인스턴스 변수(instance variables)
        - 메소드 밖에, 클래스 안에 선언된 변수. 앞에는 static이라는 예약어가 없어야 한다.
        - 객체가 생성될 때 생명이 시작되고, 그 객체를 참조하고 있는 다른 객체가 없으면 소멸된다.
    - 클래스 변수(class variables)
        - 인스턴스 변수처럼 메소드 밖에, 클래스 안에 선언된 변수 중에서 타입 선언 앞에 static이라는 예약어가 있는 변수
        - 클래스가 처음 호출될 때 생명이 시작되고, 자바 프로그램이 끝날 때 소멸된다.
    - 소스코드 예시
   ```java
    public class VariableTypes {
        int instanceVariable;
        static int classVariable;
        public void method(int parameter) {
            int localVariable;
        }
        
        public void otherMethod() {
            int localVariable;
        }
    }
    ```


2. 변수의 이름을 지을 때 대문자로 시작해도 되나요?
    - 변수명은 소문자 알파벳으로 시작해야 한다.


3. 자료형에는 기본 자료형과 어떤 자료형이 있나요?
    - 기본 자료형과 참조 자료형이 있다.
    - 참조 자료형은 new 예약어로 초기화해주어야 한다.


4. 기본 자료형에는 몇가지가 있나요?
    - 기본 자료형은 8가지가 있다.
    - byte, short, int, long, char, float, double, boolean로 이루어져 있다.


5. 기본 자료형 중 정수형에는 어떤 것들이 있나요?
    - 정수형에는 byte, short, int, long, char 이 있다.
    - byte는 8비트로, 기본 값은 0이며, 값의 볌위는 -2<sup>7</sup> ~ 2<sup>7</sup>-1 이다.
    - short는 16비트로, 기본 값은 0이며, 값의 볌위는 -2<sup>15</sup> ~ 2<sup>15</sup>-1 이다.
    - int는 32비트로, 기본 값은 0이며, 값의 볌위는 -2<sup>31</sup> ~ 2<sup>31</sup>-1 이다.
    - long은 64비트로, 기본 값은 0L이며, 값의 볌위는 -2<sup>63</sup> ~ 2<sup>63</sup>-1 이다.
    - char는 16비트로, 기본 값은 '\u0000'이며, 값의 볌위는 0 ~ 2<sup>16</sup>-1 이다.


6. byte는 몇 비트(bit)로 되어 있나요?
    - 8bit로 되어 있다.


7. byte는 왜 만들었을까요?
    - 많은 부분에서 데이터를 저장할 때 byte 값들을 조합해서 사용한다.
    - 그래야 적은 공간에 보다 많은 내용을 저장할 수 있다.


8. int와 long 중 어떤 타입이 더 큰 숫자를 처리할 수 있나요?
    - long 이 더 큰 숫자를 처리할 수 있다.


9. 소수점을 처리하는 타입은 어떤 것이 있나요?
    - 소수점을 처리하는 타입은 float와 double이 있다.
    - float는 32비트, byte는 64비트로 표현된다.


10. char는 정수형인가요?
    - 그렇다.


11. a라는 것을 char로 정의할 때 어떤 기호로 감싸주어야 하나요?
    - 작은 따옴표(')로 감싸주어야 한다.


12. true와 false 두 개의 값만을 가지는 타입은 어떤 것인가요?
    - boolean 타입이다.
