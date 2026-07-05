from scraper import obtener_html
from parser import obtener_ofertas
from exporter import guardar


URL = "https://ar.computrabajo.com/trabajo-de-desarrollador-en-buenos-aires-en-bahia-blanca"
html = obtener_html(URL)
# Descargar la página
html = obtener_html(URL)

# Obtener las ofertas
ofertas = obtener_ofertas(html)

# Guardar en CSV y Excel
guardar(ofertas)

print(f"\nSe encontraron {len(ofertas)} ofertas\n")

for oferta in ofertas:
    print("-" * 60)
    print("Título:", oferta["titulo"])
    print("Empresa:", oferta["empresa"])
    print("Ciudad:", oferta["ciudad"])
    print("Modalidad:", oferta["modalidad"])
    print("Fecha:", oferta["fecha"])
    print("Link:", oferta["link"])