package br.com.fiap.checkpoint.api

import com.google.gson.annotations.SerializedName

data class CountryModel(
    // nome.abreviado
    @SerializedName("nome")
    val nome: CountryNameModel,

    // localizacao.regiao.nome
    @SerializedName("localizacao")
    val localizacao: CountryLocateModel,

    // governo.capital.nome
    @SerializedName("governo")
    val governo: CountryGovernmentModel
)

// nome.abreviado
data class CountryNameModel(
    @SerializedName("abreviado")
    val abreviado: String
)

// localizacao.regiao.nome
data class CountryLocateModel(
    @SerializedName("regiao")
    val regiao: CountryLocateRegionModel
)

data class CountryLocateRegionModel(
    @SerializedName("nome")
    val nome: String
)

// governo.capital.nome
data class CountryGovernmentModel(
    @SerializedName("capital")
    val capital: CountryGovernmentCapitalModel
)

data class CountryGovernmentCapitalModel(
    @SerializedName("nome")
    val nome: String
)


/*
{
    "area": {
        "total": "468",
        "unidade": {
            "nome": "quilômetros quadrados",
            "símbolo": "km2",
            "multiplicador": 1
        }
    },
    "localizacao": {
        "regiao": {
            "id": {
                "M49": 150
            },
            "nome": "Europa"
        },
        "sub-regiao": {
            "id": {
                "M49": 39
            },
            "nome": "Europa meridional  (Sul da Europa)"
        },
        "regiao-intermediaria": null
    },
    "linguas": [{
        "id": {
            "ISO-639-1": "ca",
            "ISO-639-2": "cat"
        },
        "nome": "catalão"
    }],
    "governo": {
        "capital": {
            "nome": "Andorra-a-Velha"
        }
    },
    "unidades-monetarias": [{
        "id": {
            "ISO-4217-ALPHA": "EUR",
            "ISO-4217-NUMERICO": "978"
        },
        "nome": "Euro"
    }],
    "historico": "O Principado de Andorra é um dos menores Estados da Europa, situado no alto dos Pireneus, entre as fronteiras francesa e espanhola. O primeiro documento que menciona Andorra é a Ata de Consagração da Catedral de Santa María de Urgell, de 839. Tal documento nomeia as freguesias do principado como feudo dos condes de Urgell.Por 715 anos, de 1278 a 1993, os andorranos foram governados por líderes franceses e espanhóis. Segundo a história registra, houve anos de intensa luta entre os condes vizinhos e a Igreja para ver quem conseguia soberania sobre Andorra. Passados esses anos, a assinatura dos tratados Pareatges, em 1278 e 1288, pelo arcebispo de Urgell, Pere d’Urg e o conde de Foix, Roger Bernart III, pôs fim às hostilidades e estabeleceu a soberania partilhada sobre o território. Em 1993, o sistema feudal foi modificado com a introdução de uma constituição moderna: os copríncipes permaneceram como chefes de Estado, mas o governo transformou-se em uma democracia parlamentar. Andorra se tornou um centro comercial internacional rico por causa do forte setor bancário e baixos impostos. Como parte de seus esforços para modernizar sua economia, se abriu ao investimento estrangeiro e se envolveu em outras reformas. Embora não seja membro da Unão Europeia, Andorra mantém uma relação especial com o bloco que é regido por vários acordos alfandegários e de cooperação. Fontes: http://visitandorra.com/pt/o-pais/um-pouco-de-historia/ https://www.cia.gov/library/publications/the-world-factbook/geos/an.html"
},


 */