/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
!function(){"use strict";const{ipcRenderer:e,webFrame:o,crashReporter:r}=require("electron");function t(e){if(!e||!e.startsWith("vscode:"))throw new Error(`Unsupported event IPC channel '${e}'`)}window.vscode={ipcRenderer:{send(o,...r){t(o),e.send(o,...r)},on(o,r){t(o),e.on(o,r)},once(o,r){t(o),e.once(o,r)},removeListener(o,r){t(o),e.removeListener(o,r)}},webFrame:{getZoomFactor:()=>o.getZoomFactor(),getZoomLevel:()=>o.getZoomLevel(),setZoomLevel(e){o.setZoomLevel(e)}},crashReporter:{start(e){r.start(e)}}}}();
//# sourceMappingURL=https://ticino.blob.core.windows.net/sourcemaps/17299e413d5590b14ab0340ea477cdd86ff13daf/core/vs/base/parts/sandbox/electron-browser/preload.js.map
