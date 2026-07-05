"""import pandas as pd

df = pd.DataFrame(ofertas)

df.to_excel("ofertas.xlsx", index=False)"""

import pandas as pd

def guardar(ofertas):

    df = pd.DataFrame(ofertas)

    df.to_csv(
        "data/ofertas.csv",
        index=False,
        encoding="utf-8-sig"
    )

    df.to_excel(
        "data/ofertas.xlsx",
        index=False
    )

    print("Archivos guardados correctamente.")