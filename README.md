<<<<<<< HEAD
# Java Basic Project

## Mô tả

Repo này gồm 8 chương trình Java cơ bản:

1. Tính chu vi hình chữ nhật
2. Tính diện tích hình chữ nhật
3. Giải phương trình bậc 2
4. Tính số ngày của một tháng
5. Kiểm tra n có phải số nguyên tố hay không
6. Tính tổng S = 1 - 2 + 3 - 4 + ... + n
7. Tìm UCLN của a và b
8. Tính tổng S = 1! + 2! + 3! + ... + n!

## Công nghệ sử dụng

- Java 17
- Maven
- JUnit 5
- JaCoCo để đo statement coverage và branch coverage

## Cách chạy chương trình

```bash
mvn test
```

## Xem báo cáo coverage

Sau khi chạy:

```bash
mvn test
```

Mở file:

```text
target/site/jacoco/index.html
```

## Mục tiêu kiểm thử

- 100% statement coverage
- 100% branch coverage

## Cấu trúc thư mục

```text
src/main/java/com/example/
src/test/java/com/example/
```

## GitHub Issues cần tạo

### Issue 1: Viết test JUnit kiểm thử hộp trắng cho các luồng xử lý hợp lệ

Nội dung:
- Kiểm thử các input hợp lệ.
- Bao phủ các câu lệnh chính.
- Bao phủ các đường đi logic thông thường.

### Issue 2: Viết test JUnit kiểm thử hộp trắng cho các nhánh lỗi, điều kiện biên, vòng lặp và ngoại lệ

Nội dung:
- Kiểm thử dữ liệu không hợp lệ.
- Kiểm thử điều kiện biên.
- Kiểm thử các nhánh lỗi.
- Kiểm thử vòng lặp không chạy, chạy một lần và chạy nhiều lần.
=======
# white-box-testing
>>>>>>> 9d9d8216680538ce70529d3106645fc6bfc236a6
