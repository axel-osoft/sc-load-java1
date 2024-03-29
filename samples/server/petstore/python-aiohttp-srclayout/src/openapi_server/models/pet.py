# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server.models.category import Category
from openapi_server.models.tag import Tag
from openapi_server import util


class Pet(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id: int=None, category: Category=None, name: str=None, photo_urls: List[str]=None, tags: List[Tag]=None, status: str=None):
        """Pet - a model defined in OpenAPI

        :param id: The id of this Pet.
        :param category: The category of this Pet.
        :param name: The name of this Pet.
        :param photo_urls: The photo_urls of this Pet.
        :param tags: The tags of this Pet.
        :param status: The status of this Pet.
        """
        self.openapi_types = {
            'id': int,
            'category': Category,
            'name': str,
            'photo_urls': List[str],
            'tags': List[Tag],
            'status': str
        }

        self.attribute_map = {
            'id': 'id',
            'category': 'category',
            'name': 'name',
            'photo_urls': 'photoUrls',
            'tags': 'tags',
            'status': 'status'
        }

        self._id = id
        self._category = category
        self._name = name
        self._photo_urls = photo_urls
        self._tags = tags
        self._status = status

    @classmethod
    def from_dict(cls, dikt: dict) -> 'Pet':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The Pet of this Pet.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self):
        """Gets the id of this Pet.


        :return: The id of this Pet.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Pet.


        :param id: The id of this Pet.
        :type id: int
        """

        self._id = id

    @property
    def category(self):
        """Gets the category of this Pet.


        :return: The category of this Pet.
        :rtype: Category
        """
        return self._category

    @category.setter
    def category(self, category):
        """Sets the category of this Pet.


        :param category: The category of this Pet.
        :type category: Category
        """

        self._category = category

    @property
    def name(self):
        """Gets the name of this Pet.


        :return: The name of this Pet.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this Pet.


        :param name: The name of this Pet.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")

        self._name = name

    @property
    def photo_urls(self):
        """Gets the photo_urls of this Pet.


        :return: The photo_urls of this Pet.
        :rtype: List[str]
        """
        return self._photo_urls

    @photo_urls.setter
    def photo_urls(self, photo_urls):
        """Sets the photo_urls of this Pet.


        :param photo_urls: The photo_urls of this Pet.
        :type photo_urls: List[str]
        """
        if photo_urls is None:
            raise ValueError("Invalid value for `photo_urls`, must not be `None`")

        self._photo_urls = photo_urls

    @property
    def tags(self):
        """Gets the tags of this Pet.


        :return: The tags of this Pet.
        :rtype: List[Tag]
        """
        return self._tags

    @tags.setter
    def tags(self, tags):
        """Sets the tags of this Pet.


        :param tags: The tags of this Pet.
        :type tags: List[Tag]
        """

        self._tags = tags

    @property
    def status(self):
        """Gets the status of this Pet.

        pet status in the store

        :return: The status of this Pet.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this Pet.

        pet status in the store

        :param status: The status of this Pet.
        :type status: str
        """
        allowed_values = ["available", "pending", "sold"]  # noqa: E501
        if status not in allowed_values:
            raise ValueError(
                "Invalid value for `status` ({0}), must be one of {1}"
                .format(status, allowed_values)
            )

        self._status = status
