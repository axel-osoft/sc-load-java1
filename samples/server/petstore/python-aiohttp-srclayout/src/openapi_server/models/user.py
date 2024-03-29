# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server import util


class User(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id: int=None, username: str=None, first_name: str=None, last_name: str=None, email: str=None, password: str=None, phone: str=None, user_status: int=None):
        """User - a model defined in OpenAPI

        :param id: The id of this User.
        :param username: The username of this User.
        :param first_name: The first_name of this User.
        :param last_name: The last_name of this User.
        :param email: The email of this User.
        :param password: The password of this User.
        :param phone: The phone of this User.
        :param user_status: The user_status of this User.
        """
        self.openapi_types = {
            'id': int,
            'username': str,
            'first_name': str,
            'last_name': str,
            'email': str,
            'password': str,
            'phone': str,
            'user_status': int
        }

        self.attribute_map = {
            'id': 'id',
            'username': 'username',
            'first_name': 'firstName',
            'last_name': 'lastName',
            'email': 'email',
            'password': 'password',
            'phone': 'phone',
            'user_status': 'userStatus'
        }

        self._id = id
        self._username = username
        self._first_name = first_name
        self._last_name = last_name
        self._email = email
        self._password = password
        self._phone = phone
        self._user_status = user_status

    @classmethod
    def from_dict(cls, dikt: dict) -> 'User':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The User of this User.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self):
        """Gets the id of this User.


        :return: The id of this User.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this User.


        :param id: The id of this User.
        :type id: int
        """

        self._id = id

    @property
    def username(self):
        """Gets the username of this User.


        :return: The username of this User.
        :rtype: str
        """
        return self._username

    @username.setter
    def username(self, username):
        """Sets the username of this User.


        :param username: The username of this User.
        :type username: str
        """

        self._username = username

    @property
    def first_name(self):
        """Gets the first_name of this User.


        :return: The first_name of this User.
        :rtype: str
        """
        return self._first_name

    @first_name.setter
    def first_name(self, first_name):
        """Sets the first_name of this User.


        :param first_name: The first_name of this User.
        :type first_name: str
        """

        self._first_name = first_name

    @property
    def last_name(self):
        """Gets the last_name of this User.


        :return: The last_name of this User.
        :rtype: str
        """
        return self._last_name

    @last_name.setter
    def last_name(self, last_name):
        """Sets the last_name of this User.


        :param last_name: The last_name of this User.
        :type last_name: str
        """

        self._last_name = last_name

    @property
    def email(self):
        """Gets the email of this User.


        :return: The email of this User.
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email):
        """Sets the email of this User.


        :param email: The email of this User.
        :type email: str
        """

        self._email = email

    @property
    def password(self):
        """Gets the password of this User.


        :return: The password of this User.
        :rtype: str
        """
        return self._password

    @password.setter
    def password(self, password):
        """Sets the password of this User.


        :param password: The password of this User.
        :type password: str
        """

        self._password = password

    @property
    def phone(self):
        """Gets the phone of this User.


        :return: The phone of this User.
        :rtype: str
        """
        return self._phone

    @phone.setter
    def phone(self, phone):
        """Sets the phone of this User.


        :param phone: The phone of this User.
        :type phone: str
        """

        self._phone = phone

    @property
    def user_status(self):
        """Gets the user_status of this User.

        User Status

        :return: The user_status of this User.
        :rtype: int
        """
        return self._user_status

    @user_status.setter
    def user_status(self, user_status):
        """Sets the user_status of this User.

        User Status

        :param user_status: The user_status of this User.
        :type user_status: int
        """

        self._user_status = user_status
