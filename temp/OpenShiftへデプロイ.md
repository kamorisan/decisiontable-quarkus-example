Openshift Console: https://console-openshift-console.apps.cluster-463a.463a.sandbox1785.opentlc.com
Openshift API for command line 'oc' client: https://api.cluster-463a.463a.sandbox1785.opentlc.com:6443

## OpenShift Login
export MASTER_URL=https://api.cluster-463a.463a.sandbox1785.opentlc.com:6443
oc login ${MASTER_URL} -u opentlc-mgr -p r3dh4t1! --insecure-skip-tls-verify=true

## プロジェクトの作成
export PJ_NAME=dm-kogito
oc new-project ${PJ_NAME}

### openshift へのデプロイ

## Kogito Operator
oc apply -f operator/kogito-operator.yaml

#### Mavenプラグインを実行して、アプリケーションをパッケージ化します。
mvn clean compile package -DskipTests

## yamlからのインストール
oc apply -f operator/kogito-deploy.yaml -n ${PJ_NAME}

## Binary のアップロード
### oc start-build <Application name> --from-dir=target/ -n <namespace>
oc start-build decisiontable-quarkus-example --from-dir=target/ -n ${PJ_NAME}


## Swagger-UI
http://decisiontable-quarkus-example-dm-kogito.apps.cluster-463a.463a.sandbox1785.opentlc.com/q/swagger-ui/


