## SpringbootWithMongoDB

### Springboot + MongoDB Atlas + Jasypt Project;

## Request Payload:

### Postman
{
	"id":"sasemmewwdkkja",
	"fullName":"Priyobrato Das",
	"salary":88181.90,
	"taxAmmount":7333.00,
	"email":"Debabrato9@gmail.com"
}


## Data Saved At Atlas:

{
	"id":"sasemmewwdkkja",
	"fullName":"Priyobrato Das",
	"salary":88181.90,
	"taxAmmount":7333.00,
	"email":"Debabrato9@gmail.com"
}

## Encryption

C:\jasypt-1.9.0.jar>java -cp jasypt-1.9.0.jar org.jasypt.intf.cli.JasyptPBEStringEncryptionCLI input="##########" password=SimplePassword algorithm=PBEWithMD5AndDES

----ENVIRONMENT-----------------

Runtime: Oracle Corporation Java HotSpot(TM) 64-Bit Server VM 25.###-###



----ARGUMENTS-------------------

algorithm: PBEWithMD5AndDES
input: ###########
password: SimplePassword



----OUTPUT----------------------

##################################
