# icecold

To run the app with maven
1.
mvn clean install
2. Once the Maven build is successful, run following to start the server
mvn spring-boot:run


# Setup Mongo DB
1. Install Mongo using brew
brew install mongodb

2. Create the mongo mongo folder
run this in command line:
$ sudo mkdir -p /data/db/

3. Start Mongo DB
run this in command line:
mongod

4. Once the Mongo DB is running, open a new command line window to run the mongo import to set up the icecold database. Please remember to change the folder path to match your local environment

mongoimport --host=127.00.1 --db icecold --collection flavor < /Users/michael.kong/icecold/src/main/resources/flavor.json

mongoimport --host=127.00.1 --db icecold --collection userAccount < /Users/michael.kong/icecold/src/main/resources/userAccount.json

mongoimport --host=127.00.1 --db icecold --collection inventory < /Users/michael.kong/icecold/src/main/resources/inventory.json

5. Accessing the Mongo DB

