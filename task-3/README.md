# Task-3

- Dockerized your REST service of Homework II
  - Dockerhub account: **zydiii**
  - Docker file: **./Dockerfile**
  - Docker commands
    - **build** Build an image from a Dockerfile
    - **push** Push an image or a repository to a registry
    - **pull** Pull an image or a repository from a registry
    - **run** Run a command in a new container
    - **exec** Run a command in a running container
- Deliverables
  - Docker image, pushed to dockerhub
  - Docker file & Readme.md

## How to use this image

### Pull the image

```
$ docker pull zydiii/wordladder:v1.0
```
or you can enter:
```
$ docker pull zydiii/wordladder
```
to use the default tag: latest.

When pull is done, you can use:
```
$ docker images
```
and you can see zydiii/wordladder has been successfully added to the docker images.

### Run the image

```
docker run -it -p 80:8088 -d zydiii/wordladder
```
Then you can visit **localhost:80** to use wordladder. You can change **80** to whatever you'd like. **-d** means you run it background, however, you can remove it to run it foreground.

### Login

- Username: user
- Password: password

Then you can visit wordladder.

### EXEC
Use
```
$ docker ps
```
to get the CONTAINER ID.
```
$ docker exec -it $CONTAINER ID$ /bin/bash
```
Then you can execute the commands, and enter exit to quit.

### Stop the image
```
$ docker stop $CONTAINER ID$
```
### Remove the image
```
$ docker rmi zydiii/wordladder:$tag$
```