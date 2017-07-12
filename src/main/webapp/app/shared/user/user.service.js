"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
Object.defineProperty(exports, "__esModule", { value: true });
var core_1 = require("@angular/core");
var response_wrapper_model_1 = require("../model/response-wrapper.model");
var request_util_1 = require("../model/request-util");
var UserService = (function () {
    function UserService(http) {
        this.http = http;
        this.resourceUrl = 'api/users';
    }
    UserService.prototype.create = function (user) {
        var _this = this;
        return this.http.post(this.resourceUrl, user)
            .map(function (res) { return _this.convertResponse(res); });
    };
    UserService.prototype.update = function (user) {
        var _this = this;
        return this.http.put(this.resourceUrl, user)
            .map(function (res) { return _this.convertResponse(res); });
    };
    UserService.prototype.find = function (login) {
        return this.http.get(this.resourceUrl + "/" + login).map(function (res) { return res.json(); });
    };
    UserService.prototype.query = function (req) {
        var _this = this;
        var options = request_util_1.createRequestOption(req);
        return this.http.get(this.resourceUrl, options)
            .map(function (res) { return _this.convertResponse(res); });
    };
    UserService.prototype.delete = function (login) {
        return this.http.delete(this.resourceUrl + "/" + login);
    };
    UserService.prototype.authorities = function () {
        return this.http.get('api/users/authorities').map(function (res) {
            var json = res.json();
            return json;
        });
    };
    UserService.prototype.convertResponse = function (res) {
        var jsonResponse = res.json();
        return new response_wrapper_model_1.ResponseWrapper(res.headers, jsonResponse, res.status);
    };
    return UserService;
}());
UserService = __decorate([
    core_1.Injectable()
], UserService);
exports.UserService = UserService;
