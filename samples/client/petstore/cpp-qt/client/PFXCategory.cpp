/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "PFXCategory.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "PFXHelpers.h"

namespace test_namespace {

PFXCategory::PFXCategory(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

PFXCategory::PFXCategory() {
    this->initializeModel();
}

PFXCategory::~PFXCategory() {}

void PFXCategory::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_name_isSet = false;
    m_name_isValid = false;
}

void PFXCategory::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void PFXCategory::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::test_namespace::fromJsonValue(m_id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_name_isValid = ::test_namespace::fromJsonValue(m_name, json[QString("name")]);
    m_name_isSet = !json[QString("name")].isNull() && m_name_isValid;
}

QString PFXCategory::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject PFXCategory::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::test_namespace::toJsonValue(m_id));
    }
    if (m_name_isSet) {
        obj.insert(QString("name"), ::test_namespace::toJsonValue(m_name));
    }
    return obj;
}

qint64 PFXCategory::getId() const {
    return m_id;
}
void PFXCategory::setId(const qint64 &id) {
    m_id = id;
    m_id_isSet = true;
}

bool PFXCategory::is_id_Set() const{
    return m_id_isSet;
}

bool PFXCategory::is_id_Valid() const{
    return m_id_isValid;
}

QString PFXCategory::getName() const {
    return m_name;
}
void PFXCategory::setName(const QString &name) {
    m_name = name;
    m_name_isSet = true;
}

bool PFXCategory::is_name_Set() const{
    return m_name_isSet;
}

bool PFXCategory::is_name_Valid() const{
    return m_name_isValid;
}

bool PFXCategory::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_name_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool PFXCategory::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace test_namespace
