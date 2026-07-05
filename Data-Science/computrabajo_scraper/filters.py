def buscar_tecnologias(texto):

    texto = texto.lower()

    techs = [
        "python",
        "html",
        "css",
        "javascript",
        "php"
    ]

    return [
        t
        for t in techs
        if t in texto
    ]