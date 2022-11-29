# Microserviço Professor

Exemplo de projeto de implementação de microserviço usando java spring boot
e Banco de dados postgres sendo publicado no kubernetes (minikube)

comando para BUILD e criação da imagem e dos containers usando docker-compose:

```
docker-compose up -d
```

comando para BUILD da imagem:

```
docker build -t professorms:latest .
```

### EXAMPLE MINIKUBE

#### K8s manifest files
* postgres-config.yaml
* postgres-secret.yaml
* postgres.yaml
* spring-boot.yaml

#### K8s commands

##### start Minikube and check status
    minikube start --vm-driver=hyperkit 
    minikube status

##### comandos para mudar para o registry local ao inves do docker hub
    minikube docker-env
    minikube docker-env | Invoke-Expression
    docker images

##### get minikube node's ip address
    minikube ip

##### get basic info about k8s components
    kubectl get node
    kubectl get pod
    kubectl get svc
    kubectl get all

##### apply file to k8s
    kubectl apply -f file_name.yaml

##### get extended info about components
    kubectl get pod -o wide
    kubectl get node -o wide

##### get detailed info about a specific component
    kubectl describe svc {svc-name}
    kubectl describe pod {pod-name}

##### get application logs
    kubectl logs {pod-name}
#### dashboards minikube
    minikube dashboard
##### stop your Minikube cluster
    minikube stop

#### abrir browser com url do serviço
    minikube service webapp-service

<br />

#### Links
* minikube docs: https://minikube.sigs.k8s.io/docs/start/
* k8s official documentation: https://kubernetes.io/docs/home/
* exemplo de webapp mongo + node code repo: https://gitlab.com/nanuchi/developing-with-docker/-/tree/feature/k8s-in-hour
* mongodb image on Docker Hub: https://hub.docker.com/_/mongo
* rodando minikube com local images no windows: https://medium.com/@maumribeiro/running-your-own-docker-images-in-minikube-for-windows-ea7383d931f6
* webapp image on Docker Hub: https://hub.docker.com/repository/docker/nanajanashia/k8s-demo-app

