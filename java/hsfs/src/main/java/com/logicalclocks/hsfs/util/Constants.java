/*
 *  Copyright (c) 2020-2023. Hopsworks AB
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 *  See the License for the specific language governing permissions and limitations under the License.
 *
 */

package com.logicalclocks.hsfs.util;

import java.util.Arrays;
import java.util.List;

public class Constants {

  // env vars
  public static final String PROJECTNAME_ENV = "hopsworks.projectname";

  public static final String FEATURESTORE_SUFFIX = "_featurestore";

  public static final List<String> COMPLEX_FEATURE_TYPES = Arrays.asList("MAP", "ARRAY", "STRUCT", "UNIONTYPE");

  public static final String HIVE_FORMAT = "hive";
  public static final String JDBC_FORMAT = "jdbc";
  public static final String KAFKA_FORMAT = "kafka";
  public static final String SNOWFLAKE_FORMAT = "net.snowflake.spark.snowflake";
  public static final String BIGQUERY_FORMAT = "bigquery";

  // Spark options
  public static final String DELIMITER = "delimiter";
  public static final String HEADER = "header";
  public static final String INFER_SCHEMA = "inferSchema";
  public static final String JDBC_USER = "user";
  public static final String JDBC_PWD = "password";
  public static final String JDBC_URL = "url";
  public static final String JDBC_TABLE = "dbtable";
  public static final String JDBC_DRIVER = "driver";

  public static final String TF_CONNECTOR_RECORD_TYPE = "recordType";

  public static final String S3_SCHEME = "s3://";
  public static final String S3_SPARK_SCHEME = "s3a://";

  public static final String S3_ACCESS_KEY_ENV = "fs.s3a.access.key";
  public static final String S3_SECRET_KEY_ENV = "fs.s3a.secret.key";
  public static final String S3_SESSION_KEY_ENV = "fs.s3a.session.token";
  public static final String S3_CREDENTIAL_PROVIDER_ENV = "fs.s3a.aws.credentials.provider";
  public static final String S3_TEMPORARY_CREDENTIAL_PROVIDER =
      "org.apache.hadoop.fs.s3a.TemporaryAWSCredentialsProvider";
  public static final String S3_ENDPOINT = "fs.s3a.endpoint";
  public static final String S3_ENCRYPTION_ALGO = "fs.s3a.server-side-encryption-algorithm";
  public static final String S3_ENCRYPTION_KEY = "fs.s3a.server-side-encryption-key";

  public static final String SNOWFLAKE_USER = "sfUser";
  public static final String SNOWFLAKE_PWD = "sfPassword";
  public static final String SNOWFLAKE_AUTH = "sfAuthenticator";
  public static final String SNOWFLAKE_TOKEN = "sfToken";
  public static final String SNOWFLAKE_URL = "sfURL";
  public static final String SNOWFLAKE_DB = "sfDatabase";
  public static final String SNOWFLAKE_SCHEMA = "sfSchema";
  public static final String SNOWFLAKE_TABLE = "dbtable";
  public static final String SNOWFLAKE_ROLE = "sfRole";
  public static final String SNOWFLAKE_WAREHOUSE = "sfWarehouse";
  public static final String SNOWFLAKE_APPLICATION = "application";

  public static final String KAFKA_BOOTSTRAP_SERVERS = "kafka.bootstrap.servers";
  public static final String KAFKA_SECURITY_PROTOCOL = "kafka.security.protocol";
  public static final String KAFKA_SSL_TRUSTSTORE_LOCATION = "kafka.ssl.truststore.location";
  public static final String KAFKA_SSL_TRUSTSTORE_PASSWORD = "kafka.ssl.truststore.password";
  public static final String KAFKA_SSL_KEYSTORE_LOCATION = "kafka.ssl.keystore.location";
  public static final String KAFKA_SSL_KEYSTORE_PASSWORD = "kafka.ssl.keystore.password";
  public static final String KAFKA_SSL_KEY_PASSWORD = "kafka.ssl.key.password";
  public static final String KAFKA_SSL_ENDPOINT_IDENTIFICATION_ALGORITHM =
      "kafka.ssl.endpoint.identification.algorithm";
  //GCS
  public static final String PROPERTY_KEY_FILE = "fs.gs.auth.service.account.json.keyfile";
  public static final String PROPERTY_ENCRYPTION_KEY = "fs.gs.encryption.key";
  public static final String PROPERTY_ENCRYPTION_HASH = "fs.gs.encryption.key.hash";
  public static final String PROPERTY_ALGORITHM = "fs.gs.encryption.algorithm";
  public static final String PROPERTY_GCS_FS_KEY = "fs.AbstractFileSystem.gs.impl";
  public static final String PROPERTY_GCS_FS_VALUE = "com.google.cloud.hadoop.fs.gcs.GoogleHadoopFS";
  public static final String PROPERTY_GCS_ACCOUNT_ENABLE = "google.cloud.auth.service.account.enable";
  public static final String PROPERTY_GCS_ACCOUNT_EMAIL = "fs.gs.auth.service.account.email";
  public static final String PROPERTY_GCS_ACCOUNT_KEY_ID = "fs.gs.auth.service.account.private.key.id";
  public static final String PROPERTY_GCS_ACCOUNT_KEY = "fs.gs.auth.service.account.private.key";
  // end gcs
  // bigquery constants
  public static final String BIGQ_CREDENTIALS = "credentials";
  public static final String BIGQ_PARENT_PROJECT = "parentProject";
  public static final String BIGQ_MATERIAL_DATASET = "materializationDataset";
  public static final String BIGQ_VIEWS_ENABLED = "viewsEnabled";
  public static final String BIGQ_PROJECT = "project";
  public static final String BIGQ_DATASET = "dataset";
  // end bigq
}
