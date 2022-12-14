# parameter-store-kotlin

Example project to recovery parameters of AWS Parameter Store

## Stack
- [Kotlin](https://kotlinlang.org/) 1.6.21
- [Spring Boot](https://spring.io/projects/spring-boot/) 2.7.3
- [Spring Cloud](https://spring.io/projects/spring-cloud) 2021.0.4

## How to start

### Local
- No need any configuration
- No need internet
- Attribute param receive value `value local`

![Execution Local](./assets/execution_local.png "Parameter param")

### Parameter Store
- Need variable AWS_ACCESS_KEY_ID
- Need variable AWS_SECRET_ACCESS_KEY
- Need variable AWS_REGION
- Configure parameter in [AWS Parameter Store](https://docs.aws.amazon.com/pt_br/systems-manager/latest/userguide/systems-manager-parameter-store.html)

![Parameter store](./assets/parameter_store.png "Parameter param")

![Execution with Aws Parameter store](./assets/execution_remote.png "Parameter param")


## Usefully information

- [Location variable](https://github.com/TiagoBani/parameter-store-kotlin/blob/main/src/main/kotlin/com/tiagobani/parameterstorekotlin/ParameterStoreKotlinApplication.kt#L13)
- [Configuration store](https://github.com/TiagoBani/parameter-store-kotlin/blob/main/src/main/resources/bootstrap.yml)
