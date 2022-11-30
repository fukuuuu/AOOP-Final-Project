-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 29, 2022 at 03:37 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `userdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `userinfo`
--

CREATE TABLE `userinfo` (
  `Fname` varchar(40) NOT NULL,
  `Lname` varchar(40) NOT NULL,
  `user` varchar(40) NOT NULL,
  `password` varchar(40) NOT NULL,
  `Country` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `userinfo`
--

INSERT INTO `userinfo` (`Fname`, `Lname`, `user`, `password`, `Country`) VALUES
('admin', 'admin', 'admin', 'admin', 'admin'),
('test', 'test', 'test', 'test', 'Thailand'),
('p', 'p', 'p', 'p', 'Singapore'),
('gg', 'gg', 'gg', 'gg', 'Vietnam'),
('fuku', 'Folk', 'fukuuu', '0897002113', 'Thailand'),
('Phatthara', 'Srilachot', 'saladfan', 'Folk90959095', 'Nigeria'),
('Phatthara', 'Srilachot', 'fuku', 'Folk0897002113', 'Nigeria');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
