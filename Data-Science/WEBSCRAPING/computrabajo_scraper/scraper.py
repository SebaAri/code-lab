import requests

HEADERS = {
    "User-Agent": (
        "Mozilla/5.0 (Windows NT 10.0; Win64; x64) "
        "AppleWebKit/537.36 (KHTML, like Gecko) "
        "Chrome/137.0.0.0 Safari/537.36"
    )
}

def obtener_html(url):
    response = requests.get(url, headers=HEADERS)

    print("Código de estado:", response.status_code)

    return response.text