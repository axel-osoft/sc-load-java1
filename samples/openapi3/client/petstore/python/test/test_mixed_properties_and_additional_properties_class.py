# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest
import datetime

import petstore_api
from petstore_api.models.mixed_properties_and_additional_properties_class import MixedPropertiesAndAdditionalPropertiesClass  # noqa: E501
from petstore_api.rest import ApiException

class TestMixedPropertiesAndAdditionalPropertiesClass(unittest.TestCase):
    """MixedPropertiesAndAdditionalPropertiesClass unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test MixedPropertiesAndAdditionalPropertiesClass
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = petstore_api.models.mixed_properties_and_additional_properties_class.MixedPropertiesAndAdditionalPropertiesClass()  # noqa: E501
        if include_optional :
            return MixedPropertiesAndAdditionalPropertiesClass(
                uuid = '', 
                date_time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                map = {
                    'key' : petstore_api.models.animal.Animal(
                        className = '', 
                        color = 'red', )
                    }
            )
        else :
            return MixedPropertiesAndAdditionalPropertiesClass(
        )

    def testMixedPropertiesAndAdditionalPropertiesClass(self):
        """Test MixedPropertiesAndAdditionalPropertiesClass"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
