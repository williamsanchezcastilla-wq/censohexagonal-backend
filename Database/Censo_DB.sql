--
-- PostgreSQL database dump
--

\restrict Yg2OeMCyb6fLdNj5Tgux8XjjU22r8wm2GUl7JGxGteUY6inKLGZZPuAA9EbLcVS

-- Dumped from database version 18.1
-- Dumped by pg_dump version 18.1

-- Started on 2025-12-06 19:05:29

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET transaction_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 5005 (class 0 OID 24579)
-- Dependencies: 220
-- Data for Name: censos; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.censos (id, apellido, direccion, edad, estrato, fecha_registro, municipio, nivel_educativo, nombre, sexo) FROM stdin;
3	Sanchez Castilla	campestre	20	3	\N	bolivar	3	alvaro	masculino
\.


--
-- TOC entry 5011 (class 0 OID 0)
-- Dependencies: 219
-- Name: censos_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.censos_id_seq', 3, true);


-- Completed on 2025-12-06 19:05:29

--
-- PostgreSQL database dump complete
--

\unrestrict Yg2OeMCyb6fLdNj5Tgux8XjjU22r8wm2GUl7JGxGteUY6inKLGZZPuAA9EbLcVS

