# Install
https://www.postgresql.org/download/linux/ubuntu/

```bash
$ sudo sh -c 'echo "deb http://apt.postgresql.org/pub/repos/apt $(lsb_release -cs)-pgdg main" > /etc/apt/sources.list.d/pgdg.list'

$ wget --quiet -O - https://www.postgresql.org/media/keys/ACCC4CF8.asc | sudo apt-key add -

$ sudo apt-get update

$ sudo apt-get -y install postgresql
```

# Useful commands
```bash
$ sudo systemctl status postgresql.service

$ /usr/lib/postgresql/14/bin/postgres -V
```

# Setup postgres user
```bash
$ sudo passwd postgres
```

# Setup a test user/database
```
$ su postgres

$ psql
# CREATE USER tester WITH ENCRYPTED PASSWORD 'test';
# CREATE DATABASE testdb OWNER tester ENCODING 'utf-8';

$ psql -h localhost -U tester -d testdb
```
