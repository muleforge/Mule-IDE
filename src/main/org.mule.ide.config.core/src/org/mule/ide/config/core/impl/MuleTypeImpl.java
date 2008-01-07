/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.core.AbstractConnectorType;
import org.mule.ide.config.core.AbstractExtensionType;
import org.mule.ide.config.core.AbstractFilterType;
import org.mule.ide.config.core.AbstractGlobalEndpointType;
import org.mule.ide.config.core.AbstractModelType;
import org.mule.ide.config.core.AbstractSecurityManagerType;
import org.mule.ide.config.core.AbstractTransactionFactoryType;
import org.mule.ide.config.core.AbstractTransactionManagerType;
import org.mule.ide.config.core.AbstractTransformerType;
import org.mule.ide.config.core.AdminAgentType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.DescriptionType;
import org.mule.ide.config.core.EnvironmentPropertyType;
import org.mule.ide.config.core.ManagementContextType;
import org.mule.ide.config.core.MuleType;

import org.mule.ide.config.core.NotificationManagerType;
import org.mule.ide.config.spring.BeanType;
import org.mule.ide.config.spring.BeansType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mule Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.MuleTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleTypeImpl#getEnvironmentProperty <em>Environment Property</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleTypeImpl#getAdminAgent <em>Admin Agent</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleTypeImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleTypeImpl#getNotifications <em>Notifications</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleTypeImpl#getAbstractExtensionGroup <em>Abstract Extension Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleTypeImpl#getAbstractExtension <em>Abstract Extension</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleTypeImpl#getAbstractSecurityManagerGroup <em>Abstract Security Manager Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleTypeImpl#getAbstractSecurityManager <em>Abstract Security Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleTypeImpl#getAbstractTransactionManagerGroup <em>Abstract Transaction Manager Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleTypeImpl#getAbstractTransactionManager <em>Abstract Transaction Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleTypeImpl#getAbstractTransactionFactoryGroup <em>Abstract Transaction Factory Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleTypeImpl#getAbstractTransactionFactory <em>Abstract Transaction Factory</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleTypeImpl#getAbstractConnectorGroup <em>Abstract Connector Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleTypeImpl#getAbstractConnector <em>Abstract Connector</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleTypeImpl#getAbstractGlobalEndpointGroup <em>Abstract Global Endpoint Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleTypeImpl#getAbstractGlobalEndpoint <em>Abstract Global Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleTypeImpl#getAbstractTransformerGroup <em>Abstract Transformer Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleTypeImpl#getAbstractTransformer <em>Abstract Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleTypeImpl#getAbstractFilterGroup <em>Abstract Filter Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleTypeImpl#getAbstractFilter <em>Abstract Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleTypeImpl#getAbstractModelGroup <em>Abstract Model Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleTypeImpl#getAbstractModel <em>Abstract Model</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleTypeImpl#getBeans <em>Beans</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleTypeImpl#getBean <em>Bean</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.MuleTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MuleTypeImpl extends EObjectImpl implements MuleType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MuleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getMuleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CorePackage.MULE_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnvironmentPropertyType> getEnvironmentProperty() {
		return getGroup().list(CorePackage.eINSTANCE.getMuleType_EnvironmentProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdminAgentType> getAdminAgent() {
		return getGroup().list(CorePackage.eINSTANCE.getMuleType_AdminAgent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManagementContextType> getConfiguration() {
		return getGroup().list(CorePackage.eINSTANCE.getMuleType_Configuration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NotificationManagerType> getNotifications() {
		return getGroup().list(CorePackage.eINSTANCE.getMuleType_Notifications());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DescriptionType> getDescription() {
		return getGroup().list(CorePackage.eINSTANCE.getMuleType_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractExtensionGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(CorePackage.eINSTANCE.getMuleType_AbstractExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractExtensionType> getAbstractExtension() {
		return getAbstractExtensionGroup().list(CorePackage.eINSTANCE.getMuleType_AbstractExtension());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractSecurityManagerGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(CorePackage.eINSTANCE.getMuleType_AbstractSecurityManagerGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractSecurityManagerType> getAbstractSecurityManager() {
		return getAbstractSecurityManagerGroup().list(CorePackage.eINSTANCE.getMuleType_AbstractSecurityManager());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractTransactionManagerGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(CorePackage.eINSTANCE.getMuleType_AbstractTransactionManagerGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractTransactionManagerType> getAbstractTransactionManager() {
		return getAbstractTransactionManagerGroup().list(CorePackage.eINSTANCE.getMuleType_AbstractTransactionManager());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractTransactionFactoryGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(CorePackage.eINSTANCE.getMuleType_AbstractTransactionFactoryGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractTransactionFactoryType> getAbstractTransactionFactory() {
		return getAbstractTransactionFactoryGroup().list(CorePackage.eINSTANCE.getMuleType_AbstractTransactionFactory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractConnectorGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(CorePackage.eINSTANCE.getMuleType_AbstractConnectorGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractConnectorType> getAbstractConnector() {
		return getAbstractConnectorGroup().list(CorePackage.eINSTANCE.getMuleType_AbstractConnector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractGlobalEndpointGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(CorePackage.eINSTANCE.getMuleType_AbstractGlobalEndpointGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractGlobalEndpointType> getAbstractGlobalEndpoint() {
		return getAbstractGlobalEndpointGroup().list(CorePackage.eINSTANCE.getMuleType_AbstractGlobalEndpoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractTransformerGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(CorePackage.eINSTANCE.getMuleType_AbstractTransformerGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractTransformerType> getAbstractTransformer() {
		return getAbstractTransformerGroup().list(CorePackage.eINSTANCE.getMuleType_AbstractTransformer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractFilterGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(CorePackage.eINSTANCE.getMuleType_AbstractFilterGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractFilterType> getAbstractFilter() {
		return getAbstractFilterGroup().list(CorePackage.eINSTANCE.getMuleType_AbstractFilter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractModelGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(CorePackage.eINSTANCE.getMuleType_AbstractModelGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractModelType> getAbstractModel() {
		return getAbstractModelGroup().list(CorePackage.eINSTANCE.getMuleType_AbstractModel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BeansType> getBeans() {
		return getGroup().list(CorePackage.eINSTANCE.getMuleType_Beans());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BeanType> getBean() {
		return getGroup().list(CorePackage.eINSTANCE.getMuleType_Bean());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MULE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.MULE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.MULE_TYPE__ENVIRONMENT_PROPERTY:
				return ((InternalEList<?>)getEnvironmentProperty()).basicRemove(otherEnd, msgs);
			case CorePackage.MULE_TYPE__ADMIN_AGENT:
				return ((InternalEList<?>)getAdminAgent()).basicRemove(otherEnd, msgs);
			case CorePackage.MULE_TYPE__CONFIGURATION:
				return ((InternalEList<?>)getConfiguration()).basicRemove(otherEnd, msgs);
			case CorePackage.MULE_TYPE__NOTIFICATIONS:
				return ((InternalEList<?>)getNotifications()).basicRemove(otherEnd, msgs);
			case CorePackage.MULE_TYPE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case CorePackage.MULE_TYPE__ABSTRACT_EXTENSION_GROUP:
				return ((InternalEList<?>)getAbstractExtensionGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.MULE_TYPE__ABSTRACT_EXTENSION:
				return ((InternalEList<?>)getAbstractExtension()).basicRemove(otherEnd, msgs);
			case CorePackage.MULE_TYPE__ABSTRACT_SECURITY_MANAGER_GROUP:
				return ((InternalEList<?>)getAbstractSecurityManagerGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.MULE_TYPE__ABSTRACT_SECURITY_MANAGER:
				return ((InternalEList<?>)getAbstractSecurityManager()).basicRemove(otherEnd, msgs);
			case CorePackage.MULE_TYPE__ABSTRACT_TRANSACTION_MANAGER_GROUP:
				return ((InternalEList<?>)getAbstractTransactionManagerGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.MULE_TYPE__ABSTRACT_TRANSACTION_MANAGER:
				return ((InternalEList<?>)getAbstractTransactionManager()).basicRemove(otherEnd, msgs);
			case CorePackage.MULE_TYPE__ABSTRACT_TRANSACTION_FACTORY_GROUP:
				return ((InternalEList<?>)getAbstractTransactionFactoryGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.MULE_TYPE__ABSTRACT_TRANSACTION_FACTORY:
				return ((InternalEList<?>)getAbstractTransactionFactory()).basicRemove(otherEnd, msgs);
			case CorePackage.MULE_TYPE__ABSTRACT_CONNECTOR_GROUP:
				return ((InternalEList<?>)getAbstractConnectorGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.MULE_TYPE__ABSTRACT_CONNECTOR:
				return ((InternalEList<?>)getAbstractConnector()).basicRemove(otherEnd, msgs);
			case CorePackage.MULE_TYPE__ABSTRACT_GLOBAL_ENDPOINT_GROUP:
				return ((InternalEList<?>)getAbstractGlobalEndpointGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.MULE_TYPE__ABSTRACT_GLOBAL_ENDPOINT:
				return ((InternalEList<?>)getAbstractGlobalEndpoint()).basicRemove(otherEnd, msgs);
			case CorePackage.MULE_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				return ((InternalEList<?>)getAbstractTransformerGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.MULE_TYPE__ABSTRACT_TRANSFORMER:
				return ((InternalEList<?>)getAbstractTransformer()).basicRemove(otherEnd, msgs);
			case CorePackage.MULE_TYPE__ABSTRACT_FILTER_GROUP:
				return ((InternalEList<?>)getAbstractFilterGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.MULE_TYPE__ABSTRACT_FILTER:
				return ((InternalEList<?>)getAbstractFilter()).basicRemove(otherEnd, msgs);
			case CorePackage.MULE_TYPE__ABSTRACT_MODEL_GROUP:
				return ((InternalEList<?>)getAbstractModelGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.MULE_TYPE__ABSTRACT_MODEL:
				return ((InternalEList<?>)getAbstractModel()).basicRemove(otherEnd, msgs);
			case CorePackage.MULE_TYPE__BEANS:
				return ((InternalEList<?>)getBeans()).basicRemove(otherEnd, msgs);
			case CorePackage.MULE_TYPE__BEAN:
				return ((InternalEList<?>)getBean()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.MULE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CorePackage.MULE_TYPE__ENVIRONMENT_PROPERTY:
				return getEnvironmentProperty();
			case CorePackage.MULE_TYPE__ADMIN_AGENT:
				return getAdminAgent();
			case CorePackage.MULE_TYPE__CONFIGURATION:
				return getConfiguration();
			case CorePackage.MULE_TYPE__NOTIFICATIONS:
				return getNotifications();
			case CorePackage.MULE_TYPE__DESCRIPTION:
				return getDescription();
			case CorePackage.MULE_TYPE__ABSTRACT_EXTENSION_GROUP:
				if (coreType) return getAbstractExtensionGroup();
				return ((FeatureMap.Internal)getAbstractExtensionGroup()).getWrapper();
			case CorePackage.MULE_TYPE__ABSTRACT_EXTENSION:
				return getAbstractExtension();
			case CorePackage.MULE_TYPE__ABSTRACT_SECURITY_MANAGER_GROUP:
				if (coreType) return getAbstractSecurityManagerGroup();
				return ((FeatureMap.Internal)getAbstractSecurityManagerGroup()).getWrapper();
			case CorePackage.MULE_TYPE__ABSTRACT_SECURITY_MANAGER:
				return getAbstractSecurityManager();
			case CorePackage.MULE_TYPE__ABSTRACT_TRANSACTION_MANAGER_GROUP:
				if (coreType) return getAbstractTransactionManagerGroup();
				return ((FeatureMap.Internal)getAbstractTransactionManagerGroup()).getWrapper();
			case CorePackage.MULE_TYPE__ABSTRACT_TRANSACTION_MANAGER:
				return getAbstractTransactionManager();
			case CorePackage.MULE_TYPE__ABSTRACT_TRANSACTION_FACTORY_GROUP:
				if (coreType) return getAbstractTransactionFactoryGroup();
				return ((FeatureMap.Internal)getAbstractTransactionFactoryGroup()).getWrapper();
			case CorePackage.MULE_TYPE__ABSTRACT_TRANSACTION_FACTORY:
				return getAbstractTransactionFactory();
			case CorePackage.MULE_TYPE__ABSTRACT_CONNECTOR_GROUP:
				if (coreType) return getAbstractConnectorGroup();
				return ((FeatureMap.Internal)getAbstractConnectorGroup()).getWrapper();
			case CorePackage.MULE_TYPE__ABSTRACT_CONNECTOR:
				return getAbstractConnector();
			case CorePackage.MULE_TYPE__ABSTRACT_GLOBAL_ENDPOINT_GROUP:
				if (coreType) return getAbstractGlobalEndpointGroup();
				return ((FeatureMap.Internal)getAbstractGlobalEndpointGroup()).getWrapper();
			case CorePackage.MULE_TYPE__ABSTRACT_GLOBAL_ENDPOINT:
				return getAbstractGlobalEndpoint();
			case CorePackage.MULE_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				if (coreType) return getAbstractTransformerGroup();
				return ((FeatureMap.Internal)getAbstractTransformerGroup()).getWrapper();
			case CorePackage.MULE_TYPE__ABSTRACT_TRANSFORMER:
				return getAbstractTransformer();
			case CorePackage.MULE_TYPE__ABSTRACT_FILTER_GROUP:
				if (coreType) return getAbstractFilterGroup();
				return ((FeatureMap.Internal)getAbstractFilterGroup()).getWrapper();
			case CorePackage.MULE_TYPE__ABSTRACT_FILTER:
				return getAbstractFilter();
			case CorePackage.MULE_TYPE__ABSTRACT_MODEL_GROUP:
				if (coreType) return getAbstractModelGroup();
				return ((FeatureMap.Internal)getAbstractModelGroup()).getWrapper();
			case CorePackage.MULE_TYPE__ABSTRACT_MODEL:
				return getAbstractModel();
			case CorePackage.MULE_TYPE__BEANS:
				return getBeans();
			case CorePackage.MULE_TYPE__BEAN:
				return getBean();
			case CorePackage.MULE_TYPE__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.MULE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CorePackage.MULE_TYPE__ENVIRONMENT_PROPERTY:
				getEnvironmentProperty().clear();
				getEnvironmentProperty().addAll((Collection<? extends EnvironmentPropertyType>)newValue);
				return;
			case CorePackage.MULE_TYPE__ADMIN_AGENT:
				getAdminAgent().clear();
				getAdminAgent().addAll((Collection<? extends AdminAgentType>)newValue);
				return;
			case CorePackage.MULE_TYPE__CONFIGURATION:
				getConfiguration().clear();
				getConfiguration().addAll((Collection<? extends ManagementContextType>)newValue);
				return;
			case CorePackage.MULE_TYPE__NOTIFICATIONS:
				getNotifications().clear();
				getNotifications().addAll((Collection<? extends NotificationManagerType>)newValue);
				return;
			case CorePackage.MULE_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends DescriptionType>)newValue);
				return;
			case CorePackage.MULE_TYPE__ABSTRACT_EXTENSION_GROUP:
				((FeatureMap.Internal)getAbstractExtensionGroup()).set(newValue);
				return;
			case CorePackage.MULE_TYPE__ABSTRACT_SECURITY_MANAGER_GROUP:
				((FeatureMap.Internal)getAbstractSecurityManagerGroup()).set(newValue);
				return;
			case CorePackage.MULE_TYPE__ABSTRACT_TRANSACTION_MANAGER_GROUP:
				((FeatureMap.Internal)getAbstractTransactionManagerGroup()).set(newValue);
				return;
			case CorePackage.MULE_TYPE__ABSTRACT_TRANSACTION_FACTORY_GROUP:
				((FeatureMap.Internal)getAbstractTransactionFactoryGroup()).set(newValue);
				return;
			case CorePackage.MULE_TYPE__ABSTRACT_CONNECTOR_GROUP:
				((FeatureMap.Internal)getAbstractConnectorGroup()).set(newValue);
				return;
			case CorePackage.MULE_TYPE__ABSTRACT_GLOBAL_ENDPOINT_GROUP:
				((FeatureMap.Internal)getAbstractGlobalEndpointGroup()).set(newValue);
				return;
			case CorePackage.MULE_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				((FeatureMap.Internal)getAbstractTransformerGroup()).set(newValue);
				return;
			case CorePackage.MULE_TYPE__ABSTRACT_FILTER_GROUP:
				((FeatureMap.Internal)getAbstractFilterGroup()).set(newValue);
				return;
			case CorePackage.MULE_TYPE__ABSTRACT_MODEL_GROUP:
				((FeatureMap.Internal)getAbstractModelGroup()).set(newValue);
				return;
			case CorePackage.MULE_TYPE__BEANS:
				getBeans().clear();
				getBeans().addAll((Collection<? extends BeansType>)newValue);
				return;
			case CorePackage.MULE_TYPE__BEAN:
				getBean().clear();
				getBean().addAll((Collection<? extends BeanType>)newValue);
				return;
			case CorePackage.MULE_TYPE__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.MULE_TYPE__GROUP:
				getGroup().clear();
				return;
			case CorePackage.MULE_TYPE__ENVIRONMENT_PROPERTY:
				getEnvironmentProperty().clear();
				return;
			case CorePackage.MULE_TYPE__ADMIN_AGENT:
				getAdminAgent().clear();
				return;
			case CorePackage.MULE_TYPE__CONFIGURATION:
				getConfiguration().clear();
				return;
			case CorePackage.MULE_TYPE__NOTIFICATIONS:
				getNotifications().clear();
				return;
			case CorePackage.MULE_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case CorePackage.MULE_TYPE__ABSTRACT_EXTENSION_GROUP:
				getAbstractExtensionGroup().clear();
				return;
			case CorePackage.MULE_TYPE__ABSTRACT_SECURITY_MANAGER_GROUP:
				getAbstractSecurityManagerGroup().clear();
				return;
			case CorePackage.MULE_TYPE__ABSTRACT_TRANSACTION_MANAGER_GROUP:
				getAbstractTransactionManagerGroup().clear();
				return;
			case CorePackage.MULE_TYPE__ABSTRACT_TRANSACTION_FACTORY_GROUP:
				getAbstractTransactionFactoryGroup().clear();
				return;
			case CorePackage.MULE_TYPE__ABSTRACT_CONNECTOR_GROUP:
				getAbstractConnectorGroup().clear();
				return;
			case CorePackage.MULE_TYPE__ABSTRACT_GLOBAL_ENDPOINT_GROUP:
				getAbstractGlobalEndpointGroup().clear();
				return;
			case CorePackage.MULE_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				getAbstractTransformerGroup().clear();
				return;
			case CorePackage.MULE_TYPE__ABSTRACT_FILTER_GROUP:
				getAbstractFilterGroup().clear();
				return;
			case CorePackage.MULE_TYPE__ABSTRACT_MODEL_GROUP:
				getAbstractModelGroup().clear();
				return;
			case CorePackage.MULE_TYPE__BEANS:
				getBeans().clear();
				return;
			case CorePackage.MULE_TYPE__BEAN:
				getBean().clear();
				return;
			case CorePackage.MULE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.MULE_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case CorePackage.MULE_TYPE__ENVIRONMENT_PROPERTY:
				return !getEnvironmentProperty().isEmpty();
			case CorePackage.MULE_TYPE__ADMIN_AGENT:
				return !getAdminAgent().isEmpty();
			case CorePackage.MULE_TYPE__CONFIGURATION:
				return !getConfiguration().isEmpty();
			case CorePackage.MULE_TYPE__NOTIFICATIONS:
				return !getNotifications().isEmpty();
			case CorePackage.MULE_TYPE__DESCRIPTION:
				return !getDescription().isEmpty();
			case CorePackage.MULE_TYPE__ABSTRACT_EXTENSION_GROUP:
				return !getAbstractExtensionGroup().isEmpty();
			case CorePackage.MULE_TYPE__ABSTRACT_EXTENSION:
				return !getAbstractExtension().isEmpty();
			case CorePackage.MULE_TYPE__ABSTRACT_SECURITY_MANAGER_GROUP:
				return !getAbstractSecurityManagerGroup().isEmpty();
			case CorePackage.MULE_TYPE__ABSTRACT_SECURITY_MANAGER:
				return !getAbstractSecurityManager().isEmpty();
			case CorePackage.MULE_TYPE__ABSTRACT_TRANSACTION_MANAGER_GROUP:
				return !getAbstractTransactionManagerGroup().isEmpty();
			case CorePackage.MULE_TYPE__ABSTRACT_TRANSACTION_MANAGER:
				return !getAbstractTransactionManager().isEmpty();
			case CorePackage.MULE_TYPE__ABSTRACT_TRANSACTION_FACTORY_GROUP:
				return !getAbstractTransactionFactoryGroup().isEmpty();
			case CorePackage.MULE_TYPE__ABSTRACT_TRANSACTION_FACTORY:
				return !getAbstractTransactionFactory().isEmpty();
			case CorePackage.MULE_TYPE__ABSTRACT_CONNECTOR_GROUP:
				return !getAbstractConnectorGroup().isEmpty();
			case CorePackage.MULE_TYPE__ABSTRACT_CONNECTOR:
				return !getAbstractConnector().isEmpty();
			case CorePackage.MULE_TYPE__ABSTRACT_GLOBAL_ENDPOINT_GROUP:
				return !getAbstractGlobalEndpointGroup().isEmpty();
			case CorePackage.MULE_TYPE__ABSTRACT_GLOBAL_ENDPOINT:
				return !getAbstractGlobalEndpoint().isEmpty();
			case CorePackage.MULE_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				return !getAbstractTransformerGroup().isEmpty();
			case CorePackage.MULE_TYPE__ABSTRACT_TRANSFORMER:
				return !getAbstractTransformer().isEmpty();
			case CorePackage.MULE_TYPE__ABSTRACT_FILTER_GROUP:
				return !getAbstractFilterGroup().isEmpty();
			case CorePackage.MULE_TYPE__ABSTRACT_FILTER:
				return !getAbstractFilter().isEmpty();
			case CorePackage.MULE_TYPE__ABSTRACT_MODEL_GROUP:
				return !getAbstractModelGroup().isEmpty();
			case CorePackage.MULE_TYPE__ABSTRACT_MODEL:
				return !getAbstractModel().isEmpty();
			case CorePackage.MULE_TYPE__BEANS:
				return !getBeans().isEmpty();
			case CorePackage.MULE_TYPE__BEAN:
				return !getBean().isEmpty();
			case CorePackage.MULE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MuleTypeImpl
