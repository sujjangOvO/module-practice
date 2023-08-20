module student.db {
    requires transitive student.service; // student.service 에 의존
    requires java.logging;
    exports student.service.dbimpl;
}