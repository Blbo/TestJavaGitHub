SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Base de données :  `bank_of_iut`
--

-- --------------------------------------------------------

--
-- Table `client`
--

CREATE TABLE `client` (
  `numero_client` varchar(50) NOT NULL,
  `adresse` varchar(255),
  `nom` varchar(255)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

ALTER TABLE `client`
  ADD PRIMARY KEY (`numero_client`);

-- --------------------------------------------------------

--
-- Table `compte`
--

CREATE TABLE `compte` (
  `numero_compte` varchar(50) NOT NULL,
  `solde` double,
  `numero_client` varchar(50)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

ALTER TABLE `compte`
  ADD PRIMARY KEY (`numero_compte`),
  ADD KEY `numero_client` (`numero_client`);

ALTER TABLE `compte`
  ADD CONSTRAINT `compte_ibfk_1` FOREIGN KEY (`numero_client`) REFERENCES `client` (`numero_client`);

