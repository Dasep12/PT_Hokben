-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 09, 2021 at 01:35 PM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 7.4.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hokben`
--

-- --------------------------------------------------------

--
-- Table structure for table `akun`
--

CREATE TABLE `akun` (
  `Id` int(10) NOT NULL,
  `nama` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `akun`
--

INSERT INTO `akun` (`Id`, `nama`, `password`) VALUES
(2, 'admin', '123');

-- --------------------------------------------------------

--
-- Table structure for table `form_biayakirim`
--

CREATE TABLE `form_biayakirim` (
  `idbiaya` int(11) NOT NULL,
  `jarak` varchar(30) NOT NULL,
  `biaya` varchar(30) NOT NULL,
  `keterangan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `form_biayakirim`
--

INSERT INTO `form_biayakirim` (`idbiaya`, `jarak`, `biaya`, `keterangan`) VALUES
(7, '5 KM', '5000', 'Jakarta'),
(8, '10 KM', '10000', 'Jakarta'),
(9, '15 KM', '15000', 'Jakarta'),
(10, '20 KM', '20000', 'Jakarta');

-- --------------------------------------------------------

--
-- Table structure for table `form_daftar_pemesan`
--

CREATE TABLE `form_daftar_pemesan` (
  `id_pendaftaran` varchar(30) NOT NULL,
  `nama_pemesan` varchar(30) NOT NULL,
  `telp_pemesan` varchar(30) NOT NULL,
  `nama_custemer` varchar(30) NOT NULL,
  `alamt_custemer` varchar(30) NOT NULL,
  `telp_custemer` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `form_register`
--

CREATE TABLE `form_register` (
  `nama` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `nomer_hp` int(20) NOT NULL,
  `email` varchar(20) NOT NULL,
  `ket` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `form_transaksi`
--

CREATE TABLE `form_transaksi` (
  `id_pesanan` varchar(20) NOT NULL,
  `nama_penerima` varchar(20) NOT NULL,
  `nohp` char(15) DEFAULT NULL,
  `alamat` varchar(255) NOT NULL,
  `nama_makanan` varchar(30) NOT NULL,
  `nama_pengantar` varchar(30) DEFAULT NULL,
  `merk_kendaraan` varchar(30) DEFAULT NULL,
  `status` varchar(20) NOT NULL,
  `tanggal` date DEFAULT NULL,
  `hrgmakanan` int(11) DEFAULT NULL,
  `jarak` char(10) DEFAULT NULL,
  `biayakirim` int(11) DEFAULT NULL,
  `qty` int(3) DEFAULT NULL,
  `total` int(11) DEFAULT NULL,
  `tanggal_kirim` datetime DEFAULT NULL,
  `tanggal_sampai` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `form_transaksi`
--

INSERT INTO `form_transaksi` (`id_pesanan`, `nama_penerima`, `nohp`, `alamat`, `nama_makanan`, `nama_pengantar`, `merk_kendaraan`, `status`, `tanggal`, `hrgmakanan`, `jarak`, `biayakirim`, `qty`, `total`, `tanggal_kirim`, `tanggal_sampai`) VALUES
('F0001', 'Dasep', NULL, 'Jl Lodan Dalam II C', 'Burger Chikend ind', 'Dasep Depiyawan', 'Vario 125 cc ', 'Sudah Sampai', '2021-10-09', 150000, '15 KM', 15000, 5, 765000, '2021-10-09 16:40:17', '2021-10-09 16:41:31'),
('F0002', 'Febri', NULL, 'Lodan', 'Burger Chikend ind', 'Andi Gunawan', 'Jupiter MX 120 cc', 'Sudah Sampai', '2021-10-09', 150000, '10 KM', 10000, 5, 760000, '2021-10-09 17:12:06', '2021-10-09 17:30:53');

-- --------------------------------------------------------

--
-- Table structure for table `form_utilitas`
--

CREATE TABLE `form_utilitas` (
  `id` int(11) NOT NULL,
  `merk_kendaraan` varchar(30) NOT NULL,
  `bahan_bakar` varchar(11) NOT NULL,
  `biaya_operasional` varchar(11) NOT NULL,
  `tanggal` date DEFAULT NULL,
  `keterangan` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `form_utilitas`
--

INSERT INTO `form_utilitas` (`id`, `merk_kendaraan`, `bahan_bakar`, `biaya_operasional`, `tanggal`, `keterangan`) VALUES
(1, 'Jupiter MX 120 cc', 'Diesel', '12000', '2021-10-09', 'Jauh'),
(2, 'Vario 125 cc ', 'Diesel', '60000', '2021-10-09', 'Tracking Jauh');

-- --------------------------------------------------------

--
-- Table structure for table `master_kendaraan`
--

CREATE TABLE `master_kendaraan` (
  `kode_kendaraan` varchar(30) NOT NULL,
  `merk_kendaraan` varchar(30) NOT NULL,
  `jenis_kendaraan` varchar(30) NOT NULL,
  `no_polisi` varchar(30) NOT NULL,
  `masa_kendaraan` varchar(30) NOT NULL,
  `kondisi_kendaraan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `master_kendaraan`
--

INSERT INTO `master_kendaraan` (`kode_kendaraan`, `merk_kendaraan`, `jenis_kendaraan`, `no_polisi`, `masa_kendaraan`, `kondisi_kendaraan`) VALUES
('JKT-01', 'Jupiter MX 120 cc', 'Bebek ', 'B 5012 MK', '5 tahun', 'Baik  '),
('JKT-02', 'Jupiter MX 120 cc', 'Bebek', 'B 5023 MH', '5 tahun', 'Baik   '),
('JKT-03', 'Vario 125 cc ', 'Bebek Matic', 'B 5044 MI', '5 Tahun', 'Baik');

-- --------------------------------------------------------

--
-- Table structure for table `master_makanan`
--

CREATE TABLE `master_makanan` (
  `id_makanan` varchar(10) NOT NULL,
  `nama_makanan` varchar(20) NOT NULL,
  `jenis_makanan` varchar(20) NOT NULL,
  `harga_makanan` varchar(20) NOT NULL,
  `masa_makanan` varchar(20) NOT NULL,
  `kandungan_makanan` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `master_makanan`
--

INSERT INTO `master_makanan` (`id_makanan`, `nama_makanan`, `jenis_makanan`, `harga_makanan`, `masa_makanan`, `kandungan_makanan`) VALUES
('BO54', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO55', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO56', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO57', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO58', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO59', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO60', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO61', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO62', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO63', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO64', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO65', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO66', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO67', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO68', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO69', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO70', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO71', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO72', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO73', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO74', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO75', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO76', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO77', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO78', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO79', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO80', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO81', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO82', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO83', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO84', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO85', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO86', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO87', 'Burger Chikend ind', 'Berat', '150000', '3 hari', ''),
('BO88', 'Burger Chikend ind', 'Berat', '150000', '3 hari', '');

-- --------------------------------------------------------

--
-- Table structure for table `master_pengantar`
--

CREATE TABLE `master_pengantar` (
  `idpengantar` int(11) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `area` varchar(30) NOT NULL,
  `no_telpon` varchar(30) NOT NULL,
  `umur` varchar(30) NOT NULL,
  `tgl_lahir` varchar(30) NOT NULL,
  `alamat` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `master_pengantar`
--

INSERT INTO `master_pengantar` (`idpengantar`, `nama`, `area`, `no_telpon`, `umur`, `tgl_lahir`, `alamat`) VALUES
(8, 'Dasep Depiyawan', 'Bandung', '083821909090', '20', '1999-04-13', 'Jl Lodan Dalam II C '),
(9, 'Andi Gunawan', 'Lampung', '0899121212812', '24', '1970-11-01', 'Lampung kalianda ');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `iduser` varchar(90) NOT NULL,
  `nama` varchar(60) DEFAULT NULL,
  `bagian` varchar(60) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `nohp` char(14) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `cabang` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`iduser`, `nama`, `bagian`, `password`, `nohp`, `email`, `cabang`) VALUES
('U0001', 'Admin', 'Admin', '123', '083821909090', 'dasep@gmail.com', 'Bandung'),
('U0002', 'Kasir', 'Kasir', '123', '0898898989', 'andi@rizer.com', 'Lampung'),
('U0004', 'Dasep', 'user', '123', '08669', 'dasep@gmail.com', NULL),
('U0005', 'febri', 'user', '123', '085888779385', 'febriit17@gmail.com', NULL),
('U0006', 'Febri', 'user', '123', '083821', 'febri@gmail.com', NULL),
('U0007', 'dicki', 'user', '123', '213464', 'rthrth', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `akun`
--
ALTER TABLE `akun`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `form_biayakirim`
--
ALTER TABLE `form_biayakirim`
  ADD PRIMARY KEY (`idbiaya`);

--
-- Indexes for table `form_daftar_pemesan`
--
ALTER TABLE `form_daftar_pemesan`
  ADD PRIMARY KEY (`id_pendaftaran`);

--
-- Indexes for table `form_transaksi`
--
ALTER TABLE `form_transaksi`
  ADD PRIMARY KEY (`id_pesanan`);

--
-- Indexes for table `form_utilitas`
--
ALTER TABLE `form_utilitas`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `master_kendaraan`
--
ALTER TABLE `master_kendaraan`
  ADD PRIMARY KEY (`kode_kendaraan`);

--
-- Indexes for table `master_makanan`
--
ALTER TABLE `master_makanan`
  ADD PRIMARY KEY (`id_makanan`);

--
-- Indexes for table `master_pengantar`
--
ALTER TABLE `master_pengantar`
  ADD PRIMARY KEY (`idpengantar`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`iduser`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `akun`
--
ALTER TABLE `akun`
  MODIFY `Id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `form_biayakirim`
--
ALTER TABLE `form_biayakirim`
  MODIFY `idbiaya` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `form_utilitas`
--
ALTER TABLE `form_utilitas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `master_pengantar`
--
ALTER TABLE `master_pengantar`
  MODIFY `idpengantar` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
