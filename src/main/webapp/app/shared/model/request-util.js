"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var http_1 = require("@angular/http");
exports.createRequestOption = function (req) {
    var options = new http_1.BaseRequestOptions();
    if (req) {
        var params = new http_1.URLSearchParams();
        params.set('page', req.page);
        params.set('size', req.size);
        if (req.sort) {
            params.paramsMap.set('sort', req.sort);
        }
        params.set('query', req.query);
        options.params = params;
    }
    return options;
};
