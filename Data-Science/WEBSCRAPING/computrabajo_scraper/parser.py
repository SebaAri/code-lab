from bs4 import BeautifulSoup

BASE_URL = "https://ar.computrabajo.com"

def obtener_ofertas(html):

    soup = BeautifulSoup(html, "lxml")

    articulos = soup.find_all("article", class_="box_offer")

    datos = []

    for oferta in articulos:

        titulo_tag = oferta.select_one("h2 a")
        titulo = titulo_tag.get_text(strip=True) if titulo_tag else ""

        enlace = ""
        if titulo_tag and titulo_tag.has_attr("href"):
            enlace = BASE_URL + titulo_tag["href"]

        empresa = ""
        ciudad = ""
        fecha = ""
        modalidad = ""

        parrafos = oferta.find_all("p")

        if len(parrafos) >= 1:
            empresa_tag = parrafos[0].find("a")
            if empresa_tag:
                empresa = empresa_tag.get_text(strip=True)

        if len(parrafos) >= 2:
            ciudad = parrafos[1].get_text(strip=True)

        if len(parrafos) >= 3:
            fecha = parrafos[2].get_text(strip=True)

        texto = oferta.get_text(" ", strip=True)

        if "Remoto" in texto:
            modalidad = "Remoto"
        elif "Presencial" in texto:
            modalidad = "Presencial"
        elif "Híbrido" in texto:
            modalidad = "Híbrido"

        datos.append({
            "titulo": titulo,
            "empresa": empresa,
            "ciudad": ciudad,
            "modalidad": modalidad,
            "fecha": fecha,
            "link": enlace
        })

    return datos