#spring_thymeleaf_tutorial
### 1. About Thymeleaf
1. Thymeleaf là gì
    - Thymeleaf là một Java Template Engine phía Server. Có nhiệm vụ xử lý và generate các file HTML, XML, XHTML, …
2. Cách hoạt động
   - Các file HTML do Thymeleaf tạo ra là nhờ kết hợp dữ liệu và template + quy tắc để sinh ra một file HTML chứa đầy đủ thông tin
3. Ưu và nhược điểm
    - Ưu điểm (so với các java template khác như jsp, isf, ..) :
        + Tích hợp mạnh mẽ với spring framework (đặc biệt là springboot)
        +  Gần gủi với HTML: view của ứng dụng chỉ là các file HTML, Thymeleaf sẽ tham gia vào file HTML dưới dạng các thuộc tính của các thẻ HTML.
           (Không cần phải thêm bất xử loại thẻ non-HTML nào cả, chỉ cần sử dụng thuộc tính “th:*” trong các thẻ HTML)
           (Ví dụ: JSP muốn sử dụng các thẻ chuẩn của jsp như JSTL thì cần có taglib)
        +  Có cơ chế live reload (config disable cache)
    - Nhược điểm:
        + Không có hỗ trợ thư viện JSP
        + Chưa có thẻ tương đương với các thẻ custom
4. Tutorial
    - https://www.thymeleaf.org/doc/tutorials/2.1/usingthymeleaf.html
### 2. Testing
http://localhost:2000/index
http://localhost:2000/
