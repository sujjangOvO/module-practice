module student.model { // 모듈의 파일 이름은 반드시 module-info, 확장자명은 java && root directory 에 위치
    exports student.model; // 다른 모듈이 module의 이름인 student.mode(1번째 줄)을 사용하면(requires)
    // exports한 패키지 모든 public 타입에 접근할 수 있다, 다른 패키지엔 접근 불가
}