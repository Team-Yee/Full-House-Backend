package github.yee.fullhousebackend.database.config

import io.r2dbc.spi.ConnectionFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.r2dbc.connection.R2dbcTransactionManager
import org.springframework.transaction.annotation.EnableTransactionManagement

@Configuration
@EnableTransactionManagement
class R2dbcTransactionConfig {

    @Bean
    fun r2DbcTransactionManager(connectionFactory: ConnectionFactory) = R2dbcTransactionManager(connectionFactory)
}
