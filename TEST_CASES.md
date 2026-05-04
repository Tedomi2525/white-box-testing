# Danh sách test case

| STT | Chức năng | Input | Kết quả mong đợi | Kết quả thực tế |
|---|---|---|---|---|
| 1 | Chu vi HCN | dai=5, rong=3 | 16 | Pass |
| 2 | Chu vi HCN | dai=0, rong=3 | Ném IllegalArgumentException | Pass |
| 3 | Diện tích HCN | dai=5, rong=3 | 15 | Pass |
| 4 | Diện tích HCN | dai=-1, rong=3 | Ném IllegalArgumentException | Pass |
| 5 | PT bậc 2 | a=1,b=-3,c=2 | 2 nghiệm 2 và 1 | Pass |
| 6 | PT bậc 2 | a=1,b=2,c=1 | Nghiệm kép -1 | Pass |
| 7 | PT bậc 2 | a=1,b=1,c=1 | Vô nghiệm thực | Pass |
| 8 | PT bậc nhất | a=0,b=2,c=-4 | x = 2 | Pass |
| 9 | PT vô nghiệm | a=0,b=0,c=5 | Vô nghiệm | Pass |
| 10 | PT vô số nghiệm | a=0,b=0,c=0 | Vô số nghiệm | Pass |
| 11 | Số ngày tháng | tháng 2 năm 2024 | 29 | Pass |
| 12 | Số ngày tháng | tháng 2 năm 2023 | 28 | Pass |
| 13 | Số ngày tháng | tháng 4 | 30 | Pass |
| 14 | Số ngày tháng | tháng 1 | 31 | Pass |
| 15 | Số ngày tháng | tháng 13 | Ném IllegalArgumentException | Pass |
| 16 | Kiểm tra số nguyên tố | n=7 | true | Pass |
| 17 | Kiểm tra số nguyên tố | n=8 | false | Pass |
| 18 | Kiểm tra số nguyên tố | n=1 | false | Pass |
| 19 | Tổng xen kẽ | n=5 | 3 | Pass |
| 20 | Tổng xen kẽ | n=0 | 0 | Pass |
| 21 | Tổng xen kẽ | n=-1 | Ném IllegalArgumentException | Pass |
| 22 | UCLN | a=12,b=18 | 6 | Pass |
| 23 | UCLN | a=0,b=5 | 5 | Pass |
| 24 | UCLN | a=0,b=0 | Ném IllegalArgumentException | Pass |
| 25 | Tổng giai thừa | n=3 | 9 | Pass |
| 26 | Tổng giai thừa | n=0 | 0 | Pass |
| 27 | Tổng giai thừa | n=-1 | Ném IllegalArgumentException | Pass |
