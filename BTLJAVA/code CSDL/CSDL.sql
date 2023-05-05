Create database thuvienjava1
use thuvienjava1
create table docgia(
ID_DocGia int identity(1,1),
TenNguoiDung varchar(50),
NgaySinh varchar(50),
NgheNghiep varchar(50),
SDT varchar(50),
DiaChi varchar(50)
Primary key(ID_DocGia)
);
create table TaiKhoan(  
TaiKhoan varchar(50),
MatKhau varchar(50),
ID_DocGia int,
primary key(TaiKhoan),
foreign key(ID_DocGia) references docgia(ID_DocGia) ON DELETE CASCADE ON UPDATE CASCADE,
);
create table Sach(
MaSach int identity(1,1),
TenSach varchar(50),
TheLoai varchar(50),
TacGia varchar(50),
NamXB int,
ThoiGianThem varchar(50),
SoLuong int,
primary key (MaSach),
);
create table PhieuMuon(
MaMuon int identity(1,1),
NgayMuon varchar(50),
NgayTra varchar(50),
TrangThai varchar(50),
ID_DocGia int,
MaSach int,
primary key (MaMuon),
foreign key(ID_DocGia) references docgia(ID_DocGia) ON DELETE CASCADE ON UPDATE CASCADE,
foreign key(MaSach) references Sach(MaSach) ON DELETE CASCADE ON UPDATE CASCADE,
);