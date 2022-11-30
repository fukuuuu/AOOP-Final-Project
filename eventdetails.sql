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
-- Database: `events`
--

-- --------------------------------------------------------

--
-- Table structure for table `eventdetails`
--

CREATE TABLE `eventdetails` (
  `event` varchar(500) NOT NULL,
  `leader` varchar(400) NOT NULL,
  `location` varchar(500) NOT NULL,
  `date` varchar(500) NOT NULL,
  `time` varchar(200) DEFAULT NULL,
  `description` varchar(300) DEFAULT NULL,
  `participant` varchar(200) DEFAULT NULL,
  `members` varchar(500) DEFAULT NULL,
  `fullTime` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `eventdetails`
--

INSERT INTO `eventdetails` (`event`, `leader`, `location`, `date`, `time`, `description`, `participant`, `members`, `fullTime`) VALUES
('test', 'Phatthara', 'test', 'November 30, 2023', '17:35', 'test', 'test', 'Phatthara', 'November 30, 2023 17:35'),
('test1', 'admin', 'test1', 'December 5, 2022', '12:00', 'test1', 'test1', 'admin', 'December 5, 2022 12:00'),
('game', 'gg', 'gg\'s place', 'December 10, 2022', '13:30', 'lets play games', '10', 'gg', 'December 10, 2022 13:30');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
