module student.service {
    requires transitive student.model; // student.model 에 의존, transitive 는 종속성 전이
                                    // => service 모듈을 외부에서 추가한다면 requires student.model을 추가하지 않아도 접근이 가능하다
    exports student.service; // student.service 에 정의된 public 타입 유형을 다른 모듈에서 사용할 수 있도록 함
}