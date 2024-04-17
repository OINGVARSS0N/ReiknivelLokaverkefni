@echo off
mvn package
mkdir target\dependency
mvn dependency:copy-dependencies -DoutputDirectory=target/dependency