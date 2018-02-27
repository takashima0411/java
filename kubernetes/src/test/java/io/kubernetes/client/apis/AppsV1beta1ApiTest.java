/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.8.9
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.apis;

import io.kubernetes.client.ApiException;
import io.kubernetes.client.models.AppsV1beta1Deployment;
import io.kubernetes.client.models.AppsV1beta1DeploymentList;
import io.kubernetes.client.models.AppsV1beta1DeploymentRollback;
import io.kubernetes.client.models.AppsV1beta1Scale;
import io.kubernetes.client.models.V1APIResourceList;
import io.kubernetes.client.models.V1DeleteOptions;
import io.kubernetes.client.models.V1Status;
import io.kubernetes.client.models.V1beta1ControllerRevision;
import io.kubernetes.client.models.V1beta1ControllerRevisionList;
import io.kubernetes.client.models.V1beta1StatefulSet;
import io.kubernetes.client.models.V1beta1StatefulSetList;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AppsV1beta1Api
 */
@Ignore
public class AppsV1beta1ApiTest {

    private final AppsV1beta1Api api = new AppsV1beta1Api();

    
    /**
     * 
     *
     * create a ControllerRevision
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNamespacedControllerRevisionTest() throws ApiException {
        String namespace = null;
        V1beta1ControllerRevision body = null;
        String pretty = null;
        V1beta1ControllerRevision response = api.createNamespacedControllerRevision(namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * create a Deployment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNamespacedDeploymentTest() throws ApiException {
        String namespace = null;
        AppsV1beta1Deployment body = null;
        String pretty = null;
        AppsV1beta1Deployment response = api.createNamespacedDeployment(namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * create rollback of a Deployment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNamespacedDeploymentRollbackTest() throws ApiException {
        String name = null;
        String namespace = null;
        AppsV1beta1DeploymentRollback body = null;
        String pretty = null;
        AppsV1beta1DeploymentRollback response = api.createNamespacedDeploymentRollback(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * create a StatefulSet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNamespacedStatefulSetTest() throws ApiException {
        String namespace = null;
        V1beta1StatefulSet body = null;
        String pretty = null;
        V1beta1StatefulSet response = api.createNamespacedStatefulSet(namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of ControllerRevision
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionNamespacedControllerRevisionTest() throws ApiException {
        String namespace = null;
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1Status response = api.deleteCollectionNamespacedControllerRevision(namespace, pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of Deployment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionNamespacedDeploymentTest() throws ApiException {
        String namespace = null;
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1Status response = api.deleteCollectionNamespacedDeployment(namespace, pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete collection of StatefulSet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionNamespacedStatefulSetTest() throws ApiException {
        String namespace = null;
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1Status response = api.deleteCollectionNamespacedStatefulSet(namespace, pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a ControllerRevision
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNamespacedControllerRevisionTest() throws ApiException {
        String name = null;
        String namespace = null;
        V1DeleteOptions body = null;
        String pretty = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        V1Status response = api.deleteNamespacedControllerRevision(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a Deployment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNamespacedDeploymentTest() throws ApiException {
        String name = null;
        String namespace = null;
        V1DeleteOptions body = null;
        String pretty = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        V1Status response = api.deleteNamespacedDeployment(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * delete a StatefulSet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNamespacedStatefulSetTest() throws ApiException {
        String name = null;
        String namespace = null;
        V1DeleteOptions body = null;
        String pretty = null;
        Integer gracePeriodSeconds = null;
        Boolean orphanDependents = null;
        String propagationPolicy = null;
        V1Status response = api.deleteNamespacedStatefulSet(name, namespace, body, pretty, gracePeriodSeconds, orphanDependents, propagationPolicy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * get available resources
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAPIResourcesTest() throws ApiException {
        V1APIResourceList response = api.getAPIResources();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind ControllerRevision
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listControllerRevisionForAllNamespacesTest() throws ApiException {
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1beta1ControllerRevisionList response = api.listControllerRevisionForAllNamespaces(_continue, fieldSelector, includeUninitialized, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind Deployment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listDeploymentForAllNamespacesTest() throws ApiException {
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        AppsV1beta1DeploymentList response = api.listDeploymentForAllNamespaces(_continue, fieldSelector, includeUninitialized, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind ControllerRevision
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listNamespacedControllerRevisionTest() throws ApiException {
        String namespace = null;
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1beta1ControllerRevisionList response = api.listNamespacedControllerRevision(namespace, pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind Deployment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listNamespacedDeploymentTest() throws ApiException {
        String namespace = null;
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        AppsV1beta1DeploymentList response = api.listNamespacedDeployment(namespace, pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind StatefulSet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listNamespacedStatefulSetTest() throws ApiException {
        String namespace = null;
        String pretty = null;
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1beta1StatefulSetList response = api.listNamespacedStatefulSet(namespace, pretty, _continue, fieldSelector, includeUninitialized, labelSelector, limit, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * list or watch objects of kind StatefulSet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listStatefulSetForAllNamespacesTest() throws ApiException {
        String _continue = null;
        String fieldSelector = null;
        Boolean includeUninitialized = null;
        String labelSelector = null;
        Integer limit = null;
        String pretty = null;
        String resourceVersion = null;
        Integer timeoutSeconds = null;
        Boolean watch = null;
        V1beta1StatefulSetList response = api.listStatefulSetForAllNamespaces(_continue, fieldSelector, includeUninitialized, labelSelector, limit, pretty, resourceVersion, timeoutSeconds, watch);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified ControllerRevision
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchNamespacedControllerRevisionTest() throws ApiException {
        String name = null;
        String namespace = null;
        Object body = null;
        String pretty = null;
        V1beta1ControllerRevision response = api.patchNamespacedControllerRevision(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified Deployment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchNamespacedDeploymentTest() throws ApiException {
        String name = null;
        String namespace = null;
        Object body = null;
        String pretty = null;
        AppsV1beta1Deployment response = api.patchNamespacedDeployment(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update scale of the specified Deployment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchNamespacedDeploymentScaleTest() throws ApiException {
        String name = null;
        String namespace = null;
        Object body = null;
        String pretty = null;
        AppsV1beta1Scale response = api.patchNamespacedDeploymentScale(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update status of the specified Deployment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchNamespacedDeploymentStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        Object body = null;
        String pretty = null;
        AppsV1beta1Deployment response = api.patchNamespacedDeploymentStatus(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update the specified StatefulSet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchNamespacedStatefulSetTest() throws ApiException {
        String name = null;
        String namespace = null;
        Object body = null;
        String pretty = null;
        V1beta1StatefulSet response = api.patchNamespacedStatefulSet(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update scale of the specified StatefulSet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchNamespacedStatefulSetScaleTest() throws ApiException {
        String name = null;
        String namespace = null;
        Object body = null;
        String pretty = null;
        AppsV1beta1Scale response = api.patchNamespacedStatefulSetScale(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * partially update status of the specified StatefulSet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchNamespacedStatefulSetStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        Object body = null;
        String pretty = null;
        V1beta1StatefulSet response = api.patchNamespacedStatefulSetStatus(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified ControllerRevision
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readNamespacedControllerRevisionTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        V1beta1ControllerRevision response = api.readNamespacedControllerRevision(name, namespace, pretty, exact, export);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified Deployment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readNamespacedDeploymentTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        AppsV1beta1Deployment response = api.readNamespacedDeployment(name, namespace, pretty, exact, export);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read scale of the specified Deployment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readNamespacedDeploymentScaleTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        AppsV1beta1Scale response = api.readNamespacedDeploymentScale(name, namespace, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read status of the specified Deployment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readNamespacedDeploymentStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        AppsV1beta1Deployment response = api.readNamespacedDeploymentStatus(name, namespace, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read the specified StatefulSet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readNamespacedStatefulSetTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        Boolean exact = null;
        Boolean export = null;
        V1beta1StatefulSet response = api.readNamespacedStatefulSet(name, namespace, pretty, exact, export);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read scale of the specified StatefulSet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readNamespacedStatefulSetScaleTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        AppsV1beta1Scale response = api.readNamespacedStatefulSetScale(name, namespace, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * read status of the specified StatefulSet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readNamespacedStatefulSetStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        String pretty = null;
        V1beta1StatefulSet response = api.readNamespacedStatefulSetStatus(name, namespace, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified ControllerRevision
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceNamespacedControllerRevisionTest() throws ApiException {
        String name = null;
        String namespace = null;
        V1beta1ControllerRevision body = null;
        String pretty = null;
        V1beta1ControllerRevision response = api.replaceNamespacedControllerRevision(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified Deployment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceNamespacedDeploymentTest() throws ApiException {
        String name = null;
        String namespace = null;
        AppsV1beta1Deployment body = null;
        String pretty = null;
        AppsV1beta1Deployment response = api.replaceNamespacedDeployment(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace scale of the specified Deployment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceNamespacedDeploymentScaleTest() throws ApiException {
        String name = null;
        String namespace = null;
        AppsV1beta1Scale body = null;
        String pretty = null;
        AppsV1beta1Scale response = api.replaceNamespacedDeploymentScale(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace status of the specified Deployment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceNamespacedDeploymentStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        AppsV1beta1Deployment body = null;
        String pretty = null;
        AppsV1beta1Deployment response = api.replaceNamespacedDeploymentStatus(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace the specified StatefulSet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceNamespacedStatefulSetTest() throws ApiException {
        String name = null;
        String namespace = null;
        V1beta1StatefulSet body = null;
        String pretty = null;
        V1beta1StatefulSet response = api.replaceNamespacedStatefulSet(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace scale of the specified StatefulSet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceNamespacedStatefulSetScaleTest() throws ApiException {
        String name = null;
        String namespace = null;
        AppsV1beta1Scale body = null;
        String pretty = null;
        AppsV1beta1Scale response = api.replaceNamespacedStatefulSetScale(name, namespace, body, pretty);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * replace status of the specified StatefulSet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceNamespacedStatefulSetStatusTest() throws ApiException {
        String name = null;
        String namespace = null;
        V1beta1StatefulSet body = null;
        String pretty = null;
        V1beta1StatefulSet response = api.replaceNamespacedStatefulSetStatus(name, namespace, body, pretty);

        // TODO: test validations
    }
    
}
