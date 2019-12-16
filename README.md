# backend




-- ENTITIES
			User {
				id: integer,
				name: string,
				email: string,
				address: Address,
				roles: array(UserRole)
			}
			UserRole {
				id: integer,
				name: string
			}
			
			Address {
				id: integer,
				address: string,
				city: string,
				province: string,
				country: string,
				zip: string
			}
			
			Category {
				id: integer,
				name: string 
			}

			Product {
				id: integer,
				name: string, 
				seoname: string,
				images: array(Image),
				options: array(Option),
				categories: array(Category)
			}
			
			Image {
				id: integer,
				name: string,
				data: blob
			}

			
			Option {
				id: integer,
				name: string,
				sku: string, 				
				price: integer,
				quantity: integer,
				mensuration: Mensuration
			}
			
			Mensuration {
				id: integer,
				weight: integer,
				width: integer
				height: integer,
				length: integer
			}

			Transaction {
				id: integer,
				invoice: string,
				subtotal: integer,
				tax: integer,
				shipping: integer,
				total: integer,
				status: enum('waiting', 'cancelled', 'completed'),
				address: Address
				items: array(TransactionItem)
			}
			
			TransactionItem {
				id: integer,
				name: string,
				sku: string,
				price: integer,
				quantity: integer
			}

			Contact {
				id: integer,
				name: string,
				email: string,
				message: string
			}
			
			Authority {
				id: integer,
				name: string,
				url: string
			}
	
-- MODELS
	Authentication {
		token: string,
		authority: Authority (GMAIL, FACEBOOK, DUVALHUB )
	}
	
	Token {
		type: string,
		bearer: string
	}
------------------------------
CRUD EN GÉNÉRAL RETOURNE ET PREND UN 'image/json' mais dans le cas du /api/v1/images retourne le mime-type dans le POST Hrsder
	-- READ
		200 - OK
		404 - Not Found

	-- CREATE
		200 - OK
		400 - Bad Request

	-- DELETE
		204 - No Content (success + equipotent)
		401 - Unauthorized (pas de Token)
		403 - Forbidden (Role dans le Token pas bon)


	-- UPDATE
		200 - OK
		404 - Not Found
		400 - Bad Request
		401 - Unauthorized

------------------------------------
SERVICE - Category CRUD /api/v1/categories

------------------------------------
SERVICE - Product CRUD /api/v1/products

------------------------------------
SERVICE - Transaction CRUD /api/v1/transactions

	curl -X POST /api/v1/transactions -d '{ <shopping card> }' 
		+ collecter confirmation dans paypal
			+ si confirmé, retourn '{ <numéro de confirmation de l'achat> }' 200 OK
				+ envoit email
			+ sinon, retourn 402 Payment Required



------------------------------------
SERVICE - Image CRUD /api/v1/images

------------------------------------
SERVICE - Authentication

	-- je ne suis pas d'accord d'utiliser oauth2 dans l'URI. Et pourquoi pas JWT simplement? 
	
	POST /api/v1/oauth2/authenticate
	GET /api/v1/oauth2/validate 
	PUT /api/v1/oauth2/renew (refresh token) 
	
	
------------------------------------
REST - Image
	curl -X POST /api/v1/images -d @/image/file/path -H 'Content-Type=image/jpg' -> 

	curl -X GET /api/v1/images/1 -> Content-Type=image/jpg, + blob 

	curl -X GET /api/v1/images/1 -> 




https://www.baeldung.com/spring-security-expressions-basic
@Service
public class FooService {
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public List<Foo> findAll() { ... }
    ...
}




