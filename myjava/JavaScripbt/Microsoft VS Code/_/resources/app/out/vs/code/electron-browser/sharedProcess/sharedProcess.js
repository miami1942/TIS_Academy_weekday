/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
"use strict";const bootstrapWindow=(()=>window.MonacoBootstrapWindow)(),bootstrap=(()=>window.MonacoBootstrap)();bootstrap.avoidMonkeyPatchFromAppInsights(),bootstrapWindow.load(["vs/code/electron-browser/sharedProcess/sharedProcessMain"],(function(o,t){o.startup({machineId:t.machineId,windowId:t.windowId})}));
//# sourceMappingURL=https://ticino.blob.core.windows.net/sourcemaps/17299e413d5590b14ab0340ea477cdd86ff13daf/core/vs/code/electron-browser/sharedProcess/sharedProcess.js.map
