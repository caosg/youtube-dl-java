"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
Object.defineProperty(exports, "__esModule", { value: true });
var core_1 = require("@angular/core");
var FindLanguageFromKeyPipe = (function () {
    function FindLanguageFromKeyPipe() {
        this.languages = {
            'ca': { name: 'Català' },
            'cs': { name: 'Český' },
            'da': { name: 'Dansk' },
            'de': { name: 'Deutsch' },
            'el': { name: 'Ελληνικά' },
            'en': { name: 'English' },
            'es': { name: 'Español' },
            'et': { name: 'Eesti' },
            'fa': { name: 'فارسی', rtl: true },
            'fr': { name: 'Français' },
            'gl': { name: 'Galego' },
            'hu': { name: 'Magyar' },
            'hi': { name: 'हिंदी' },
            'hy': { name: 'Հայերեն' },
            'it': { name: 'Italiano' },
            'ja': { name: '日本語' },
            'ko': { name: '한국어' },
            'mr': { name: 'मराठी' },
            'nl': { name: 'Nederlands' },
            'pl': { name: 'Polski' },
            'pt-br': { name: 'Português (Brasil)' },
            'pt-pt': { name: 'Português' },
            'ro': { name: 'Română' },
            'ru': { name: 'Русский' },
            'sk': { name: 'Slovenský' },
            'sr': { name: 'Srpski' },
            'sv': { name: 'Svenska' },
            'ta': { name: 'தமிழ்' },
            'th': { name: 'ไทย' },
            'tr': { name: 'Türkçe' },
            'ua': { name: 'Українська' },
            'vi': { name: 'Tiếng Việt' },
            'zh-cn': { name: '中文（简体）' },
            'zh-tw': { name: '繁體中文' }
        };
    }
    FindLanguageFromKeyPipe.prototype.transform = function (lang) {
        return this.languages[lang].name;
    };
    return FindLanguageFromKeyPipe;
}());
FindLanguageFromKeyPipe = __decorate([
    core_1.Pipe({ name: 'findLanguageFromKey' })
], FindLanguageFromKeyPipe);
exports.FindLanguageFromKeyPipe = FindLanguageFromKeyPipe;
