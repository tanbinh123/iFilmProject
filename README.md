# Project iFilm
### Tổng quan
Ứng dụng iFilm cho phép người dùng xem thông tin, lịch chiếu, đặt vé online những phim đang/sắp ra rạp thuộc hệ thống iFilm. Đồng thời cho phép admin xem doanh thu của rạp, từ đó đưa ra những chiến lược vận hành tối ưu hơn
### Role
1. **Khách hàng**
2. **Admin**
### Đối tượng
1. **Khách hàng**: thông tin cá nhân, tài khoản, số dư, đối tượng (trẻ em, người lớn => giá vé khác nhau)
2. **Phim**: ảnh minh họa, tên, đánh giá (dự kiến), thông tin cơ bản (thể loại, thời lượng), mô tả ngắn
3. **Rạp chiếu**: địa chỉ 
   - **Phòng chiếu**: tên phòng, sơ đồ phòng
      - **Sơ đồ phòng**: số hàng, số ghế/hàng
4. **Ghế**: code, loại ghế (VIP, thường), giá, trạng thái (trống/không trống)
5. **Vé**: Tên phim, tên rạp, khung giờ chiếu, phòng chiếu, ghế
6. **Hóa đơn**: Thời gian/địa chỉ (là địa chỉ rạp) xuất hóa đơn, thông tin khách hàng, thông tin các sản phẩm (vé, bỏng nước đi kèm)
7. **Combo đi kèm**: tên combo, giá, ảnh minh họa, trạng thái (còn, hết)
### Chức năng chính
1. **Tất cả**: Xem thông tin các phim đang có trên hệ thống, tình trạng đặt chỗ (phòng cụ thể)
2. **Khách**:
   - **Tạo tài khoản**:
      - Khách hàng cần có tài khoản để đặt vé
      - Với project này, admin sẽ là tài khoản có sẵn 
      - Thành công: username và email chưa tồn tại trong hệ thống, nhập password 2 lần giống nhau
   - **Đặt vé + combo bỏng nước**:
      - Thành công: tích điểm, thay đổi trạng thái ghế, thêm vé vào kho vé của khách
      - Thất bại: Số dư không đủ, trễ 30 phút so với giờ chiếu
   - **Nạp tiền vào tài khoản**
   - **Huỷ vé**: 
      - Thành công: Hoàn tiền vào tài khoản khách, thay đổi trạng thái ghế
      - Thất bại: thời gian hủy vé trong khoảng 1 tiếng trước giờ chiếu
3. **Admin**
   - **Thêm phim mới**:
   - **Theo dõi doanh thu**: lựa chọn khung thời gian
