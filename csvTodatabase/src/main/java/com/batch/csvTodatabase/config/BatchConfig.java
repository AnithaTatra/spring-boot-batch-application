package com.batch.csvTodatabase.config;

import com.batch.csvTodatabase.repository.VisitorRepository;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableBatchProcessing
public class BatchConfig {

    @Autowired
    VisitorRepository visitorRepository;
    @Autowired
    JobRepository jobRepository;
    @Autowired
    JobBuilder jobBuilder;
    @Autowired
    StepBuilder stepBuilder;
    @Autowired
    PlatformTransactionManager transactionManager;





}
