# GodOfJava

책 `자바의 신`으로 공부 중 입니다.

> Chpater 별로
> - '직접해 봅시다' 및 그 외 문제를 Exam 디렉토리에 풀면서 학습하려고 합니다.
> - '정리해 봅시다' 문제를 README.md 파일에 풀고 정리해보려고 합니다.

--- 

## 💡 Reference

- [자바의 신 Github](https://github.com/godofjava/GodOfJava2nd)
- [Java Reference](https://docs.oracle.com/javase/tutorial/)

---

## ✏️ 정리해봅시다.

- [Chapter 01. 프로그래밍이란 무엇인가?](#chapter-01-프로그래밍이란-무엇인가)
- [Chapter 02. Hello God Of Java](#chapter-02-hello-god-of-java)
- [Chapter 03. 자바를 제대로 알려면 객체가 무엇인지를 알아야 해요.](#chapter-03-자바를-제대로-알려면-객체가-무엇인지를-알아야-해요)
- [Chapter 04. 정보를 어디에 넣고 싶은데](#chapter-04-정보를-어디에-넣고-싶은데)
- [Chapter 05. 계산을 하고 싶어요](#Chapter-05-계산을-하고-싶어요)
- [Chapter 06. 제가 조건을 좀 따져요](#Chapter-06-제가-조건을-좀-따져요)
- [Chapter 07. 여러 데이터를 하나에 넣을 수는 없을까요?](#Chapter-07-여러-데이터를-하나에-넣을-수는-없을까요)
- [Chapter 08. 참조 자료형에 대해서 더 자세히 알아봅시다](#Chapter-08-참조-자료형에-대해서-더-자세히-알아봅시다)
- [Chapter 09. 자바를 배우면 패키지와 접근 제어자는 꼭 알아야 해요](#Chapter-09-자바를-배우면-패키지와-접근-제어자는-꼭-알아야-해요)
- [Chpater 10. 자바는 상속이라는 것이 있어요](#Chpater-10-자바는-상속이라는-것이-있어요)
- [Chpater 11. 매번 만들기 귀찮은데 누가 만들어 놓은 거 쓸 수 없나요?](#Chpater-11-매번-만들기-귀찮은데-누가-만들어-놓은-거-쓸-수-없나요)
- [Chapter 12. 모든 클래스의 부모 클래스는 Object에요](#Chapter-12-모든-클래스의-부모-클래스는-Object에요)

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

### Chapter 05. 계산을 하고 싶어요

1. 값을 할당할 때 사용하는 연산자의 기호는 무엇인가요?
    - `=`을 사용하며, 대입연산자라고 한다.


2. 기본적인 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지를 계산할 때 사용하는 연산자의 기호는 무엇인가요?
    - 덧셈은 `+`, 뺄셈은 `-`, 곱셈은 `*`, 나눗셈은 `/`, 나머지는 `%`를 사용한다.


3. +=는 무엇을 사용하는 연산자인가요?
    - 자신의 수에 우측 값을 더할 때 사용한다.
    - ex) `int x = x + 1` 과 `int x += 1` 이 같다.


4. 여러분들이 연산의 순서를 모르거나 확실히 하고 싶을 때에는 어떤 기호를 사용해야 하나요?
    - 괄호`()`를 사용하여 연산의 순서를 확실히 할 수 있다.

5. ==와 !=의 차이는 무엇인가요?
    - `==`는 양쪽이 같다, `!=`는 같지 않다는 뜻이다.


6. <와 <=의 차이는 무엇인가요?
    - `<`는 좌측보다 우측이 크다.
    - `<=`는 좌측이 우측보다 작거나 같다.


7. ! 연산자는 어떤 타입에 사용할 수 있나요?
    - boolean 타입에 사용할 수 있다.


8. ? : 로 표시하는 삼항연산자의 ?와 :뒤에 명시해주는 값은 무엇을 의미하나요?
    - (조건식) ? (True일 때의 값) : (False일 때의 값);


9. 자바는 형 변환을 한다고 했는데, short의 값을 long에 할당할 때에는 어떤 것을 해 주어야 하나요?
    - 식 앞에 `(short)` 를 써서 캐스팅해준다.


10. 반대로 long 값을 short에 할당할 때에는 어떤 것을 해 주어야 하나요?
    - 식 앞에 `(long)` 을 써서 캐스팅해준다.


11. 9와 10의 경우 중 어떤 경우가 기존 값이 사라지고, 엉뚱한 값으로 바뀔 수 있나요?
    - 10
    - 범위가 더 큰 타입으로 변환하면 아무런 문제가 없다.

### Chapter 06. 제가 조건을 좀 따져요

1. if 문장의 소괄호 안에는 어떤 형태의 결과가 제공되어야 하나요?
    - `boolean` 형태의 결과가 있어야 한다.


2. if 조건에 맞지 않는 모든 경우를 처리할 때 사용하는 예약어는 뭔가요?
    - `else` 예약어를 사용한다.


3. switch를 사용할 수 있는 기본 자료형의 타입에는 어떤 것들이 있나요?
    - long 을 제외한 정수형을 사용할 수 있다.


4. switch 블록 안에서 비교 대상값 앞에 사용하는 예약어는 무엇인가요?
    - `case` 예약어를 사용한다.


5. switch 조건을 빠져나가도록 하는 예약어는 무엇인가요?
    - `break` 예약어를 사용하여 switch 조건을 빠져나간다.


6. switch 조건들에 맞지 않을 때 기본 처리를 하기 위한 예약어는 무엇인가요?
    - `default` 예약어를 사용한다.


7. while 문의 소괄호 안에는 어떤 형태의 결과가 제공되어야 하나요?
    - `boolean` 조건이 들어가야 한다.


8. while 문을 무조건 한번은 실행하게 하려면 어떻게 해야 하나요?
    - 조건 값을 true 로 설정한다.


9. while 문을 마음대로 빠져나가게 하려면 어떤 예약어를 사용하면 되나요?
    - `break` 예약어를 사용한다.


10. while 문의 중간에 while 문의 소괄호 점검 구문으로 건너뛰도록 할 때 사용하는 예약어는 무엇인가요?
    - `continue` 예약어를 사용하여 점검 구문으로 건너뛰도록 한다.


11. for 루프의 소괄호 안의 가장 첫 구문(첫 세미 콜론 앞의 문장)은 for 루프가 수행되는 동안 몇 번 수행되나요?
    - 1번 수행되며, 변수를 초기화 시켜주는 역할을 한다.


12. for 루프의 소괄호 안의 중간에 있는 구문은 어떤 타입의 결과가 제공되어야 하나요?
    - `boolean` 타입의 결과가 제공되어야 한다.
    - true일 경우 for 루프 내의 반복 문장이 수행되고, 그렇지 않으면 for 루프는 종료된다.


13. for 루프의 소괄호 안의 마지막에 있는 구문에서는 어떤 작업을 수행하나요?
    - 조건 값을 증가시켜주며, 초기화에서 선언한 변수를 여기서 증가시킨다.

### Chapter 07. 여러 데이터를 하나에 넣을 수는 없을까요?

1. 배열을 선언할 때 어떤 키워드를 타입 앞이나 뒤에 사용해야 하나요?
    - `[]` 대괄호를 사용한다.


2. 배열의 첫번째 위치는 0인가요? 1인가요?
    - 배열의 위치는 0부터 시작한다.


3. 배열을 선언할 때 boolean 배열의 크기만 지정했다면 boolean 배열의 [0] 위치에 있는 값은 무엇인가요?
    - `false`


4. ArrayIndexOutOfBoundsException이라는 것은 언제 발생하나요?
    - 배열의 갯수보다 큰 수를 불러올 때 발생한다.


5. 중괄호를 이용하여 배열을 초기화할 때 중괄호 끝에 반드시 어떤 것을 입력해 주어야 하나요?
    - 세미콜론 `;`을 입력해야 한다.


6. 2차원 배열을 정의할 때에는 대괄호를 몇 개 지정해야 하나요?
    - 2개 지정해야 한다.
    - ex. `int[][] twoDim;`


7. 배열을 쉽게 처리해주는 for문의 문법은 어떻게 되나요?
    - `for(변수타입 변수명 : 배열)`


8. 자바 프로그램에 데이터를 전달해 주려면 클래스 이름 뒤에 어떻게 구분하여 나열하면 되나요?
    - 공백으로 구분하여 나열하면 된다.
    - ex. `java Program a b c d`


9. 자바 프로그램이 시작할 때 전달 받는 내용은 어떤 타입의 배열인가요?
    - String 타입의 배열

### Chapter 08. 참조 자료형에 대해서 더 자세히 알아봅시다

1. 생성자는 반드시 만들어야 하나요?
    - 필수는 아니다.


2. 만약 매개 변수가 있는 생성자를 만들고, 매개 변수가 없는 기본 생성자를 호출하면 어떻게 될까요?
    - 오류가 발생한다.
    - 매개 변수가 없는 기본 생성자를 호출하려면, 매개 변수가 없는 기본 생성자를 생성해야 한다.


3. 생성자의 개수는 제한이 있나요?
    - 개수의 제한은 따로 없다.


4. 인스턴스의 변수와 매개 변수나 메소드 내에서 생성한 변수와 구분하기 위해서 사용하는 키워드는 무엇인가요?
    - `this` 예약어


5. 메소드 선언시 리턴 타입으로 지정한 데이터를 넘겨줄 때 필요한 키워드는 무엇인가요?
    - `return` 예약어


6. 메소드 선언시 아무 데이터도 리턴 타입으로 넘겨주지 않겠다는 것을 지정하는 키워드는 무엇인가요?
    - `void`


7. 메소드 선언에 static이 있는 것과 없는 것의 차이는 무엇인가요?
    - static 이 있으면 클래스 내에서 인스턴스 생성을 하지 않아도 메소드를 호출할 수 있다.


8. 필자가 엄청나게 중요하다고 한 것 중 메소드의 이름은 같으나 매개 변수를 다르게 하는 것의 명칭은 무엇인가요?
    - 오버로딩(overloading)


9. 기본 자료형을 매개 변수로 넘겨 줄 때 Pass by value 인가요? 아니면 Pass by reference 인가요?
    - Pass by value


10. 참조 자료형을 매개 변수로 넘겨 줄 때 Pass by value 인가요? 아니면 Pass by reference 인가요?
    - Pass by reference


11. 매개 변수의 수가 가변적일 때 메소드 선언시 타입과 변수 이름 사이에 어떤 것을 적어줘야 하나요?
    - `...` (점 사이에 공백이 있으면 안된다.)

### Chapter 09. 자바를 배우면 패키지와 접근 제어자는 꼭 알아야 해요

1. 패키지를 선언할 때 사용하는 예약어는 무엇인가요?
    - `import` 예약어


2. 패키지 선언은 클래스 소스 중 어디에 위치해야 하나요?
    - 맨 위(가장 첫 줄)에 위치해야 한다.


3. 패키지를 선언할 때 가장 상위 패키지의 이름으로 절대 사용하면 안 되는 단어는 무엇인가요?
    - `java`


4. 패키지 이름에 예약어가 포함되어도 되나요?
    - 안된다.


5. import 는 클래스 내에 선언해도 되나요?
    - 패키지 선언부 아래에, 클래스 선언부 위에 선언 한다.


6. 같은 패키지에 있는 클래스를 사용할 때 import를 해야 하나요?
    - java.lang 패키지이거나 같은 패키지의 경우 import 하지 않아도 된다.


7. 특정 패키지에 있는 클래스들을 모두 import 할 때 사용하는 기호는 무엇인가요?
    - `*`


8. 클래스에 선언되어 있는 static 한 메소드나 변수를 import하려면 어떻게 선언해야 하나요?
    - `import` 예약어 혹은 `import statc` 을 사용하여 선언한다.


9. 접근 제어자 중 가장 접근 권한이 넓은 (어떤 클래스에서도 접근할 수 있는) 것은 무엇인가요?
    - `public` 접근 제어자


10. 접근 제어자 중 가장 접근 권한이 좁은 (다른 클래스에서는 접근할 수 없는) 것은 무엇인가요?
    - `private` 접근 제어자


11. 접근 제어자 중 같은 패키지와 상속관계에 있는 클래스만 접근할 수 있도록 제한하는 것은 무엇인가요?
    - `protected` 접근 제어자


12. "Calculator.java 라는 자바 소스가 있을 경우, 그 소스 내에는 Calculator라는 클래스 외에는 (   )으로 선언된 클래스가 있으면 안 된다."   
    여기서 괄호 안에 들어가야 하는 것은 무엇인가요?
    - `public`

### Chpater 10. 자바는 상속이라는 것이 있어요

1. 상속을 받는 클래스의 선언문에 사용하는 키워드는 무엇인가요?
    - `extends`


2. 상속을 받은 클래스의 생성자를 수행하면 부모의 생성자도 자동으로 수행되나요?
    - 부모의 생성자가 있을 경우 수행된다.


3. 부모 클래스의 생성자를 자식 클래스에서 직접 선택하려고 할 때 사용하는 예약어는 무엇인가요?


4. 메소드 Overriding과 Overloading을 정확하게 설명해보세요.
    - Overriding 은 부모 클래스의 메소드 시그니처를 복제해서 자식 클래스에서 새로운 것을 만들어 내어 부모 클래스의 기능은 무시하고, 자식 클래스에서 덮어 쓰는 것. (복제)
    - Overloading 은 동일한 메소드에 매개 변수를 다르게 해서 만드는 것. (확장)


5. A가 부모, B가 자식 클래스라면 `A a = new B();의 형태로 객체 생성이 가능한가요?
    - 가능하다.


6. 명시적으로 형 변환을 하기 전에 타입을 확인하려면 어떤 예약어를 사용해야 하나요?
    - `instanceof` 예약어


7. 6에서 사용한 예약어의 좌측에는 어떤 값이, 우측에는 어떤 값이 들어가나요?
    - `instanceof`의 앞에는 객체를, 뒤에는 클래스(타입)를 지정해주면 된다.


8. 6의 예약어의 수행 결과는 어떤 타입으로 제공되나요?
    - boolean 타입


9. Polymorphism이라는 것은 도대체 뭔가요?
    - 다형성

### Chpater 11. 매번 만들기 귀찮은데 누가 만들어 놓은 거 쓸 수 없나요?

1. API 문서를 자동으로 생성하는 명령어를 무엇이라고 했나요?
    - `javadoc`


2. API 왼쪽 상단에는 어떤 내용이 제공되나요?
    - 패키지 목록 창 (모든 패키지의 링크 목록)


3. API 왼쪽 하단에는 어떤 내용이 제공되나요?
    - 클래스 목록 창(윗창에서 선택한 패키지의 클래스 링크 목록)


4. API 우측 화면에는 보통 어떤 내용이 제공되나요?
    - 상세 설명 창(선택한 패키지나 선택한 클래스에 대한 설명)


5. Deprecated라는 것의 의미는 무엇인가요?
    - 더 이상 사용하지 않는다는 의미이다.

### 12. 모든 클래스의 부모 클래스는 Object에요

1. 모든 클래스의 최상위 부모 클래스인 Object 클래스는 어떤 패키지에 선언되어 있나요?
   - java.lang 패키지에 선언되어 있다.


2. 클래스가 어떻게 선언되어 있는지 확인할 수 있는 명령어(실행 파일)의 이름은 무엇인가요?
   - javap 명령


3. Object 클래스에 선언되어 있는 모든 메소드는 여러분들이 Overriding 해야 하나요?
   - 아니요. 필요한 메소드만 Overriding 하여 사용하면 된다.


4. Object 클래스의 clone() 메소드의 용도는 무엇인가요?
   - 객체의 복사본을 만들어 리턴한다.


5. System.out.println() 메소드를 사용하여 클래스를 출력했을 때 호출되는 Object 클래스에 있는 메소드는 무엇인가요?
   - toString() 메소드가 호출된 결과가 제공된다.


6. 객체의 주소를 비교하는 것이 아닌, 값을 비교하려면 Object 클래스에 선언되어 있는 어떤 메소드를 overriding 해야 하나요?
   - 참조 자료형의 비교는 equals() 메소드를 사용해야 확실히 비교가 가능하다.
   - 만약 직접 구현한 클래스의 비교를 정확하게 하려면, 이 equals() 메소드를 Overriding 하는 것이 좋다.


7. Object 클래스에 선언되어 있는 hashCode() 라는 메소드는 어떤 타입의 값을 리턴하나요?
   - hashCode() 메소드는 객체의 메모리 주소를 16진수로 리턴한다.
   - int 값을 리턴한다.

