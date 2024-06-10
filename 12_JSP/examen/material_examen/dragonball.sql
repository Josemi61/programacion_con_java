-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: db
-- Tiempo de generación: 20-05-2024 a las 12:20:02
-- Versión del servidor: 8.4.0
-- Versión de PHP: 8.2.19

CREATE DATABASE dragonball;
USE dragonball;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `dragonball`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `afiliacion`
--

CREATE TABLE `afiliacion` (
  `id` int NOT NULL,
  `nombre` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `afiliacion`
--

INSERT INTO `afiliacion` (`id`, `nombre`) VALUES
(1, 'Guerreros Z'),
(2, 'Imperio de Freezer'),
(3, 'Libre'),
(4, 'Otros'),
(5, 'Villano'),
(6, 'Asistente de Beerus'),
(7, 'Tropas del Orgullo'),
(8, 'Asistente de Vermoudh');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personaje`
--

CREATE TABLE `personaje` (
  `id` int NOT NULL,
  `idRaza` int NOT NULL,
  `idAfiliacion` int NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `energia` int NOT NULL,
  `sexo` varchar(50) NOT NULL,
  `descripcion` text NOT NULL,
  `imagen` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `personaje`
--

INSERT INTO `personaje` (`id`, `idRaza`, `idAfiliacion`, `nombre`, `energia`, `sexo`, `descripcion`, `imagen`) VALUES
(1, 1, 1, 'Goku', 60000000, 'Masculino', 'El protagonista de la serie, conocido por su gran poder y personalidad amigable. Originalmente enviado a la Tierra como un infante volador con la misión de conquistarla. Sin embargo, el caer por un barranco le proporcionó un brutal golpe que si bien casi lo mata, este alteró su memoria y anuló todos los instintos violentos de su especie, lo que lo hizo crecer con un corazón puro y bondadoso, pero conservando todos los poderes de su raza. No obstante, en la nueva continuidad de Dragon Ball se establece que él fue enviado por sus padres a la Tierra con el objetivo de sobrevivir a toda costa a la destrucción de su planeta por parte de Freeza. Más tarde, Kakarot, ahora conocido como Son Goku, se convertiría en el príncipe consorte del monte Fry-pan y líder de los Guerreros Z, así como el mayor defensor de la Tierra y del Universo 7, logrando mantenerlos a salvo de la destrucción en innumerables ocasiones, a pesar de no considerarse a sí mismo como un héroe o salvador.', 'https://dragonball-api.com/characters/goku_normal.webp'),
(2, 1, 1, 'Vegeta', 54000000, 'Masculino', 'Príncipe de los Saiyans, inicialmente un villano, pero luego se une a los Z Fighters. A pesar de que a inicios de Dragon Ball Z, Vegeta cumple un papel antagónico, poco después decide rebelarse ante el Imperio de Freeza, volviéndose un aliado clave para los Guerreros Z. Con el paso del tiempo llegaría a cambiar su manera de ser, optando por permanecer y vivir en la Tierra para luchar a su lado contra las inminentes adversidades que superar. Junto con Piccolo, él es de los antiguos enemigos de Goku que ha evolucionando al pasar de ser un villano y antihéroe, a finalmente un héroe a lo largo del transcurso de la historia, convirtiéndose así en el deuteragonista de la serie.', 'https://dragonball-api.com/characters/vegeta_normal.webp'),
(3, 2, 1, 'Piccolo', 2000000, 'Masculino', 'Es un namekiano que surgió tras ser creado en los últimos momentos de vida de su padre, siendo su actual reencarnación. Aunque en un principio fue el archienemigo de Son Goku, con el paso del tiempo fue haciéndose menos malvado hasta finalmente convertirse en un ser bondadoso y miembro de los Guerreros Z. A través del tiempo, también comenzó a tomarle cariño a su discípulo Son Gohan, a quien veía como una especie de \'vástago\' y formando un lazo de amistad con este.', 'https://dragonball-api.com/characters/picolo_normal.webp'),
(4, 3, 1, 'Bulma', 0, 'Femenino', 'Bulma es la protagonista femenina de la serie manga Dragon Ball y sus adaptaciones al anime Dragon Ball, Dragon Ball Z, Dragon Ball Super y Dragon Ball GT. Es hija del Dr. Brief y su esposa Panchy, hermana menor de Tights y una gran amiga de Son Goku con quien inicia la búsqueda de las Esferas del Dragón. En Dragon Ball Z tuvo a Trunks, primogénito de quien sería su esposo Vegeta, a su hija Bra[3] y su hijo adulto del tiempo alterno Trunks del Futuro Alternativo.', 'https://dragonball-api.com/characters/bulma.webp'),
(5, 4, 2, 'Freezer', 530000, 'Masculino', 'Freezer es el tirano espacial y el principal antagonista de la saga de Freezer.', 'https://dragonball-api.com/characters/Freezer.webp'),
(6, 4, 2, 'Zarbon', 20000, 'Masculino', 'Zarbon es uno de los secuaces de Freezer y un luchador poderoso.', 'https://dragonball-api.com/characters/zarbon.webp'),
(7, 4, 2, 'Dodoria', 18000, 'Masculino', 'Dodoria es otro secuaz de Freezer conocido por su brutalidad.', 'https://dragonball-api.com/characters/dodoria.webp'),
(8, 4, 2, 'Ginyu', 9000, 'Masculino', 'Ginyu es el líder del la élite de mercenarios de mayor prestigio del Ejército de Freeza, la cual lleva el nombre de Fuerzas Especiales Ginew en su honor[9].', 'https://dragonball-api.com/characters/ginyu.webp'),
(9, 5, 3, 'Celula', 250000000, 'Masculino', 'Cell conocido como Célula en España, es un bioandroide creado por la computadora del Dr. Gero, quien vino del futuro de la línea 3 con la intención de vengarse de Goku por haber acabado con el Ejército del Listón Rojo, y con ello el sueño de todo villano: dominar el mundo. Es el antagonista principal del Arco de los Androides y Cell.', 'https://dragonball-api.com/characters/celula.webp'),
(10, 1, 1, 'Gohan', 45000000, 'Masculino', 'Son Gohanda en su tiempo en España, o simplemente Gohan en Hispanoamérica, es uno de los personajes principales de los arcos argumentales de Dragon Ball Z, Dragon Ball Super y Dragon Ball GT. Es un mestizo entre saiyano y humano terrícola. Es el primer hijo de Son Goku y Chi-Chi, hermano mayor de Son Goten, esposo de Videl y padre de Pan.', 'https://dragonball-api.com/characters/gohan.webp'),
(11, 3, 1, 'Krilin', 1000000, 'Masculino', 'Amigo cercano de Goku y guerrero valiente, es un personaje del manga y anime de Dragon Ball. Es uno de los principales discípulos de Kame-Sen\'nin, Guerrero Z, y el mejor amigo de Son Goku. Es junto a Bulma uno de los personajes de apoyo principales de Dragon Ball, Dragon Ball Z y Dragon Ball Super. Aparece en Dragon Ball GT como personaje secundario. En el Arco de Majin Boo, se retira de las artes marciales, optando por formar una familia, como el esposo de la Androide Número 18 y el padre de Marron.', 'https://dragonball-api.com/characters/Krilin_Universo7.webp'),
(12, 3, 1, 'Tenshinhan', 2400000, 'Masculino', 'Maestro de las artes marciales y miembro de los Z Fighters.  Es un personaje que aparece en el manga y en el anime de Dragon Ball, Dragon Ball Z, Dragon Ball GT y posteriormente en Dragon Ball Super.', 'https://dragonball-api.com/characters/Tenshinhan_Universo7.webp'),
(13, 3, 1, 'Yamcha', 1980000, 'Masculino', 'Luchador que solía ser un bandido del desierto.', 'https://dragonball-api.com/characters/Final_Yamcha.webp'),
(14, 3, 1, 'Chi-Chi', 0, 'Femenino', 'Esposa de Goku y madre de Gohan. Es la princesa del Monte Fry-pan siendo la hija de la fallecida reina de esta montaña y el Rey Gyuma, ella terminaría conociendo a Son Goku cuando era tan solo una niña para años más tarde durante su adolescencia ser su esposa y convertirse en la estricta pero amorosa madre de Gohan y Goten.', 'https://dragonball-api.com/characters/ChiChi_DBS.webp'),
(15, 1, 1, 'Gotenks', 65600000, 'Masculino', ' Gotenks también conocido inicialmente como Gotrunk en el doblaje al español de España, es el resultado de la Danza de la Fusión llevada a cabo correctamente por Goten y Trunks.', 'https://dragonball-api.com/characters/Gotenks_Artwork.webp'),
(16, 1, 1, 'Trunks', 50000000, 'Masculino', 'Hijo de Vegeta y Bulma. Es un mestizo entre humano terrícola y Saiyano nacido en la Tierra, e hijo de Bulma y Vegeta, el cual es introducido en el Arco de los Androides y Cell. Más tarde en su vida como joven, se termina convirtiendo en un luchador de artes marciales, el mejor amigo de Son Goten y en el hermano mayor de su hermana Bra.', 'https://dragonball-api.com/characters/Trunks_Buu_Artwork.webp'),
(17, 3, 1, 'Master Roshi', 500000, 'Masculino', 'Maestro de artes marciales y mentor de Goku. Conocido bajo el nombre de Muten Rosh, fue en su momento el terrícola más fuerte de la Tierra, y mucha gente lo recuerda como el \'Dios de las Artes Marciales\', pero antes de poder ostentar dicho título tuvo que trabajar y estudiar las artes marciales con su maestro Mutaito y su eterno rival Tsuru-Sen\'nin.', 'https://dragonball-api.com/characters/roshi.webp'),
(18, 1, 1, 'Bardock', 450000, 'Masculino', 'Es un saiyano de clase baja proveniente del Planeta Vegeta del Universo 7. Pertenece al Ejército Saiyano, que está bajo el liderazgo del Rey Vegeta, y es jefe de su escuadrón durante la anexión del planeta por parte de las fuerzas coloniales del Imperio de Freeza. Él es el esposo de Gine y padre biológico de Kakarotto y Raditz.', 'https://dragonball-api.com/characters/Bardock_Artwork.webp'),
(19, 3, 1, 'Launch', 0, 'Femenino', 'Personaje que sufre cambios de personalidad al estornudar. Es uno de los personajes principales del manga Dragon Ball y su anime homónimo; Lunch es una chica que sufre de un trastorno de personalidad doble que a raíz de sus reacciones alérgicas provoca que ella cambie entre dos personalidades diferentes, ninguna de las personalidades recuerda lo que la otra hizo o dijo.', 'https://dragonball-api.com/characters/Lunch_traje_de_sirvienta_en_el_manga.webp'),
(20, 3, 4, 'Mr. Satan', 450, 'Masculino', 'Luchador humano famoso por llevarse el mérito de las victorias de los Guerreros Z.', 'https://dragonball-api.com/characters/Mr_Satan_DBSuper.webp'),
(21, 2, 1, 'Dende', 3200, 'Masculino', 'Sucesor de Piccolo como el nuevo Namekian protector de la Tierra. Es un pequeño namekiano, que vivía en el poblado de Moori, junto a su hermano Scargo y otros tantos de su especie. Es el hijo 108 del Gran Patriarca y posteriormente Dios de la Tierra, sustituyendo a Dios.', 'https://dragonball-api.com/characters/Dende_Artwork.webp'),
(22, 5, 5, 'Androide 17', 320000000, 'Masculino', 'Antes de ser secuestrado, es el hermano mellizo de la Androide Número 18, quien al igual que ella antes de ser Androide era un humano normal hasta que fueron secuestrados por el Dr. Gero, y es por eso que lo odian. Tras su cambio de humano a Androide, le insertaron un chip con el objetivo de destruir a Son Goku, quien en su juventud extermino al Ejército del Listón Rojo. Al considerarse defectuoso porque no quería ser \'esclavo de nadie\', el Dr. Gero les había colocado a ambos hermanos, un dispositivo de apagado para detenerlos en cualquier momento de desobediencia, pero cuando el científico los despierta, el rencor y rebeldía de 17 eran tal que se encargó de destruir el control que lo volvería a encerrar y acto seguido mató sin piedad a su propio creador. Su situación se le iría en contra, ya que Cell tenía como misión absorber a 17 y 18 para completar su desarrollo y convertirse en Cell Perfecto.', 'https://dragonball-api.com/characters/17_Artwork.webp'),
(23, 5, 5, 'Androide 16', 440000000, 'Masculino', 'Android 16 es un androide gigante conocido por su amor a la naturaleza y la vida.', 'https://dragonball-api.com/characters/Androide_16.webp'),
(24, 5, 5, 'Androide 19', 122000000, 'Masculino', 'Android 19 es uno de los androides creados por el Dr. Gero.', 'https://dragonball-api.com/characters/Android19.webp'),
(25, 5, 5, 'Androide 20 (Dr. Gero)', 128000000, 'Masculino', 'Dr. Gero es el científico loco que creó a los androides 17, 18 y 19.', 'https://dragonball-api.com/characters/Dr._Gero nadroide 20.webp'),
(26, 5, 5, 'Androide 13', 195000000, 'Masculino', 'Android 13 es un androide peligroso que aparece en la película \'El Regreso de Cooler\'.', 'https://dragonball-api.com/characters/Androide13normal.webp'),
(27, 5, 5, 'Androide 14', 192500000, 'Masculino', 'Android 14 es otro androide que aparece en la misma película que Android 13.', 'https://dragonball-api.com/characters/14Dokkan.webp'),
(28, 5, 5, 'Androide 15', 175000000, 'Masculino', 'Android 15 es otro androide que aparece en la misma película que Android 13.', 'https://dragonball-api.com/characters/15Dokkan.webp'),
(29, 2, 1, 'Nail', 42000, 'Masculino', 'Es un Namekiano (habitante del planeta Namek), que se caracteriza por formar parte de los escasos miembros de la \'estirpe guerrera\', y ser el más poderoso entre ellos junto a Piccolo.', 'https://dragonball-api.com/characters/Nail_Artwork.webp'),
(30, 1, 2, 'Raditz', 1500, 'Masculino', 'Es el hijo de Bardock y Gine, y hermano mayor de Son Goku. Él es uno de los pocos saiyanos que sobrevivieron a la destrucción del Planeta Vegeta, y formaba parte del equipo de Vegeta. Es el primer antagonista de Dragon Ball Z.', 'https://dragonball-api.com/characters/Raditz_artwork_Dokkan.webp'),
(31, 6, 5, 'Babidi', 0, 'Masculino', 'Conocido también como Bóbidi o Bábidi, es un poderoso hechicero madoshi, \'hijo\' del gran mago Bibbidi, fundador de la familia Majin. La \'M\' que llevan ambos en el cinturón de sus atuendos al igual que la frente de aquellos que han sido poseídos para formar parte de la familia Majin.', 'https://dragonball-api.com/characters/Babidi_Artwork.webp'),
(32, 6, 5, 'Majin Buu', 8, 'Masculino', 'También conocido como Boo original, es la forma original y pura de Majin-Boo, y la última forma de Boo que aparece en Dragon Ball Z.', 'https://dragonball-api.com/characters/BuuGordo_Universo7.webp'),
(33, 7, 4, 'Beerus', 102, 'Masculino', 'Dios de la Destrucción Beerus, conocido también como Beers, o Bills en Hispanoamérica e inicialmente en España[1], es un personaje que fue introducido en la película Dragon Ball Z: La batalla de los dioses, donde es el antagonista principal de la película, y que aparece en el manga y anime de Dragon Ball Super como un personaje principal. Ocupa el puesto de Dios de la Destrucción de todo el Universo 7 siendo el lugar donde se desarrolla la historia de Dragon Ball.', 'https://dragonball-api.com/characters/Beerus_DBS_Broly_Artwork.webp'),
(34, 8, 6, 'Whis', 15, 'Masculino', 'Whis es uno de los hijos del Gran Sacerdote, hermano menor de Vados, Korn y Kus. Es el ángel guía encargado de asistir y servir como maestro al Dios de la Destrucción del Universo 7, Beerus.', 'https://dragonball-api.com/characters/Whis_DBS_Broly_Artwork.webp'),
(35, 9, 4, 'Zeno', 500, 'Masculino', 'Zeno es el ser supremo del multiverso y tiene un poder abrumador .El Rey de Todo, también conocido como Zen Oo (Zeno Sama en España y Zen Oo Sama en Hispanoamerica) y apodado por Son Goku como Todito (全ぜんちゃん, Zen-chan), es el gobernante y dios absoluto de todos los universos y el máximo soberano de todo lo existente en Dragon Ball.', 'https://dragonball-api.com/characters/Zeno_Artwork.webp'),
(36, 7, 4, 'Kibito-Shin', 32, 'Masculino', 'es la fusión entre Shin y Kibito. Ellos fueron unidos permanentemente mediante el uso de los míticos pendientes Pothala. Está actualmente separado gracias a un deseo concedido por las Esferas del Dragón namekianas.', 'https://dragonball-api.com/characters/Kibito_shin_Artwork.webp'),
(37, 10, 7, 'Jiren', 121, 'Masculino', 'Jiren es un poderoso luchador del Universo 11 y uno de los oponentes más formidables en el torneo.', 'https://dragonball-api.com/characters/Jiren.webp'),
(38, 7, 7, 'Toppo', 99, 'Masculino', 'Toppo es el líder de las Tropas del Orgullo, guerreros de la justicia del Universo 11 que actúan como protectores de la paz y superhéroes del bien. Él ha sido entrenado por el ángel guía Marcarita, convirtiéndose así en un candidato como futuro Dios de la Destrucción en su universo.', 'https://dragonball-api.com/characters/Toppo.webp'),
(39, 7, 7, 'Dyspo', 50, 'Masculino', 'Dyspo es uno de los miembros del Equipo Universo 11 como uno de los soldados más poderosos de las Tropas del Orgullo junto con Jiren y su líder Toppo.', 'https://dragonball-api.com/characters/Dispo_render.webp'),
(40, 8, 8, 'Marcarita ', 10, 'Femenino', 'Marcarita es el ángel guía del Universo 11, sirviente y maestra de artes marciales del Dios de la Destrucción Vermoud. Es un personaje de la Arco de la Supervivencia Universal de Dragon Ball Super.', 'https://dragonball-api.com/characters/Marcarita.webp'),
(41, 7, 7, 'Vermoudh', 99, 'Masculino', 'Es el individuo que actualmente ostenta el cargo de Dios de la Destrucción en el Universo 11, puesto que obtuvo tras abandonar su membresía como Soldado del Orgullo dentro de las Tropas del Orgullo.', 'https://dragonball-api.com/characters/Vermoud.webp'),
(42, 8, 4, 'Grand Priest ', 969, 'Masculino', 'El Gran Sacerdote es el supervisor del torneo y uno de los seres más poderosos. Gran Ministro de los Omni-Reyes , es un ángel que actúa como asesor cercano y figura guía de Zenón y del Futuro Zenón . De vez en cuando hace cumplir los Decretos Divinos de los Zenos y da la bienvenida a los invitados a su palacio . El Gran Ministro es también padre de trece Ángeles, de los cuales doce sirven a los Dioses de la Destrucción . Por su posición y poder, es quizás el segundo ser más fuerte del Multiverso .', 'https://dragonball-api.com/characters/Grand priest.webp'),
(43, 11, 4, 'Kaio del norte (Kaito)', 6000, 'Masculino', 'Se trata del dios encargado de administrar las Galaxias del Norte, el cuadrante boreal del Universo 7 y supervisar a los dioses de los planetas de dicho sector (como es el caso de Kami en la Tierra)', 'https://dragonball-api.com/characters/Kaio_del_Norte.webp'),
(44, 5, 1, 'Android 18', 280, 'Femenino', 'Es la hermana melliza del Androide Número 17 y una \'androide\' creada a partir de una base humana por el Dr. Gero con el único fin de destruir a Goku.', 'https://dragonball-api.com/characters/Androide_18_Artwork.webp'),
(45, 1, 1, 'Gogeta', 250, 'Masculino', 'Gogeta es la fusión resultante de Son Goku y Vegeta, cuando realizan la Danza de la Fusión correctamente para enfrentarse a Broly. Su voz es una voz dual que contiene las voces de Goku y Vegeta. Junto con el poder todopoderoso de los dos, con la astucia y perspicacia de Vegeta, y la habilidad pródiga de las artes marciales de Goku, es uno de los guerreros más temibles para desafiar a una pelea.', 'https://dragonball-api.com/transformaciones/gogeta.webp'),
(46, 1, 1, 'Vegetto', 180, 'Masculino', 'Vegetto es el personaje más fuerte dentro del manga original y uno de los personajes más poderosos de toda la serie en general. Su poder es el resultado del máximo poder combinado de Goku y Vegeta, multiplicado varias veces su fuerza, siendo una de las fusiones más poderosas dentro de la franquicia.', 'https://dragonball-api.com/transformaciones/Vegetto.webp'),
(47, 12, 4, 'Janemba', 15, 'Masculino', 'Janemba es un demonio de pura maldad y gran poder maligno. Creado a partir de las acciones de un adolescente ogro llamado Psyche Oni, quien era el responsable de vigilar la máquina purificadora de almas, la cual explota como consecuencia de la falta de cuidado del ogro, las almas malignas terminan por usar como huésped su cuerpo, creando así a este demonio.', 'https://dragonball-api.com/transformaciones/Janemba_artwork_SDBH.webp'),
(48, 1, 4, 'Broly', 7, 'Masculino', 'Broly es un Saiyajin que posee un poder gigantesco e incontrolable, el cual se manifiesta en toda su magnitud cuando se convierte en el Super Saiyajin Legendario. Incluso cuando apenas era un bebé su nivel de poder alcanzaba cifras inmensas que provocaban asombro y preocupación entre los de su raza', 'https://dragonball-api.com/transformaciones/Broly_DBS_Base.webp'),
(49, 11, 4, 'Kaio del Sur', 0, 'Masculino', 'El Kaio del Sur es la única referencia que tenemos de los otros dioses Kaiō en el manga, más allá del Kaiō Sama Norte ya que es el único Kaiō, junto con el Kaiō del Norte, en aparecer en el manga, y uno de los cuatro que aparecen en el anime, junto al Gran Kaio.', 'https://dragonball-api.com/characters/Kaio_del_sur_cuerpo_completo.webp'),
(50, 11, 4, 'Kaio del este', 0, 'Femenino', 'La Kaiō del Este es una Kaio que solo aparece en el anime. Le gustan los retos y de entrenar duramente a sus discípulos, que destacan por ser guerreros muy veloces, siendo el ejemplo más claro Chapuchai.', 'https://dragonball-api.com/characters/kaio del este.webp'),
(51, 11, 4, 'Kaio del Oeste', 0, 'Masculino', 'El Kaiō del Oeste es el rival del Kaio del Norte. Y como dice su nombre, el controla la galaxia del Oeste.', 'https://dragonball-api.com/characters/Kaio del oeste.webp'),
(52, 11, 4, 'Gran Kaio', 0, 'Masculino', 'Gran Kaio es el Kaio de mayor importancia del Otro Mundo y es el Dios que se encarga de administrar a los demás Kaiō para que se ocupen de cuyos sectores de la Galaxia. Su apariencia es la de un anciano con una barba larga y muy canosa, remarcada por unas gafas oscuras que nunca se quita en la serie. Cuenta con su propio planeta, el Planeta del Gran Kaio, en el cual la gravedad es 10 veces mayor a la del planeta Tierra.', 'https://dragonball-api.com/characters/Gran_kaio_sama12.webp'),
(53, 13, 4, 'Kaio-shin del Este', 0, 'Masculino', 'Es uno de los Kaio-shin, los dioses de la creación que se encargan de crear vida en todo el Universo 7 y protegerlo de amenazas supremas.\nAnteriormente solía hacerse cargo de proteger la zona este del universo, ya que después de la muerte de los otros Kaio-shin a manos de Majin-Boo, se convirtió en el Kaio-shin principal del Universo 7.', 'https://dragonball-api.com/characters/Kaio-shin_del_este_Artwork.webp'),
(54, 13, 4, 'Kaio-shin del Norte', 0, 'Masculino', 'El Kaiō-shin del Norte es otro de los Kaiō-shin que vivió junto a el resto de los Kaio-shin y Dai Kaio-shin hace 5 millones de años, y que luchó contra Majin Boo.', 'https://dragonball-api.com/characters/Kaio-shin del norte.webp'),
(55, 13, 4, 'Kaio-shin del Sur', 0, 'Masculino', 'El Kaio-shin del Sur fue el gobernante del cuadrante sur del universo y era el más poderoso entre los Kaio-shin.', 'https://dragonball-api.com/characters/Kaio-shin_del_Sur_Dokkan.webp'),
(56, 11, 4, 'Kaio-shin del Oeste', 0, 'Femenino', 'La Kaiō-shin del Oeste es una Kaio-shin, que vivió junto a sus compañeros, fue la primera en morir en la terrible batalla librada contra Majin Boo hace 5 millones de años.', 'https://dragonball-api.com/characters/Kaio-shin_del_Oeste_Dokkan.webp'),
(57, 11, 4, 'Gran Kaio-shin', 0, 'Masculino', 'El Gran Kaio-shin, conocido también como Sagrado Kaiosama en Hispanoamérica, era el Kaio-shin principal del Universo 7 y supervisor de los otros Kaio-shin del mismo universo.\nTras ser absorbido por Majin Boo, el Gran Kaio-shin del Universo 7 se convirtió en la faceta más dominante en Boo Gordo, aún viviendo actualmente dentro de su cuerpo a través de su espíritu.', 'https://dragonball-api.com/characters/Gran_Kaio-shin_Artwork.webp'),
(58, 13, 4, 'Kibito', 0, 'Masculino', 'Kibito es el ayudante y guardaespaldas del Kaio-shin del Este. Es un experto combatiente y con ciertos poderes curativos y mágicos como corresponde a su función. Su técnica más conocida es el Kai-Kai.', 'https://dragonball-api.com/characters/Kibito_Artwork.webp');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `raza`
--

CREATE TABLE `raza` (
  `id` int NOT NULL,
  `nombre` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `raza`
--

INSERT INTO `raza` (`id`, `nombre`) VALUES
(1, 'Saiyan'),
(2, 'Namekiano'),
(3, 'Terrícola'),
(4, 'Raza de Freezer'),
(5, 'Androide'),
(6, 'Majin'),
(7, 'Dios'),
(8, 'Ángel'),
(9, 'Desconocido'),
(10, 'Raza de Jiren'),
(11, 'Nucleico benigno'),
(12, 'Demonio'),
(13, 'Nucleico');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `afiliacion`
--
ALTER TABLE `afiliacion`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `personaje`
--
ALTER TABLE `personaje`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_personaje_raza` (`idRaza`),
  ADD KEY `fk_personaje_afiliacion` (`idAfiliacion`);

--
-- Indices de la tabla `raza`
--
ALTER TABLE `raza`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `afiliacion`
--
ALTER TABLE `afiliacion`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `personaje`
--
ALTER TABLE `personaje`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=59;

--
-- AUTO_INCREMENT de la tabla `raza`
--
ALTER TABLE `raza`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `personaje`
--
ALTER TABLE `personaje`
  ADD CONSTRAINT `fk_personaje_afiliacion` FOREIGN KEY (`idAfiliacion`) REFERENCES `afiliacion` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_personaje_raza` FOREIGN KEY (`idRaza`) REFERENCES `raza` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
