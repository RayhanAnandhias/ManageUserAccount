package config;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;

/**
 *
 * @author rayhan & andika
 */
@Configuration
@EnableMongoRepositories("db")
public class MongoConfig extends AbstractMongoConfiguration {

    @Override
    protected String getDatabaseName() {
        return "appl";
    }

    @Override
    public MongoClient mongoClient() {
        return new MongoClient();
    }
    
}
