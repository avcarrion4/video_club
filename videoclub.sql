-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-04-2019 a las 20:34:56
-- Versión del servidor: 10.1.21-MariaDB
-- Versión de PHP: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `videoclub`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detareg`
--

CREATE TABLE `detareg` (
  `idPrestamo` int(2) NOT NULL,
  `idVideo` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detareg`
--

INSERT INTO `detareg` (`idPrestamo`, `idVideo`) VALUES
(2, 1),
(5, 1),
(6, 2),
(10, 1),
(2, 1),
(5, 1),
(6, 2),
(10, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lock`
--

CREATE TABLE `lock` (
  `id_lock` int(10) NOT NULL,
  `nombre_usuario` varchar(50) NOT NULL,
  `entrada` varchar(50) NOT NULL,
  `salida` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `membresia`
--

CREATE TABLE `membresia` (
  `idMembresia` int(2) NOT NULL,
  `tipo` varchar(10) NOT NULL,
  `descuento` int(2) NOT NULL,
  `fechaInicio` date NOT NULL,
  `fechaFin` date NOT NULL,
  `estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `membresia`
--

INSERT INTO `membresia` (`idMembresia`, `tipo`, `descuento`, `fechaInicio`, `fechaFin`, `estado`) VALUES
(1, 'GOLD', 2, '2015-07-25', '2016-07-25', 1),
(2, 'NORMAL', 1, '2016-07-26', '2017-07-26', 1),
(3, 'GOLD', 2, '2016-07-27', '2017-07-27', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personas`
--

CREATE TABLE `personas` (
  `idPersona` int(2) NOT NULL,
  `cedula` int(10) NOT NULL,
  `nombres` varchar(50) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `usuario` varchar(10) DEFAULT NULL,
  `clave` varchar(5) DEFAULT NULL,
  `rol` int(1) NOT NULL,
  `codigo` varchar(50) NOT NULL,
  `idMembresia` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `personas`
--

INSERT INTO `personas` (`idPersona`, `cedula`, `nombres`, `direccion`, `correo`, `usuario`, `clave`, `rol`, `codigo`, `idMembresia`) VALUES
(1, 1104659386, 'Andres Carrion', 'Loja', 'andres_1990_@hotmail.es', 'andy', '1990', 0, 'A:001', 0),
(2, 1104659387, 'Vinicio Malla', 'Polonia y Paraguay', 'slif.andy@gmail.com', 'vini', '1290', 1, 'V:002', 0),
(3, 1104659388, 'Juan Perez', '10 de Agosto', 'jperez@gmail.com', 'juan', '1010', 2, 'C:004', 1),
(4, 1104659390, 'Pablo Castro', 'Azuay', 'pcastro@gmail.com', 'pablo', '9999', 2, 'C:008', 2),
(5, 1105102542, 'Rocío', 'Pedestal', 'chio@gmail.com', 'chio', 'lke2', 2, 'C:0012', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registro`
--

CREATE TABLE `registro` (
  `idPrestamo` int(2) NOT NULL,
  `fregistro` date NOT NULL,
  `fdevolucion` date DEFAULT NULL,
  `idCliente` int(2) NOT NULL,
  `dias` int(1) NOT NULL,
  `tipo` int(1) NOT NULL,
  `estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `registro`
--

INSERT INTO `registro` (`idPrestamo`, `fregistro`, `fdevolucion`, `idCliente`, `dias`, `tipo`, `estado`) VALUES
(2, '2016-07-26', '2016-07-26', 3, 0, 0, 0),
(3, '2016-07-22', '2016-07-24', 3, 2, 1, 0),
(4, '2016-07-26', '2016-07-28', 4, 2, 1, 0),
(5, '2016-07-26', '2016-07-26', 3, 0, 0, 0),
(6, '2016-07-26', '2016-07-26', 3, 0, 0, 0),
(7, '2016-07-26', '2016-07-28', 3, 2, 1, 0),
(8, '2016-07-26', '2016-07-28', 4, 2, 1, 0),
(9, '2016-07-27', '2016-07-29', 5, 2, 1, 0),
(10, '2016-07-27', '2016-07-29', 5, 2, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `roles`
--

CREATE TABLE `roles` (
  `idroles` int(11) NOT NULL,
  `rolescol` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `roles`
--

INSERT INTO `roles` (`idroles`, `rolescol`) VALUES
(0, 'ADMINISTRADOR'),
(1, 'VENDEDOR'),
(2, 'CLIENTE');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `videos`
--

CREATE TABLE `videos` (
  `idVideo` int(2) NOT NULL,
  `titulo` varchar(50) NOT NULL,
  `director` varchar(50) NOT NULL,
  `genero` varchar(50) NOT NULL,
  `actor` varchar(50) NOT NULL,
  `anio` int(4) NOT NULL,
  `renta` int(2) NOT NULL,
  `venta` int(2) NOT NULL,
  `cantidad` int(2) NOT NULL,
  `resenia` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `videos`
--

INSERT INTO `videos` (`idVideo`, `titulo`, `director`, `genero`, `actor`, `anio`, `renta`, `venta`, `cantidad`, `resenia`) VALUES
(1, 'Rambo', 'Director A', 'ACCION', 'Actor A', 1995, 5, 8, 4, 'Galardonada.\nPelicula de accion \nbasada en tiempos de guerra\n'),
(2, 'Rambo 2', 'Director B', 'ACCION', 'Actor B', 1994, 5, 10, 9, 'Pelicula de accion basada en tiempos de guerra segunda parte.\nMejores graficas'),
(3, 'Ted', 'Director C', 'ACCION', 'Actor C', 2005, 10, 15, 13, 'Un oso que cobra vida.'),
(4, 'Beso de la muerte', 'Jacson', 'CIENCIA FICCION', 'Vinicio', 1990, 20, 40, 3, 'Pelicula filmada en el año 1990'),
(5, 'anaconda', 'asd', 'ACCION', 'asd', 1990, 1, 2, 4, '');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `lock`
--
ALTER TABLE `lock`
  ADD PRIMARY KEY (`id_lock`);

--
-- Indices de la tabla `membresia`
--
ALTER TABLE `membresia`
  ADD PRIMARY KEY (`idMembresia`);

--
-- Indices de la tabla `personas`
--
ALTER TABLE `personas`
  ADD PRIMARY KEY (`idPersona`),
  ADD KEY `roles_idx` (`rol`);

--
-- Indices de la tabla `registro`
--
ALTER TABLE `registro`
  ADD PRIMARY KEY (`idPrestamo`);

--
-- Indices de la tabla `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`idroles`);

--
-- Indices de la tabla `videos`
--
ALTER TABLE `videos`
  ADD PRIMARY KEY (`idVideo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `lock`
--
ALTER TABLE `lock`
  MODIFY `id_lock` int(10) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `membresia`
--
ALTER TABLE `membresia`
  MODIFY `idMembresia` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `personas`
--
ALTER TABLE `personas`
  MODIFY `idPersona` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `registro`
--
ALTER TABLE `registro`
  MODIFY `idPrestamo` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT de la tabla `videos`
--
ALTER TABLE `videos`
  MODIFY `idVideo` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `personas`
--
ALTER TABLE `personas`
  ADD CONSTRAINT `roles` FOREIGN KEY (`rol`) REFERENCES `roles` (`idroles`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
