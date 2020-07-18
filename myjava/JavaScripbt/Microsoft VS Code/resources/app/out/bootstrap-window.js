/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
"use strict";!function(e,n){"object"==typeof exports?module.exports=n():e.MonacoBootstrapWindow=n()}(this,(function(){const e=require.__$__nodeRequire("path"),n=require.__$__nodeRequire("electron").webFrame,o=require.__$__nodeRequire("electron").ipcRenderer,t=globalThis.MonacoBootstrap;function s(e,n){n&&o.send("vscode:openDevTools"),console.error(`[uncaught exception]: ${e}`),e&&"string"!=typeof e&&e.stack&&console.error(e.stack)}return{load:function(r,i,a){const c=(window.location.search||"").split(/[?&]/).filter((function(e){return!!e})).map((function(e){return e.split("=")})).filter((function(e){return 2===e.length})).reduce((function(e,n){return e[n[0]]=decodeURIComponent(n[1]),e}),{}),d=JSON.parse(c.config||"{}")||{},l=d.zoomLevel;"number"==typeof l&&0!==l&&n.setZoomLevel(l),process.on("uncaughtException",(function(e){s(e,p)}));const p=(process.env.VSCODE_DEV||!!d.extensionDevelopmentPath)&&!d.extensionTestsPath;let u;(p||a&&a.forceEnableDeveloperKeybindings)&&(u=function(e){
const n="darwin"===process.platform?"meta-alt-73":"ctrl-shift-73",t="darwin"===process.platform?"meta-82":"ctrl-82";let s=function(s){const r=function(e){return[e.ctrlKey?"ctrl-":"",e.metaKey?"meta-":"",e.altKey?"alt-":"",e.shiftKey?"shift-":"",e.keyCode].join("")}(s);r===n||"123"===r?o.send("vscode:toggleDevTools"):r!==t||e||o.send("vscode:reloadWindow")};return window.addEventListener("keydown",s),function(){s&&(window.removeEventListener("keydown",s),s=void 0)}}(a&&a.disallowReloadKeybinding)),Object.assign(process.env,d.userEnv),t.enableASARSupport(e.join(d.appRoot,"node_modules")),a&&"function"==typeof a.canModifyDOM&&a.canModifyDOM(d);const f=t.setupNLS();let m=f.availableLanguages["*"]||"en";"zh-tw"===m?m="zh-Hant":"zh-cn"===m&&(m="zh-Hans"),window.document.documentElement.setAttribute("lang",m),window.define=void 0,require.define("fs",["original-fs"],(function(e){return e})),window.MonacoEnvironment={};const g={baseUrl:`${t.uriFromPath(d.appRoot)}/out`,"vs/nls":f,
nodeModules:["electron","original-fs","debug","inherits","ms","readable-stream","strip-ansi","applicationinsights","diagnostic-channel","diagnostic-channel-publishers","zone.js","chokidar","graceful-fs","http-proxy-agent","https-proxy-agent","agent-base","iconv-lite-umd","jschardet","keytar","nan","prebuild-install","minimist","native-is-elevated","native-keymap","native-watchdog","node-pty","semver-umd","spdlog","bindings","file-uri-to-path","sudo-prompt","v8-inspect-profiler","chrome-remote-interface","vscode-nsfw","vscode-oniguruma","vscode-proxy-agent","vscode-ripgrep","vscode-sqlite3","vscode-textmate","vsda","xterm","xterm-addon-search","xterm-addon-unicode11","xterm-addon-webgl","yauzl","yazl","vscode-windows-ca-certs","node-addon-api","vscode-windows-registry","windows-foreground-love","windows-mutex","windows-process-tree","ansi-regex","anymatch","braces","buffer-crc32","fd-slicer","fs-extra","fsevents","glob-parent","is-binary-path","is-glob","lodash.isinteger","lodash.isundefined","mkdirp","normalize-path","github-from-package","proxy-from-env","readdirp","socks-proxy-agent","string_decoder","util-deprecate","binary-extensions","commander","detect-libc","es6-promisify","expand-template","fill-range","is-extglob","jsonfile","napi-build-utils","node-abi","semver","noop-logger","npmlog","pend","picomatch","pump","rc","safe-buffer","simple-get","socks","smart-buffer","tar-fs","tunnel-agent","universalify","which-pm-runs","ws","are-we-there-yet","async-limiter","chownr","console-control-strings","decompress-response","deep-extend","end-of-stream","es6-promise","gauge","ini","ip","mkdirp-classic","once","set-blocking","simple-concat","strip-json-comments","tar-stream","to-regex-range","ultron","aproba","bl","delegates","fs-constants","has-unicode","is-number","mimic-response","object-assign","signal-exit","string-width","wide-align","is-fullwidth-code-point","wrappy","buffer","code-point-at","core-util-is","isarray","process-nextick-args","base64-js","ieee754","number-is-nan","assert","async_hooks","buffer","child_process","cluster","console","constants","crypto","dgram","dns","domain","events","fs","http","http2","https","inspector","module","net","os","path","perf_hooks","process","punycode","querystring","readline","repl","stream","string_decoder","sys","timers","tls","trace_events","tty","url","util","v8","vm","worker_threads","zlib","config"]
};d.nodeCachedDataDir&&(g.nodeCachedData={path:d.nodeCachedDataDir,seed:r.join("")}),a&&"function"==typeof a.beforeLoaderConfig&&a.beforeLoaderConfig(d,g),require.config(g),f.pseudo&&require(["vs/nls"],(function(e){e.setPseudoTranslation(f.pseudo)})),a&&"function"==typeof a.beforeRequire&&a.beforeRequire(),require(r,e=>{try{const n=i(e,d);n&&"function"==typeof n.then&&n.then(()=>{u&&a&&a.removeDeveloperKeybindingsAfterLoad&&u()},e=>{s(e,p)})}catch(e){s(e,p)}},s)}}}));
//# sourceMappingURL=https://ticino.blob.core.windows.net/sourcemaps/485c41f9460bdb830c4da12c102daff275415b53/core/bootstrap-window.js.map
