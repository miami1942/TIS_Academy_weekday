/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/
"use strict";const bootstrap=require("./bootstrap"),product=require("../product.json");bootstrap.avoidMonkeyPatchFromAppInsights(),bootstrap.configurePortable(product),bootstrap.enableASARSupport(),require("./bootstrap-amd").load("vs/code/node/cli");
//# sourceMappingURL=https://ticino.blob.core.windows.net/sourcemaps/485c41f9460bdb830c4da12c102daff275415b53/core/cli.js.map
